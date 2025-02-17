
package com.abcs;

import com.funciones.Api;
import com.login.biblio_funciones;
import java.awt.Color;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;


public class Libros extends javax.swing.JInternalFrame {

    public Libros() {
        initComponents();

        this.setClosable(true);
        this.setIconifiable(true);
        this.setMaximizable(true);
        this.setResizable(true);
        this.setTitle("Libros");
        
        cargarCombos();
    }

    private void cargarCombos(){
        Api a = new Api();

        //Estantes
        String datos = a.obtener("/obtener_autores");
        List<String> lista = biblio_funciones.tratarRequest(datos);
        for (String string : lista) {
            comboAutores.addItem(string);
        }

        //Generos
        datos = a.obtener("/obtener_generos");
        lista = biblio_funciones.tratarRequest(datos);
        for (String string : lista) {
            comboGeneros.addItem(string);
        }  
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jTextField14 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        background = new javax.swing.JPanel();
        Datos = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        txt_id = new javax.swing.JTextField();
        txt_titulo = new javax.swing.JTextField();
        txt_isbn = new javax.swing.JTextField();
        txt_editorial = new javax.swing.JTextField();
        txt_idioma = new javax.swing.JTextField();
        txt_descripcion = new javax.swing.JTextField();
        txt_paginas = new javax.swing.JTextField();
        txt_cantidad = new javax.swing.JTextField();
        txt_precio = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        comboEstantes = new javax.swing.JComboBox<>();
        comboGeneros = new javax.swing.JComboBox<>();
        comboAutores = new javax.swing.JComboBox<>();
        jPanel3 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jButton4 = new javax.swing.JButton();
        txt_fecha = new javax.swing.JSpinner();
        eliminar = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        tittle = new javax.swing.JRadioButton();
        autor = new javax.swing.JRadioButton();
        id = new javax.swing.JRadioButton();
        Dato_especifico = new javax.swing.JTextField();
        especifica = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();

        jTextField14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField14ActionPerformed(evt);
            }
        });

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/key-person.png"))); // NOI18N
        jLabel13.setText("Buscar:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField14, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addGap(18, 18, 18))
        );

        background.setBackground(new java.awt.Color(0, 102, 153));
        background.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backgroundMouseClicked(evt);
            }
        });
        background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Datos.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 153));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("ID:");

        jLabel2.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 102, 153));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("ISBN:");

        jLabel3.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 102, 153));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Editorial:");

        jLabel5.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 102, 153));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Titulo:");

        jLabel6.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 102, 153));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Fecha Publicacion:");

        jLabel7.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 102, 153));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("Descripcion:");

        jLabel8.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 102, 153));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("Num. Paginas:");

        jLabel9.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 102, 153));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setText("Idioma:");

        jLabel10.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 102, 153));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel10.setText("Num. Ejemplares:");

        jLabel11.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 102, 153));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel11.setText("Estante:");

        jLabel12.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 102, 153));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel12.setText("Precio:");

        jLabel14.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 102, 153));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel14.setText("Genero:");

        jLabel15.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 102, 153));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel15.setText("Autor:");

        txt_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_idActionPerformed(evt);
            }
        });

        jButton1.setText("Añadir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton3.setText("Actualizar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        comboEstantes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6" }));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/key-person.png"))); // NOI18N
        jLabel16.setText("Buscar:");

        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/actualizar.png"))); // NOI18N
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(156, Short.MAX_VALUE)
                .addComponent(jLabel16)
                .addGap(18, 18, 18)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton4)
                .addGap(27, 27, 27))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton4)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel16)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(15, 15, 15))
        );

        txt_fecha.setModel(new javax.swing.SpinnerDateModel());

        eliminar.setText("Eliminar");
        eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarActionPerformed(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(0, 102, 153));
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel17.setText("Busqueda especifica");

        tittle.setText("Titulo");

        autor.setText("Autor");

        id.setText("ID");

        especifica.setText("Busqueda especifica");
        especifica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                especificaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout DatosLayout = new javax.swing.GroupLayout(Datos);
        Datos.setLayout(DatosLayout);
        DatosLayout.setHorizontalGroup(
            DatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DatosLayout.createSequentialGroup()
                .addContainerGap(114, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(105, 105, 105)
                .addComponent(eliminar)
                .addGap(108, 108, 108)
                .addComponent(jButton3)
                .addGap(88, 88, 88))
            .addGroup(DatosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(DatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(DatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(DatosLayout.createSequentialGroup()
                        .addGroup(DatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(DatosLayout.createSequentialGroup()
                                .addComponent(txt_isbn, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(61, 61, 61)
                                .addComponent(especifica, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txt_editorial, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_precio, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(DatosLayout.createSequentialGroup()
                                .addGroup(DatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txt_paginas, javax.swing.GroupLayout.DEFAULT_SIZE, 87, Short.MAX_VALUE)
                                    .addComponent(comboEstantes, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(DatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(DatosLayout.createSequentialGroup()
                                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txt_cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(DatosLayout.createSequentialGroup()
                                        .addComponent(jLabel14)
                                        .addGap(18, 18, 18)
                                        .addComponent(comboGeneros, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel15)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(comboAutores, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(txt_descripcion)
                            .addGroup(DatosLayout.createSequentialGroup()
                                .addComponent(txt_idioma, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel6)
                                .addGap(18, 18, 18)
                                .addComponent(txt_fecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DatosLayout.createSequentialGroup()
                        .addGroup(DatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(DatosLayout.createSequentialGroup()
                                .addComponent(txt_titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(35, 35, 35)
                                .addComponent(Dato_especifico)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(DatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(autor)
                                    .addComponent(id)))
                            .addGroup(DatosLayout.createSequentialGroup()
                                .addComponent(txt_id, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(99, 99, 99)
                                .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(36, 36, 36)
                                .addComponent(tittle)))
                        .addGap(32, 32, 32))))
            .addGroup(DatosLayout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        DatosLayout.setVerticalGroup(
            DatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DatosLayout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(DatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_id, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel17)
                        .addComponent(tittle)))
                .addGroup(DatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(DatosLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(DatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(DatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txt_titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Dato_especifico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addGroup(DatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(DatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txt_isbn, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(especifica))
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(DatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txt_editorial, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(DatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(DatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txt_idioma, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING))
                            .addComponent(txt_fecha)))
                    .addGroup(DatosLayout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(autor)
                        .addGap(18, 18, 18)
                        .addComponent(id)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel6)))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(DatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DatosLayout.createSequentialGroup()
                        .addGroup(DatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(txt_descripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(DatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_paginas, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addComponent(txt_cantidad, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(DatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel11)
                    .addGroup(DatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel14)
                        .addComponent(jLabel15)
                        .addComponent(comboEstantes, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(comboGeneros, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(comboAutores, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(DatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(txt_precio, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(DatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1)
                    .addGroup(DatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton3)
                        .addComponent(eliminar)))
                .addGap(36, 36, 36))
        );

        background.add(Datos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 640, 540));

        jPanel2.setBackground(new java.awt.Color(0, 102, 153));

        jLabel4.setFont(new java.awt.Font("Roboto Black", 1, 48)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("LIBROS");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 640, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(17, 17, 17))
        );

        background.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 640, 90));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(background, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backgroundMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backgroundMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_backgroundMouseClicked

    private void txt_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_idActionPerformed

    private void jTextField14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField14ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField14ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        Api a = new Api();
        String ruta = "/obtener_libros";
        String datos = a.obtener(ruta);

        List<String> libros = biblio_funciones.tratarRequest(datos);
        biblio_funciones.mensaje("Se encontraron "+libros.size()+" Libros Registrados.", "Consulta", 1);
        jComboBox1.removeAllItems();
        for (String libro : libros) {
            jComboBox1.addItem(libro);
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
        String Libros = jComboBox1.getSelectedItem().toString();
        String id = Libros.split("_")[0];
        //obtener los datos del cliente con la api
        Api a = new Api();
        String ruta = "/obtener_libro/" + id;
        String datos = a.obtener(ruta);
        //separar por --
        String[] datos_separados = datos.split("--");
        //poner los datos en los campos de texto
        txt_id.setText(datos_separados[0]);
        txt_titulo.setText(datos_separados[1]);
        txt_precio.setText(datos_separados[5]);
        txt_cantidad.setText(datos_separados[8]);
        txt_editorial.setText(datos_separados[4]);
        txt_paginas.setText(datos_separados[7]);
        txt_idioma.setText(datos_separados[5]);
        txt_isbn.setText(datos_separados[3]);   
        txt_descripcion.setText(datos_separados[6]);
        comboEstantes.setSelectedIndex(Integer.parseInt(datos_separados[9]));
        comboAutores.setSelectedIndex(Integer.parseInt(datos_separados[10]));
        comboGeneros.setSelectedIndex(Integer.parseInt(datos_separados[11]));
        txt_precio.setText(datos_separados[12]);
        
        SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd");
        Date fecha = null;
        try {
            fecha = formato.parse(datos_separados[2]);
        } catch (ParseException ex) {
            biblio_funciones.mensaje(ex.toString(), "ERROR", 1);
        }
        
        txt_fecha.setValue(fecha);

    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        //Anadir un nuevo cliente
        String titulo = txt_titulo.getText();
        String precio = txt_precio.getText();
        String cantidad = txt_cantidad.getText();
        String editorial = txt_editorial.getText();
        String paginas = txt_paginas.getText();
        String idioma = txt_idioma.getText();
        String isbn = txt_isbn.getText();
        String descripcion = txt_descripcion.getText();
        //Separar el valor del combo box para obtener el id del autor y del genero
        String estante = comboEstantes.getSelectedItem().toString();
        String id_estante= estante.split("_")[0];
        String autor = comboAutores.getSelectedItem().toString();
        String id_autor = autor.split("_")[0];
        String genero = comboGeneros.getSelectedItem().toString();
        String id_genero = genero.split("_")[0];
                //poner la fecha en el Jspinner txt_fecha
        SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd");
        String fechapubli = formato.format(txt_fecha.getValue());
     
        //Si alguno de esos campos esta vacia poner camposRojos
        if(titulo.equals("") || precio.equals("") || cantidad.equals("") || editorial.equals("") || fechapubli.equals("") || paginas.equals("") || idioma.equals("") || isbn.equals("") || descripcion.equals("")){
            camposRojos(titulo, precio, cantidad, editorial, fechapubli, paginas, idioma, isbn, descripcion, estante, id_autor, id_genero);
        }else{

            camposBlancos();
            //Si no esta vacia enviar los datos a la api
            //Segur este orden     .format(titulo, fecha_publicacion, is    bn, editorial, idioma, descripcion, num_paginas, num_ejemplares, id_estante, id_autor, id_genero, precioxdia))
            Api a = new Api();
            String ruta="/insertar_libro";
            String json= "{"+
                "\"titulo\":\""+titulo+"\","+
                "\"fecha_publicacion\":\""+fechapubli+"\","+
                "\"isbn\":\""+isbn+"\","+
                "\"editorial\":\""+editorial+"\","+
                "\"idioma\":\""+idioma+"\","+
                "\"descripcion\":\""+descripcion+"\","+
                "\"num_paginas\":\""+paginas+"\","+
                "\"num_ejemplares\":\""+cantidad+"\","+
                "\"id_estante\":\""+id_estante+"\","+
                "\"id_autor\":\""+id_autor+"\","+
                "\"id_genero\":\""+id_genero+"\","+
                "\"precioxdia\":\""+precio+"\""+
            "}";
               biblio_funciones.mensaje(json,"FECHA",1);

            a.insertar(json, ruta);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        //Anadir un nuevo Libro
       //Anadir un nuevo cliente
        String id = txt_id.getText();
        String titulo = txt_titulo.getText();
        String precio = txt_precio.getText();
        String cantidad = txt_cantidad.getText();
        String editorial = txt_editorial.getText();
        String paginas = txt_paginas.getText();
        String idioma = txt_idioma.getText();
        String isbn = txt_isbn.getText();
        String descripcion = txt_descripcion.getText();
        //Separar el valor del combo box para obtener el id del autor y del genero
        String estante = comboEstantes.getSelectedItem().toString();
        estante= estante.split("_")[0];
        String autor = comboAutores.getSelectedItem().toString();
        autor = autor.split("_")[0];
        String genero = comboGeneros.getSelectedItem().toString();
        genero = genero.split("_")[0];
                //poner la fecha en el Jspinner txt_fecha
        SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd");
        String fechapubli = formato.format(txt_fecha.getValue());
     
        
        //Si alguno de esos campos esta vacia poner camposRojos
        if(titulo.equals("") || precio.equals("") || cantidad.equals("") || editorial.equals("") || fechapubli.equals("") || paginas.equals("") || idioma.equals("") || isbn.equals("") || descripcion.equals("")){
            camposRojos(titulo, precio, cantidad, editorial, fechapubli, paginas, idioma, isbn, descripcion, estante, autor, genero);
        }else{
            //Validar que la fecha este en el formato correcto dd/mm/yyyy con una expresion regular
            camposBlancos();
            //Si no esta vacia enviar los datos a la api
            //Segur este orden     .format(titulo, fecha_publicacion, is    bn, editorial, idioma, descripcion, num_paginas, num_ejemplares, id_estante, id_autor, id_genero, precioxdia))
            Api a = new Api();
            String ruta="modificar_libro";
            String json= "{"+
                "\"id_libro\":\""+id+"\","+
                "\"titulo\":\""+titulo+"\","+
                "\"fecha_publicacion\":\""+fechapubli+"\","+
                "\"isbn\":\""+isbn+"\","+
                "\"editorial\":\""+editorial+"\","+
                "\"idioma\":\""+idioma+"\","+
                "\"descripcion\":\""+descripcion+"\","+
                "\"num_paginas\":\""+paginas+"\","+
                "\"num_ejemplares\":\""+cantidad+"\","+
                "\"id_estante\":\""+estante+"\","+
                "\"id_autor\":\""+autor+"\","+
                "\"id_genero\":\""+genero+"\","+
                "\"precioxdia\":\""+precio+"\""+
            "}";

            a.modificar(json, ruta);

        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarActionPerformed
         // Obtener el ID del libro seleccionado
    String datosLibro = (String) jComboBox1.getSelectedItem();
    String id_libro = datosLibro.split("_")[0];

    // Validar si el ID del libro no está vacío
    if (!id_libro.isEmpty()) {
        int confirmacion = JOptionPane.showConfirmDialog(null, "¿Estás seguro de que deseas eliminar este libro?", "Confirmar eliminación", JOptionPane.YES_NO_OPTION);

        // Si el usuario confirma la eliminación
        if (confirmacion == JOptionPane.YES_OPTION) {
            // Realizar la eliminación del libro
            String ruta = "/eliminar_libro/" + id_libro;
            Api a = new Api();
            String respuesta = a.eliminar(ruta);

            // Verificar si la eliminación fue exitosa
            if (respuesta.equals("Libro eliminado")) {
                // Limpiar los campos después de la eliminación (si es necesario)
                // Actualizar la lista de libros después de la eliminación
                jButton4ActionPerformed(evt);

                // Mostrar mensaje de éxito
                JOptionPane.showMessageDialog(null, "Libro eliminado exitosamente.", "Eliminación exitosa", JOptionPane.INFORMATION_MESSAGE);
            } else {
                // Mostrar mensaje de error si la eliminación falló
                JOptionPane.showMessageDialog(null, "Error al eliminar el libro: " + respuesta, "Error de eliminación", JOptionPane.ERROR_MESSAGE);
            }
        }
    } else {
        JOptionPane.showMessageDialog(null, "Por favor selecciona un libro para eliminar.", "Libro no seleccionado", JOptionPane.WARNING_MESSAGE);
    }
    }//GEN-LAST:event_eliminarActionPerformed

    private void especificaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_especificaActionPerformed
         String datoEspecifico = Dato_especifico.getText();
    
    String criterioBusqueda = "";
    if (tittle.isSelected()) {
        criterioBusqueda = "titulo";
    } else if (autor.isSelected()) {
        criterioBusqueda = "autor";
    } else if (id.isSelected()) {
        criterioBusqueda = "id";
    } else {
        JOptionPane.showMessageDialog(null, "Por favor, seleccione un criterio de búsqueda.", "Advertencia", JOptionPane.WARNING_MESSAGE);
        return;
    }
    
    Api a = new Api();
    String ruta = "/buscar_libro?criterio=" + criterioBusqueda + "&dato=" + datoEspecifico;
    String datos = a.obtener(ruta);
    
    List<String> librosEncontrados = biblio_funciones.tratarRequest(datos);
    jComboBox1.removeAllItems();
    for (String libro : librosEncontrados) {
        jComboBox1.addItem(libro);
    }
    }//GEN-LAST:event_especificaActionPerformed
 
    private void camposRojos(String titulo,String precio,String cantidad,String editorial,String fechapubli,String paginas,String idioma,String isbn, String descripcion, String estante, String autor, String genero){
        
        //validar que los campos no esten vacios
        if (titulo.equals("")) {
            txt_titulo.setBackground(Color.red);
        }
        if (precio.equals("")) {
            txt_precio.setBackground(Color.red);
        }
        if (cantidad.equals("")) {
            txt_cantidad.setBackground(Color.red);
        }
        if (editorial.equals("")) {
            txt_editorial.setBackground(Color.red);
        }
        if (fechapubli.equals("")) {
            txt_fecha.setBackground(Color.red);
        }
        if (paginas.equals("")) {
            txt_paginas.setBackground(Color.red);
        }
        if (idioma.equals("")) {
            txt_idioma.setBackground(Color.red);
        }
        if (isbn.equals("")) {
            txt_isbn.setBackground(Color.red);
        }
        if (descripcion.equals("")) {
            txt_descripcion.setBackground(Color.red);
        }
        if (estante.equals("")) {
            comboEstantes.setBackground(Color.red);
        }
        if (autor.equals("")) {
            comboAutores.setBackground(Color.red);
        }
        if (genero.equals("")) {
            comboGeneros.setBackground(Color.red);
        }

    
    }

    //camposBlancos
    private void camposBlancos(){
        txt_titulo.setBackground(Color.white);
        txt_precio.setBackground(Color.white);
        txt_cantidad.setBackground(Color.white);
        txt_editorial.setBackground(Color.white);
        txt_fecha.setBackground(Color.white);
        txt_paginas.setBackground(Color.white);
        txt_idioma.setBackground(Color.white);
        txt_isbn.setBackground(Color.white);
        txt_descripcion.setBackground(Color.white);
        comboEstantes.setBackground(Color.white);
        comboAutores.setBackground(Color.white);
        comboGeneros.setBackground(Color.white);
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Dato_especifico;
    private javax.swing.JPanel Datos;
    private javax.swing.JRadioButton autor;
    private javax.swing.JPanel background;
    private javax.swing.JComboBox<String> comboAutores;
    private javax.swing.JComboBox<String> comboEstantes;
    private javax.swing.JComboBox<String> comboGeneros;
    private javax.swing.JButton eliminar;
    private javax.swing.JButton especifica;
    private javax.swing.JRadioButton id;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JRadioButton tittle;
    private javax.swing.JTextField txt_cantidad;
    private javax.swing.JTextField txt_descripcion;
    private javax.swing.JTextField txt_editorial;
    private javax.swing.JSpinner txt_fecha;
    private javax.swing.JTextField txt_id;
    private javax.swing.JTextField txt_idioma;
    private javax.swing.JTextField txt_isbn;
    private javax.swing.JTextField txt_paginas;
    private javax.swing.JTextField txt_precio;
    private javax.swing.JTextField txt_titulo;
    // End of variables declaration//GEN-END:variables
}
