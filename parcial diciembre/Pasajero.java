@Entity
public class Pasajero {
    @Id
    @GeneratedValue(Strategy.Id)
    Long pasajero_id;

    String nombre;
    Integer dni;
    Integer edad;
    String sexo;

    TipoPasajero tipoPasajero;
}