package main;

import controller.DemoController;
import controller.SessionController;
import io.github.flbulgarelli.jpa.extras.simple.WithSimplePersistenceUnit;
import javax.persistence.PersistenceException;
import spark.Spark;
import spark.template.handlebars.HandlebarsTemplateEngine;

public class Routes implements WithSimplePersistenceUnit {

  public static void main(String[] args) {
    new Bootstrap().run();
    new Routes().start();
  }

  public void start() {
    System.out.println("Iniciando servidor");
    Spark.port(8080);
    Spark.staticFileLocation("/public");

    var engine = new HandlebarsTemplateEngine();
    var demoController = new DemoController();
    var sessionController = new SessionController();

    Spark.get("/", demoController::listar, engine);
    Spark.get("/login", sessionController::mostrarLogin, engine);
    Spark.post("/login", sessionController::crearSesion);

    Spark.exception(
        PersistenceException.class, (e, request, response) -> {
          response.redirect("/500");
        }
    );

    Spark.before(((request, response) -> entityManager().clear()));
  }
}
