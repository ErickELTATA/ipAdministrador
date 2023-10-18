package com.example.apiadministrador.controller;


import com.example.apiadministrador.model.Usuarios;
import com.example.apiadministrador.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/usuarios")
public class usuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @GetMapping
    public ResponseEntity<List<Usuarios>> listarUsuarios(){
        List<Usuarios> usuarios = usuarioService.listAll();

        if(usuarios.isEmpty()){
            return ResponseEntity.noContent().build();
        }
        return new ResponseEntity<>(usuarios, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Usuarios> listarusuario(@PathVariable Integer id){
        try{
            Usuarios usuarios = usuarioService.get(id);
            return new ResponseEntity<>(usuarios,HttpStatus.OK);
        }catch (Exception exception){
            return ResponseEntity.notFound().build();
        }
    }


    @PostMapping
    public ResponseEntity<Usuarios> guardarUsuario(@RequestBody Usuarios usuarios){
        Usuarios usuarioNuevo = usuarioService.save(usuarios);
        return  new ResponseEntity<>(usuarioNuevo, HttpStatus.CREATED);
    }

    @PutMapping
    public ResponseEntity<Usuarios> editarUsuario(@RequestBody Usuarios usuarios){
        Usuarios usuarioNuevo = usuarioService.save(usuarios);
        return  new ResponseEntity<>(usuarioNuevo, HttpStatus.CREATED);
    }

    @DeleteMapping("/borrar/{id}")
    public ResponseEntity<?> eliminarUsuario(@PathVariable Integer id){
        try {
            usuarioService.delete(id);
            return ResponseEntity.noContent().build();
        }catch (Exception exception){
            return ResponseEntity.notFound().build();
        }
    }



}
