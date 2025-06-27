package InteresadoEnAlertas;

import API.AlertaMeteorologica;
import API.NotificationService;
import Usuario.Usuario;
import java.util.List;
import java.util.Map;

public class NotificarSalirConParaguas {
  public void anteAlerta(Map<String, List<String>> alertas, Usuario usuario) {
    NotificationService notificationService;
    if (alertas.containsValue(AlertaMeteorologica.TORMENTA)) {
      notificationService.send(usuario.getEmail(), "ALERTA DE TORMENTA, SALIR CON PARAGUAS");
    }
  }
}
