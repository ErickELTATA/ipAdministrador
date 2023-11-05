package com.example.apiadministrador.service;


import com.example.apiadministrador.model.PoliticaConfidencialidad;
import com.example.apiadministrador.repository.PoliticaConfidencialidadRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PoliticaConfidencialidadService {


    @Autowired
    private PoliticaConfidencialidadRepository misionRepository;

    public List<PoliticaConfidencialidad> listAll(){

        return misionRepository.findAll();
    }


    public PoliticaConfidencialidad get(Integer id){

        return misionRepository.findById(id).get();
    }

    public PoliticaConfidencialidad save(PoliticaConfidencialidad mision){
        return misionRepository.save(mision);
    }

    public void delete(Integer id){
        misionRepository.deleteById(id);
    }


}
