package RegistroAlertas;

import API.AlertaMeteorologica;
import ServicioMeteorologico.ServicioMeteorologico;
import ServicioMeteorologico.ServicioMeteorologicoAccuWeather;
import java.util.ArrayList;
import java.util.List;

public class RegistroAlertas {
  List<AlertaMeteorologica> alertasActuales = new ArrayList<>();
  ServicioMeteorologicoAccuWeather servicioMeteorologico;

  public RegistroAlertas(ServicioMeteorologicoAccuWeather servicioMeteorologico) {
    this.servicioMeteorologico = servicioMeteorologico;
  }

  public void actualizarAlertas() {
    this.alertasActuales = servicioMeteorologico.getAlertasMeteorologicas();
  }
}
