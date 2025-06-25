package SolicitudDeQuitado;

import Guardarropas.Guardarropas;
import Prenda.Prenda;
import Solicitud.Estado;
import Solicitud.SolicitudDeModificacion;

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
