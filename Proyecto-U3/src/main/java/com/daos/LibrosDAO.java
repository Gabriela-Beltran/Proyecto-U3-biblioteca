package com.daos;

import com.dominio.Libro;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Samuel Vega
 */
public class LibrosDAO {
    List<Libro> libros;
    
    public LibrosDAO() {
        libros = new ArrayList<>();
    }
    
    public Libro obten(Libro libro) {
        for (Libro libro2 : libros) {
            if(libro2.equals(libro)) {
                return libro2;
            }
        }
        
        return null;
    }
    
    public boolean anadir(Libro libro) {
        libros.add(libro);
        
        return obten(libro) != null;
    }
    
    public boolean modificar(Libro libro) {
        return obten(libro).equals(libro);
    }
    
}
