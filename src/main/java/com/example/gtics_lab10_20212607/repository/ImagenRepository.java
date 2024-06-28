package com.example.gtics_lab10_20212607.repository;

import com.example.gtics_lab10_20212607.entity.Imagen;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ImagenRepository extends JpaRepository<Imagen, Integer> {
}
