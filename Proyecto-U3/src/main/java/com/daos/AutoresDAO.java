package com.daos;

import com.dominio.Autor;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Samuel Vega
 */
public class AutoresDAO {
    List<Autor> autores;
    
    public AutoresDAO() {
        autores = new ArrayList<>();
    }
    
    public Autor obten(Autor autor2) {
        for (Autor autor : autores) {
            if(autor.equals(autor2)) {
                return autor;
            }
        }
        
        return null;
    }
    
    public boolean anadir(Autor autor) {
        autores.add(autor);
        
        return obten(autor) != null;
    }
    
    public boolean modificar(Autor autor) {
        return obten(autor).equals(autor);
    }
    
}
