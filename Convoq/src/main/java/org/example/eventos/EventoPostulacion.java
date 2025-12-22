package org.example.eventos;

import jakarta.persistence.*;
import org.example.postulaciones.Usuario;

import java.time.LocalDateTime;

@Entity
public class EventoPostulacion implements EventoAuditoria {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    LocalDateTime actualizadoEn;
    @ManyToOne
    Usuario actualizadoPor;
    String descripcion;
    String rolActualizador;
}
