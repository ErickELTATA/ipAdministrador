package com.example.apiadministrador.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Table(name = "mision")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Mision {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer Id;

    @Column(name = "contenido")
    private String Contenido;

    @Column(name = "Fecha")
    private Date Fecha;


}
