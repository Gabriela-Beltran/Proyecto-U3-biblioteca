package com.login;

import com.daos.UsuariosDAO;
import com.dominio.Usuario;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

/**
 *
 * @author Samuel Vega
 */
public class LoginTest {
    
    public LoginTest() {}
    
    @Test
    public void testLogin() {
        UsuariosDAO users = new UsuariosDAO();
        users.anadir(new Usuario(1, "elias", "elias"));
        
        LoginT instance = new LoginT(users);
        
        assertTrue(instance.login("elias", "elias"));
    }
}
