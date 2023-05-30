
package Vista;

import DAO.Imp.DAOPrestamosImpl;
import DAO.Interfaces.DAOPrestamos;
import java.awt.Color;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import javax.swing.JOptionPane;

/**
 * @author DBUSTAMANTEP
 */

public class NuevoPrestamo extends javax.swing.JFrame {

    /**
     * Creates new form NuevoLibro
     */
    public NuevoPrestamo() {
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
        LblEstadoPrestamo = new javax.swing.JLabel();
        Lblnomlibro = new javax.swing.JLabel();
        LblUsuario = new javax.swing.JLabel();
        jTextFieldUsuario = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jButtonGuaradr = new javax.swing.JButton();
        jTextFieldISBN = new javax.swing.JTextField();
        jTextFieldEstadoPrestamo = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);

        jPanelFondo.setBackground(new java.awt.Color(255, 255, 255));
        jPanelFondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Titulo.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        Titulo.setForeground(new java.awt.Color(0, 0, 0));
        Titulo.setText("Creación de prestamo");
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

        LblEstadoPrestamo.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        LblEstadoPrestamo.setForeground(new java.awt.Color(0, 0, 0));
        LblEstadoPrestamo.setText("Estado del prestamo");
        jPanelFondo.add(LblEstadoPrestamo, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 320, 330, 40));

        Lblnomlibro.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        Lblnomlibro.setForeground(new java.awt.Color(0, 0, 0));
        Lblnomlibro.setText("ISBN Libro");
        jPanelFondo.add(Lblnomlibro, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 110, 330, 40));

        LblUsuario.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        LblUsuario.setForeground(new java.awt.Color(0, 0, 0));
        LblUsuario.setText("Documento del usuario");
        jPanelFondo.add(LblUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 220, 330, 40));

        jTextFieldUsuario.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldUsuario.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextFieldUsuario.setForeground(new java.awt.Color(153, 153, 153));
        jTextFieldUsuario.setText("Ingrese el documento del usuario");
        jTextFieldUsuario.setBorder(null);
        jTextFieldUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTextFieldUsuarioMousePressed(evt);
            }
        });
        jTextFieldUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldUsuarioActionPerformed(evt);
            }
        });
        jPanelFondo.add(jTextFieldUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 270, 310, -1));

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
        jButtonGuaradr.setText("Guardar nuevo prestamo");
        jButtonGuaradr.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonGuaradr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGuaradrActionPerformed(evt);
            }
        });
        jPanelFondo.add(jButtonGuaradr, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 450, -1, 50));

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
        jPanelFondo.add(jTextFieldISBN, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 170, 380, -1));

        jTextFieldEstadoPrestamo.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldEstadoPrestamo.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextFieldEstadoPrestamo.setForeground(new java.awt.Color(153, 153, 153));
        jTextFieldEstadoPrestamo.setText("Ingrese el estado del prestamo");
        jTextFieldEstadoPrestamo.setBorder(null);
        jTextFieldEstadoPrestamo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTextFieldEstadoPrestamoMousePressed(evt);
            }
        });
        jTextFieldEstadoPrestamo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldEstadoPrestamoActionPerformed(evt);
            }
        });
        jPanelFondo.add(jTextFieldEstadoPrestamo, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 370, 380, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes/prestamo.png"))); // NOI18N
        jPanelFondo.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 100, 550, 290));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelFondo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelFondo, javax.swing.GroupLayout.DEFAULT_SIZE, 508, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JLabelSalidaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JLabelSalidaMouseClicked
        JOptionPane.showMessageDialog(null, "Gracias por usar nuestro sistema de biblioteca\nTenga un buen día");
        System.exit(0);
    }//GEN-LAST:event_JLabelSalidaMouseClicked

    private void jTextFieldUsuarioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextFieldUsuarioMousePressed
        jTextFieldUsuario.setText("");
        jTextFieldUsuario.setForeground(Color.BLACK);
        // jTextFieldDescripcion.setForeground();
    }//GEN-LAST:event_jTextFieldUsuarioMousePressed

    private void jTextFieldUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldUsuarioActionPerformed

    private void jButtonGuaradrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGuaradrActionPerformed
        //creamos variables para guardar los datos de nuestros JTextField
        int ISBNLibro = Integer.parseInt(jTextFieldISBN.getText());
        long documentoUsuario = Long.parseLong(jTextFieldUsuario.getText());
        String Estado = jTextFieldEstadoPrestamo.getText();

        //llamamos el metodod de generarReporte el cual nos guarda en un CSV
        generarReporte();
        //cambiamos de JFrame al JFrame de prestamos
        this.setVisible(false);
        Prestamos prestamos = new Prestamos();
        prestamos.setVisible(true);
        //creamos un nuevo objeto de tipo Prestamo
        Modelo.Prestamos prestamo = new Modelo.Prestamos();
        //al nuevo prestamo le asignamos los valores que sacamos de los textFields anteriormente
        prestamo.setISBNLibro(ISBNLibro);
        prestamo.setDocumentoUsuario(documentoUsuario);
        prestamo.setEstado(Estado);

        try {
            //creamos un nuevo dao para hacer el registro del prestamo
            DAOPrestamos dao = new DAOPrestamosImpl();
            dao.Registrar(prestamo);
            JOptionPane.showMessageDialog(null, "Registro exitoso");
        } catch (Exception e) {
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

    private void jTextFieldEstadoPrestamoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextFieldEstadoPrestamoMousePressed
        jTextFieldEstadoPrestamo.setText("");
        jTextFieldEstadoPrestamo.setForeground(Color.BLACK);
        //jTextFieldAnalisis.setForeground();
    }//GEN-LAST:event_jTextFieldEstadoPrestamoMousePressed

    private void jTextFieldEstadoPrestamoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldEstadoPrestamoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldEstadoPrestamoActionPerformed
//metodo donde generamos un reporte al csv

    private void generarReporte() {
        try {
            BufferedWriter outStream = new BufferedWriter(new FileWriter("ReportePrestamo.csv", true));
            LocalDate now = LocalDate.now();
            outStream.write(now + "," + jTextFieldISBN.getText() + " , " + jTextFieldUsuario.getText() + " , " + jTextFieldEstadoPrestamo.getText() + "\n");
            outStream.close();
            JOptionPane.showMessageDialog(null, "Se ha guardado exitosamente el registro");
            // System.out.println("Registro guardado de manera exitosa");

        } catch (IOException exception) {
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
            java.util.logging.Logger.getLogger(NuevoPrestamo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NuevoPrestamo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NuevoPrestamo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NuevoPrestamo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NuevoPrestamo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel JLabelSalida;
    private javax.swing.JLabel LblEstadoPrestamo;
    private javax.swing.JLabel LblUsuario;
    private javax.swing.JLabel Lblnomlibro;
    private javax.swing.JLabel Titulo;
    private javax.swing.JButton jButtonGuaradr;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanelFondo;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JTextField jTextFieldEstadoPrestamo;
    private javax.swing.JTextField jTextFieldISBN;
    private javax.swing.JTextField jTextFieldUsuario;
    // End of variables declaration//GEN-END:variables
}
