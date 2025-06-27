package Prenda;

import Sugerencia.Sugerencia;
import Usuario.Usuario;
import java.util.List;

public class MotorSugerenciasEstandar implements MotorSugerencias {
  @Override
  public Sugerencia generarSugerencia(Usuario usuario) {
    List<Prenda> prendas = usuario.getPrendas();
    Prenda prendaSuperior = prendas.stream().filter(prenda -> prenda.esSuperior()).toList().get(0);
    Prenda prendaInferior = prendas.stream().filter(prenda -> prenda.esInferior()).toList().get(0);
    Prenda calzado = prendas.stream().filter(prenda -> prenda.esCalzado()).toList().get(0);

    return new Sugerencia(prendaSuperior, prendaInferior, calzado);
  }
}
