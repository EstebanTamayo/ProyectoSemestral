/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Especifico;

import Comparar.PantallaComparar;
import Entidades.Ventilador;
import Favoritos.PantallaFavoritos;
import Listado.PantallaLista;
import com.formdev.flatlaf.FlatLightLaf;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

/**
 *
 * @author lr56c
 */
public class PantallaEspecifica extends javax.swing.JFrame {

    private ItemDisplayController itemDisplayController;
    private Ventilador ventilador = null;
    private int index;
    /**
     * Creates new form PantallaEspecifica
     */
    public PantallaEspecifica() {
        itemDisplayController = new ItemDisplayController(this);
        initComponents();
        barraBotones1.setPadre(this);
    }

    private void Inicializacion(){
        
        ventilador = itemDisplayController.getVentilador(index);
        
        if(ventilador == null){
            JOptionPane.showMessageDialog(this, "Producto no encontrado", "Error", 0);
            return;
        }
        jLabelCodigo.setText("Codigo: " + ventilador.getCodigo());
        jLabelCategoria.setText("Categoria: " + ventilador.getCategoria());
        jLabelCapacidad.setText("Capacidad: " + ventilador.getCapacidad());
        jLabelTipo.setText("Tipo equipo: " + ventilador.getTipoEquipo());
        jLabelEspacio.setText("Espacio metros cuadrados: " + ventilador.getEspacioMaximo());
        jLabelMarca.setText("Marca: " + ventilador.getMarca());
        jLabelModelo.setText("Modelo: " + ventilador.getModelo());
        jLabelRemoto.setText("Control remoto: " + (ventilador.isControlRemoto() ? "Tiene" : "No tiene"));
        jLabelInstalacion.setText("Instalacion: " + (ventilador.isInstalacion() ? "Tiene" : "No tiene"));
        jLabelPrecio.setText("Precio: " + ventilador.getPrecio());
        jLabelAncho.setText("Ancho: " + ventilador.getAncho());
        jLabelAlto.setText("Alto: " + ventilador.getAlto());
        jLabelDescripcion.setText("Descripcion: " + ventilador.getDescripcion());
        jLabelRefrigerante.setText("Refrigerante: " + ventilador.getRefrigerante());
        
        boolean fav = itemDisplayController.getFavorite(index);
        jButtonFavoritos.setText(fav ? "Eliminar Favoritos" : "Agregar Favoritos");
    }
    
    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
        Inicializacion();
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        ImageSection = new javax.swing.JPanel();
        LineaPanel = new javax.swing.JPanel();
        DescripcionSection = new javax.swing.JPanel();
        jLabelTipo = new javax.swing.JLabel();
        jLabelPrecio = new javax.swing.JLabel();
        jLabelDescripcion = new javax.swing.JLabel();
        jLabelInstalacion = new javax.swing.JLabel();
        jLabelCodigo = new javax.swing.JLabel();
        jLabelCategoria = new javax.swing.JLabel();
        jLabelMarca = new javax.swing.JLabel();
        jLabelModelo = new javax.swing.JLabel();
        jLabelRefrigerante = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jButtonComparar = new javax.swing.JButton();
        jButtonFavoritos = new javax.swing.JButton();
        EspecificationSection = new javax.swing.JPanel();
        jLabelEspecificaciones = new javax.swing.JLabel();
        jLabelCapacidad = new javax.swing.JLabel();
        jLabelEspacio = new javax.swing.JLabel();
        jLabelRemoto = new javax.swing.JLabel();
        jLabelAncho = new javax.swing.JLabel();
        jLabelAlto = new javax.swing.JLabel();
        barraBotones1 = new proyectosemestral.Paneles.BarraBotones();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        jScrollPane1.setPreferredSize(new java.awt.Dimension(1280, 1100));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        ImageSection.setBackground(new java.awt.Color(255, 255, 255));
        ImageSection.setPreferredSize(new java.awt.Dimension(400, 400));

        javax.swing.GroupLayout ImageSectionLayout = new javax.swing.GroupLayout(ImageSection);
        ImageSection.setLayout(ImageSectionLayout);
        ImageSectionLayout.setHorizontalGroup(
            ImageSectionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        ImageSectionLayout.setVerticalGroup(
            ImageSectionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );

        LineaPanel.setBackground(new java.awt.Color(153, 153, 153));
        LineaPanel.setPreferredSize(new java.awt.Dimension(1280, 5));

        javax.swing.GroupLayout LineaPanelLayout = new javax.swing.GroupLayout(LineaPanel);
        LineaPanel.setLayout(LineaPanelLayout);
        LineaPanelLayout.setHorizontalGroup(
            LineaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1280, Short.MAX_VALUE)
        );
        LineaPanelLayout.setVerticalGroup(
            LineaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 8, Short.MAX_VALUE)
        );

        DescripcionSection.setBackground(new java.awt.Color(255, 255, 255));
        DescripcionSection.setPreferredSize(new java.awt.Dimension(400, 400));

        jLabelTipo.setForeground(new java.awt.Color(51, 51, 51));
        jLabelTipo.setText("Tipo");

        jLabelPrecio.setForeground(new java.awt.Color(51, 51, 51));
        jLabelPrecio.setText("Precio");

        jLabelDescripcion.setForeground(new java.awt.Color(51, 51, 51));
        jLabelDescripcion.setText("Descripcion");

        jLabelInstalacion.setForeground(new java.awt.Color(51, 51, 51));
        jLabelInstalacion.setText("Tipo Instalacion");

        jLabelCodigo.setForeground(new java.awt.Color(51, 51, 51));
        jLabelCodigo.setText("Codigo");

        jLabelCategoria.setForeground(new java.awt.Color(51, 51, 51));
        jLabelCategoria.setText("Categoria");

        jLabelMarca.setForeground(new java.awt.Color(51, 51, 51));
        jLabelMarca.setText("Marca");

        jLabelModelo.setForeground(new java.awt.Color(51, 51, 51));
        jLabelModelo.setText("Modelo");

        jLabelRefrigerante.setForeground(new java.awt.Color(51, 51, 51));
        jLabelRefrigerante.setText("Refrigerante");

        javax.swing.GroupLayout DescripcionSectionLayout = new javax.swing.GroupLayout(DescripcionSection);
        DescripcionSection.setLayout(DescripcionSectionLayout);
        DescripcionSectionLayout.setHorizontalGroup(
            DescripcionSectionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DescripcionSectionLayout.createSequentialGroup()
                .addGap(84, 84, 84)
                .addGroup(DescripcionSectionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelTipo)
                    .addComponent(jLabelPrecio)
                    .addComponent(jLabelDescripcion)
                    .addComponent(jLabelInstalacion)
                    .addComponent(jLabelCodigo)
                    .addComponent(jLabelCategoria)
                    .addComponent(jLabelMarca)
                    .addComponent(jLabelModelo)
                    .addComponent(jLabelRefrigerante))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        DescripcionSectionLayout.setVerticalGroup(
            DescripcionSectionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DescripcionSectionLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabelTipo)
                .addGap(18, 18, 18)
                .addComponent(jLabelPrecio)
                .addGap(18, 18, 18)
                .addComponent(jLabelDescripcion)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addComponent(jLabelInstalacion)
                .addGap(18, 18, 18)
                .addComponent(jLabelCodigo)
                .addGap(18, 18, 18)
                .addComponent(jLabelCategoria)
                .addGap(18, 18, 18)
                .addComponent(jLabelMarca)
                .addGap(18, 18, 18)
                .addComponent(jLabelModelo)
                .addGap(18, 18, 18)
                .addComponent(jLabelRefrigerante)
                .addGap(37, 37, 37))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setPreferredSize(new java.awt.Dimension(400, 157));

        jButtonComparar.setBackground(new java.awt.Color(31, 106, 178));
        jButtonComparar.setText("Comparar");
        jButtonComparar.setToolTipText("");
        jButtonComparar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCompararActionPerformed(evt);
            }
        });

        jButtonFavoritos.setBackground(new java.awt.Color(31, 106, 178));
        jButtonFavoritos.setText("Agregar Favoritos");
        jButtonFavoritos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFavoritosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jButtonComparar, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                .addComponent(jButtonFavoritos)
                .addGap(29, 29, 29))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonComparar)
                    .addComponent(jButtonFavoritos))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        EspecificationSection.setBackground(new java.awt.Color(255, 255, 255));
        EspecificationSection.setPreferredSize(new java.awt.Dimension(400, 157));

        jLabelEspecificaciones.setForeground(new java.awt.Color(51, 51, 51));
        jLabelEspecificaciones.setText("Especificaciones");

        jLabelCapacidad.setForeground(new java.awt.Color(51, 51, 51));
        jLabelCapacidad.setText("Capacidad");

        jLabelEspacio.setForeground(new java.awt.Color(51, 51, 51));
        jLabelEspacio.setText("Espacio");

        jLabelRemoto.setForeground(new java.awt.Color(51, 51, 51));
        jLabelRemoto.setText("Control Remoto");

        jLabelAncho.setForeground(new java.awt.Color(51, 51, 51));
        jLabelAncho.setText("Ancho");

        jLabelAlto.setForeground(new java.awt.Color(51, 51, 51));
        jLabelAlto.setText("Alto");

        javax.swing.GroupLayout EspecificationSectionLayout = new javax.swing.GroupLayout(EspecificationSection);
        EspecificationSection.setLayout(EspecificationSectionLayout);
        EspecificationSectionLayout.setHorizontalGroup(
            EspecificationSectionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EspecificationSectionLayout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addGroup(EspecificationSectionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelEspecificaciones)
                    .addComponent(jLabelCapacidad)
                    .addComponent(jLabelEspacio)
                    .addComponent(jLabelRemoto)
                    .addComponent(jLabelAncho)
                    .addComponent(jLabelAlto))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        EspecificationSectionLayout.setVerticalGroup(
            EspecificationSectionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EspecificationSectionLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabelEspecificaciones)
                .addGap(18, 18, 18)
                .addComponent(jLabelCapacidad)
                .addGap(18, 18, 18)
                .addComponent(jLabelEspacio)
                .addGap(18, 18, 18)
                .addComponent(jLabelRemoto)
                .addGap(18, 18, 18)
                .addComponent(jLabelAncho)
                .addGap(18, 18, 18)
                .addComponent(jLabelAlto)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(barraBotones1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(EspecificationSection, javax.swing.GroupLayout.DEFAULT_SIZE, 874, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addComponent(ImageSection, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(DescripcionSection, javax.swing.GroupLayout.DEFAULT_SIZE, 874, Short.MAX_VALUE))
                        .addComponent(LineaPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 1387, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(barraBotones1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ImageSection, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DescripcionSection, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addComponent(LineaPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 8, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(EspecificationSection, javax.swing.GroupLayout.PREFERRED_SIZE, 217, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 217, Short.MAX_VALUE)))
        );

        jScrollPane1.setViewportView(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 835, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCompararActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCompararActionPerformed
        if(!itemDisplayController.addComparacion(index)){
            JOptionPane.showMessageDialog(this, "Error al agregar comparacion. Intente denuevo", "Error", 0);
            return;
        }
        
        itemDisplayController.GoComparar();
    }//GEN-LAST:event_jButtonCompararActionPerformed

    private void jButtonFavoritosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFavoritosActionPerformed
        boolean fav = itemDisplayController.getFavorite(index);
        jButtonFavoritos.setText(fav ? "Eliminar Favoritos" : "Agregar Favoritos");
        itemDisplayController.addFavorito(index, !fav );
    }//GEN-LAST:event_jButtonFavoritosActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        try{
            UIManager.setLookAndFeel( new FlatLightLaf() );
} catch( Exception ex ) {
    System.err.println( "Failed to initialize LaF" );
}

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PantallaEspecifica().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel DescripcionSection;
    private javax.swing.JPanel EspecificationSection;
    private javax.swing.JPanel ImageSection;
    private javax.swing.JPanel LineaPanel;
    private proyectosemestral.Paneles.BarraBotones barraBotones1;
    public javax.swing.JButton jButtonComparar;
    public javax.swing.JButton jButtonFavoritos;
    public javax.swing.JLabel jLabelAlto;
    public javax.swing.JLabel jLabelAncho;
    public javax.swing.JLabel jLabelCapacidad;
    public javax.swing.JLabel jLabelCategoria;
    public javax.swing.JLabel jLabelCodigo;
    public javax.swing.JLabel jLabelDescripcion;
    public javax.swing.JLabel jLabelEspacio;
    private javax.swing.JLabel jLabelEspecificaciones;
    public javax.swing.JLabel jLabelInstalacion;
    public javax.swing.JLabel jLabelMarca;
    public javax.swing.JLabel jLabelModelo;
    public javax.swing.JLabel jLabelPrecio;
    public javax.swing.JLabel jLabelRefrigerante;
    public javax.swing.JLabel jLabelRemoto;
    public javax.swing.JLabel jLabelTipo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
