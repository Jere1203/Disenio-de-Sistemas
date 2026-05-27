@Entity
@Inheritance(Strategy = InheritanceType.JOINED_TABLE)
public class Asiento {
    @Id
    @GeneratedValue(Strategy.ID)
    Long asiento_id;

    @OneToOne
    Pasajero pasajeroAsignado;

    @ManyToMany
    @OrderCollumn(ordenEspera)
    List<Pasajero> pasajerosEnEspera;


    Integer numero;
}