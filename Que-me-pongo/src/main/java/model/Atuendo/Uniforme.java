package model.Atuendo;

import model.Prenda.Prenda;

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

  public boolean aptaParaTemperatura(Integer temperatura) {
    return this.prendasAptasParaTemperatura(temperatura);
  }

  private boolean prendasAptasParaTemperatura(Integer temperatura) {
    return
        this.parteSuperior.aptaParaTemperatura(temperatura)
            && this.parteInferior.aptaParaTemperatura(temperatura)
            && this.calzado.aptaParaTemperatura(temperatura);
  }
}

