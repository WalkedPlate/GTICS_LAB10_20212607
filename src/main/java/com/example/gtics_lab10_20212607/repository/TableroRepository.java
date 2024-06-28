package com.example.gtics_lab10_20212607.repository;

import com.example.gtics_lab10_20212607.entity.Tablero;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TableroRepository extends JpaRepository<Tablero, Integer> {
}
