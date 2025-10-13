package model.RegistroAlertas;

import model.API.AlertaMeteorologica;
import java.util.ArrayList;
import java.util.List;
import model.ServicioMeteorologico.ServicioMeteorologicoAccuWeather;

public class RegistroAlertas {
  List<AlertaMeteorologica> alertasActuales = new ArrayList<>();
  ServicioMeteorologicoAccuWeather servicioMeteorologico;

  public RegistroAlertas(ServicioMeteorologicoAccuWeather servicioMeteorologico) {
    this.servicioMeteorologico = servicioMeteorologico;
  }

  public void actualizarAlertas() {
    this.alertasActuales = servicioMeteorologico.getAlertasMetereologicas();
  }
}
