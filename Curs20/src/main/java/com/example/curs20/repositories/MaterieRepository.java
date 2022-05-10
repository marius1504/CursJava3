package com.example.curs20.repositories;

import com.example.curs20.associaton.Materie;
import org.springframework.stereotype.Repository;

@Repository
public interface MaterieRepository extends JpaRepository<Materie, Integer> {

}
