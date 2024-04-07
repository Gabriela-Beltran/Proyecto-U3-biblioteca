package com.daos;

import com.dominio.Libro;
import java.util.ArrayList;
import java.util.List;
import org.springframework.jdbc.core.JdbcTemplate;

public class LibrosDAO {
   private final List<Libro> libros;
   private JdbcTemplate jdbcTemplate;
    
    public LibrosDAO(JdbcTemplate jdbcTemplate) {
        this.libros = new ArrayList<>();
        this.jdbcTemplate = jdbcTemplate;
    }
    
    public LibrosDAO() {
        libros = new ArrayList<>();
    }
    
    public Libro obtenerPorTitulo(String titulo) {
        for (Libro libro : libros) {
            if (libro.getTitulo().equals(titulo)) {
                return libro;
            }
        }
        return null; 
    }

    public Libro obtenerPorId(int id) {
        for (Libro libro : libros) {
            if (libro.getId() == id) {
                return libro;
            }
        }
        return null;
    }
    
    public boolean anadir(Libro libro) {
        libros.add(libro);
        return true;
    }

    public boolean modificar(Libro libro) {
        return libros.contains(libro);
    }
}
