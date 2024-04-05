package dao;

import dominio.Usuario;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class UsuarioDAOTest {
    
    public UsuarioDAOTest() {}

    @Test
    public void testRegistrarUsuario() {
        Usuario esperado = new Usuario(2, "Pedro");
        Usuario resultado;
        
        UsuarioDAO instance = new UsuarioDAO();
        
        instance.registrarUsuario(new Usuario(2, "Pedro"));
        
        resultado = instance.obten(2);
        
        assertEquals(esperado, resultado);
    }

    @Test
    public void testActualizarUsuario() {
        Usuario esperado = new Usuario(2, "Pablo");
        Usuario resultado;
        
        UsuarioDAO instance = new UsuarioDAO();
        
        instance.registrarUsuario(new Usuario(2, "Pedro"));
        instance.actualizarUsuario(new Usuario(2, "Pablo"));
        
        resultado = instance.obten(2);
        
        assertEquals(esperado, resultado);
    }
    
}
