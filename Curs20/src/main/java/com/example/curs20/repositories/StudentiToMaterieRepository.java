package com.example.curs20.repositories;

import com.example.curs20.associaton.StudentiToMaterie;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentiToMaterieRepository extends JpaRepository<StudentiToMaterie, Integer>{

    @Modifying
    @Query(value = "INSERT INTO studenti_to_materii " +
            "values (NULL, ?1, ?2) " ,
            nativeQuery = true)
    void insertStudentiToMaterie(Integer student_id, Integer materie_id);

}
