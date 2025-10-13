package model.AsesorDeImagen;

import model.API.EstadoDelTiempo;
import model.Atuendo.Atuendo;
import model.Atuendo.Guardarropas;
import model.ServicioMeteorologico.ServicioMeteorologicoAccuWeather;
import java.util.List;

public class AsesorDeImagen {
  private final ServicioMeteorologicoAccuWeather servicioMeteorologico;

  public AsesorDeImagen(ServicioMeteorologicoAccuWeather servicioMeteorologico) {
    this.servicioMeteorologico = servicioMeteorologico;
  }

  public Atuendo sugerirAtuendo(String direccion, Guardarropas guardarropas) {
    EstadoDelTiempo estadoDelTiempo = this.servicioMeteorologico.obtenerCondicionesClimaticas(direccion);
    List<Atuendo> combinaciones = guardarropas.todasLasPosiblesCombinaciones();
    return combinaciones
        .stream()
        .filter(combinacion -> combinacion.aptaParaTemperatura(estadoDelTiempo.temperatura()))
        .filter(combinacion -> combinacion.aptaParaHumedad(estadoDelTiempo.humedad()))
        .findFirst()
        .get();
  }

}
