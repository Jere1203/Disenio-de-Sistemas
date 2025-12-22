package org.example.modalidad;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue("Ventanilla_Permanente")
public class VentanillaPermanente implements ModalidadConvocatoria {
}
