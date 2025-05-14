package Atuendo;

import Prenda.Prenda;

public interface UniformeFactory {
  Prenda fabricarPrendaSuperior();

  Prenda fabricarPrendaInferior();

  Prenda fabricarCalzado();
}
