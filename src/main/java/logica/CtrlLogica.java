package logica;

import java.util.List;
import persistencia.CtrlPersistencia;

public class CtrlLogica {
    CtrlPersistencia ctrlP;

    public CtrlLogica() {
        ctrlP = new CtrlPersistencia();
    }
    
    // Espacio para los metodos necesarios para el manejo de la base de datos
    public boolean validarUsuario(String usuario, String password){
        // Traemos de la base de datos todos los usuarios
        List<Usuario> lista = ctrlP.retornarTodosLosUsuarios();
        
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).getNombre().equals(usuario) && lista.get(i).getContraseña().equals(password)) {
                return true;
            }
        }
        return false;
    }
}
