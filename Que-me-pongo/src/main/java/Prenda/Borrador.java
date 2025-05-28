package Prenda;

import Exceptions.PrendaInvalidaException;
import java.util.Objects;

public class Borrador {
  Color colorPrincipal;
  Color colorSecundario;
  TipoMaterial materialPrenda;
  TipoPrenda tipoPrenda;
  Trama trama;
  Formalidad formalidad;

  public void especificarTipo(TipoPrenda tipoPrenda) {
    this.tipoPrenda = Objects.requireNonNull(tipoPrenda);
    ;
  }

  public void especificarTrama(Trama trama) {
    this.trama = Objects.requireNonNullElse(trama, Trama.LISA);
  }

  public void especificarMaterial(TipoMaterial materialPrenda) {
    this.materialPrenda = Objects.requireNonNull(materialPrenda);
  }

  public void especificarColorPrincial(Color colorPrincipal) {
    this.colorPrincipal = Objects.requireNonNull(colorPrincipal);
  }

  public void especificarColorSecundario(Color colorSecundario) {
    this.colorSecundario = Objects.requireNonNull(colorSecundario);
  }

  public void especificarFormalidad(Formalidad formalidad) {
    this.formalidad = Objects.requireNonNull(formalidad);
  }

  public Prenda crearPrenda() {
    validarParametros();
    return new Prenda(this.tipoPrenda, this.materialPrenda, this.colorPrincipal, this.colorSecundario, this.trama, this.formalidad);
  }

  void validarParametros() {
    if (this.tipoPrenda == null) {
      throw new PrendaInvalidaException("Falta tipo de prenda");
    }
    if (this.materialPrenda == null) {
      throw new PrendaInvalidaException("Falta material de la prenda");
    }
    if (this.colorPrincipal == null) {
      throw new PrendaInvalidaException("Falta color principal de la prenda");
    }
  }
}
