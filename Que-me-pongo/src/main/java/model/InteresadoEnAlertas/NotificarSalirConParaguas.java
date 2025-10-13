package model.InteresadoEnAlertas;

import model.API.AlertaMeteorologica;
import model.API.NotificationService;
import model.Usuario.Usuario;
import java.util.List;
import java.util.Map;

public class NotificarSalirConParaguas {
  public void anteAlerta(Map<String, List<String>> alertas, Usuario usuario) {
    NotificationService notificationService;
    if (alertas.containsValue(AlertaMeteorologica.TORMENTA)) {
      //notificationService.send(usuario.getEmail(), "ALERTA DE TORMENTA, SALIR CON PARAGUAS");
    }
  }
}
