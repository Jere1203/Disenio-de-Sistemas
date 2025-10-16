package controller;

import java.util.HashMap;
import java.util.Map;
import model.Usuario.Usuario;
import repositories.RepositorioUsuario;
import spark.ModelAndView;
import spark.Request;
import spark.Response;

public class SessionController {

  public ModelAndView mostrarLogin(Request req, Response res) {
    Map<String, Object> modelo = new HashMap<>();
    return new ModelAndView(modelo, "formulario-login.html.hbs");
  }

  public ModelAndView crearSesion(Request req, Response res) {
    try {
      Usuario usuario = RepositorioUsuario.instance()
                                          .buscarPorUsuarioYContrasenia(
                                              req.queryParams("nombre"),
                                              req.queryParams("contrasenia")
                                          );
      req.session()
         .attribute("user_id", usuario.getId());
      res.redirect("/");
      return null;
    } catch (Exception e) {
      res.redirect("/login");
      return null;
    }
  }
}
