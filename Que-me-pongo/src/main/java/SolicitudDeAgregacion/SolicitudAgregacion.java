package SolicitudDeAgregacion;

import Guardarropas.Guardarropas;
import Prenda.Prenda;
import Solicitud.Estado;
import Solicitud.SolicitudDeModificacion;


public class SolicitudAgregacion extends SolicitudDeModificacion {

  Prenda prenda;
  Estado estado;

  public void realizarAceptacionEn(Guardarropas unGuardarropas) {
    this.estado = Estado.ACEPTADA;
    unGuardarropas.agregarPrenda(this.prenda);
  }

  public void deshacerEn(Guardarropas unGuardarropas) {
    unGuardarropas.quitarPrenda(this.prenda);
  }
}
