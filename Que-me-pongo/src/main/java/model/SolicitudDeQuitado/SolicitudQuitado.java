package model.SolicitudDeQuitado;

import model.Guardarropas.Guardarropas;
import model.Prenda.Prenda;
import model.Solicitud.Estado;
import model.Solicitud.SolicitudDeModificacion;

public class SolicitudQuitado extends SolicitudDeModificacion {
  Prenda prenda;
  Estado estado;

  public void realizarAceptacionEn(Guardarropas unGuardarropas) {
    unGuardarropas.quitarPrenda(this.prenda);
  }

  public void deshacerEn(Guardarropas unGuardarropas) {
    unGuardarropas.agregarPrenda(this.prenda);
  }
}
