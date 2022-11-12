/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Login;

import com.formdev.flatlaf.FlatLightLaf;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

/**
 *
 * @author esteb
 */
public class Login extends javax.swing.JFrame {

    private boolean firstUser = true;
    private boolean firstPass = true;
    private boolean userOK = false;
    private boolean passOK = false;
    private LoginController loginController;
    
    /**
     * Creates new form Login
     */
    public Login() {
        loginController = new LoginController(this);
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
        lblLogo = new javax.swing.JLabel();
        ImagenInicio = new javax.swing.JLabel();
        lblinicioSesion = new javax.swing.JLabel();
        lblTitleContrasena = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        lblTitleUsuario = new javax.swing.JLabel();
        lblUsuario = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jButton1 = new javax.swing.JButton();
        jPasswordField = new javax.swing.JPasswordField();

        jLabel2.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setResizable(false);

        bg.setBackground(new java.awt.Color(255, 255, 255));
        bg.setInheritsPopupMenu(true);
        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblNombreEmpresa.setBackground(new java.awt.Color(255, 255, 255));
        lblNombreEmpresa.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        lblNombreEmpresa.setForeground(new java.awt.Color(255, 255, 255));
        lblNombreEmpresa.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNombreEmpresa.setText("ON SITE CLIMATIZACION");
        bg.add(lblNombreEmpresa, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 140, 280, 70));

        lblLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectosemestral/images/LogoOnsite.png"))); // NOI18N
        lblLogo.setText("jLabel3");
        bg.add(lblLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 150, 80));

        ImagenInicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectosemestral/images/Inicio.jpg"))); // NOI18N
        ImagenInicio.setText("jLabel4");
        bg.add(ImagenInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 0, 390, 530));

        lblinicioSesion.setBackground(new java.awt.Color(0, 0, 0));
        lblinicioSesion.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        lblinicioSesion.setText("INICIAR SESION");
        bg.add(lblinicioSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, -1, -1));

        lblTitleContrasena.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        lblTitleContrasena.setText("CONTRASEÑA");
        bg.add(lblTitleContrasena, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 400, -1, -1));
        bg.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 460, 220, 10));

        lblTitleUsuario.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        lblTitleUsuario.setText("USUARIO");
        bg.add(lblTitleUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, -1, -1));

        lblUsuario.setBackground(new java.awt.Color(255, 255, 255));
        lblUsuario.setForeground(new java.awt.Color(153, 153, 153));
        lblUsuario.setText("Ingrese usuario");
        lblUsuario.setBorder(null);
        lblUsuario.setSelectionColor(new java.awt.Color(204, 204, 204));
        lblUsuario.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                lblUsuarioFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                lblUsuarioFocusLost(evt);
            }
        });
        lblUsuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                lblUsuarioKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                lblUsuarioKeyReleased(evt);
            }
        });
        bg.add(lblUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, 220, 40));
        bg.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 390, 220, 10));

        jButton1.setBackground(new java.awt.Color(31, 106, 178));
        jButton1.setText("ENTRAR");
        jButton1.setEnabled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        bg.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 480, -1, -1));

        jPasswordField.setBackground(new java.awt.Color(255, 255, 255));
        jPasswordField.setForeground(new java.awt.Color(153, 153, 153));
        jPasswordField.setText("jPasswordField1");
        jPasswordField.setBorder(null);
        jPasswordField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jPasswordFieldKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jPasswordFieldKeyReleased(evt);
            }
        });
        bg.add(jPasswordField, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 440, 220, -1));

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

    private void lblUsuarioKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lblUsuarioKeyPressed
        
        if(firstUser){
            lblUsuario.setText("");
            firstUser = false;
        }
    }//GEN-LAST:event_lblUsuarioKeyPressed

    private void lblUsuarioFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_lblUsuarioFocusLost
        // TODO add your handling code here:
        
        if(lblUsuario.getText().length() == 0){
            lblUsuario.setText("Ingrese usuario");
        }
    }//GEN-LAST:event_lblUsuarioFocusLost

    private void lblUsuarioKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lblUsuarioKeyReleased
        // TODO add your handling code here:
        if(lblUsuario.getText().length() == 0){
            userOK = false;
        }
        else{
            userOK = true;
        }
        
        checkEnter();
    }//GEN-LAST:event_lblUsuarioKeyReleased

    private void lblUsuarioFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_lblUsuarioFocusGained

        if(firstUser){
            lblUsuario.setCaretPosition(lblUsuario.getDocument().getLength());
            return;
        }
    }//GEN-LAST:event_lblUsuarioFocusGained

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        String p = String.valueOf(jPasswordField.getPassword());
        loginController.EnterAction(lblUsuario.getText(), p);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jPasswordFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPasswordFieldKeyReleased
          if(jPasswordField.getPassword().length == 0){
            passOK = false;
        }
        else{
            passOK = true;
        }
        
        checkEnter();
    }//GEN-LAST:event_jPasswordFieldKeyReleased

    private void jPasswordFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPasswordFieldKeyPressed
        
        if(firstPass){
            jPasswordField.setText("");
            firstPass = false;
        }
    }//GEN-LAST:event_jPasswordFieldKeyPressed

    private void checkEnter(){
        if(userOK && passOK){
            jButton1.setEnabled(true);
        }
        else{
            jButton1.setEnabled(false);
        }
    }
    
    public void MostrarAlerta(){
        JOptionPane.showMessageDialog(this, "Usuario no encontrado", "Error", 0);
    }
    
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
    private javax.swing.JPanel bg;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPasswordField jPasswordField;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JLabel lblNombreEmpresa;
    public javax.swing.JLabel lblTitleContrasena;
    private javax.swing.JLabel lblTitleUsuario;
    private javax.swing.JTextField lblUsuario;
    private javax.swing.JLabel lblinicioSesion;
    // End of variables declaration//GEN-END:variables
}