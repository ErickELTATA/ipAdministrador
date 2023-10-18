package com.example.apiadministrador.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "usuarios")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Usuarios {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "nombreEmpresa")
    private String nombreEmpresa;

    @Column(name = "sectorEmpresa")
    private String sectorEmpresa;

    @Column(name = "sucursalEmpresa")
    private String sucursalEmpresa;

    @Column(name = "nombreContacto")
    private String nombreContacto;

    @Column(name = "numeroTelefono")
    private String numeroTelefono;

    @Column(name = "usuario")
    private String usuario;

    @Column(name = "contrasena")
    private String contrasena;



}
