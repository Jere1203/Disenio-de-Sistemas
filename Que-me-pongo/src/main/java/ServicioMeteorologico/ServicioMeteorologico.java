package ServicioMeteorologico;

import API.AlertaMeteorologica;
import API.EstadoDelTiempo;
import java.util.ArrayList;
import java.util.List;

public interface ServicioMeteorologico {
  EstadoDelTiempo obtenerCondicionesClimaticas(String direccion);
  List<AlertaMeteorologica> alertasActuales = new ArrayList<>();
}
