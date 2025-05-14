import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertSame;

import Atuendo.Uniforme;
import Atuendo.UniformeSanJuan;
import Prenda.Borrador;
import Prenda.Categoria;
import Prenda.Color;
import Prenda.Prenda;
import Prenda.TipoMaterial;
import Prenda.TipoPrenda;
import Prenda.Trama;
import org.junit.Test;

public class QMPTest {
  Borrador borrador = new Borrador();
  TipoPrenda zapatillas = new TipoPrenda(Categoria.ParteInferior);

  @Test
  public void laPrendaSeCreaConExito() {
    borrador.especificarTipo(zapatillas);
    borrador.especificarMaterial(TipoMaterial.LANA);
    borrador.especificarTrama(Trama.LISA);
    borrador.especificarColorPrincial(new Color(0, 255, 0));
    borrador.especificarColorSecundario(new Color(255, 255, 255));
    assertDoesNotThrow(() -> borrador.crearPrenda());
  }

  @Test
  public void siNoDetalloTramaEstaEsLisa() {
    borrador.especificarTipo(zapatillas);
    borrador.especificarMaterial(TipoMaterial.LANA);
    borrador.especificarTrama(null);
    borrador.especificarColorPrincial(new Color(0, 255, 0));
    borrador.especificarColorSecundario(new Color(255, 255, 255));
    Prenda prendaAux = borrador.crearPrenda();
    assertSame(Trama.LISA, prendaAux.getTrama());
  }

  @Test
  public void seCreaUnUniformeParaColegioSanJuan() {
    UniformeSanJuan builderSanJuan = new UniformeSanJuan();
    Prenda camisaSanJuan = builderSanJuan.fabricarPrendaSuperior();
    Prenda pantalonSanJuan = builderSanJuan.fabricarPrendaInferior();
    Prenda calzadoSanJuan = builderSanJuan.fabricarCalzado();
    assertDoesNotThrow(() -> new Uniforme(camisaSanJuan, pantalonSanJuan, calzadoSanJuan));
  }
}
