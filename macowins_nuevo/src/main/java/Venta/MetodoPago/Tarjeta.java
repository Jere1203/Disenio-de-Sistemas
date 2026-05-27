package Venta.MetodoPago;

import Prenda.Prenda;
import java.util.List;

public class Tarjeta implements MetodoPago{
  private Integer cantidadCuotas;
  private Integer coeficienteCuotas;
  public float precioFinal(List<Prenda> prendas) {
    return (float) (cantidadCuotas*coeficienteCuotas + prendas.stream().mapToDouble(p -> (0.01 * p.precioFinal())).sum());
  }
}
