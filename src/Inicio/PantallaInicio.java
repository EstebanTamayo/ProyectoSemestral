/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Inicio;

import com.formdev.flatlaf.FlatLightLaf;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.UIManager;
import proyectosemestral.Paneles.TarjetaProducto;

/**
 *
 * @author esteb
 */
public class PantallaInicio extends javax.swing.JFrame {

      /**
     * Creates new form PantallaInicio
     */
    public PantallaInicio() {
        initComponents();
        bannerInfo1.infoPanel3.jTitleLabel.setText("prueba");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        bg = new javax.swing.JPanel();
        PanelImage = new javax.swing.JPanel();
        lblLogo = new javax.swing.JLabel();
        PanelBotones = new javax.swing.JPanel();
        jButton6 = new javax.swing.JButton();
        btComparar = new javax.swing.JButton();
        btProductos = new javax.swing.JButton();
        btCrear = new javax.swing.JButton();
        bannerInfo1 = new proyectosemestral.Paneles.BannerInfo();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jScrollPane2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane2.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        jScrollPane2.setPreferredSize(new java.awt.Dimension(1280, 2200));

        bg.setBackground(new java.awt.Color(255, 255, 255));
        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PanelImage.setBackground(new java.awt.Color(255, 255, 255));

        lblLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectosemestral/images/LogoOnsite.png"))); // NOI18N
        lblLogo.setText("jLabel1");

        javax.swing.GroupLayout PanelImageLayout = new javax.swing.GroupLayout(PanelImage);
        PanelImage.setLayout(PanelImageLayout);
        PanelImageLayout.setHorizontalGroup(
            PanelImageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 210, Short.MAX_VALUE)
            .addGroup(PanelImageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(PanelImageLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(lblLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        PanelImageLayout.setVerticalGroup(
            PanelImageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 140, Short.MAX_VALUE)
            .addGroup(PanelImageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(PanelImageLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(lblLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        bg.add(PanelImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 210, 140));

        PanelBotones.setBackground(new java.awt.Color(255, 255, 255));

        jButton6.setBackground(new java.awt.Color(31, 106, 178));
        jButton6.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jButton6.setForeground(new java.awt.Color(255, 255, 255));
        jButton6.setText("Favoritos");
        jButton6.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton6.setPreferredSize(new java.awt.Dimension(96, 34));

        btComparar.setBackground(new java.awt.Color(31, 106, 178));
        btComparar.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        btComparar.setForeground(new java.awt.Color(255, 255, 255));
        btComparar.setText("Comparar");
        btComparar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btComparar.setPreferredSize(new java.awt.Dimension(96, 34));
        btComparar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCompararActionPerformed(evt);
            }
        });

        btProductos.setBackground(new java.awt.Color(31, 106, 178));
        btProductos.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        btProductos.setForeground(new java.awt.Color(255, 255, 255));
        btProductos.setText("Productos");
        btProductos.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        btCrear.setBackground(new java.awt.Color(31, 106, 178));
        btCrear.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        btCrear.setForeground(new java.awt.Color(255, 255, 255));
        btCrear.setText("Crear");
        btCrear.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btCrear.setPreferredSize(new java.awt.Dimension(96, 34));
        btCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCrearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelBotonesLayout = new javax.swing.GroupLayout(PanelBotones);
        PanelBotones.setLayout(PanelBotonesLayout);
        PanelBotonesLayout.setHorizontalGroup(
            PanelBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelBotonesLayout.createSequentialGroup()
                .addGap(172, 172, 172)
                .addComponent(btProductos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btComparar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btCrear, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(182, Short.MAX_VALUE))
        );
        PanelBotonesLayout.setVerticalGroup(
            PanelBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelBotonesLayout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(PanelBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btProductos)
                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btComparar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btCrear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(54, Short.MAX_VALUE))
        );

        bg.add(PanelBotones, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 0, 790, 140));
        bg.add(bannerInfo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, -1, -1));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1280, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 280, Short.MAX_VALUE)
        );

        bg.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 440, 1280, 280));

        jScrollPane2.setViewportView(bg);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 720, Short.MAX_VALUE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCrearActionPerformed
        // TODO add your handling code here:
        System.out.println("btn");
    }//GEN-LAST:event_btCrearActionPerformed

    private void btCompararActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCompararActionPerformed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_btCompararActionPerformed

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
                new PantallaInicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelBotones;
    private javax.swing.JPanel PanelImage;
    private proyectosemestral.Paneles.BannerInfo bannerInfo1;
    private javax.swing.JPanel bg;
    private javax.swing.JButton btComparar;
    private javax.swing.JButton btCrear;
    private javax.swing.JButton btProductos;
    private javax.swing.JButton jButton6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblLogo;
    // End of variables declaration//GEN-END:variables
}
