package com.example.apiadministrador.service;


import com.example.apiadministrador.model.Usuarios;
import com.example.apiadministrador.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    public List<Usuarios> listAll(){
        return usuarioRepository.findAll();
    }


    public Usuarios get(Integer id){
        return usuarioRepository.findById(id).get();
    }

    public Usuarios save(Usuarios usuarios){
        return  usuarioRepository.save(usuarios);
    }

    public void delete(Integer id){
        usuarioRepository.deleteById(id);
    }

}
