package model.Usuario;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import model.Guardarropas.Guardarropas;
import model.Prenda.MotorSugerencias;
import model.Prenda.Prenda;
import model.Sugerencia.Sugerencia;
import java.util.ArrayList;
import java.util.List;
import org.apache.commons.codec.digest.DigestUtils;

@Entity
@Table(name = "Usuarios")
public class Usuario {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Column
  String nombre;

  @Column
  String email;

  @Column
  String hashContrasenia;

  List<Prenda> prendas;
  Integer edad;
  MotorSugerencias motorSugerencias;

  @OneToMany(cascade = CascadeType.PERSIST)
  @JoinColumn(name = "usuario_id")
  List<Guardarropas> guardarropas = new ArrayList<>();

  Sugerencia sugerenciaDiaria;


  public Usuario() {
  }

  public Usuario(Integer edad, MotorSugerencias motorSugerencias, String email, String contrasenia) {
    this.edad = edad;
    this.motorSugerencias = motorSugerencias;
    this.email = email;
    this.setContrasenia(contrasenia);
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

  public void setContrasenia(String contrasenia) {
    this.hashContrasenia = DigestUtils.sha256Hex(contrasenia);
  }

  public Long getId() {
    return this.id;
  }
}
