package org.example.postulaciones;

import jakarta.persistence.*;

import java.util.Date;
@Entity
public class Comentario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String texto;
    Date fecha;
    @ManyToOne
    Usuario comentarista;
}
