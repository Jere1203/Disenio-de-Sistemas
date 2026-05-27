package Venta;

import Prenda.Prenda;
import Venta.MetodoPago.MetodoPago;
import java.time.LocalDate;
import java.util.List;
import java.util.Map;

public class Venta {
  private List<Prenda> prendasVendidas;
  private LocalDate fechaVenta;
  private MetodoPago metodoPago;

  public float precioFinal() {
    return metodoPago.precioFinal(prendasVendidas);
  }
}
