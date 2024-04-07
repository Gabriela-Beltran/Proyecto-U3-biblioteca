/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ServicioMock;
import javax.sql.DataSource;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.core.io.ClassPathResource;
import org.springframework.jdbc.datasource.init.ScriptUtils;
/**
 *
 * @author DELL
 */
public class BaseDeDatos {
    private DataSource dataSource;

    public BaseDeDatos() {
        inicializar();
    }

    public DataSource getDataSource() {
        return dataSource;
    }

    private void inicializar() {
        dataSource = new DriverManagerDataSource("jdbc:h2:mem:test;MODE=MYSQL", "sa", "sa");
        try {
            ScriptUtils.executeSqlScript(dataSource.getConnection(), new ClassPathResource("sql-scripts/test-data.sql"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
