package main;

import io.github.flbulgarelli.jpa.extras.simple.WithSimplePersistenceUnit;
import model.Prenda.MotorSugerenciasEstandar;
import model.Usuario.Usuario;

public class Bootstrap implements WithSimplePersistenceUnit {

  public static void main(String[] args) {
    new Bootstrap().run();
  }

  public void run() {
    withTransaction(() -> {
      var usuario = new Usuario(21, new MotorSugerenciasEstandar(), "jbartolsic@frba.utn.edu.ar", "hola");
      persist(usuario);
    });
  }
}
