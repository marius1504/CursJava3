package com.example.curs20.repositories;

import com.example.curs20.associaton.Materie;
import com.example.curs20.associaton.Profesor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ProfesorRepository extends JpaRepository<Profesor, Integer> {

    Optional<Profesor> findById(Integer id);

    @Query(value = "SELECT * FROM materii " + "WHERE " +
            "id_profesor = ?1 " ,
            nativeQuery = true)
    List<Optional<Materie>> findMateriiByProfesorId(Integer id_professor);

}
