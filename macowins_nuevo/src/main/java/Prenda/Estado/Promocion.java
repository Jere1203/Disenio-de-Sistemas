package Prenda.Estado;

import Prenda.Prenda;

public class Promocion implements Estado{
  private float descuento;
  public float precio(Prenda prenda) {
    return prenda.getPrecioBase() - descuento;
  }
}
