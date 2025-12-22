package org.example.postulaciones;

import jakarta.persistence.*;
import org.example.convocatoria.Convocatoria;

import java.util.List;

@Entity
public class Postulacion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;
    String titulo;
    String descripcion;
    @Enumerated(EnumType.STRING)
    EstadoPostulacion estado;
    @OneToOne
    Usuario postulante;
    @ManyToMany
    List<Comentario> comentarios;
    @ManyToOne
    Convocatoria convocatoria;
}
