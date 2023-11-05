package com.example.apiadministrador.controller;

import com.example.apiadministrador.model.PoliticaConfidencialidad;
import com.example.apiadministrador.service.PoliticaConfidencialidadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "http://localhost:5173")
@RestController
@RequestMapping("/api/poconfi")
public class PoliticaConfidencialiadadController {

    @Autowired
    private PoliticaConfidencialidadService politicaConfidencialidadService;

    /*
    @GetMapping
    public ResponseEntity<List<Mision>> listarmision(){

        List<Mision> mision = misionService.listAll();

        if(mision.isEmpty()){
            return ResponseEntity.noContent().build();
        }
        return new ResponseEntity<>(mision, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Mision> listarmision(@PathVariable Integer id){
        try{
            Mision mision = misionService.get(id);
            return new ResponseEntity<>(mision,HttpStatus.OK);
        }catch (Exception exception){
            return ResponseEntity.notFound().build();
        }
    }

*/
    @PostMapping("/register")
    public ResponseEntity<PoliticaConfidencialidad> guardarmision(@RequestBody PoliticaConfidencialidad mision){
        PoliticaConfidencialidad misionNuevo = politicaConfidencialidadService.save(mision);
        return  new ResponseEntity<>(misionNuevo, HttpStatus.CREATED);
    }
/*
    @PutMapping
    public ResponseEntity<Mision> editarmision(@RequestBody Mision mision){
        Mision misionNuevo = misionService.save(mision);
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

 */
}
