package model.API;

import java.time.LocalDateTime;

public class RespuestaMeteorologica {
  private final EstadoDelTiempo estadoDelTiempo;
  private final LocalDateTime expiracion;

  public RespuestaMeteorologica(EstadoDelTiempo estadoDelTiempo, LocalDateTime expiracion) {
    this.estadoDelTiempo = estadoDelTiempo;
    this.expiracion = expiracion;
  }

  public boolean expiro() {
    return this.expiracion.isAfter(LocalDateTime.now());
  }

  public EstadoDelTiempo getEstadoDelTiempo() {
    return this.estadoDelTiempo;
  }
}
