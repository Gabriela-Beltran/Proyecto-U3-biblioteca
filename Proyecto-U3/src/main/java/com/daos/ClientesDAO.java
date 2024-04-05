package com.daos;

import com.dominio.Cliente;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Samuel Vega
 */
public class ClientesDAO {
    List<Cliente> clientes;
    
    public ClientesDAO() {
        clientes = new ArrayList<>();
    }
    
    public Cliente obten(Cliente cliente) {
        for (Cliente cliente2 : clientes) {
            if(cliente2.equals(cliente)) {
                return cliente;
            }
        }
        
        return null;
    }
    
    public boolean anadir(Cliente cliente) {
        clientes.add(cliente);
        
        return obten(cliente) != null;
    }
    
    public boolean modificar(Cliente cliente) {
        return obten(cliente).equals(cliente);
    }
    
}

