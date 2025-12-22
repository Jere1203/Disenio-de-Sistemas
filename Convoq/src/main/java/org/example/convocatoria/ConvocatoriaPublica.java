package org.example.convocatoria;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue("Convocatoria_Publica")
public class ConvocatoriaPublica extends Convocatoria{
}
