package com.example.apiadministrador.service;

import com.example.apiadministrador.model.Departamento;
import com.example.apiadministrador.model.Mision;
import com.example.apiadministrador.repository.DepartamentoRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartamentoService {

    @Autowired
    private DepartamentoRepository departamentoRepository;

    public List<Departamento> listAll(){

        return departamentoRepository.findAll();
    }


    public Departamento get(Integer id){

        return departamentoRepository.findById(id).get();
    }

    public Departamento save(Departamento departamento){

        return departamentoRepository.save(departamento);
    }

    public void delete(Integer id){
        departamentoRepository.deleteById(id);
    }
}
