package org.example.modalidad;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue("Con_Vencimiento")
public class ConVencimiento implements ModalidadConvocatoria {
}

