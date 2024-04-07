package com.capturas;

import com.dominio.Libro;
import com.dominio.Proveedor;
import java.util.List;

/**
 *
 * @author Samuel Vega
 */
public class ComprasT {
    private final double IVA = 0.16;
    
    private Proveedor proveedor;
    private List<Libro> libros;
    
    public ComprasT(Proveedor proveedor, List<Libro> libros) {
        this.proveedor = proveedor;
        this.libros = libros;
    }
    
    public double totalizar() {
        double precioTotal = 0.0;
        
        for (Libro libro : libros) {
            precioTotal += libro.getPrecio();
        }
        
        precioTotal += (precioTotal*IVA);
        
        return precioTotal;
    }
}
