package Venta.MetodoPago;

import Prenda.Prenda;
import java.util.List;

public interface MetodoPago {
  public float precioFinal(List<Prenda> prendas);
}
