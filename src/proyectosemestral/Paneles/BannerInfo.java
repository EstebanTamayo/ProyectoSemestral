/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package proyectosemestral.Paneles;

/**
 *
 * @author lr56c
 */
public class BannerInfo extends javax.swing.JPanel {

    /**
     * Creates new form BannerInfo
     */
    public BannerInfo() {
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

        TitleSection = new javax.swing.JPanel();
        jTitleLabel = new javax.swing.JLabel();
        InfoSection = new javax.swing.JPanel();
        infoPanel3 = new proyectosemestral.Paneles.InfoPanel();
        infoPanel4 = new proyectosemestral.Paneles.InfoPanel();

        setBackground(new java.awt.Color(31, 106, 178));
        setPreferredSize(new java.awt.Dimension(1280, 300));

        TitleSection.setBackground(new java.awt.Color(31, 106, 178));

        jTitleLabel.setText("title");

        javax.swing.GroupLayout TitleSectionLayout = new javax.swing.GroupLayout(TitleSection);
        TitleSection.setLayout(TitleSectionLayout);
        TitleSectionLayout.setHorizontalGroup(
            TitleSectionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TitleSectionLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jTitleLabel)
                .addGap(621, 621, 621))
        );
        TitleSectionLayout.setVerticalGroup(
            TitleSectionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TitleSectionLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jTitleLabel)
                .addContainerGap(38, Short.MAX_VALUE))
        );

        InfoSection.setBackground(new java.awt.Color(31, 106, 178));

        javax.swing.GroupLayout InfoSectionLayout = new javax.swing.GroupLayout(InfoSection);
        InfoSection.setLayout(InfoSectionLayout);
        InfoSectionLayout.setHorizontalGroup(
            InfoSectionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(InfoSectionLayout.createSequentialGroup()
                .addGap(426, 426, 426)
                .addComponent(infoPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(infoPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(426, Short.MAX_VALUE))
        );
        InfoSectionLayout.setVerticalGroup(
            InfoSectionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(InfoSectionLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(InfoSectionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(infoPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(infoPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(TitleSection, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(InfoSection, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(TitleSection, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(InfoSection, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel InfoSection;
    private javax.swing.JPanel TitleSection;
    public proyectosemestral.Paneles.InfoPanel infoPanel3;
    public proyectosemestral.Paneles.InfoPanel infoPanel4;
    public javax.swing.JLabel jTitleLabel;
    // End of variables declaration//GEN-END:variables
}
