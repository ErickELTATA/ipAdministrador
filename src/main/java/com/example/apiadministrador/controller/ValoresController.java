package com.example.apiadministrador.controller;

import com.example.apiadministrador.model.Mision;
import com.example.apiadministrador.model.Valores;
import com.example.apiadministrador.service.MisionService;
import com.example.apiadministrador.service.ValoresService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/valores")
public class ValoresController {

    @Autowired
    private ValoresService misionService;

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
    public ResponseEntity<Valores> guardarmision(@RequestBody Valores mision){
        Valores misionNuevo = misionService.save(mision);
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
