package model.Usuario;

import model.Guardarropas.Guardarropas;
import model.Prenda.MotorSugerencias;
import model.Prenda.Prenda;
import model.Sugerencia.Sugerencia;
import java.util.ArrayList;
import java.util.List;

public class Usuario {
  List<Prenda> prendas;
  Integer edad;
  MotorSugerencias motorSugerencias;
  List<Guardarropas> guardarropas = new ArrayList<>();
  Sugerencia sugerenciaDiaria;
  String email;
  public Usuario(Integer edad, MotorSugerencias motorSugerencias, String email) {
    this.edad = edad;
    this.motorSugerencias = motorSugerencias;
    this.email = email;
  }

  public String getEmail() {
    return email;
  }

  public Sugerencia getSugerenciaDiaria() {
    return this.sugerenciaDiaria;
  }

  public Sugerencia generarSugerencia() {
    return this.motorSugerencias.generarSugerencia(this);
  }

  public void calcularSugerenciaDiaria() {
    this.sugerenciaDiaria = generarSugerencia();
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
