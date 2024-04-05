package com.dominio;

import java.util.Date;

/**
 *
 * @author Samuel Vega
 */
public class Tarjeta {
    private int id;
    private Date fechaVencimiento;
    private Date fecha;
    private String telefono;
    private Cliente cliente;

    public Tarjeta() {}

    public Tarjeta(int id, Date fechaVencimiento, Date fecha, String telefono, Cliente cliente) {
        this.id = id;
        this.fechaVencimiento = fechaVencimiento;
        this.fecha = fecha;
        this.telefono = telefono;
        this.cliente = cliente;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(Date fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + this.id;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Tarjeta other = (Tarjeta) obj;
        return this.id == other.id;
    }

    @Override
    public String toString() {
        return "Tarjeta{" + "id=" + id + ", fechaVencimiento=" + fechaVencimiento + ", fecha=" + fecha + ", telefono=" + telefono + ", cliente=" + cliente + '}';
    }

}
