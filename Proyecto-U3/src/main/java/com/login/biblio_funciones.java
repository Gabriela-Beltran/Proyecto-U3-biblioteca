/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.login;

import com.funciones.Api;
import com.itextpdf.text.pdf.Barcode;


import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.WindowConstants;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.text.View;

public class biblio_funciones {
    

    public static String crearXML(String datos){  
        List<String> lista = tratarRequest(datos);
        //Crear un xml con los datos
        String xml = """
                     <?xml version="1.0" encoding="UTF-8"?>
                     <!DOCTYPE xml>
                     <xml>
                     """;
        xml += "<filas>\n";
        for (String fila : lista) {
            String[] columnas = fila.split("_");
            //Contar los campos de la fila para saber cuantos son y ponerlos en el xml
           
            xml += "<fila>\n";
            for (int i = 0; i < columnas.length; i++) {
                xml += "<campo"+i+">"+columnas[i]+"</campo"+i+">\n";
            }
            xml += "</fila>\n";
        }
        xml += "</filas>\n";
        xml += "</xml>";

        //direccion donde se va a guardar el archivo dentro de reportes
        String ruta = "src\\Reportes\\consultas.xml";
        
        //guardar el xml en un archivo
        java.io.File archivo = new java.io.File(ruta);

        try {
            java.io.FileWriter escribir = new java.io.FileWriter(archivo, false);
            escribir.write(xml);
            escribir.close();
        } catch (java.io.IOException ex) {
            mensaje("Error al escribir el archivo","Error",2);
        }

        mensaje("Archivo creado con exito", "CONSULTA REALIZADA", 1);
        return ruta;
    }
    
  
    //Dialog que pide un string
    public static String pedirString(String mensaje, String titulo){
        String respuesta = javax.swing.JOptionPane.showInputDialog(null, mensaje, titulo, 3);
        return respuesta;
    }
    //Dialog que pide seleccionar de un combobox
    public static String mensajeCombo(String mensaje, String titulo, String[] opciones){
        String respuesta = (String) javax.swing.JOptionPane.showInputDialog(null, mensaje, titulo, 3, null, opciones, opciones[0]);
        //separar por __ para obtener el id 
        String[] id = respuesta.split("__");
        respuesta = id[0];
        return respuesta;

    }
    //MessageBox personalizado con un mensaje, un titulo y un tipo de mensaje
    public static void mensaje(String mensaje, String titulo, int tipo){
        javax.swing.JOptionPane.showMessageDialog(null, mensaje, titulo, tipo);
        //ejemplo de uso: mensaje("Mensaje de prueba", "Titulo de prueba", 1);
    }
    //MessageBox personalizado con un mensaje, un titulo y 2 botones de respuesta
    public static int mensajeDecision(String mensaje, String titulo, String boton1, String boton2){
        int respuesta = javax.swing.JOptionPane.showConfirmDialog(null, mensaje, titulo, 0, 3, null);
        return respuesta;
    }

    public static List<String> tratarRequest(String datos) {
        //Separa los datos por | para cada fila y por -- para cada columna
        String[] filas = datos.split("\\|");
        //Lista con su nombre y su id
        List<String> lista = new java.util.ArrayList<>();
        
        for (String fila : filas) {
            String[] columnas = fila.split("--");
            lista.add(columnas[0]+"_"+columnas[1]);  
        }

        //mostrar la lista en un dialog
        return lista;
    
    }
    
    public static void GuardarCB(ImageIcon Barras){
        //Solicitar donde quieres guardar el archivo con un filedialog
        javax.swing.JFileChooser fileChooser = new javax.swing.JFileChooser();
        fileChooser.setDialogTitle("Guardar imagen");
        fileChooser.setFileFilter(new FileNameExtensionFilter("Imagenes", "jpg", "png", "gif", "bmp"));
        int seleccion = fileChooser.showSaveDialog(null);

        if (seleccion == javax.swing.JFileChooser.APPROVE_OPTION) {
            java.io.File fichero = fileChooser.getSelectedFile();
            String ruta = fichero.getAbsolutePath();
            //guardar imagen
            try {
                java.awt.image.BufferedImage bi = new java.awt.image.BufferedImage(Barras.getIconWidth(), Barras.getIconHeight(), java.awt.image.BufferedImage.TYPE_INT_RGB);
                java.awt.Graphics g = bi.createGraphics();
                Barras.paintIcon(null, g, 0, 0);
                g.setColor(java.awt.Color.WHITE);
                g.drawString(ruta, 10, 20);
                g.dispose();
                javax.imageio.ImageIO.write(bi, "jpg", new java.io.File(ruta+".jpg"));
            } catch (java.io.IOException e) {
                System.out.println("Error al guardar la imagen");
            }
        }

    }

}
