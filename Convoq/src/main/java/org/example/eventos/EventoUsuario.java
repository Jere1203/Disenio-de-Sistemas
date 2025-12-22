package org.example.eventos;

import jakarta.persistence.*;
import org.example.postulaciones.Usuario;

import java.util.Date;

@Entity
public class EventoUsuario implements EventoAuditoria{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    Date ocurridoEn;
    @Enumerated(EnumType.STRING)
    TipoEventoUsuario tipoEvento;
    @Enumerated(EnumType.STRING)
    Ejecutor ejecutor;
    String urlEjecutor;
    @ManyToOne
    Usuario usuario;
}
