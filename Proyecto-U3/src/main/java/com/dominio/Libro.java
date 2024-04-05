package com.dominio;

import java.util.Objects;

/**
 *
 * @author Samuel Vega
 */
public class Libro {
    private int id;
    private String titulo;
    private double precio;
    private int cantidad;
    private String editorial;
    private int paginas;
    private String idioma;
    private String isbn;
    private String descripcion;
    private Autor autor;

    public Libro() {}

    public Libro(int id, String titulo, double precio, int cantidad, String editorial, int paginas, String idioma, String isbn, String descripcion, Autor autor) {
        this.id = id;
        this.titulo = titulo;
        this.precio = precio;
        this.cantidad = cantidad;
        this.editorial = editorial;
        this.paginas = paginas;
        this.idioma = idioma;
        this.isbn = isbn;
        this.descripcion = descripcion;
        this.autor = autor;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 47 * hash + this.id;
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
        final Libro other = (Libro) obj;
        return this.id == other.id;
    }

    @Override
    public String toString() {
        return "Libro{" + "id=" + id + ", titulo=" + titulo + ", precio=" + precio + ", cantidad=" + cantidad + ", editorial=" + editorial + ", paginas=" + paginas + ", idioma=" + idioma + ", isbn=" + isbn + ", descripcion=" + descripcion + ", autor=" + autor + '}';
    }

}
