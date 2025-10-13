import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertSame;

import model.Atuendo.Uniforme;
import model.Atuendo.UniformeSanJuan;
import model.Prenda.Borrador;
import model.Prenda.Categoria;
import model.Prenda.Color;
import model.Prenda.Prenda;
import model.Prenda.TipoMaterial;
import model.Prenda.TipoPrenda;
import model.Prenda.Trama;
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
