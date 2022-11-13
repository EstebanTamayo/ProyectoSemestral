/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package proyectosemestral.Paneles;

/**
 *
 * @author lr56c
 */
public class BarraBotonesSuperior extends javax.swing.JPanel {
    
    /**
     * Creates new form BarraBotonesSuperior
     */
    public BarraBotonesSuperior() {
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

        ImageSection = new javax.swing.JPanel();
        BotonesSection = new javax.swing.JPanel();
        jButtonProductos = new javax.swing.JButton();
        jButtonFavoritos = new javax.swing.JButton();
        jButtonComparar = new javax.swing.JButton();
        jButtonCrear = new javax.swing.JButton();
        jButtonListaProductos = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        ImageSection.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout ImageSectionLayout = new javax.swing.GroupLayout(ImageSection);
        ImageSection.setLayout(ImageSectionLayout);
        ImageSectionLayout.setHorizontalGroup(
            ImageSectionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 232, Short.MAX_VALUE)
        );
        ImageSectionLayout.setVerticalGroup(
            ImageSectionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        BotonesSection.setBackground(new java.awt.Color(255, 255, 255));

        jButtonProductos.setBackground(new java.awt.Color(31, 106, 178));
        jButtonProductos.setText("Productos");

        jButtonFavoritos.setBackground(new java.awt.Color(31, 106, 178));
        jButtonFavoritos.setText("Favoritos");

        jButtonComparar.setBackground(new java.awt.Color(31, 106, 178));
        jButtonComparar.setText("Comparar");

        jButtonCrear.setBackground(new java.awt.Color(31, 106, 178));
        jButtonCrear.setText("Crear");

        jButtonListaProductos.setBackground(new java.awt.Color(31, 106, 178));
        jButtonListaProductos.setText("Productos");

        javax.swing.GroupLayout BotonesSectionLayout = new javax.swing.GroupLayout(BotonesSection);
        BotonesSection.setLayout(BotonesSectionLayout);
        BotonesSectionLayout.setHorizontalGroup(
            BotonesSectionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BotonesSectionLayout.createSequentialGroup()
                .addContainerGap(297, Short.MAX_VALUE)
                .addGroup(BotonesSectionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BotonesSectionLayout.createSequentialGroup()
                        .addComponent(jButtonProductos)
                        .addGap(53, 53, 53)
                        .addComponent(jButtonFavoritos)
                        .addGap(47, 47, 47)
                        .addComponent(jButtonComparar)
                        .addGap(33, 33, 33)
                        .addComponent(jButtonCrear, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(255, 255, 255))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BotonesSectionLayout.createSequentialGroup()
                        .addComponent(jButtonListaProductos)
                        .addGap(656, 656, 656))))
        );
        BotonesSectionLayout.setVerticalGroup(
            BotonesSectionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BotonesSectionLayout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addGroup(BotonesSectionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonProductos)
                    .addComponent(jButtonFavoritos)
                    .addComponent(jButtonComparar)
                    .addComponent(jButtonCrear))
                .addGap(18, 18, 18)
                .addComponent(jButtonListaProductos)
                .addContainerGap(73, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(ImageSection, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BotonesSection, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ImageSection, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BotonesSection, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(1, 1, 1))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BotonesSection;
    public javax.swing.JPanel ImageSection;
    public javax.swing.JButton jButtonComparar;
    public javax.swing.JButton jButtonCrear;
    public javax.swing.JButton jButtonFavoritos;
    public javax.swing.JButton jButtonListaProductos;
    public javax.swing.JButton jButtonProductos;
    // End of variables declaration//GEN-END:variables
}
