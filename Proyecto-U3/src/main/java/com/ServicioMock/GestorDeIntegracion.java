package com.ServicioMock;
import com.daos.LibrosDAO;
import com.dominio.Libro;

public class GestorDeIntegracion {
 private ServicioExterno servicioExterno;
    private LibrosDAO librosDAO;

    public GestorDeIntegracion(LibrosDAO librosDAO, ServicioExterno servicioExterno) {
        this.librosDAO = librosDAO;
        this.servicioExterno = servicioExterno;
    }

  public void processBook(String bookTitle) {
      ResultadoDeEvaluacion resultado = servicioExterno.evaluateBook(bookTitle);
    Libro libro = librosDAO.obtenerPorTitulo(bookTitle);
    
    if (resultado != null) {
        // Si hay un resultado del servicio externo, actualizar la descripción del libro
        libro.setDescripcion(resultado.getReview());
    } else {
        // Si el resultado del servicio externo es nulo, establecer la descripción del libro como una cadena vacía
        libro.setDescripcion("");
    }
}
}
