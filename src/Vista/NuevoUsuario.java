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
public class NuevoUsuario extends javax.swing.JFrame {

    /**
     * Creates new form NuevoLibro
     */
    public NuevoUsuario() {
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
        LblCorreo = new javax.swing.JLabel();
        LblnomUsuario = new javax.swing.JLabel();
        LblApellido = new javax.swing.JLabel();
        jTextFieldApellidoUsuario = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jButtonGuardar = new javax.swing.JButton();
        jTextFieldNombre = new javax.swing.JTextField();
        jTextFieldCorreo = new javax.swing.JTextField();
        jTextFieldNContacto = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        LblNContacto = new javax.swing.JLabel();
        imagen = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);

        jPanelFondo.setBackground(new java.awt.Color(255, 255, 255));
        jPanelFondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Titulo.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        Titulo.setForeground(new java.awt.Color(0, 0, 0));
        Titulo.setText("Creación de usuario");
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

        LblCorreo.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        LblCorreo.setForeground(new java.awt.Color(0, 0, 0));
        LblCorreo.setText("Correo del usuario");
        jPanelFondo.add(LblCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 320, 330, 40));

        LblnomUsuario.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        LblnomUsuario.setForeground(new java.awt.Color(0, 0, 0));
        LblnomUsuario.setText("Nombre del usuario");
        jPanelFondo.add(LblnomUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 110, 330, 40));

        LblApellido.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        LblApellido.setForeground(new java.awt.Color(0, 0, 0));
        LblApellido.setText("Apellido del usuario");
        jPanelFondo.add(LblApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 220, 330, 40));

        jTextFieldApellidoUsuario.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldApellidoUsuario.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextFieldApellidoUsuario.setForeground(new java.awt.Color(153, 153, 153));
        jTextFieldApellidoUsuario.setText("Ingrese el apellido del usuario");
        jTextFieldApellidoUsuario.setBorder(null);
        jTextFieldApellidoUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTextFieldApellidoUsuarioMousePressed(evt);
            }
        });
        jTextFieldApellidoUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldApellidoUsuarioActionPerformed(evt);
            }
        });
        jPanelFondo.add(jTextFieldApellidoUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 270, 380, -1));

        jSeparator2.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        jPanelFondo.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 390, 310, 10));

        jSeparator3.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator3.setForeground(new java.awt.Color(0, 0, 0));
        jPanelFondo.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 190, 310, 10));

        jSeparator4.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator4.setForeground(new java.awt.Color(0, 0, 0));
        jPanelFondo.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 290, 310, 10));

        jButtonGuardar.setBackground(new java.awt.Color(255, 255, 255));
        jButtonGuardar.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jButtonGuardar.setForeground(new java.awt.Color(0, 0, 0));
        jButtonGuardar.setText("Guardar nuevo usuario");
        jButtonGuardar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGuardarActionPerformed(evt);
            }
        });
        jPanelFondo.add(jButtonGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 540, -1, 50));

        jTextFieldNombre.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldNombre.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextFieldNombre.setForeground(new java.awt.Color(153, 153, 153));
        jTextFieldNombre.setText("Ingrese el nombre del usuario");
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

        jTextFieldCorreo.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldCorreo.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextFieldCorreo.setForeground(new java.awt.Color(153, 153, 153));
        jTextFieldCorreo.setText("Ingrese el correo del usuario");
        jTextFieldCorreo.setBorder(null);
        jTextFieldCorreo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTextFieldCorreoMousePressed(evt);
            }
        });
        jTextFieldCorreo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCorreoActionPerformed(evt);
            }
        });
        jPanelFondo.add(jTextFieldCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 370, 320, -1));

        jTextFieldNContacto.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldNContacto.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextFieldNContacto.setForeground(new java.awt.Color(153, 153, 153));
        jTextFieldNContacto.setText("Ingrese un numero de contacto");
        jTextFieldNContacto.setBorder(null);
        jTextFieldNContacto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTextFieldNContactoMousePressed(evt);
            }
        });
        jTextFieldNContacto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNContactoActionPerformed(evt);
            }
        });
        jPanelFondo.add(jTextFieldNContacto, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 460, 310, -1));

        jSeparator5.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator5.setForeground(new java.awt.Color(0, 0, 0));
        jPanelFondo.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 480, 310, 10));

        LblNContacto.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        LblNContacto.setForeground(new java.awt.Color(0, 0, 0));
        LblNContacto.setText("Numero de contacto");
        jPanelFondo.add(LblNContacto, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 410, 330, 40));

        imagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes/usuario1.png"))); // NOI18N
        imagen.setText("jLabel1");
        jPanelFondo.add(imagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 0, 540, 610));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelFondo, javax.swing.GroupLayout.PREFERRED_SIZE, 810, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelFondo, javax.swing.GroupLayout.DEFAULT_SIZE, 627, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JLabelSalidaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JLabelSalidaMouseClicked
        System.exit(1);
    }//GEN-LAST:event_JLabelSalidaMouseClicked

    private void jTextFieldApellidoUsuarioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextFieldApellidoUsuarioMousePressed
        jTextFieldApellidoUsuario.setText("");
        jTextFieldApellidoUsuario.setForeground(Color.BLACK);
        // jTextFieldDescripcion.setForeground();
    }//GEN-LAST:event_jTextFieldApellidoUsuarioMousePressed

    private void jTextFieldApellidoUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldApellidoUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldApellidoUsuarioActionPerformed

    private void jButtonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGuardarActionPerformed
            this.setVisible(false);
            Usuarios usuarios=new Usuarios();
            usuarios.setVisible(true);
    }//GEN-LAST:event_jButtonGuardarActionPerformed

    private void jTextFieldNombreMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextFieldNombreMousePressed
        jTextFieldNombre.setText("");
        jTextFieldNombre.setForeground(Color.BLACK);
        //jTextFieldNombre.setForeground();
    }//GEN-LAST:event_jTextFieldNombreMousePressed

    private void jTextFieldNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNombreActionPerformed

    private void jTextFieldCorreoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextFieldCorreoMousePressed
        jTextFieldCorreo.setText("");
        jTextFieldCorreo.setForeground(Color.BLACK);
        //jTextFieldAnalisis.setForeground();
    }//GEN-LAST:event_jTextFieldCorreoMousePressed

    private void jTextFieldCorreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCorreoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldCorreoActionPerformed

    private void jTextFieldNContactoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextFieldNContactoMousePressed
        jTextFieldNContacto.setText("");
        jTextFieldNContacto.setForeground(Color.BLACK);
    }//GEN-LAST:event_jTextFieldNContactoMousePressed

    private void jTextFieldNContactoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNContactoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNContactoActionPerformed

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
            java.util.logging.Logger.getLogger(NuevoUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NuevoUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NuevoUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NuevoUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NuevoUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel JLabelSalida;
    private javax.swing.JLabel LblApellido;
    private javax.swing.JLabel LblCorreo;
    private javax.swing.JLabel LblNContacto;
    private javax.swing.JLabel LblnomUsuario;
    private javax.swing.JLabel Titulo;
    private javax.swing.JLabel imagen;
    private javax.swing.JButton jButtonGuardar;
    private javax.swing.JPanel jPanelFondo;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JTextField jTextFieldApellidoUsuario;
    private javax.swing.JTextField jTextFieldCorreo;
    private javax.swing.JTextField jTextFieldNContacto;
    private javax.swing.JTextField jTextFieldNombre;
    // End of variables declaration//GEN-END:variables
}
