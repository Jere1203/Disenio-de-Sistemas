package org.example.convocatoria;

import jakarta.persistence.*;
import org.example.modalidad.ModalidadConvocatoria;
import org.example.postulaciones.Usuario;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "Tipo_Convocatoria")
public abstract class Convocatoria {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String nombre;
    String descripcion;
    @ManyToOne
    Usuario convocante;
    @OneToOne
    ModalidadConvocatoria modalidad;
}
