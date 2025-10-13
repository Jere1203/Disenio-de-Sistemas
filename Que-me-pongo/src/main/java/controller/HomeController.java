package controller;

import spark.ModelAndView;
import spark.Request;
import spark.Response;

public class HomeController {
  public Void index(Request req, Response res) {
    res.redirect("/bienvenida");
    return null;
  }
}
