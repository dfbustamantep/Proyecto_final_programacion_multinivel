
package Vista;

import DAO.Imp.DAOUsuariosImpl;
import DAO.Interfaces.DAOUsuarios;
import java.awt.Color;
import javax.swing.JOptionPane;

/**
 * @author DBUSTAMANTEP
 */

public class EditarUsuario extends javax.swing.JFrame {

    Modelo.Usuarios usuarioM;

    /**
     * Creates new form EditarUsuario
     */
    public EditarUsuario(Modelo.Usuarios usuario) {
        initComponents();

        this.usuarioM = usuario;

        jTextFieldDocumento.setText(String.valueOf(usuarioM.getDocumento()));
        jTextFieldNombre.setText(usuarioM.getNombre());
        jTextFieldApellidoUsuario.setText(usuarioM.getApellido());
        jTextFieldCorreo.setText(usuarioM.getCorreo());
        jTextFieldNContacto.setText(String.valueOf(usuarioM.getnContacto()));
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
        jButtonCnacelar = new javax.swing.JButton();
        imagen = new javax.swing.JLabel();
        jSeparator6 = new javax.swing.JSeparator();
        jTextFieldDocumento = new javax.swing.JTextField();
        LblDocumento = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);

        jPanelFondo.setBackground(new java.awt.Color(255, 255, 255));
        jPanelFondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Titulo.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        Titulo.setForeground(new java.awt.Color(0, 0, 0));
        Titulo.setText("Modificación usuario");
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
        jPanelFondo.add(LblCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 410, 330, 40));

        LblnomUsuario.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        LblnomUsuario.setForeground(new java.awt.Color(0, 0, 0));
        LblnomUsuario.setText("Nombre del usuario");
        jPanelFondo.add(LblnomUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, 330, 40));

        LblApellido.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        LblApellido.setForeground(new java.awt.Color(0, 0, 0));
        LblApellido.setText("Apellido del usuario");
        jPanelFondo.add(LblApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 310, 330, 40));

        jTextFieldApellidoUsuario.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldApellidoUsuario.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextFieldApellidoUsuario.setForeground(new java.awt.Color(0, 0, 0));
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
        jPanelFondo.add(jTextFieldApellidoUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 350, 380, -1));

        jSeparator2.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        jPanelFondo.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 470, 310, 10));

        jSeparator3.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator3.setForeground(new java.awt.Color(0, 0, 0));
        jPanelFondo.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 270, 310, 10));

        jSeparator4.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator4.setForeground(new java.awt.Color(0, 0, 0));
        jPanelFondo.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 370, 310, 10));

        jButtonGuardar.setBackground(new java.awt.Color(255, 255, 255));
        jButtonGuardar.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jButtonGuardar.setForeground(new java.awt.Color(0, 0, 0));
        jButtonGuardar.setText("Guardar cambios de usuario");
        jButtonGuardar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGuardarActionPerformed(evt);
            }
        });
        jPanelFondo.add(jButtonGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 600, -1, 50));

        jTextFieldNombre.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldNombre.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextFieldNombre.setForeground(new java.awt.Color(0, 0, 0));
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
        jPanelFondo.add(jTextFieldNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 250, 380, -1));

        jTextFieldCorreo.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldCorreo.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextFieldCorreo.setForeground(new java.awt.Color(0, 0, 0));
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
        jPanelFondo.add(jTextFieldCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 450, 320, -1));

        jTextFieldNContacto.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldNContacto.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextFieldNContacto.setForeground(new java.awt.Color(0, 0, 0));
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
        jPanelFondo.add(jTextFieldNContacto, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 540, 310, -1));

        jSeparator5.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator5.setForeground(new java.awt.Color(0, 0, 0));
        jPanelFondo.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 560, 310, 10));

        LblNContacto.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        LblNContacto.setForeground(new java.awt.Color(0, 0, 0));
        LblNContacto.setText("Numero de contacto");
        jPanelFondo.add(LblNContacto, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 500, 330, 40));

        jButtonCnacelar.setBackground(new java.awt.Color(255, 255, 255));
        jButtonCnacelar.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jButtonCnacelar.setForeground(new java.awt.Color(0, 0, 0));
        jButtonCnacelar.setText("Cancelar");
        jButtonCnacelar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonCnacelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCnacelarActionPerformed(evt);
            }
        });
        jPanelFondo.add(jButtonCnacelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 600, -1, 50));

        imagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes/usuario1.png"))); // NOI18N
        imagen.setText("jLabel1");
        jPanelFondo.add(imagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 50, 540, 610));

        jSeparator6.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator6.setForeground(new java.awt.Color(0, 0, 0));
        jPanelFondo.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, 310, 10));

        jTextFieldDocumento.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldDocumento.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextFieldDocumento.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldDocumento.setText("Ingrese el documento del usuario");
        jTextFieldDocumento.setBorder(null);
        jTextFieldDocumento.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTextFieldDocumentoMousePressed(evt);
            }
        });
        jTextFieldDocumento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldDocumentoActionPerformed(evt);
            }
        });
        jPanelFondo.add(jTextFieldDocumento, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, 380, -1));

        LblDocumento.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        LblDocumento.setForeground(new java.awt.Color(0, 0, 0));
        LblDocumento.setText("Documento del usuario");
        jPanelFondo.add(LblDocumento, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, 330, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelFondo, javax.swing.GroupLayout.DEFAULT_SIZE, 810, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanelFondo, javax.swing.GroupLayout.PREFERRED_SIZE, 704, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JLabelSalidaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JLabelSalidaMouseClicked
        JOptionPane.showMessageDialog(null, "Gracias por usar nuestro sistema de biblioteca\nTenga un buen día");
        System.exit(0);
    }//GEN-LAST:event_JLabelSalidaMouseClicked

    private void jTextFieldApellidoUsuarioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextFieldApellidoUsuarioMousePressed
        //jTextFieldApellidoUsuario.setText("");
        //jTextFieldApellidoUsuario.setForeground(Color.BLACK);
        // jTextFieldDescripcion.setForeground();
    }//GEN-LAST:event_jTextFieldApellidoUsuarioMousePressed

    private void jTextFieldApellidoUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldApellidoUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldApellidoUsuarioActionPerformed

    private void jButtonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGuardarActionPerformed
        Long documento = Long.valueOf(jTextFieldDocumento.getText());
        String nombre = jTextFieldNombre.getText();
        String apellido = jTextFieldApellidoUsuario.getText();
        String correo = jTextFieldCorreo.getText();
        Long nContacto = Long.valueOf(jTextFieldNContacto.getText());

        this.setVisible(false);
        Usuarios usuarios = new Usuarios();
        usuarios.setVisible(true);

        Modelo.Usuarios usuario = new Modelo.Usuarios();
        usuario.setDocumento(documento);
        usuario.setNombre(nombre);
        usuario.setApellido(apellido);
        usuario.setCorreo(correo);
        usuario.setnContacto(nContacto);

        try {
            DAOUsuarios usuariosd = new DAOUsuariosImpl();
            usuariosd.Modificar(usuario);
            JOptionPane.showMessageDialog(null, "Modificación exitosa");

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }//GEN-LAST:event_jButtonGuardarActionPerformed

    private void jTextFieldNombreMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextFieldNombreMousePressed

        //jTextFieldNombre.setForeground();
    }//GEN-LAST:event_jTextFieldNombreMousePressed

    private void jTextFieldNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNombreActionPerformed

    private void jTextFieldCorreoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextFieldCorreoMousePressed

        //jTextFieldAnalisis.setForeground();
    }//GEN-LAST:event_jTextFieldCorreoMousePressed

    private void jTextFieldCorreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCorreoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldCorreoActionPerformed

    private void jTextFieldNContactoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextFieldNContactoMousePressed

    }//GEN-LAST:event_jTextFieldNContactoMousePressed

    private void jTextFieldNContactoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNContactoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNContactoActionPerformed

    private void jTextFieldDocumentoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextFieldDocumentoMousePressed

        // jTextFieldDescripcion.setForeground();
    }//GEN-LAST:event_jTextFieldDocumentoMousePressed

    private void jTextFieldDocumentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldDocumentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldDocumentoActionPerformed

    private void jButtonCnacelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCnacelarActionPerformed
        JOptionPane.showMessageDialog(null, "Edición del usuario cancelada");
        this.setVisible(false);
        Usuarios usuarios = new Usuarios();
        usuarios.setVisible(true);
    }//GEN-LAST:event_jButtonCnacelarActionPerformed

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
            java.util.logging.Logger.getLogger(EditarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            Modelo.Usuarios usuario;

            public void run() {
                new EditarUsuario(usuario).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel JLabelSalida;
    private javax.swing.JLabel LblApellido;
    private javax.swing.JLabel LblCorreo;
    private javax.swing.JLabel LblDocumento;
    private javax.swing.JLabel LblNContacto;
    private javax.swing.JLabel LblnomUsuario;
    private javax.swing.JLabel Titulo;
    private javax.swing.JLabel imagen;
    private javax.swing.JButton jButtonCnacelar;
    private javax.swing.JButton jButtonGuardar;
    private javax.swing.JPanel jPanelFondo;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JTextField jTextFieldApellidoUsuario;
    private javax.swing.JTextField jTextFieldCorreo;
    private javax.swing.JTextField jTextFieldDocumento;
    private javax.swing.JTextField jTextFieldNContacto;
    private javax.swing.JTextField jTextFieldNombre;
    // End of variables declaration//GEN-END:variables
}
