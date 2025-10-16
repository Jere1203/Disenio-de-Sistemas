package controller;

import io.github.flbulgarelli.jpa.extras.simple.WithSimplePersistenceUnit;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import spark.ModelAndView;
import spark.Request;
import spark.Response;

public class DemoController implements WithSimplePersistenceUnit {
  public ModelAndView listar(Request req, Response res) {
    Map<String, Object> modelo = new HashMap<>();
    modelo.put("anio",
               LocalDate.now()
                        .getYear()
    );
    modelo.put("sesionIniciada",
               req.session()
                  .attribute("user_id") != null
    );
    return new ModelAndView(modelo, "index.html.hbs");
  }
}
