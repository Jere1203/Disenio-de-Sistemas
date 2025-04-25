package Prenda;

import Atuendo.Uniforme;
import java.awt.Color;
import java.util.ArrayList;
import java.util.List;

public class GestorPrendas {
  private List<Prenda> backupPrendas;
  List<Uniforme> uniformesArmados;
  public GestorPrendas(List<Prenda> backupPrendas) {
    this.backupPrendas = backupPrendas;
  }

  Prenda nuevaPrenda(Prenda.Prenda.TipoPrenda tipoPrenda, Prenda.Prenda.Material materialPrenda, Color colorPrincipal, Color colorSecundario) {
    return new Prenda(tipoPrenda,materialPrenda,colorPrincipal,colorSecundario);
  }

  Uniforme nuevoUniforme() {
    Uniforme uniforme = new Uniforme(adadawdawd,awdasd,asdasda);
    uniformesArmados.add(uniforme);
    return uniforme;

  }

  void guardarPrenda(Prenda prenda) {
    backupPrendas.add(prenda);
  }


}
