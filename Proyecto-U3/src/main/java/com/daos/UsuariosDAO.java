package com.daos;

import com.dominio.Usuario;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Samuel Vega
 */
public class UsuariosDAO {
    List<Usuario> usuarios;
    
    public UsuariosDAO() {
        usuarios = new ArrayList<>();
    }
    
    public Usuario obten(Usuario user) {
        for (Usuario user2 : usuarios) {
            if(user2.equals(user)) {
                return user2;
            }
        }
        
        return null;
    }
    
    public Usuario obtenPorUser(String user) {
        for (Usuario user2 : usuarios) {
            if(user.equals(user2.getUser())) {
                return user2;
            }
        }
        
        return null;
    }
    
    public boolean anadir(Usuario usuario) {
        usuarios.add(usuario);
        
        return obten(usuario) != null;
    }
    
    public boolean modificar(Usuario usuario) {
        return obten(usuario).equals(usuario);
    }
    
}
