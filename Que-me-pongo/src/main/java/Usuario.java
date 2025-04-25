import Atuendo.Uniforme;
import Prenda.Prenda;
import java.awt.Color;

public class Usuario {
  private TipoUsuario tipoUsuario;

  public Usuario(TipoUsuario tipoUsuario) {
    this.tipoUsuario = tipoUsuario;
  }

  Uniforme generarUniforme() {
    return new Uniforme(prendaSuperior, prendaInferior, calzado);
  }
}

enum TipoUsuario {
  Cliente,
  Administrador
}
