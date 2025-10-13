import controller.HomeController;
import controller.SaludoController;
import spark.ModelAndView;
import spark.Spark;
import spark.template.handlebars.HandlebarsTemplateEngine;

public class Main {
  public static void main(String[] args) {
    Spark.port(9000);
    HandlebarsTemplateEngine engine = new HandlebarsTemplateEngine();

    HomeController homeController = new HomeController();
    SaludoController saludoController = new SaludoController();

    Spark.get("/", homeController::index);
    Spark.get("/bienvenida", saludoController::saludo, engine);
    Spark.get("/despedida", saludoController::despedida, engine);

    // QMP7:
    // 1) Como usuario de QueMePongo quiero ver todas las prendas que tengo en mi guardarropas desde el navegador para poder administrarlas
    // GET /guardarropas -> 200 OK || 500 INTERNAL SERVER ERROR
    // RESPONSE: {tipo: pantalon, tela: ...} en JSON.

    // 2) Como usuario de QueMePongo, quiero crear una prenda desde el navegador.
    // POST /prendas -> 201 CREATED || 406 NOT ACCEPTABLE (Si falta algun parametro)
    // {tipo: remera, color: ..., tela: ...} JSON

    // 3) Como usuario de QueMePongo quiero ver una prenda en particular que tengo en mi guardarropas para poder editarla.
    // GET /prendas/:ID_PRENDA -> 200 OK || 404 NOT FOUND
    // RESPONSE: {tipo: pantalon, tela: ...} en JSON.

    // 4) Como usuario de QueMePongo, quiero poder eliminar una prenda de mi guardarropas.
    // DELETE /prendas/:ID_PRENDA -> 200 OK || 404 NOT FOUND
    // NO BODY

    // 5) Como usuario de QueMePongo, quiero poder ver mis eventos para administrarlos.
    // GET /eventos -> 204 NO CONTENT || 500 INTERNAL SERVER ERROR
    // JSON NO SE COMO ES LA ESTRUCTURA DE UN EVENTO.

    // 6) Como usuario de QueMePongo, quiero poder abrir las sugerencias de prendas para un evento en mi navegador.
    // GET /evento/:ID_EVENTO/sugerencias -> 200 OK || 404 NOT FOUND
    // JSON {tipo: .., color: ..., etc} json de prenda
  }

}
