package model.Atuendo;

import model.Prenda.Prenda;

public interface UniformeFactory {
  Prenda fabricarPrendaSuperior();

  Prenda fabricarPrendaInferior();

  Prenda fabricarCalzado();
}
