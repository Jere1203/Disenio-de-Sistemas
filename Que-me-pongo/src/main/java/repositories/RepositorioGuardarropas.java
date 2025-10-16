package repositories;

import io.github.flbulgarelli.jpa.extras.simple.WithSimplePersistenceUnit;
import java.util.Collection;
import model.Atuendo.Guardarropas;

public class RepositorioGuardarropas implements WithSimplePersistenceUnit {
  private static final RepositorioGuardarropas INSTANCE = new RepositorioGuardarropas();

  public static RepositorioGuardarropas instance() {
    return INSTANCE;
  }

  public Collection<Guardarropas> obtenerTodos() {
    return entityManager().createQuery("from Guardarropa", Guardarropas.class).getResultList();
  }
}
