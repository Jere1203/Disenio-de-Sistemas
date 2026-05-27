package Prenda.Estado;

import Prenda.Prenda;

public class Nueva implements Estado{
  public float precio(Prenda prenda) {
    return prenda.getPrecioBase();
  }
}
