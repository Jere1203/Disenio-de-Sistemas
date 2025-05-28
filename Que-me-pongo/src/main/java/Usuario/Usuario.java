package Usuario;

import Atuendo.Sugerencia;
import Prenda.MotorSugerencias;
import Prenda.Prenda;
import java.util.List;

public class Usuario {
  List<Prenda> prendas;
  Integer edad;
  MotorSugerencias motorSugerencias;

  public Usuario(Integer edad, MotorSugerencias motorSugerencias) {
    this.edad = edad;
    this.motorSugerencias = motorSugerencias;
  }

  public Sugerencia generarSugerencia() {
    return this.motorSugerencias.generarSugerencia(this);
  }

  public Integer getEdad() {
    return edad;
  }

  public List<Prenda> getPrendas() {
    return prendas;
  }

  public void setPrendas(List<Prenda> prendas) {
    this.prendas = prendas;
  }

  public MotorSugerencias getMotorSugerencias() {
    return motorSugerencias;
  }

  public void setMotorSugerencias(MotorSugerencias motorSugerencias) {
    this.motorSugerencias = motorSugerencias;
  }
}
