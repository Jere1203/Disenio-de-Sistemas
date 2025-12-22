package org.example.convocatoria;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue("Convocatoria_Privada")
public class ConvocatoriaPrivada extends Convocatoria{
}
