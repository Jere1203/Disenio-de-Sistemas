package model.Atuendo;

import model.API.Humedad;

public class Atuendo {
  public Atuendo() {
  }

  public boolean aptaParaTemperatura(int temperatura) {
    return true;
  }

  public boolean aptaParaHumedad(Humedad humedad) {
    return true;
  }
// Tiene que haber una excepcion para evitar que haya prendas sin tipo, tela, categoría o color primario.
//  Se debe evitar que haya prendas cuya categoría no se condiga con su tipo. (Ej, una remera no puede ser calzado).
}
