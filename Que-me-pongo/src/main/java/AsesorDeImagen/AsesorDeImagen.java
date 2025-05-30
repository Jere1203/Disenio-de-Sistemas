package AsesorDeImagen;

import API.EstadoDelTiempo;
import Atuendo.Atuendo;
import Atuendo.Guardarropas;
import ServicioMeteorologico.ServicioMeteorologicoAccuWeather;
import java.util.List;

public class AsesorDeImagen {
  private ServicioMeteorologicoAccuWeather servicioMeteorologico;

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
