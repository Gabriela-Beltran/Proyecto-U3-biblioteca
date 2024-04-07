package com.capturas;

import com.dominio.Cliente;
import com.dominio.Libro;
import java.util.List;

/**
 *
 * @author Samuel Vega
 */
public class VentasT {
    private final double IVA = 0.16;
    
    private Cliente cliente;
    private List<Libro> libros;
    
    public VentasT(Cliente cliente, List<Libro> libros) {
        this.cliente = cliente;
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
