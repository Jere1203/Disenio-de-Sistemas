@Entity
public class Lugar{
    String nombre;
    String descripcion;
    foto;
    pais;
    @Embedded
    Posicion posicion;
}