package repositories;

import io.github.flbulgarelli.jpa.extras.simple.WithSimplePersistenceUnit;
import model.Usuario.Usuario;
import org.apache.commons.codec.digest.DigestUtils;

public class RepositorioUsuario implements WithSimplePersistenceUnit {
  private static final RepositorioUsuario INSTANCE = new RepositorioUsuario();

  public static RepositorioUsuario instance() {
    return INSTANCE;
  }

  public Usuario buscarPorUsuarioYContrasenia(String nombre, String contrasenia) {
    return entityManager().createQuery("from Usuario where nombre = :nombre and hashContrasenia := :hashContrasenia", Usuario.class)
        .setParameter("nombre", nombre)
        .setParameter("hashContrasenia", DigestUtils.sha256Hex(contrasenia))
        .getResultList()
        .get(0);
  }
}
