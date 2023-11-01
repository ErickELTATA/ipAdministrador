package com.example.apiadministrador.repository;

import com.example.apiadministrador.model.PoliticaConfidencialidad;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PoliticaConfidencialidadRepository extends JpaRepository<PoliticaConfidencialidad,Integer> {
}
