package Venta.MetodoPago;

import Prenda.Prenda;
import java.util.Collection;
import java.util.List;

public class Efectivo implements MetodoPago{
  public float precioFinal(List<Prenda> prendas) {
    return (float) prendas.stream().mapToDouble(p -> p.precioFinal()).sum();
  }
}
