package model.Guardarropas;

import javax.persistence.*;
import model.Prenda.Prenda;
import model.Solicitud.Estado;
import model.Solicitud.SolicitudDeModificacion;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "Guardarropas")
public class Guardarropas {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @OneToMany(cascade = CascadeType.PERSIST)
  @JoinColumn(name = "guardarropas_id")
  @OrderColumn(name = "importancia")
  List<Prenda> prendas = new ArrayList<>();

  List<SolicitudDeModificacion> solicitudesDeModificacion = new ArrayList<>();

  public Guardarropas() {
  }

  public Long getId() {
    return this.id;
  }

  public void agregarPrenda(Prenda prenda) {
    prendas.add(prenda);
  }

  public void quitarPrenda(Prenda prenda) {
    prendas.remove(prenda);
  }

  public void quitarSolicitud(SolicitudDeModificacion solicitud) {
    solicitudesDeModificacion.remove(solicitud);
  }

  public List<SolicitudDeModificacion> solicitudesPendientes() {
    return this.solicitudesDeModificacion.stream()
                                         .filter(s -> s.getEstado() == Estado.PENDIENTE)
                                         .toList();
  }
}
