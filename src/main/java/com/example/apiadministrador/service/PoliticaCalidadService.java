package com.example.apiadministrador.service;

import com.example.apiadministrador.model.Mision;
import com.example.apiadministrador.model.PoliticaCalidad;
import com.example.apiadministrador.model.PoliticaConfidencialidad;
import com.example.apiadministrador.repository.PoliticaCalidadRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PoliticaCalidadService {

    @Autowired
    private PoliticaCalidadRepository politicaCalidadRepository;


    public List<PoliticaCalidad> listAll(){

        return politicaCalidadRepository.findAll();    }


    public PoliticaCalidad get(Integer id){

        return politicaCalidadRepository.findById(id).get();
    }

    public PoliticaCalidad save(PoliticaCalidad politicaCalidad){
        return politicaCalidadRepository.save(politicaCalidad);
    }

    public void delete(Integer id){
        politicaCalidadRepository.deleteById(id);
    }
}
