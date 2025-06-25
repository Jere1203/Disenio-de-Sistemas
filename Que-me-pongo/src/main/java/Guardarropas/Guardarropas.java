package Guardarropas;

import Prenda.Prenda;
import Solicitud.Estado;
import Solicitud.SolicitudDeModificacion;
import java.util.ArrayList;
import java.util.List;

public class Guardarropas {
  List<Prenda> prendas = new ArrayList<>();
  List<SolicitudDeModificacion> solicitudesDeModificacion = new ArrayList<>();

  public Guardarropas() {
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
