package com.example.apiadministrador.repository;


import com.example.apiadministrador.model.PoliticaCalidad;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PoliticaCalidadRepository extends JpaRepository<PoliticaCalidad, Integer> {

}
