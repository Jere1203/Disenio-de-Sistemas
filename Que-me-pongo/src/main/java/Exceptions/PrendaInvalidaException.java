package Exceptions;

public class PrendaInvalidaException extends RuntimeException {
  public PrendaInvalidaException(String motivo) {
    super("La prenda es invalida porque " + motivo);
  }
}
