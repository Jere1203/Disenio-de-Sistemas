@Entity
public class Viaje{
    @Id
    @GeneratedValue(Strategy.Id)
    Long viaje_id;

    @OneToMany
    @JoinCollumn(name='asiento_id')
    List<Asiento> asientos;

    @OneToOne
    Lugar destino;
    @OneToOne
    Lugar origen;

    LocalDateTime fechaDeSalida;
    String descripcion;

}