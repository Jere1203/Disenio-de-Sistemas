package org.example.eventos;

import jakarta.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public interface EventoAuditoria {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
}
