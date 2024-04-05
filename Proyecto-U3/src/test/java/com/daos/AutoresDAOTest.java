package com.daos;

import com.dominio.Autor;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

/**
 *
 * @author Samuel Vega
 */
public class AutoresDAOTest {
    
    public AutoresDAOTest() {}
    
    @Test
    public void testAnadir() {
        AutoresDAO instance = new AutoresDAO();
        assertTrue(instance.anadir(new Autor(1, "Stephen King")));
    }
    
    @Test
    public void testModificar() {
        AutoresDAO instance = new AutoresDAO();
        instance.anadir(new Autor(1, "Stephen King"));
        assertTrue(instance.modificar(new Autor(1, "Lewis Carroll")));
    }
    
}
