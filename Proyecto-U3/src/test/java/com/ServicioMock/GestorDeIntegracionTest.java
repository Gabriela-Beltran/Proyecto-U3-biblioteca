package com.ServicioMock;
import com.daos.LibrosDAO;
import com.dominio.Autor;
import com.dominio.Libro;
import org.junit.*;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;
import java.sql.SQLException;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.core.io.ClassPathResource;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.jdbc.datasource.init.ScriptUtils;

@RunWith(MockitoJUnitRunner.class)
public class GestorDeIntegracionTest {
    
    @Mock
    private ServicioExterno mockServicioExterno;

    @Mock
    private LibrosDAO mockLibrosDAO;

    @InjectMocks
    private GestorDeIntegracion gestorIntegracion;

    @Before
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);
        when(mockServicioExterno.evaluateBook(anyString())).thenReturn(null);
        when(mockLibrosDAO.obtenerPorTitulo(anyString())).thenReturn(new Libro());
        gestorIntegracion = new GestorDeIntegracion(mockLibrosDAO, mockServicioExterno);
    }

    @Test
    public void testAgregarLibro() {
        when(mockServicioExterno.evaluateBook(anyString())).thenReturn(new ResultadoDeEvaluacion(4, "Buena reseña"));
        Libro libro = new Libro();
        when(mockLibrosDAO.obtenerPorTitulo(anyString())).thenReturn(libro);
        gestorIntegracion.processBook("libro");
        verify(mockServicioExterno).evaluateBook("libro");
        assertEquals("Buena reseña", libro.getDescripcion());
    }

    @Test
    public void testActualizarLibro() {
        gestorIntegracion.processBook("It (eso)");
        verify(mockServicioExterno).evaluateBook("It (eso)");
    }

    @Test
    public void testServicioExternoNoDisponible() throws SQLException {
    ServicioExterno mockServicioExterno = mock(ServicioExterno.class);
    when(mockServicioExterno.evaluateBook(anyString())).thenReturn(null);
    GestorDeIntegracion gestorIntegracion = new GestorDeIntegracion(mockLibrosDAO, mockServicioExterno);
    gestorIntegracion.processBook("It (eso)");
    assertEquals("", mockLibrosDAO.obtenerPorTitulo("It (eso)").getDescripcion());
    }
 
}
