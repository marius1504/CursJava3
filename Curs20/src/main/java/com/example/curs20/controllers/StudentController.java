package com.example.curs20.controllers;

import com.example.curs20.associaton.Adresa;
import com.example.curs20.associaton.Materie;
import com.example.curs20.associaton.Student;
import com.example.curs20.repositories.MaterieRepository;
import com.example.curs20.repositories.StudentRepository;
import com.example.curs20.repositories.StudentiToMaterieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.Optional;

@RestController
@RequestMapping(path = "/student")
public class StudentController {
    @PersistenceContext
    EntityManager entityManager;

    private final StudentRepository studentRepository;
    @Autowired
    MaterieRepository materieRepository;
    @Autowired
    StudentiToMaterieRepository studentiToMaterieRepository;

    @Autowired
    public StudentController(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @PostMapping(path = "/enroll")
    public ResponseEntity<String> addStudentToMaterii(@RequestParam(name = "studentId") Integer studentId, @RequestParam(name = "materieId") Integer materieId){
       Optional<Student> student = studentRepository.findById(studentId);
       Optional<Materie> materie = materieRepository.findById(studentId);
       if (student.isPresent() && materie.isPresent()){
           studentiToMaterieRepository.insertStudentiToMaterie(studentId, materieId);
           return new ResponseEntity<>("Studentul cu id-ul" + studentId + "a fost inscris la materia" + materieId, HttpStatus.OK);
       }
        return new ResponseEntity<>("Studentul cu id-ul" + studentId + "este deja inscris la materia" + materieId, HttpStatus.BAD_REQUEST);
    }

    @PostMapping
    public ResponseEntity<Student> addNewStudent(@RequestBody Student student){
        if(!studentRepository.findByCNP(student.getCnp()).isPresent()){
            studentRepository.saveAndFlush(student);
            return new ResponseEntity<>(student, HttpStatus.OK);
        }
        return new ResponseEntity<>(student, HttpStatus.BAD_REQUEST);
    }

    @PutMapping(path = "/{studentId}/adresa")
    public ResponseEntity<Object> updateStudentAdress(@PathVariable Integer studentId, @RequestBody Adresa adresa){
        Optional<Student> student = studentRepository.findById(studentId);
        if(student.isPresent()){
            Student studentUpdated = student.get();
            studentUpdated.getAdresa().setStrada(adresa.getStrada());
            studentUpdated.getAdresa().setNumar(adresa.getNumar());
            studentUpdated.getAdresa().setLocalitate(adresa.getLocalitate());
            studentRepository.saveAndFlush(studentUpdated);
            return new ResponseEntity<>(studentUpdated, HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NOT_MODIFIED);
    }

    @DeleteMapping(path = "/{studentId}")
    public ResponseEntity<Object> deleteStudent(@PathVariable Integer studentId){
        studentRepository.deleteById(studentId);
        return new ResponseEntity<>(HttpStatus.ACCEPTED);
    }
}
