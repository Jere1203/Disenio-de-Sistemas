package Usuario;

import Atuendo.Sugerencia;
import Guardarropas.Guardarropas;
import Prenda.MotorSugerencias;
import Prenda.Prenda;
import java.util.ArrayList;
import java.util.List;

public class Usuario {
  List<Prenda> prendas;
  Integer edad;
  MotorSugerencias motorSugerencias;
  List<Guardarropas> guardarropas = new ArrayList<>();

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

  public void agregarGuardarropas(Guardarropas unGuardarropas) {
    guardarropas.add(unGuardarropas);
  }

  public void quitarGuardarropas(Guardarropas unGuardarropas) {
    guardarropas.remove(unGuardarropas);
  }
}
