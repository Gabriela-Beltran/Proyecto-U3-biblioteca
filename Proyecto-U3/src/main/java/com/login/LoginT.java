package com.login;

import com.daos.UsuariosDAO;
import com.dominio.Usuario;

/**
 *
 * @author Samuel Vega
 */
public class LoginT {
    UsuariosDAO users;
    
    public LoginT(UsuariosDAO users) {
        this.users = users;
    }
    
    public boolean login(String user, String psw) {
        Usuario usuario = users.obtenPorUser(user);
        
        return psw.equals(usuario.getPsw());
    }
}
