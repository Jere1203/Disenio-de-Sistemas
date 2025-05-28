package Prenda;

import Atuendo.Sugerencia;
import Usuario.Usuario;
import java.util.List;

public class MotorSugerenciasRopaInformal implements MotorSugerencias {

  @Override
  public Sugerencia generarSugerencia(Usuario usuario) {
    List<Prenda> prendasValidas = this.getPrendasValidas(usuario);
    Prenda prendaInferior = prendasValidas.stream().filter(prenda -> prenda.esInferior()).toList().get(0);
    Prenda prendaSuperior = prendasValidas.stream().filter(prenda -> prenda.esSuperior()).toList().get(0);
    Prenda calzado = prendasValidas.stream().filter(prenda -> prenda.esCalzado()).toList().get(0);

    return new Sugerencia(prendaSuperior, prendaInferior, calzado);
  }

  public List<Prenda> getPrendasValidas(Usuario usuario) {
    if (usuario.getEdad() > 55) {
      return usuario.getPrendas().stream().filter(prenda -> !prenda.esInformal()).toList();
    }
    return usuario.getPrendas();
  }
}
