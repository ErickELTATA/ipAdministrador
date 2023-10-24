package com.example.apiadministrador.repository;

import com.example.apiadministrador.model.Resena;
import com.example.apiadministrador.model.Usuarios;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ResenaRepository extends JpaRepository<Resena, Integer> {

}
