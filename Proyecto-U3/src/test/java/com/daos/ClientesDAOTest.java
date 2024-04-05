package com.daos;

import com.dominio.Cliente;
import java.util.Date;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

/**
 *
 * @author Samuel Vega
 */
public class ClientesDAOTest {
    
    public ClientesDAOTest() {}

    @Test
    public void testAnadir() {
        ClientesDAO instance = new ClientesDAO();
        assertTrue(instance.anadir(new Cliente(1, "Rigoberto", "Mulberry St. 174", "rigo@gmail.com", "(664) 458 4715", new Date())));
    }
    
    public void testModificar() {
        ClientesDAO instance = new ClientesDAO();
        instance.anadir(new Cliente(1, "Rigoberto", "Mulberry St. 174", "rigo@gmail.com", "(664) 458 4715", new Date()));
        assertTrue(instance.modificar(new Cliente(1, "Rigoberto", "Mulberry St. 174", "rigo24@gmail.com", "(664) 458 4715", new Date())));
    }
}
