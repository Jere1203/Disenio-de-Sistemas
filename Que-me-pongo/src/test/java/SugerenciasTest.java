import Atuendo.Sugerencia;
import Prenda.Categoria;
import Prenda.Color;
import Prenda.Formalidad;
import Prenda.MotorSugerenciasEstandar;
import Prenda.MotorSugerenciasRopaInformal;
import Prenda.Prenda;
import Prenda.TipoMaterial;
import Prenda.TipoPrenda;
import Prenda.Trama;
import Usuario.Usuario;
import java.util.Arrays;
import java.util.List;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class SugerenciasTest {
  MotorSugerenciasRopaInformal motorSugerenciasInformal = new MotorSugerenciasRopaInformal();
  Usuario usuarioMayor = new Usuario(56, motorSugerenciasInformal);
  Usuario usuarioJoven = new Usuario(21, new MotorSugerenciasEstandar());

  Prenda zapatos = new Prenda(new TipoPrenda(Categoria.Calzado),
      TipoMaterial.CUERO,
      new Color(0, 255, 0),
      new Color(255, 255, 255),
      Trama.LISA,
      Formalidad.FORMAL
  );
  Prenda camisa = new Prenda(new TipoPrenda(Categoria.ParteSuperior),
      TipoMaterial.LANA,
      new Color(255, 255, 255),
      new Color(255, 255, 255),
      Trama.LISA,
      Formalidad.FORMAL
  );

  Prenda jean = new Prenda(new TipoPrenda(Categoria.ParteInferior),
      TipoMaterial.LANA,
      new Color(127, 255, 127),
      new Color(255, 255, 255),
      Trama.LISA,
      Formalidad.FORMAL
  );

  Prenda zapatillas = new Prenda(new TipoPrenda(Categoria.Calzado),
      TipoMaterial.LANA,
      new Color(0, 255, 0),
      new Color(255, 255, 255),
      Trama.LISA,
      Formalidad.INFORMAL
  );
  Prenda remera = new Prenda(new TipoPrenda(Categoria.ParteSuperior),
      TipoMaterial.LANA,
      new Color(255, 255, 255),
      new Color(255, 255, 255),
      Trama.LISA,
      Formalidad.INFORMAL
  );

  Prenda jogging = new Prenda(new TipoPrenda(Categoria.ParteInferior),
      TipoMaterial.LANA,
      new Color(127, 255, 127),
      new Color(255, 255, 255),
      Trama.LISA,
      Formalidad.INFORMAL
  );

  @Test
  public void seGeneranSugerenciasFormalesParaUsuarioMayor() {
    List<Prenda> prendas = Arrays.asList(zapatos, camisa, jean);
    usuarioMayor.setPrendas(prendas);
    Sugerencia sugerencia = usuarioMayor.generarSugerencia();
    Assertions.assertEquals(remera, sugerencia.getPrendaSuperior());
    Assertions.assertEquals(jean, sugerencia.getPrendaInferior());
    Assertions.assertEquals(zapatillas, sugerencia.getCalzado());
  }

  @Test
  public void seGeneranSugerenciasInformalesParaUsuario() {
    List<Prenda> prendas = Arrays.asList(zapatillas, remera, jogging);
    usuarioJoven.setPrendas(prendas);
    Sugerencia sugerencia = usuarioJoven.generarSugerencia();
    Assertions.assertEquals(remera, sugerencia.getPrendaSuperior());
    Assertions.assertEquals(jogging, sugerencia.getPrendaInferior());
    Assertions.assertEquals(zapatillas, sugerencia.getCalzado());
  }

}
