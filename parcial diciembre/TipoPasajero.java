@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = 'tipo_pasajero')
public abstract class TipoPasajero{
    
}