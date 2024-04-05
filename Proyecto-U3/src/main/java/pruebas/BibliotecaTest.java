package pruebas;

import dominio.Libro;
import dominio.Usuario;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class BibliotecaTest {
    
    // Creamos una instancia de la biblioteca para probar las funcionalidades
    Biblioteca biblioteca = new Biblioteca();
    
    // Prueba para verificar que se puede registrar un préstamo correctamente
    @Test
    public void testRegistrarPrestamo() {
        Libro libro = new Libro("SA654", "El señor de los anillos", "J.R.R. Tolkien");
        Usuario usuario = new Usuario(5, "Juan");
        
        // Realizamos el préstamo del libro
        biblioteca.registrarPrestamo(libro, usuario);
        
        // Verificamos que el libro esté marcado como prestado
        assertTrue(libro.estaPrestado());
    }
    
    // Prueba para verificar que se puede registrar la devolución de un libro
    @Test
    public void testRegistrarDevolucion() {
        Libro libro = new Libro("SA654", "El señor de los anillos", "J.R.R. Tolkien");
        Usuario usuario = new Usuario(5, "Juan");
        
        // Realizamos el préstamo del libro
        biblioteca.registrarPrestamo(libro, usuario);
        
        // Devolvemos el libro
        biblioteca.registrarDevolucion(libro);
        
        // Verificamos que el libro esté marcado como disponible
        assertFalse(libro.estaPrestado());
    }
}

class Biblioteca {
    public void registrarPrestamo(Libro libro, Usuario usuario) {
        libro.setPrestado(true);
    }
    
    public void registrarDevolucion(Libro libro) {
        libro.setPrestado(false);
    }
}
