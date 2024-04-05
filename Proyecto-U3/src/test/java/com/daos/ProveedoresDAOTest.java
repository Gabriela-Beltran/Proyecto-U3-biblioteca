package com.daos;

import com.dominio.Proveedor;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

/**
 *
 * @author Samuel Vega
 */
public class ProveedoresDAOTest {
    
    public ProveedoresDAOTest() {}
    
    @Test
    public void testAnadir() {
        ProveedoresDAO instance = new ProveedoresDAO();
        assertTrue(instance.anadir(new Proveedor(1, "Pedro Nuñez", "Groove Street #78", "pedrote@gmail.com", "6441594948")));
    }
    
    @Test
    public void testModificar() {
        ProveedoresDAO instance = new ProveedoresDAO();
        instance.anadir(new Proveedor(1, "Pedro Nuñez", "Groove Street #78", "pedrote@gmail.com", "6441594948"));
        assertTrue(instance.modificar(new Proveedor(1, "Pedro Nuñez", "Groove Street #78", "pedrito@gmail.com", "6441594950")));
    }
}
