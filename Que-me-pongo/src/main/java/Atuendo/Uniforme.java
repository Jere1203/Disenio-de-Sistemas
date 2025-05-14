package Atuendo;

import Prenda.Prenda;

public class Uniforme {
  Prenda parteSuperior;
  Prenda parteInferior;
  Prenda calzado;

  public Uniforme(Prenda parteSuperior, Prenda parteInferior, Prenda calzado) {
    this.parteSuperior = parteSuperior;
    this.parteInferior = parteInferior;
    this.calzado = calzado;
  }

  public static void fabricar(UniformeFactory unSastre) {
    unSastre.fabricarPrendaSuperior();
    unSastre.fabricarPrendaInferior();
    unSastre.fabricarCalzado();
  }

}
