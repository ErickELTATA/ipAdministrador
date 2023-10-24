package com.example.apiadministrador.repository;

import com.example.apiadministrador.model.Mision;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MisionRepository extends JpaRepository<Mision, Integer> {
}
