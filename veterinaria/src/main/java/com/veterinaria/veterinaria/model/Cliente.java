package com.veterinaria.veterinaria.model;

import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDate;

@Data
@Entity
@Table(name = "cliente")
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer cliente_id;

    @Column(nullable = false, length = 80)
    private String nombre;

    @Column(nullable = false, length = 80)
    private String apellido;

    @Column(nullable = false, length = 15, unique = true)
    private String telefono;

    @Column(nullable = false, length = 100, unique = true)
    private String correo;

    private String direccion;

    private LocalDate fecha_registro;
}
