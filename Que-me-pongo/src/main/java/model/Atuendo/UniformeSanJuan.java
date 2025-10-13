package model.Atuendo;


import model.Prenda.Borrador;
import model.Prenda.Categoria;
import model.Prenda.Color;
import model.Prenda.Prenda;
import model.Prenda.TipoMaterial;
import model.Prenda.TipoPrenda;

public class UniformeSanJuan implements UniformeFactory {
  Borrador borrador = new Borrador();


  public Prenda fabricarPrendaSuperior() {
    borrador.especificarTipo(new TipoPrenda(Categoria.ParteSuperior));
    borrador.especificarMaterial(TipoMaterial.PIQUE);
    borrador.especificarColorPrincial(new Color(0, 0, 255));
    return borrador.crearPrenda();
  }

  public Prenda fabricarPrendaInferior() {
    borrador.especificarTipo(new TipoPrenda(Categoria.ParteInferior));
    borrador.especificarMaterial(TipoMaterial.ACETATO);
    borrador.especificarColorPrincial(new Color(127, 127, 127));
    return borrador.crearPrenda();
  }

  public Prenda fabricarCalzado() {
    borrador.especificarTipo(new TipoPrenda(Categoria.Calzado));
    borrador.especificarColorPrincial(new Color(0, 0, 0));
    return borrador.crearPrenda();
  }
}
