package Prenda;


// La trama de una prenda puede ser un enum, todavía no tengo comportamiento definido para esos atributos por lo que
// composición sería mucho.


import java.util.Objects;

public class Prenda {
  Color colorPrincipal;
  Color colorSecundario;
  TipoMaterial materialPrenda;
  TipoPrenda tipoPrenda;
  Trama trama;

  public Prenda(TipoPrenda tipoPrenda, TipoMaterial materialPrenda, Color colorPrincipal, Color colorSecundario, Trama trama) {
    //validarConstructor(tipoPrenda, materialPrenda, colorPrincipal);
    this.tipoPrenda = tipoPrenda;
    this.materialPrenda = materialPrenda;
    this.trama = Objects.requireNonNullElse(trama, Trama.LISA);
    this.colorPrincipal = colorPrincipal;
    this.colorSecundario = colorSecundario;
  }

  public Trama getTrama() {
    return this.trama;
  }

  void setTrama(Trama unaTrama) {
    trama = unaTrama;
  }

  // Como usuario de QuéMePongo, quiero evitar que haya prendas sin tipo, tela, categoría o color primario.
//  Categoria getCategoria() {
//    return tipoPrenda.getCategoria();
//  }

  TipoMaterial getMaterial() {
    return materialPrenda;
  }

  Color getColorPrincipal() {
    return colorPrincipal;
  }

  void materialPrenda(TipoMaterial unMaterial) {
    materialPrenda = unMaterial;
  }

  void colorPrincipal(Color unColor) {
    colorPrincipal = unColor;
  }

  void colorSecundario(Color unColor) {
    colorSecundario = unColor;
  }

//  public enum TipoPrenda {
//    CAMISA(Categoria.ParteSuperior),
//    REMERA(Categoria.ParteSuperior),
//    PANTALON(Categoria.ParteInferior);
//
//    public final Categoria categoria;
//
//    TipoPrenda(Categoria categoria) {
//      this.categoria = categoria;
//    }
//
//    public Categoria getCategoria() {
//      return categoria;
//    }
//
//  }
}

// -Como usuario de QuéMePongo, quiero crear una prenda especificando primero de qué tipo es.
// NOTE: Quizás poniendo sólo el atributo tipoPrenda en el constructor y después configurar el resto de la prenda vía setters es buena idea.

// Por ahí conviene que dentro de Material estén también los atributos de colorPrincipal, secundario, tipo de tela y
// tipo de material.

// Para el tipo de trama ppal. podría usar una verificación que, en caso de no especificar el tipo de trama, ponga lisa
// de una.
// NOTE: Opté por generar todas las prendas con trama lisa y que después vía setter se pueda modificar.

// Para backup de prendas puedo instanciar con los atributos ya especificados y con setters terminar de configurarla.
// NOTE: Terminé por crear la clase GestorPrendas donde guardo en una coleccion privada las prendas que voy generando para modificarlas en un futuro en caso de necesitarlo.

// Previo a guardar la prenda verificar que sea valida, o validar en cada paso donde se pueda dar una situación de invalidez.
// NOTE: Cómo manejo las inconsistencias del tipo de material según el tipo de prenda???

// BONUS:
// Para las sugerencias podría guardar algunos uniformes para eso mismo.

// Validar que un uniforme tiene prendas de tipo superior, inferior y calzado.

// El administrador tiene que poder crear uniformes, tratar al adminstrador como una subclase de Usuario???