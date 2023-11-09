package com.example.apiadministrador.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Table(name = "vision")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Vision {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer Id;

    @Column(name = "contenido",length=2500)
    private String Contenido;

    @Column(name = "Fecha")
    private Date Fecha;

}
