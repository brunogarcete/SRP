package persistencia;

import java.util.List;
import logica.Usuario;

public class CtrlPersistencia {
    UsuarioJpaController ctrlJpa;

    public CtrlPersistencia() {
        ctrlJpa = new UsuarioJpaController();
    }

    public List<Usuario> retornarTodosLosUsuarios() {
        return ctrlJpa.findUsuarioEntities();
    }
}
