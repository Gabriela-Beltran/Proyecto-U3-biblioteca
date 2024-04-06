/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.daos;

import com.dominio.Tarjeta;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author atrap
 */
public class TarjetasDAO {
    List<Tarjeta> tarjetas;
    
    public TarjetasDAO() {
        tarjetas = new ArrayList<>();
    }
    
    public Tarjeta obten(Tarjeta tarjeta) {
        for (Tarjeta tarjeta2 : tarjetas) {
            if(tarjeta2.equals(tarjeta)) {
                return tarjeta2;
            }
        }
        
        return null;
    }
    
    public boolean anadir(Tarjeta tarjeta) {
        tarjetas.add(tarjeta);
        
        return obten(tarjeta) != null;
    }
    
    public boolean modificar(Tarjeta tarjeta) {
        return obten(tarjeta).equals(tarjeta);
    }
    
}
