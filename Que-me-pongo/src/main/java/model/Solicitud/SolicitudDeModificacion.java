package model.Solicitud;

import model.Guardarropas.Guardarropas;

public abstract class SolicitudDeModificacion {
  private Estado estado;

  public void aceptarEn(Guardarropas unGuardarropas) {
    this.estado = Estado.ACEPTADA;
    this.realizarAceptacionEn(unGuardarropas);
  }

  public abstract void realizarAceptacionEn(Guardarropas unGuardarropas);

  public Estado getEstado() {
    return this.estado;
  }

  public abstract void deshacerEn(Guardarropas unGuardarropas);

  public void rechazar() {
    this.estado = Estado.RECHAZADA;
  }
}
