package model.Prenda;

public class TipoPrenda {
  Categoria categoria;

  public TipoPrenda(Categoria categoria) {
    this.categoria = categoria;
  }

  Categoria categoria() {
    return this.categoria;
  }
}
