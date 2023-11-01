package com.example.apiadministrador.repository;

import com.example.apiadministrador.model.Valores;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ValoresRepository extends JpaRepository<Valores,Integer> {
}
