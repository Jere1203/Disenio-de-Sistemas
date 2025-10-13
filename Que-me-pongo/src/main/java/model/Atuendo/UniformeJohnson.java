package model.Atuendo;

import model.Prenda.Borrador;
import model.Prenda.Categoria;
import model.Prenda.Color;
import model.Prenda.Prenda;
import model.Prenda.TipoMaterial;
import model.Prenda.TipoPrenda;

public class UniformeJohnson implements UniformeFactory {
  Borrador borrador = new Borrador();

  public Prenda fabricarPrendaSuperior() {
    borrador.especificarTipo(new TipoPrenda(Categoria.ParteSuperior));
    borrador.especificarColorPrincial(new Color(0, 0, 0));
    borrador.especificarMaterial(TipoMaterial.LANA);
    return borrador.crearPrenda();
  }

  public Prenda fabricarPrendaInferior() {
    borrador.especificarTipo(new TipoPrenda(Categoria.ParteInferior));
    borrador.especificarColorPrincial(new Color(255, 255, 255));
    borrador.especificarMaterial(TipoMaterial.LANA);
    return borrador.crearPrenda();
  }

  public Prenda fabricarCalzado() {
    borrador.especificarTipo(new TipoPrenda(Categoria.Calzado));
    borrador.especificarColorPrincial(new Color(255, 255, 255));
    borrador.especificarMaterial(TipoMaterial.CUERO);
    return borrador.crearPrenda();
  }
}
