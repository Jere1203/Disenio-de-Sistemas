package model.Prenda;

import model.Sugerencia.Sugerencia;
import model.Usuario.Usuario;

public interface MotorSugerencias {
  public Sugerencia generarSugerencia(Usuario usuario);
}
