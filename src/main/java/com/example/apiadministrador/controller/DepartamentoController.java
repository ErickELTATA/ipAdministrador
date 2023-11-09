package com.example.apiadministrador.controller;

import com.example.apiadministrador.exception.ResourceNotFoundEception;
import com.example.apiadministrador.model.Departamento;
import com.example.apiadministrador.model.Resena;
import com.example.apiadministrador.repository.DepartamentoRepository;
import com.example.apiadministrador.service.DepartamentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.config.ConfigDataResourceNotFoundException;
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

    @Autowired
    private DepartamentoRepository repository;


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


    @PutMapping("/{id}")
    public ResponseEntity<Departamento> actualizar(@PathVariable Integer id, @RequestBody Departamento departamento){

        Departamento depart = repository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundEception("El cliente con ese ID no existe : " + id));

        depart.setNombreDepartamento(departamento.getNombreDepartamento());
        depart.setDescripcionDepartamento(departamento.getDescripcionDepartamento());

        Departamento actualizado = repository.save(depart);
        return ResponseEntity.ok(actualizado);
    }


    /*
    public ResponseEntity<Departamento> editarUsuario(@RequestBody Departamento departamento){
        Departamento Nuevo = departamentoService.save(departamento);
        return  new ResponseEntity<>Nuevo, HttpStatus.CREATED);
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
