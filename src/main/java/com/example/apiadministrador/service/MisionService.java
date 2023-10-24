package com.example.apiadministrador.service;

import com.example.apiadministrador.model.Mision;
import com.example.apiadministrador.model.Resena;
import com.example.apiadministrador.repository.MisionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MisionService {

    @Autowired
     private  MisionRepository misionRepository;

    public List<Mision> listAll(){

        return misionRepository.findAll();
    }


    public Mision get(Integer id){

        return misionRepository.findById(id).get();
    }

    public Mision save(Mision mision){
        return misionRepository.save(mision);
    }

    public void delete(Integer id){
        misionRepository.deleteById(id);
    }
}
