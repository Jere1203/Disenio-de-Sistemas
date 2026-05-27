package Prenda;

import Prenda.Estado.Estado;

public class Prenda {
  private TipoPrenda tipoPrenda;
  private Estado estado;
  private float precioBase;

  public float precioFinal() {
    return estado.precio(this);
  }

  public float getPrecioBase() {
    return this.precioBase;
  }
}
