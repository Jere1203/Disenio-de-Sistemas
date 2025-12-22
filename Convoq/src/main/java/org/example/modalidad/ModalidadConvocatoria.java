package org.example.modalidad;

import jakarta.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "Tipo_Convocatoria")
public interface ModalidadConvocatoria {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
}
