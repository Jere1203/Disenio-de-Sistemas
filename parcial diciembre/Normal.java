@Entity
@DiscriminatorValue('pasajero_normal')
public class Normal extends TipoPasajero{
    @Enumerated(EnumType.String)
    Categoria categoria;
}