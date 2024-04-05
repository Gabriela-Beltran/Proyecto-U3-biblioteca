package com.daos;

import com.dominio.Proveedor;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Samuel Vega
 */
public class ProveedoresDAO {
    List<Proveedor> proveedores;
    
    public ProveedoresDAO() {
        proveedores = new ArrayList<>();
    }
    
    public Proveedor obten(Proveedor proveedor) {
        for (Proveedor proveedor2 : proveedores) {
            if(proveedor2.equals(proveedor)) {
                return proveedor;
            }
        }
        
        return null;
    }
    
    public boolean anadir(Proveedor proveedor) {
        proveedores.add(proveedor);
        
        return obten(proveedor) != null;
    }
    
    public boolean modificar(Proveedor proveedor) {
        return obten(proveedor).equals(proveedor);
    }
    
}
