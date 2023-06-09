
package Vista;

import database.Connector;
import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/*
 * @author DBUSTAMANTEP
 */

public class Home extends javax.swing.JFrame {

    /**
     * Creates new form Home
     */
    String url;
    //private Connector conector;
    
    @SuppressWarnings("empty-statement")
    public Home() {
        initComponents();
        //conector=Connector.getConnection();
        LocalDate now=LocalDate.now();
        Locale spanishLocale=new Locale("es","ES");
        jLabelTituloFecha.setText(now.format(DateTimeFormatter.ofPattern("'Hoy es' EEEE dd 'de' MMMM 'de' YYYY",spanishLocale)));
        
         url="";
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
        jLabelTituloNoticias = new javax.swing.JLabel();
        jLabelFoto1 = new javax.swing.JLabel();
        jLabelFoto2 = new javax.swing.JLabel();
        jLabelTituloNoticias1 = new javax.swing.JLabel();
        jLabelTituloNoticias2 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);

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
                .addComponent(jLabelTituloFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 698, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(171, Short.MAX_VALUE))
        );
        BarraFechaHoraLayout.setVerticalGroup(
            BarraFechaHoraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BarraFechaHoraLayout.createSequentialGroup()
                .addContainerGap(36, Short.MAX_VALUE)
                .addComponent(jLabelTituloFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
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
        BackGround.add(jLabelExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(1160, 0, 40, -1));

        jLabelTituloNoticias.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabelTituloNoticias.setForeground(new java.awt.Color(0, 0, 0));
        jLabelTituloNoticias.setText("Noticias");
        BackGround.add(jLabelTituloNoticias, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 260, -1, -1));

        jLabelFoto1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes/libros1.png"))); // NOI18N
        BackGround.add(jLabelFoto1, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 490, 240, 200));

        jLabelFoto2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes/libros2.png"))); // NOI18N
        BackGround.add(jLabelFoto2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 290, 250, 210));

        jLabelTituloNoticias1.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabelTituloNoticias1.setForeground(new java.awt.Color(0, 0, 0));
        jLabelTituloNoticias1.setText("Ultimos días de la FilBo 2023:Estos son algunos de los libros más vendidos");
        jLabelTituloNoticias1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabelTituloNoticias1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelTituloNoticias1MouseClicked(evt);
            }
        });
        BackGround.add(jLabelTituloNoticias1, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 270, 630, 60));

        jLabelTituloNoticias2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabelTituloNoticias2.setForeground(new java.awt.Color(0, 0, 0));
        jLabelTituloNoticias2.setText("Así funciona BuscaLibre el Stand sin libros de la FilBo");
        jLabelTituloNoticias2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelTituloNoticias2MouseClicked(evt);
            }
        });
        BackGround.add(jLabelTituloNoticias2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 530, 480, -1));

        jSeparator2.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        BackGround.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 550, 510, 20));

        jSeparator3.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator3.setForeground(new java.awt.Color(0, 0, 0));
        BackGround.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 310, 590, 20));

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
        this.setVisible(false);
        
        Usuarios usuarios=new Usuarios();
        usuarios.setVisible(true);
    }//GEN-LAST:event_jButtonUsuariosActionPerformed

    private void jButtonLibrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLibrosActionPerformed
        JOptionPane.showMessageDialog(null, "Libros");
        this.setVisible(false);
        
        Libros libros=new Libros();
        libros.setVisible(true);
    }//GEN-LAST:event_jButtonLibrosActionPerformed

    private void jButtonHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonHomeActionPerformed
        JOptionPane.showMessageDialog(null, "Home");
        this.setVisible(false);
        
        Home home=new Home();
        home.setVisible(true);
    }//GEN-LAST:event_jButtonHomeActionPerformed

    private void jButtonPrestamosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPrestamosActionPerformed
        JOptionPane.showMessageDialog(null, "Prestamos");
        this.setVisible(false);
        
        Prestamos prestamos=new Prestamos();
        prestamos.setVisible(true);
    }//GEN-LAST:event_jButtonPrestamosActionPerformed

    private void jLabelExitMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelExitMousePressed
        JOptionPane.showMessageDialog(null,"Gracias por usar nuestro sistema de biblioteca\nTenga un buen día");
        System.exit(0);
             
    }//GEN-LAST:event_jLabelExitMousePressed

    private void jLabelTituloNoticias1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelTituloNoticias1MouseClicked
        url="https://mascolombia.com/ultimos-dias-de-la-filbo-2023-estos-son-algunos-de-los-libros-mas-vendidos-de-las-editoriales-independientes-colombianas/";
        try {
            //Desktop.getDesktop().browse(New Uri(String));
            Desktop.getDesktop().browse(new URI(url));
        } catch (URISyntaxException ex) {
            Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jLabelTituloNoticias1MouseClicked

    private void jLabelTituloNoticias2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelTituloNoticias2MouseClicked
         url="https://www.eltiempo.com/tecnosfera/novedades-tecnologia/asi-funciona-buscalibre-en-la-feria-del-libro-de-bogota-763901";
        try {
            //Desktop.getDesktop().browse(New Uri(String));
            Desktop.getDesktop().browse(new URI(url));
        } catch (URISyntaxException ex) {
            Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jLabelTituloNoticias2MouseClicked

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
    private javax.swing.JLabel jLabelFoto1;
    private javax.swing.JLabel jLabelFoto2;
    private javax.swing.JLabel jLabelLogo;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JLabel jLabelTitulo1;
    private javax.swing.JLabel jLabelTituloBienvenido;
    private javax.swing.JLabel jLabelTituloFecha;
    private javax.swing.JLabel jLabelTituloNoticias;
    private javax.swing.JLabel jLabelTituloNoticias1;
    private javax.swing.JLabel jLabelTituloNoticias2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    // End of variables declaration//GEN-END:variables
}
