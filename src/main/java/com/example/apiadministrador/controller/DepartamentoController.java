package com.example.apiadministrador.controller;

import com.example.apiadministrador.model.Departamento;
import com.example.apiadministrador.model.Resena;
import com.example.apiadministrador.service.DepartamentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:5173")
@RestController
@RequestMapping("/api/departamento")
public class DepartamentoController {

    @Autowired
    private DepartamentoService departamentoService;


    @GetMapping
    public ResponseEntity<List<Departamento>> listaresena(){


        List<Departamento> departamento = departamentoService.listAll();

        if(departamento.isEmpty()){
            return ResponseEntity.noContent().build();
        }
        return new ResponseEntity<>(departamento, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Departamento> listaresena(@PathVariable Integer id){
        try{
            Departamento departamento = departamentoService.get(id);
            return new ResponseEntity<>(departamento,HttpStatus.OK);
        }catch (Exception exception){
            return ResponseEntity.notFound().build();
        }
    }


    @PostMapping("/register")
    public ResponseEntity<Departamento> guardarUsuario(@RequestBody Departamento departamento){
        Departamento Nuevo = departamentoService.save(departamento);
        return  new ResponseEntity<>(Nuevo, HttpStatus.CREATED);
    }

    /*
    @PutMapping
    public ResponseEntity<Resena> editarUsuario(@RequestBody Resena resena){
        Resena resenaNuevo = resenaService.save(resena);
        return  new ResponseEntity<>(resenaNuevo, HttpStatus.CREATED);
    }
*/
    @DeleteMapping("/{id}")
    public ResponseEntity<?> eliminarUsuario(@PathVariable Integer id){
        try {
            departamentoService.delete(id);
            return ResponseEntity.noContent().build();
        }catch (Exception exception){
            return ResponseEntity.notFound().build();
        }
    }


}
