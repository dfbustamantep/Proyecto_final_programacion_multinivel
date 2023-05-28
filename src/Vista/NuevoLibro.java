/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista;

import DAO.Imp.DAOLibrosImpl;
import DAO.Interfaces.DAOLibros;
import java.awt.Color;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;

/**
 *
 * @author DBUSTAMANTEP
 */
public class NuevoLibro extends javax.swing.JFrame {

    /**
     * Creates new form NuevoLibro
     */
    public NuevoLibro() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelFondo = new javax.swing.JPanel();
        Titulo = new javax.swing.JLabel();
        JLabelSalida = new javax.swing.JLabel();
        LblNEjemplares = new javax.swing.JLabel();
        LblISBNlirbo = new javax.swing.JLabel();
        Lblautor = new javax.swing.JLabel();
        jTextFieldAutor = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jButtonGuaradr = new javax.swing.JButton();
        jTextFieldISBN = new javax.swing.JTextField();
        jTextFieldNEjemplares = new javax.swing.JTextField();
        jTextFieldResumen = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        LblResumen = new javax.swing.JLabel();
        jimagen = new javax.swing.JLabel();
        Lblnomlibro = new javax.swing.JLabel();
        jTextFieldNombre = new javax.swing.JTextField();
        jSeparator6 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();
        jTextFieldFechaP = new javax.swing.JTextField();
        LblfechaP = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);

        jPanelFondo.setBackground(new java.awt.Color(255, 255, 255));
        jPanelFondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Titulo.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        Titulo.setForeground(new java.awt.Color(0, 0, 0));
        Titulo.setText("Creación de libro");
        jPanelFondo.add(Titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 0, 470, 110));

        JLabelSalida.setFont(new java.awt.Font("Arial Black", 3, 18)); // NOI18N
        JLabelSalida.setForeground(new java.awt.Color(0, 0, 0));
        JLabelSalida.setText("   X");
        JLabelSalida.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        JLabelSalida.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JLabelSalidaMouseClicked(evt);
            }
        });
        jPanelFondo.add(JLabelSalida, new org.netbeans.lib.awtextra.AbsoluteConstraints(-2, 0, 60, 40));

        LblNEjemplares.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        LblNEjemplares.setForeground(new java.awt.Color(0, 0, 0));
        LblNEjemplares.setText("Numero de ejemplares");
        jPanelFondo.add(LblNEjemplares, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 450, 330, 40));

        LblISBNlirbo.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        LblISBNlirbo.setForeground(new java.awt.Color(0, 0, 0));
        LblISBNlirbo.setText("ISBN libro");
        jPanelFondo.add(LblISBNlirbo, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 180, 330, 40));

        Lblautor.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        Lblautor.setForeground(new java.awt.Color(0, 0, 0));
        Lblautor.setText("Autor");
        jPanelFondo.add(Lblautor, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 270, 330, 40));

        jTextFieldAutor.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldAutor.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextFieldAutor.setForeground(new java.awt.Color(153, 153, 153));
        jTextFieldAutor.setText("Ingrese el autor del libro");
        jTextFieldAutor.setBorder(null);
        jTextFieldAutor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTextFieldAutorMousePressed(evt);
            }
        });
        jTextFieldAutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldAutorActionPerformed(evt);
            }
        });
        jPanelFondo.add(jTextFieldAutor, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 320, 380, -1));

        jSeparator2.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        jPanelFondo.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 520, 310, 10));

        jSeparator3.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator3.setForeground(new java.awt.Color(0, 0, 0));
        jPanelFondo.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 250, 310, 10));

        jSeparator4.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator4.setForeground(new java.awt.Color(0, 0, 0));
        jPanelFondo.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 340, 310, 10));

        jButtonGuaradr.setBackground(new java.awt.Color(255, 255, 255));
        jButtonGuaradr.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jButtonGuaradr.setForeground(new java.awt.Color(0, 0, 0));
        jButtonGuaradr.setText("Guardar nuevo libro");
        jButtonGuaradr.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonGuaradr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGuaradrActionPerformed(evt);
            }
        });
        jPanelFondo.add(jButtonGuaradr, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 630, -1, 50));

        jTextFieldISBN.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldISBN.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextFieldISBN.setForeground(new java.awt.Color(153, 153, 153));
        jTextFieldISBN.setText("Ingrese el ISBN del libro");
        jTextFieldISBN.setBorder(null);
        jTextFieldISBN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTextFieldISBNMousePressed(evt);
            }
        });
        jTextFieldISBN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldISBNActionPerformed(evt);
            }
        });
        jPanelFondo.add(jTextFieldISBN, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 230, 380, -1));

        jTextFieldNEjemplares.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldNEjemplares.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextFieldNEjemplares.setForeground(new java.awt.Color(153, 153, 153));
        jTextFieldNEjemplares.setText("Ingrese el numero de ejemplares del libro");
        jTextFieldNEjemplares.setBorder(null);
        jTextFieldNEjemplares.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTextFieldNEjemplaresMousePressed(evt);
            }
        });
        jTextFieldNEjemplares.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNEjemplaresActionPerformed(evt);
            }
        });
        jPanelFondo.add(jTextFieldNEjemplares, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 500, 380, -1));

        jTextFieldResumen.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldResumen.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextFieldResumen.setForeground(new java.awt.Color(153, 153, 153));
        jTextFieldResumen.setText("Ingrese el resumen del libro");
        jTextFieldResumen.setBorder(null);
        jTextFieldResumen.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTextFieldResumenMousePressed(evt);
            }
        });
        jTextFieldResumen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldResumenActionPerformed(evt);
            }
        });
        jPanelFondo.add(jTextFieldResumen, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 590, 380, -1));

        jSeparator5.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator5.setForeground(new java.awt.Color(0, 0, 0));
        jPanelFondo.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 610, 310, 10));

        LblResumen.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        LblResumen.setForeground(new java.awt.Color(0, 0, 0));
        LblResumen.setText("Resumen");
        jPanelFondo.add(LblResumen, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 540, 330, 40));

        jimagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes/nuevolibro.png"))); // NOI18N
        jPanelFondo.add(jimagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 40, 320, 500));

        Lblnomlibro.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        Lblnomlibro.setForeground(new java.awt.Color(0, 0, 0));
        Lblnomlibro.setText("Nombre del libro");
        jPanelFondo.add(Lblnomlibro, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 90, 330, 40));

        jTextFieldNombre.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldNombre.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextFieldNombre.setForeground(new java.awt.Color(153, 153, 153));
        jTextFieldNombre.setText("Ingrese el nombre del libro");
        jTextFieldNombre.setBorder(null);
        jTextFieldNombre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTextFieldNombreMousePressed(evt);
            }
        });
        jTextFieldNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNombreActionPerformed(evt);
            }
        });
        jPanelFondo.add(jTextFieldNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 140, 380, -1));

        jSeparator6.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator6.setForeground(new java.awt.Color(0, 0, 0));
        jPanelFondo.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 160, 310, 10));

        jSeparator7.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator7.setForeground(new java.awt.Color(0, 0, 0));
        jPanelFondo.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 430, 310, 10));

        jTextFieldFechaP.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldFechaP.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextFieldFechaP.setForeground(new java.awt.Color(153, 153, 153));
        jTextFieldFechaP.setText("Ingrese la fecha de publicacion del libro");
        jTextFieldFechaP.setBorder(null);
        jTextFieldFechaP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTextFieldFechaPMousePressed(evt);
            }
        });
        jTextFieldFechaP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldFechaPActionPerformed(evt);
            }
        });
        jPanelFondo.add(jTextFieldFechaP, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 410, 380, -1));

        LblfechaP.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        LblfechaP.setForeground(new java.awt.Color(0, 0, 0));
        LblfechaP.setText("Fecha de publicación");
        jPanelFondo.add(LblfechaP, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 360, 330, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelFondo, javax.swing.GroupLayout.DEFAULT_SIZE, 860, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelFondo, javax.swing.GroupLayout.DEFAULT_SIZE, 693, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JLabelSalidaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JLabelSalidaMouseClicked
       JOptionPane.showMessageDialog(null,"Gracias por usar nuestro sistema de biblioteca\nTenga un buen día");
        System.exit(0);
    }//GEN-LAST:event_JLabelSalidaMouseClicked

    private void jTextFieldAutorMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextFieldAutorMousePressed
        jTextFieldAutor.setText("");
        jTextFieldAutor.setForeground(Color.BLACK);
        // jTextFieldDescripcion.setForeground();
    }//GEN-LAST:event_jTextFieldAutorMousePressed

    private void jTextFieldAutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldAutorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldAutorActionPerformed

    private void jButtonGuaradrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGuaradrActionPerformed
        String nombre=jTextFieldNombre.getText();
        String ISBN=jTextFieldISBN.getText();
        String autor=jTextFieldAutor.getText();
        String fechaP=jTextFieldFechaP.getText();
        int nEjemplares=Integer.parseInt(jTextFieldNEjemplares.getText());
        String resumen=jTextFieldResumen.getText();
        
        //if(nombre.equals("")||ISBN.equals("")||autor.equals("")||nEjemplares.equals()||){
                generarReporte();
                this.setVisible(false);
                Libros libros=new Libros();
                libros.setVisible(true);
          /*  }else{
                JOptionPane.showMessageDialog(null,"Por favor llene todos los campos");
            }*/
            Modelo.Libros libro=new Modelo.Libros();
            libro.setISBN(Integer.parseInt(ISBN));
            libro.setNombre(nombre);
            libro.setAutor(autor);
            libro.setFechaPublicacion(fechaP);
            libro.setnEjemplares(nEjemplares);
            libro.setnEjemplaresDisponibles(nEjemplares);
            libro.setResumen(resumen);
            try{
                DAOLibros librosd= new DAOLibrosImpl();
                librosd.Registrar(libro);
                JOptionPane.showMessageDialog(null, "Registro exitoso");
                /*jTextFieldNombre.setText("");
                jTextFieldISBN.setText("");
                jTextFieldAutor.setText("");
                jTextFieldFechaP.setText("");
                jTextFieldNEjemplares.setText("");
                jTextFieldResumen.setText("");*/
            }
            catch(Exception e){
                System.out.println(e.getMessage());
            }
    }//GEN-LAST:event_jButtonGuaradrActionPerformed

    private void jTextFieldISBNMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextFieldISBNMousePressed
        jTextFieldISBN.setText("");
        jTextFieldISBN.setForeground(Color.BLACK);
        //jTextFieldNombre.setForeground();
    }//GEN-LAST:event_jTextFieldISBNMousePressed
 
    private void jTextFieldISBNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldISBNActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldISBNActionPerformed

    private void jTextFieldNEjemplaresMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextFieldNEjemplaresMousePressed
        jTextFieldNEjemplares.setText("");
        jTextFieldNEjemplares.setForeground(Color.BLACK);
        //jTextFieldAnalisis.setForeground();
    }//GEN-LAST:event_jTextFieldNEjemplaresMousePressed

    private void jTextFieldNEjemplaresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNEjemplaresActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNEjemplaresActionPerformed

    private void jTextFieldResumenMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextFieldResumenMousePressed
        jTextFieldResumen.setText("");
        jTextFieldResumen.setForeground(Color.BLACK);
    }//GEN-LAST:event_jTextFieldResumenMousePressed

    private void jTextFieldResumenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldResumenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldResumenActionPerformed

    private void jTextFieldNombreMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextFieldNombreMousePressed
        jTextFieldNombre.setText("");
        jTextFieldNombre.setForeground(Color.BLACK);
        //jTextFieldNombre.setForeground();
    }//GEN-LAST:event_jTextFieldNombreMousePressed

    private void jTextFieldNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNombreActionPerformed

    private void jTextFieldFechaPMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextFieldFechaPMousePressed
        jTextFieldFechaP.setText("");
        jTextFieldFechaP.setForeground(Color.BLACK);
    }//GEN-LAST:event_jTextFieldFechaPMousePressed

    private void jTextFieldFechaPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldFechaPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldFechaPActionPerformed

     private void generarReporte() {
         try{
            BufferedWriter outStream = new BufferedWriter(new FileWriter("ReporteNuevosLibros.csv", true));
            
            outStream.write(jTextFieldNombre.getText()+","+jTextFieldISBN.getText()+","+jTextFieldAutor.getText()+","+jTextFieldNEjemplares.getText()+","+jTextFieldResumen.getText()+"\n");
            outStream.close();
            JOptionPane.showMessageDialog(null, "Se ha guardado exitosamente el registro");
            // System.out.println("Registro guardado de manera exitosa");
            
        }catch(IOException exception){
            JOptionPane.showMessageDialog(null, "Se ha producido un error intente nuevamente");
        }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(NuevoLibro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NuevoLibro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NuevoLibro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NuevoLibro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NuevoLibro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel JLabelSalida;
    private javax.swing.JLabel LblISBNlirbo;
    private javax.swing.JLabel LblNEjemplares;
    private javax.swing.JLabel LblResumen;
    private javax.swing.JLabel Lblautor;
    private javax.swing.JLabel LblfechaP;
    private javax.swing.JLabel Lblnomlibro;
    private javax.swing.JLabel Titulo;
    private javax.swing.JButton jButtonGuaradr;
    private javax.swing.JPanel jPanelFondo;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JTextField jTextFieldAutor;
    private javax.swing.JTextField jTextFieldFechaP;
    private javax.swing.JTextField jTextFieldISBN;
    private javax.swing.JTextField jTextFieldNEjemplares;
    private javax.swing.JTextField jTextFieldNombre;
    private javax.swing.JTextField jTextFieldResumen;
    private javax.swing.JLabel jimagen;
    // End of variables declaration//GEN-END:variables
}
