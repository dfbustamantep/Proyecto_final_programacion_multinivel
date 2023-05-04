/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista;

import java.awt.Color;

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
        Lblnomlibro = new javax.swing.JLabel();
        Lblautor = new javax.swing.JLabel();
        jTextFieldAutor = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jButtonGuaradr = new javax.swing.JButton();
        jTextFieldNombre = new javax.swing.JTextField();
        jTextFieldNEjemplares = new javax.swing.JTextField();
        jTextFieldResumen = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        LblResumen = new javax.swing.JLabel();
        jimagen = new javax.swing.JLabel();

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
        jPanelFondo.add(LblNEjemplares, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 320, 330, 40));

        Lblnomlibro.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        Lblnomlibro.setForeground(new java.awt.Color(0, 0, 0));
        Lblnomlibro.setText("Nombre del libro");
        jPanelFondo.add(Lblnomlibro, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 110, 330, 40));

        Lblautor.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        Lblautor.setForeground(new java.awt.Color(0, 0, 0));
        Lblautor.setText("Autor");
        jPanelFondo.add(Lblautor, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 220, 330, 40));

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
        jPanelFondo.add(jTextFieldAutor, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 270, 380, -1));

        jSeparator2.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        jPanelFondo.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 390, 310, 10));

        jSeparator3.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator3.setForeground(new java.awt.Color(0, 0, 0));
        jPanelFondo.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 190, 310, 10));

        jSeparator4.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator4.setForeground(new java.awt.Color(0, 0, 0));
        jPanelFondo.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 290, 310, 10));

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
        jPanelFondo.add(jButtonGuaradr, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 540, -1, 50));

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
        jPanelFondo.add(jTextFieldNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 170, 380, -1));

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
        jPanelFondo.add(jTextFieldNEjemplares, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 370, 380, -1));

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
        jPanelFondo.add(jTextFieldResumen, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 460, 380, -1));

        jSeparator5.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator5.setForeground(new java.awt.Color(0, 0, 0));
        jPanelFondo.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 480, 310, 10));

        LblResumen.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        LblResumen.setForeground(new java.awt.Color(0, 0, 0));
        LblResumen.setText("Resumen");
        jPanelFondo.add(LblResumen, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 410, 330, 40));

        jimagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes/nuevolibro.png"))); // NOI18N
        jPanelFondo.add(jimagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 40, 320, 500));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelFondo, javax.swing.GroupLayout.PREFERRED_SIZE, 810, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelFondo, javax.swing.GroupLayout.DEFAULT_SIZE, 628, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JLabelSalidaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JLabelSalidaMouseClicked
        System.exit(1);
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
            this.setVisible(false);
            Libros libros=new Libros();
            libros.setVisible(true);
    }//GEN-LAST:event_jButtonGuaradrActionPerformed

    private void jTextFieldNombreMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextFieldNombreMousePressed
        jTextFieldNombre.setText("");
        jTextFieldNombre.setForeground(Color.BLACK);
        //jTextFieldNombre.setForeground();
    }//GEN-LAST:event_jTextFieldNombreMousePressed

    private void jTextFieldNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNombreActionPerformed

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

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NuevoLibro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel JLabelSalida;
    private javax.swing.JLabel LblNEjemplares;
    private javax.swing.JLabel LblResumen;
    private javax.swing.JLabel Lblautor;
    private javax.swing.JLabel Lblnomlibro;
    private javax.swing.JLabel Titulo;
    private javax.swing.JButton jButtonGuaradr;
    private javax.swing.JPanel jPanelFondo;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JTextField jTextFieldAutor;
    private javax.swing.JTextField jTextFieldNEjemplares;
    private javax.swing.JTextField jTextFieldNombre;
    private javax.swing.JTextField jTextFieldResumen;
    private javax.swing.JLabel jimagen;
    // End of variables declaration//GEN-END:variables
}
