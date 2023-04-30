/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author DBUSTAMANTEP
 */
public class Home extends javax.swing.JFrame {

    /**
     * Creates new form Home
     */
    public Home() {
        initComponents();
        Date date = Date.from(Instant.now());
        
        jLabelTituloFecha.setText(String.valueOf(date));
    }
    
   
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BackGround = new javax.swing.JPanel();
        BarraLateral = new javax.swing.JPanel();
        jLabelLogo = new javax.swing.JLabel();
        jLabelTitulo = new javax.swing.JLabel();
        jLabelTitulo1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jButtonLibros = new javax.swing.JButton();
        jButtonUsuarios = new javax.swing.JButton();
        jButtonPrestamos = new javax.swing.JButton();
        jButtonHome = new javax.swing.JButton();
        BarraFechaHora = new javax.swing.JPanel();
        jLabelTituloFecha = new javax.swing.JLabel();
        jLabelTituloBienvenido = new javax.swing.JLabel();
        jLabelExit = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);

        BackGround.setBackground(new java.awt.Color(255, 255, 255));
        BackGround.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BarraLateral.setBackground(new java.awt.Color(0, 153, 255));

        jLabelLogo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes/logo.png"))); // NOI18N

        jLabelTitulo.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabelTitulo.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTitulo.setText("Biblioteca");

        jLabelTitulo1.setBackground(new java.awt.Color(0, 102, 204));
        jLabelTitulo1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabelTitulo1.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTitulo1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTitulo1.setText("Biblioteca");

        jPanel1.setBackground(new java.awt.Color(0, 102, 204));

        jButtonLibros.setBackground(new java.awt.Color(0, 102, 204));
        jButtonLibros.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jButtonLibros.setForeground(new java.awt.Color(255, 255, 255));
        jButtonLibros.setText("Libros");
        jButtonLibros.setBorder(null);
        jButtonLibros.setBorderPainted(false);
        jButtonLibros.setContentAreaFilled(false);
        jButtonLibros.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonLibros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLibrosActionPerformed(evt);
            }
        });

        jButtonUsuarios.setBackground(new java.awt.Color(0, 102, 204));
        jButtonUsuarios.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jButtonUsuarios.setForeground(new java.awt.Color(255, 255, 255));
        jButtonUsuarios.setText("Usuarios");
        jButtonUsuarios.setBorder(null);
        jButtonUsuarios.setBorderPainted(false);
        jButtonUsuarios.setContentAreaFilled(false);
        jButtonUsuarios.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonUsuariosActionPerformed(evt);
            }
        });

        jButtonPrestamos.setBackground(new java.awt.Color(0, 102, 204));
        jButtonPrestamos.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jButtonPrestamos.setForeground(new java.awt.Color(255, 255, 255));
        jButtonPrestamos.setText("Prestamos");
        jButtonPrestamos.setBorder(null);
        jButtonPrestamos.setContentAreaFilled(false);
        jButtonPrestamos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonPrestamos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPrestamosActionPerformed(evt);
            }
        });

        jButtonHome.setBackground(new java.awt.Color(0, 102, 204));
        jButtonHome.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jButtonHome.setForeground(new java.awt.Color(255, 255, 255));
        jButtonHome.setText("Home");
        jButtonHome.setBorder(null);
        jButtonHome.setContentAreaFilled(false);
        jButtonHome.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonHomeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonHome, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonPrestamos, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonLibros, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonHome, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jButtonPrestamos, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(49, 49, 49)
                .addComponent(jButtonLibros, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(jButtonUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout BarraLateralLayout = new javax.swing.GroupLayout(BarraLateral);
        BarraLateral.setLayout(BarraLateralLayout);
        BarraLateralLayout.setHorizontalGroup(
            BarraLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BarraLateralLayout.createSequentialGroup()
                .addGroup(BarraLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BarraLateralLayout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(162, 162, 162)
                        .addComponent(jLabelTitulo1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(BarraLateralLayout.createSequentialGroup()
                        .addGroup(BarraLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(BarraLateralLayout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addComponent(jLabelLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(BarraLateralLayout.createSequentialGroup()
                                .addGap(81, 81, 81)
                                .addComponent(jLabelTitulo)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        BarraLateralLayout.setVerticalGroup(
            BarraLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BarraLateralLayout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(jLabelLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelTitulo)
                .addGap(68, 68, 68)
                .addGroup(BarraLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelTitulo1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(153, Short.MAX_VALUE))
        );

        BackGround.add(BarraLateral, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 290, 750));

        BarraFechaHora.setBackground(new java.awt.Color(0, 153, 255));

        jLabelTituloFecha.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabelTituloFecha.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout BarraFechaHoraLayout = new javax.swing.GroupLayout(BarraFechaHora);
        BarraFechaHora.setLayout(BarraFechaHoraLayout);
        BarraFechaHoraLayout.setHorizontalGroup(
            BarraFechaHoraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BarraFechaHoraLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jLabelTituloFecha)
                .addContainerGap(869, Short.MAX_VALUE))
        );
        BarraFechaHoraLayout.setVerticalGroup(
            BarraFechaHoraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BarraFechaHoraLayout.createSequentialGroup()
                .addContainerGap(76, Short.MAX_VALUE)
                .addComponent(jLabelTituloFecha)
                .addGap(44, 44, 44))
        );

        BackGround.add(BarraFechaHora, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 100, 910, 120));

        jLabelTituloBienvenido.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabelTituloBienvenido.setForeground(new java.awt.Color(0, 0, 0));
        jLabelTituloBienvenido.setText("Bienvenido");
        BackGround.add(jLabelTituloBienvenido, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 40, -1, -1));

        jLabelExit.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabelExit.setForeground(new java.awt.Color(0, 0, 0));
        jLabelExit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelExit.setText("X");
        jLabelExit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabelExitMousePressed(evt);
            }
        });
        BackGround.add(jLabelExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(1156, 0, 40, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BackGround, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BackGround, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonUsuariosActionPerformed
        JOptionPane.showMessageDialog(null, "Usuarios");
    }//GEN-LAST:event_jButtonUsuariosActionPerformed

    private void jButtonLibrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLibrosActionPerformed
        JOptionPane.showMessageDialog(null, "Libros");
    }//GEN-LAST:event_jButtonLibrosActionPerformed

    private void jButtonHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonHomeActionPerformed
        JOptionPane.showMessageDialog(null, "Home");
    }//GEN-LAST:event_jButtonHomeActionPerformed

    private void jButtonPrestamosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPrestamosActionPerformed
        JOptionPane.showMessageDialog(null, "Prestamos");
    }//GEN-LAST:event_jButtonPrestamosActionPerformed

    private void jLabelExitMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelExitMousePressed
        System.exit(0);
    }//GEN-LAST:event_jLabelExitMousePressed

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
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BackGround;
    private javax.swing.JPanel BarraFechaHora;
    private javax.swing.JPanel BarraLateral;
    private javax.swing.JButton jButtonHome;
    private javax.swing.JButton jButtonLibros;
    private javax.swing.JButton jButtonPrestamos;
    private javax.swing.JButton jButtonUsuarios;
    private javax.swing.JLabel jLabelExit;
    private javax.swing.JLabel jLabelLogo;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JLabel jLabelTitulo1;
    private javax.swing.JLabel jLabelTituloBienvenido;
    private javax.swing.JLabel jLabelTituloFecha;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
