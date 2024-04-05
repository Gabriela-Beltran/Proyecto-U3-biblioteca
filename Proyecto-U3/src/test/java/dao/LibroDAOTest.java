package dao;

import dominio.Libro;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LibroDAOTest {
    
    public LibroDAOTest() {}
    
    @Test
    public void testAgregarLibro() {
        Libro esperado = new Libro("PP125", "Peter Pan", "James Matthew Barrie"); 
        Libro resultado;
        
        LibroDAO instance = new LibroDAO();
        
        instance.agregarLibro(new Libro("PP125", "Peter Pan", "James Mattew Barrie"));
        
        resultado = instance.obten("PP125");
        
        assertEquals(esperado, resultado);
    }
    
    @Test
    public void testActualizarLibro() {
        Libro esperado = new Libro("PP125", "Peter Pan", "James Matthew Barrie"); 
        Libro resultado;
        
        LibroDAO instance = new LibroDAO();
        
        instance.agregarLibro(new Libro("PP125", "Peter Pan", "James Barrie"));
        instance.actualizarLibro(new Libro("PP125", "Peter Pan", "James Matthew Barrie"));
        
        resultado = instance.obten("PP125");
        
        assertEquals(esperado, resultado);
    }
    
    @Test
    public void testEliminaLibro() {
        Libro resultado;
        
        LibroDAO instance = new LibroDAO();
        
        instance.agregarLibro(new Libro("PP125", "Peter Pan", "James Matthew Barrie"));
        
        instance.eliminarLibro(new Libro("PP125", "Peter Pan", "James Matthew Barrie"));
        
        resultado = instance.obten("PP125");
        
        assertNull(resultado);
    }
    
}
