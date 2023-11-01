package com.example.apiadministrador.service;

import com.example.apiadministrador.model.Valores;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ValoresService {

    @Autowired
    private com.example.apiadministrador.repository.ValoresRepository misionRepository;

    public List<Valores> listAll(){

        return misionRepository.findAll();
    }


    public Valores get(Integer id){

        return misionRepository.findById(id).get();
    }

    public Valores save(Valores mision){
        return misionRepository.save(mision);
    }

    public void delete(Integer id){
        misionRepository.deleteById(id);
    }
}
