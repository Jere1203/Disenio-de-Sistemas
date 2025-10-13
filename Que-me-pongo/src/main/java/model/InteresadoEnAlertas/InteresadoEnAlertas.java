package model.InteresadoEnAlertas;

import model.Usuario.Usuario;
import java.util.List;
import java.util.Map;

public interface InteresadoEnAlertas {
  public void anteAlerta(Map<String, List<String>> alertas, Usuario usuario);
}
