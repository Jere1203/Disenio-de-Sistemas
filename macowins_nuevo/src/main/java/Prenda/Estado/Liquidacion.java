package Prenda.Estado;

import Prenda.Prenda;

public class Liquidacion implements Estado{
  public float precio(Prenda prenda) {
    return prenda.getPrecioBase()/2;
  }
}
