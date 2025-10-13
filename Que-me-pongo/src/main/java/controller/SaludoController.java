package controller;

import spark.ModelAndView;
import spark.Request;
import spark.Response;

public class SaludoController {
  public ModelAndView saludo(Request req, Response res) {
    return new ModelAndView(req.queryParamOrDefault("nombre", "mundo"), "bienvenida.html.hbs");
  }

  public ModelAndView despedida(Request req, Response res) {
    return new ModelAndView(req.queryParamOrDefault("nombre", "mundo"), "despedida.html.hbs");
  }
}
