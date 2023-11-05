package com.example.apiadministrador.service;


import com.example.apiadministrador.model.Resena;

import com.example.apiadministrador.repository.ResenaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ResenaService {


    @Autowired
    private ResenaRepository resenaRepository;


    public List<Resena> listAll(){

        return resenaRepository.findAll();
    }


    public Resena get(Integer id){

        return resenaRepository.findById(id).get();
    }

    public Resena save(Resena resena){

        return resenaRepository.save(resena);
    }

    public void delete(Integer id){
        resenaRepository.deleteById(id);
    }

}
