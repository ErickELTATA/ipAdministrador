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

@RestController
@RequestMapping("/api/politicacalidad")
public class PoliticaCalidadController {

    @Autowired
    private PoliticaCalidadService misionService;

    @GetMapping
    public ResponseEntity<List<PoliticaCalidad>> listarmision(){

        List<PoliticaCalidad> mision = misionService.listAll();

        if(mision.isEmpty()){
            return ResponseEntity.noContent().build();
        }
        return new ResponseEntity<>(mision, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<PoliticaCalidad> listarmision(@PathVariable Integer id){
        try{
            PoliticaCalidad mision = misionService.get(id);
            return new ResponseEntity<>(mision,HttpStatus.OK);
        }catch (Exception exception){
            return ResponseEntity.notFound().build();
        }
    }


    @PostMapping("/register")
    public ResponseEntity<PoliticaCalidad> guardarmision(@RequestBody PoliticaCalidad mision){
        PoliticaCalidad misionNuevo = misionService.save(mision);
        return  new ResponseEntity<>(misionNuevo, HttpStatus.CREATED);
    }

    @PutMapping
    public ResponseEntity<PoliticaCalidad> editarmision(@RequestBody PoliticaCalidad mision){
        PoliticaCalidad misionNuevo = misionService.save(mision);
        return  new ResponseEntity<>(misionNuevo, HttpStatus.CREATED);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> eliminarMision(@PathVariable Integer id){
        try {
            misionService.delete(id);
            return ResponseEntity.noContent().build();
        }catch (Exception exception){
            return ResponseEntity.notFound().build();
        }
    }


}
