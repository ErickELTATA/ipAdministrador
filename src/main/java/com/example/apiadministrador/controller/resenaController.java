package com.example.apiadministrador.controller;

import com.example.apiadministrador.model.Resena;
import com.example.apiadministrador.model.Usuarios;
import com.example.apiadministrador.service.ResenaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/resena")
public class resenaController {

    @Autowired
    private ResenaService resenaService;

    @GetMapping
    public ResponseEntity<List<Resena>> listaresena(){

        List<Resena> resena = resenaService.listAll();

        if(resena.isEmpty()){
            return ResponseEntity.noContent().build();
        }
        return new ResponseEntity<>(resena, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Resena> listaresena(@PathVariable Integer id){
        try{
            Resena resena = resenaService.get(id);
            return new ResponseEntity<>(resena,HttpStatus.OK);
        }catch (Exception exception){
            return ResponseEntity.notFound().build();
        }
    }


    @PostMapping("/register")
    public ResponseEntity<Resena> guardarUsuario(@RequestBody Resena resena){
        Resena resenaNuevo = resenaService.save(resena);
        return  new ResponseEntity<>(resenaNuevo, HttpStatus.CREATED);
    }

    @PutMapping
    public ResponseEntity<Resena> editarUsuario(@RequestBody Resena resena){
        Resena resenaNuevo = resenaService.save(resena);
        return  new ResponseEntity<>(resenaNuevo, HttpStatus.CREATED);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> eliminarUsuario(@PathVariable Integer id){
        try {
            resenaService.delete(id);
            return ResponseEntity.noContent().build();
        }catch (Exception exception){
            return ResponseEntity.notFound().build();
        }
    }


}
