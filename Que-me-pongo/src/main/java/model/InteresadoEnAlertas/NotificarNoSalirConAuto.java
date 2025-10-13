package model.InteresadoEnAlertas;

import model.API.AlertaMeteorologica;
import model.API.NotificationService;
import model.Usuario.Usuario;
import java.util.List;
import java.util.Map;

public class NotificarNoSalirConAuto implements InteresadoEnAlertas {
  public void anteAlerta(Map<String, List<String>> alertas, Usuario usuario) {
    NotificationService notificationService = new NotificationService();
    if (alertas.containsValue(AlertaMeteorologica.GRANIZO)) {
      notificationService.send(usuario.getEmail(), "ALERTA DE GRANIZO, EVITAR SALIR EN AUTO");
    }
  }
}
