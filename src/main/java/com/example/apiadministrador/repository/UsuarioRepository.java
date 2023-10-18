package com.example.apiadministrador.repository;

import com.example.apiadministrador.model.Usuarios;
import jakarta.persistence.Entity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuarios, Integer> {

    

}
