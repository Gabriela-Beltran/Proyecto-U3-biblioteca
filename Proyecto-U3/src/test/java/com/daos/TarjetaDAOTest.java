package com.daos;

import com.dominio.Cliente;
import com.dominio.Tarjeta;
import java.util.Date;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

/**
 *
 * @author Samuel Vega
 */
public class TarjetaDAOTest {
    
    public TarjetaDAOTest() {}
    
    @Test
    public void testAnadir() {
        TarjetaDAO instance = new TarjetaDAO();
        assertTrue(instance.anadir(new Tarjeta(1, new Date(), new Date(), "6441495874", new Cliente(1, "Rigoberto", "Mulberry St. 174", "rigo@gmail.com", "(664) 458 4715", new Date()))));
    }
    
    @Test
    public void testModificar() {
        TarjetaDAO instance = new TarjetaDAO();
        instance.anadir(new Tarjeta(1, new Date(), new Date(), "6441495874", new Cliente(1, "Rigoberto", "Mulberry St. 174", "rigo@gmail.com", "(664) 458 4715", new Date())));
        assertTrue(instance.modificar(new Tarjeta(1, new Date(), new Date(), "6441495885", new Cliente(1, "Rigoberto", "Groove Street #45", "rigo@gmail.com", "(664) 458 4715", new Date()))));
    }
}
