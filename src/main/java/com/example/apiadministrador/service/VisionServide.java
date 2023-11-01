package com.example.apiadministrador.service;

import com.example.apiadministrador.model.Mision;
import com.example.apiadministrador.model.Vision;
import com.example.apiadministrador.repository.MisionRepository;
import com.example.apiadministrador.repository.VisionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VisionServide {

    @Autowired
    private VisionRepository misionRepository;

    public List<Vision> listAll(){

        return misionRepository.findAll();
    }


    public Vision get(Integer id){

        return misionRepository.findById(id).get();
    }

    public Vision save(Vision mision){
        return misionRepository.save(mision);
    }

    public void delete(Integer id){
        misionRepository.deleteById(id);
    }
}
