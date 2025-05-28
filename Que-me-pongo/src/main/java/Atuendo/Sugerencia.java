package Atuendo;

import Prenda.Prenda;

public class Sugerencia {
  private final Prenda prendaSuperior;
  private final Prenda prendaInferior;
  private final Prenda calzado;

  public Sugerencia(Prenda prendaSuperior, Prenda prendaInferior, Prenda calzado) {
    this.prendaSuperior = prendaSuperior;
    this.prendaInferior = prendaInferior;
    this.calzado = calzado;
  }

  public Prenda getPrendaSuperior() {
    return prendaSuperior;
  }

  public Prenda getPrendaInferior() {
    return prendaInferior;
  }

  public Prenda getCalzado() {
    return calzado;
  }
}
