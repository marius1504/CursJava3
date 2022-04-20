package demo.repository;

import jpa.repository.JpaRepository;
import models.Student;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {

}
