package ServicioMeteorologico;

import API.AccuWeatherAPI;
import API.EstadoDelTiempo;
import API.Humedad;
import API.RespuestaMeteorologica;
import java.time.Duration;
import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

public class ServicioMeteorologicoAccuWeather implements ServicioMeteorologico {
  private final Map<String, RespuestaMeteorologica> ultimasRespuestas;
  private final AccuWeatherAPI api;
  private final Duration periodoDeValidez;

  public ServicioMeteorologicoAccuWeather(AccuWeatherAPI api, Duration periodoDeValidez) {
    this.api = api;
    this.periodoDeValidez = periodoDeValidez;
    this.ultimasRespuestas = new HashMap<>();
  }

  public EstadoDelTiempo obtenerCondicionesClimaticas(String direccion) {
    if (
        !this.ultimasRespuestas.containsKey(direccion)
            || this.ultimasRespuestas.get(direccion).expiro()) {
      ultimasRespuestas.put(
          direccion,
          new RespuestaMeteorologica(this.consultarApi(direccion), proximaExpiracion()));
    }
    return this.ultimasRespuestas.get(direccion).getEstadoDelTiempo();
  }

  private LocalDateTime proximaExpiracion() {
    return LocalDateTime.now().plus(this.periodoDeValidez);
  }

  private EstadoDelTiempo consultarApi(String direccion) {
    Map<String, Object> respuesta = this.api.getWeather(direccion).get(0);
    int temperatura = (int) respuesta.get("Temperature");
    Humedad humedad = (double) respuesta.get("Humidity") > 0.8 ? Humedad.ALTA : Humedad.BAJA;
    return new EstadoDelTiempo(temperatura, humedad);
  }

}
