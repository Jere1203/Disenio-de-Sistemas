package org.example.convocatoria;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue("Convocatoria_Hibrida")
public class ConvocatoriaHibrida extends Convocatoria{
}
