package Atuendo;


import Prenda.Borrador;
import Prenda.Categoria;
import Prenda.Color;
import Prenda.Prenda;
import Prenda.TipoMaterial;
import Prenda.TipoPrenda;

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
