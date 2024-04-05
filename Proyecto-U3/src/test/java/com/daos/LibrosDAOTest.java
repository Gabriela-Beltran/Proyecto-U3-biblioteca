package com.daos;

import com.dominio.Autor;
import com.dominio.Libro;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

/**
 *
 * @author Samuel Vega
 */
public class LibrosDAOTest {
    
    public LibrosDAOTest() {}
    
    @Test
    public void testAnadir() {
        LibrosDAO instance = new LibrosDAO();
        assertTrue(instance.anadir(new Libro(1, "It (eso)", 145.5, 5, "Penguin Random House", 1504, "Español", "IT-145", "Payasito miedosito", new Autor(1, "Stephen King"))));
    }
    
    @Test
    public void testModificar() {
        LibrosDAO instance = new LibrosDAO();
        instance.anadir(new Libro(1, "It (eso)", 145.5, 5, "Penguin Random House", 1504, "Español", "IT-145", "Payasito miedosito", new Autor(1, "Stephen King")));
        assertTrue(instance.modificar(new Libro(1, "It (eso)", 150, 15, "Penguin Random House", 1504, "Inglés", "IT-146", "Payasito asustadito", new Autor(1, "Stephen King"))));
    }
}
