package com.capturas;

import com.dominio.Autor;
import com.dominio.Cliente;
import com.dominio.Libro;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

/**
 *
 * @author Samuel Vega
 */
public class VentasTest {
    
    public VentasTest() {}
    
    @Test
    public void testTotalizar() {
        List<Libro> libros = new ArrayList<>();
        
        Cliente cliente = new Cliente(1, "Rigoberto", "Mulberry St. 174", "rigo@gmail.com", "(664) 458 4715", new Date());
        Libro libro1 = new Libro(1, "It (eso)", 145.5, 5, "Penguin Random House", 1504, "Español", "IT-145", "Payasito miedosito", new Autor(1, "Stephen King"));
        Libro libro2 = new Libro(2, "13 Reasons Why", 251.29, 10, "Penguin Books", 320, "Español", "RW-135", "Ay, Hannah", new Autor(1, "Jay Asher"));
        Libro libro3 = new Libro(3, "A Clockwork Orange", 278.0, 8, "Penguin Random House", 192, "Inglés", "NM-196", "Mucho trauma?", new Autor(1, "Anthony Burgess"));
        
        libros.add(libro1);
        libros.add(libro2);
        libros.add(libro3);
        
        VentasT instance = new VentasT(cliente, libros);
        
        assertEquals(782.7564, instance.totalizar());
    }
}
