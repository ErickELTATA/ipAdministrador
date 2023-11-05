package com.example.apiadministrador.controller;

import com.example.apiadministrador.model.Mision;
import com.example.apiadministrador.model.PoliticaCalidad;
import com.example.apiadministrador.repository.PoliticaCalidadRepository;
import com.example.apiadministrador.service.MisionService;
import com.example.apiadministrador.service.PoliticaCalidadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:5173")
@RestController
@RequestMapping("/api/pocalidad")
public class PoliticaCalidadController {

    @Autowired
    private PoliticaCalidadService politicaCalidadService;

    @GetMapping
    public ResponseEntity<List<PoliticaCalidad>> listar(){

        List<PoliticaCalidad> pocalidad = politicaCalidadService.listAll();

        if(pocalidad.isEmpty()){
            return ResponseEntity.noContent().build();
        }
        return new ResponseEntity<>(pocalidad, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<PoliticaCalidad> listar(@PathVariable Integer id){
        try{
            PoliticaCalidad poCalidad = politicaCalidadService.get(id);
            return new ResponseEntity<>(poCalidad,HttpStatus.OK);
        }catch (Exception exception){
            return ResponseEntity.notFound().build();
        }
    }


    @PostMapping("/register")
    public ResponseEntity<PoliticaCalidad> guardar(@RequestBody PoliticaCalidad politicaCalidad){
        PoliticaCalidad Nuevo = politicaCalidadService.save(politicaCalidad);
        return  new ResponseEntity<>(Nuevo, HttpStatus.CREATED);
    }

    @PutMapping
    public ResponseEntity<PoliticaCalidad> editar(@RequestBody PoliticaCalidad politicaCalidad){
        PoliticaCalidad Nuevo = politicaCalidadService.save(politicaCalidad);
        return  new ResponseEntity<>(Nuevo, HttpStatus.CREATED);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> eliminar(@PathVariable Integer id){
        try {
            politicaCalidadService.delete(id);
            return ResponseEntity.noContent().build();
        }catch (Exception exception){
            return ResponseEntity.notFound().build();
        }
    }


}
