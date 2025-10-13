package model.SolicitudDeAgregacion;

import model.Guardarropas.Guardarropas;
import model.Prenda.Prenda;
import model.Solicitud.Estado;
import model.Solicitud.SolicitudDeModificacion;


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
