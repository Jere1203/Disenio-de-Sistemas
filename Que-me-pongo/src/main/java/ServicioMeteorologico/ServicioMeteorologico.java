package ServicioMeteorologico;

import API.EstadoDelTiempo;

public interface ServicioMeteorologico {
  EstadoDelTiempo obtenerCondicionesClimaticas(String direccion);
}
