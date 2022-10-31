/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package proyectosemestral;

import com.formdev.flatlaf.FlatLightLaf;
import javax.swing.UIManager;

/**
 *
 * @author esteb
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public Login() {
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

        jLabel2 = new javax.swing.JLabel();
        bg = new javax.swing.JPanel();
        lblNombreEmpresa = new javax.swing.JLabel();
        Logo = new javax.swing.JLabel();
        ImagenInicio = new javax.swing.JLabel();
        lblinicioSesion = new javax.swing.JLabel();
        lblcontrasena = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        lblUsuario = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        psfContrasena = new javax.swing.JPasswordField();
        bgEntrar = new javax.swing.JPanel();
        lblEntrar = new javax.swing.JLabel();
        salir1 = new proyectosemestral.Salir();

        jLabel2.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setResizable(false);

        bg.setBackground(new java.awt.Color(255, 255, 255));
        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblNombreEmpresa.setBackground(new java.awt.Color(255, 255, 255));
        lblNombreEmpresa.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        lblNombreEmpresa.setForeground(new java.awt.Color(255, 255, 255));
        lblNombreEmpresa.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNombreEmpresa.setText("ON SITE CLIMATIZACION");
        bg.add(lblNombreEmpresa, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 140, 280, 70));

        Logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectosemestral/images/LogoOnsite.png"))); // NOI18N
        Logo.setText("jLabel3");
        bg.add(Logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 150, 80));

        ImagenInicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectosemestral/images/Inicio.jpg"))); // NOI18N
        ImagenInicio.setText("jLabel4");
        bg.add(ImagenInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 0, 390, 530));

        lblinicioSesion.setBackground(new java.awt.Color(0, 0, 0));
        lblinicioSesion.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        lblinicioSesion.setText("INICIAR SESION");
        bg.add(lblinicioSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, -1, -1));

        lblcontrasena.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        lblcontrasena.setText("CONTRASEÑA");
        bg.add(lblcontrasena, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 400, -1, -1));
        bg.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 460, 220, 10));

        lblUsuario.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        lblUsuario.setText("USUARIO");
        bg.add(lblUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, -1, -1));

        txtUsuario.setBackground(new java.awt.Color(255, 255, 255));
        txtUsuario.setForeground(new java.awt.Color(153, 153, 153));
        txtUsuario.setText("iNGRESE SU NOMBRE DE USUARIO");
        txtUsuario.setBorder(null);
        txtUsuario.setSelectionColor(new java.awt.Color(204, 204, 204));
        bg.add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, 470, 40));
        bg.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 390, 220, 10));

        psfContrasena.setBackground(new java.awt.Color(255, 255, 255));
        psfContrasena.setForeground(new java.awt.Color(153, 153, 153));
        psfContrasena.setText("**********");
        psfContrasena.setBorder(null);
        psfContrasena.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                psfContrasenaActionPerformed(evt);
            }
        });
        bg.add(psfContrasena, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 440, 230, -1));

        bgEntrar.setBackground(new java.awt.Color(31, 106, 178));
        bgEntrar.setForeground(new java.awt.Color(31, 106, 178));

        lblEntrar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblEntrar.setForeground(new java.awt.Color(255, 255, 255));
        lblEntrar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblEntrar.setText("ENTRAR");
        lblEntrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout bgEntrarLayout = new javax.swing.GroupLayout(bgEntrar);
        bgEntrar.setLayout(bgEntrarLayout);
        bgEntrarLayout.setHorizontalGroup(
            bgEntrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bgEntrarLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblEntrar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        bgEntrarLayout.setVerticalGroup(
            bgEntrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bgEntrarLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblEntrar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        bg.add(bgEntrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 480, 80, 30));
        bg.add(salir1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void psfContrasenaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_psfContrasenaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_psfContrasenaActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {
    UIManager.setLookAndFeel( new FlatLightLaf() );
} catch( Exception ex ) {
    System.err.println( "Failed to initialize LaF" );
}
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ImagenInicio;
    private javax.swing.JLabel Logo;
    private javax.swing.JPanel bg;
    private javax.swing.JPanel bgEntrar;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lblEntrar;
    private javax.swing.JLabel lblNombreEmpresa;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JLabel lblcontrasena;
    private javax.swing.JLabel lblinicioSesion;
    private javax.swing.JPasswordField psfContrasena;
    private proyectosemestral.Salir salir1;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
