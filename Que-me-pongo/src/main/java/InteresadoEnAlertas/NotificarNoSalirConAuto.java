package InteresadoEnAlertas;

import API.AlertaMeteorologica;
import API.NotificationService;
import Usuario.Usuario;
import java.util.List;
import java.util.Map;

public class NotificarNoSalirConAuto implements InteresadoEnAlertas {
  public void anteAlerta(Map<String, List<String>> alertas, Usuario usuario) {
    NotificationService notificationService;
    if (alertas.containsValue(AlertaMeteorologica.GRANIZO)) {
      notificationService.send(usuario.getEmail(), "ALERTA DE GRANIZO, EVITAR SALIR EN AUTO");
    }
  }
}
