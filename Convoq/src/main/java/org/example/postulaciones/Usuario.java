package org.example.postulaciones;

import jakarta.persistence.*;

import java.util.Date;

@Entity
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String nombreCompleto;
    Date fechaDeNacimiento;
    boolean esInstitucion;
    @Enumerated(EnumType.STRING)
    Nacionalidad nacionalidad;
}
