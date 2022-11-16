/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Listado;

import Entidades.Ventilador;
import Entidades.VentiladorItemDTO;
import com.formdev.flatlaf.FlatLightLaf;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.InputMethodEvent;
import java.awt.event.InputMethodListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;
import proyectosemestral.DataConnection;

/**
 *
 * @author lr56c
 */
public class PantallaLista extends javax.swing.JFrame {

    private ListadoController listadoController;
    private String[]          colums = { "modelo", "marca", "tipo equipo", "precio" };
    private ArrayList<String[]> data   = new ArrayList<>();
    private ArrayList<VentiladorItemDTO> lista   = new ArrayList<>();
    private String columSearch = "";
    private String whereText = "";
    
    /**
     * Creates new form PantallaLista
     */
    public PantallaLista() {
        
        listadoController = new ListadoController(this);
        
        initComponents();
        jScrollPane1.getVerticalScrollBar().setUnitIncrement(16);
        jScrollPane2.getVerticalScrollBar().setUnitIncrement(16);
        barraBotones1.setPadre(this);
        barraBotones1.jButtonProduct.setEnabled(false);
        
        for (VentiladorItemDTO ventiladorDTO : listadoController.getVentiladoresItems()) {
            lista.add(ventiladorDTO);
            data.add(new String[]{
                ventiladorDTO.getModelo(),
                ventiladorDTO.getMarca(),
                ventiladorDTO.getTipoEquipo(),
                ventiladorDTO.getPrecio().toString()
            });
        }
        
        //TODO: traer de bdd opciones a dropdown categoria,capacidad,refrigerante,tipo equipo, marca, modelo
        //TODO: ver que funcione mayor que precio, menor que precio y lo mismo para espacio,alto,ancho
        
        DefaultTableModel model  = new DefaultTableModel( data.stream().toArray(String[][]::new), colums );
        jTable1.setModel( model );
        
        categoriaDropdownFilter.jLabelText.setText("Categoria");
        capacidadDropdownFilter.jLabelText.setText("Capacidad");
        codigoSearchFilter.jLabelText.setText("Codigo");
        controlRemooCheckboxFilter.jLabelText.setText("Control Remoto");
        espacioMaximoSearchFilter.jLabelText.setText("Espacio Maximo");
        instalacionCheckboxFilter.jLabelText.setText("Instalacion");
        marcaDropdownFilter.jLabelText.setText("Marca");
        modeloDropdownFilter.jLabelText.setText("Modelo");
        precioMaxSearchFilter.jLabelText.setText("Precio Minimo");
        precioMinSearchFilter.jLabelText.setText("Precio Maximo");
        refrigeranteDropdownFilter.jLabelText.setText("Refrigerante");
        tipoEquipoDropdownFilter.jLabelText.setText("Tipo Equipo");
        altoSearchFilter.jLabelText.setText("Alto");
        anchoSearchFilter.jLabelText.setText("Ancho");
        
        capacidadDropdownFilter.jComboBox.addItemListener((ItemEvent e) -> {
            
            int temp = capacidadDropdownFilter.jComboBox.getSelectedIndex();
            columSearch = "capacidad";
            whereText = columSearch + " = " + (int)capacidadDropdownFilter.jComboBox.getSelectedItem();
            resetFilters();
            capacidadDropdownFilter.jComboBox.setSelectedIndex(temp);
        });
        
        categoriaDropdownFilter.jComboBox.addItemListener((ItemEvent e) -> {
            
            int temp = categoriaDropdownFilter.jComboBox.getSelectedIndex();
            columSearch = "categoria";
            whereText = columSearch + " = '%" + (String)categoriaDropdownFilter.jComboBox.getSelectedItem() + "%'";
            resetFilters();
            categoriaDropdownFilter.jComboBox.setSelectedIndex(temp);
        });
        
        marcaDropdownFilter.jComboBox.addItemListener((ItemEvent e) -> {
            
            int temp = marcaDropdownFilter.jComboBox.getSelectedIndex();
            columSearch = "marca";
            whereText = columSearch + " = '%" + (String)marcaDropdownFilter.jComboBox.getSelectedItem() + "%'";
            resetFilters();
            marcaDropdownFilter.jComboBox.setSelectedIndex(temp);
        });
        
        modeloDropdownFilter.jComboBox.addItemListener((ItemEvent e) -> {
            
            int temp = modeloDropdownFilter.jComboBox.getSelectedIndex();
            columSearch = "modelo";
            whereText = columSearch + " = '%" + (String)modeloDropdownFilter.jComboBox.getSelectedItem() + "%'";
            resetFilters();
            modeloDropdownFilter.jComboBox.setSelectedIndex(temp);
        });
        
        tipoEquipoDropdownFilter.jComboBox.addItemListener((ItemEvent e) -> {
            
            int temp = tipoEquipoDropdownFilter.jComboBox.getSelectedIndex();
            columSearch = "TipoEquipo";
            whereText = columSearch + " = '%" + (String)tipoEquipoDropdownFilter.jComboBox.getSelectedItem() + "%'";
            resetFilters();
            tipoEquipoDropdownFilter.jComboBox.setSelectedIndex(temp);
        });
        
        codigoSearchFilter.jTextField.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
            }

            @Override
            public void keyPressed(KeyEvent e) {
            }

            @Override
            public void keyReleased(KeyEvent e) {
                
                String temp = codigoSearchFilter.jTextField.getText();
                columSearch = "codigo";
                whereText = columSearch + " = '%" + temp + "%'";
                resetFilters();
                codigoSearchFilter.jTextField.setText(temp);
            }
        });
        
        espacioMaximoSearchFilter.jTextField.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
            }

            @Override
            public void keyPressed(KeyEvent e) {
            }

            @Override
            public void keyReleased(KeyEvent e) {
                
                String temp = espacioMaximoSearchFilter.jTextField.getText();
                columSearch = "EspacioMaximo";
                whereText = columSearch + " = " + temp;
                resetFilters();
                espacioMaximoSearchFilter.jTextField.setText(temp);
            }
        });
        
        precioMaxSearchFilter.jTextField.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
            }

            @Override
            public void keyPressed(KeyEvent e) {
            }

            @Override
            public void keyReleased(KeyEvent e) {
                
                String temp = precioMaxSearchFilter.jTextField.getText();
                columSearch = "precio";
                whereText = columSearch + " >= " + temp;
                resetFilters();
                precioMaxSearchFilter.jTextField.setText(temp);
            }
        });
        
        precioMinSearchFilter.jTextField.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
            }

            @Override
            public void keyPressed(KeyEvent e) {
            }

            @Override
            public void keyReleased(KeyEvent e) {
                
                String temp = precioMinSearchFilter.jTextField.getText();
                columSearch = "precio";
                whereText = columSearch + " <= " + temp;
                resetFilters();
                precioMinSearchFilter.jTextField.setText(temp);
            }
        });
        
        altoSearchFilter.jTextField.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
            }

            @Override
            public void keyPressed(KeyEvent e) {
            }

            @Override
            public void keyReleased(KeyEvent e) {
                String temp = altoSearchFilter.jTextField.getText();
                columSearch = "alto";
                whereText = columSearch + " = " + temp;
                resetFilters();
                altoSearchFilter.jTextField.setText(temp);
            }
        });
        
        anchoSearchFilter.jTextField.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
            }

            @Override
            public void keyPressed(KeyEvent e) {
            }

            @Override
            public void keyReleased(KeyEvent e) {
                
                String temp = anchoSearchFilter.jTextField.getText();
                columSearch = "ancho";
                whereText = columSearch + " = " + temp;
                resetFilters();
                anchoSearchFilter.jTextField.setText(temp);
            }
        });
        
        controlRemooCheckboxFilter.jCheckBox.addActionListener((ActionEvent e) -> {
            boolean temp = controlRemooCheckboxFilter.jCheckBox.isSelected();
            columSearch = "ControlRemoto";
            whereText = columSearch + " = " + (temp ? "1" : "0");
            resetFilters();
            controlRemooCheckboxFilter.jCheckBox.setSelected(temp);
        });
        
        instalacionCheckboxFilter.jCheckBox.addActionListener((ActionEvent e) -> {
            boolean temp = controlRemooCheckboxFilter.jCheckBox.isSelected();
            columSearch = "Instalacion";
            whereText = columSearch + " = " + (temp ? "1" : "0");
            resetFilters();
            instalacionCheckboxFilter.jCheckBox.setSelected(temp);
        });
    }

    private void updateTableModel(){
        //TODO: revisar porque no se vacia si no hay resultados, ademas se podria indicar notificacion que no encontro resultados
        ArrayList<Ventilador> listaTemp = listadoController.getVentiladorFilter(whereText);
        
        for (int i = 0; i < listaTemp.size(); i++) {
            
            Ventilador v = listaTemp.get(i);
            
            lista.add(new VentiladorItemDTO(
                i,
                v.getModelo(),
                v.getMarca(),
                v.getTipoEquipo(),
                v.isInstalacion(),
                v.getPrecio()
            ));
            
            data.add(new String[]{
                v.getModelo(),
                v.getMarca(),
                v.getTipoEquipo(),
                v.getPrecio().toString()
            });
        }
        DefaultTableModel model  = new DefaultTableModel( data.stream().toArray(String[][]::new), colums );
        jTable1.setModel( model );
    }
   
    
    private void resetFilters(){
        instalacionCheckboxFilter.jCheckBox.setSelected(false);
        controlRemooCheckboxFilter.jCheckBox.setSelected(false);
        codigoSearchFilter.jTextField.setText("");
        anchoSearchFilter.jTextField.setText("");
        espacioMaximoSearchFilter.jTextField.setText("");
        precioMaxSearchFilter.jTextField.setText("");
        precioMinSearchFilter.jTextField.setText("");
        altoSearchFilter.jTextField.setText("");
        capacidadDropdownFilter.jComboBox.setSelectedIndex(0);
        categoriaDropdownFilter.jComboBox.setSelectedIndex(0);
        marcaDropdownFilter.jComboBox.setSelectedIndex(0);
        modeloDropdownFilter.jComboBox.setSelectedIndex(0);
        tipoEquipoDropdownFilter.jComboBox.setSelectedIndex(0);
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        barraBotonesSuperior1 = new proyectosemestral.Paneles.BarraBotonesSuperior();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        barraBotones1 = new proyectosemestral.Paneles.BarraBotones();
        jButtonSearchSuperior = new javax.swing.JButton();
        codigoSearchFilter = new FiltroPanels.SearchFilter();
        categoriaDropdownFilter = new FiltroPanels.DropdownFilter();
        capacidadDropdownFilter = new FiltroPanels.DropdownFilter();
        tipoEquipoDropdownFilter = new FiltroPanels.DropdownFilter();
        espacioMaximoSearchFilter = new FiltroPanels.SearchFilter();
        marcaDropdownFilter = new FiltroPanels.DropdownFilter();
        modeloDropdownFilter = new FiltroPanels.DropdownFilter();
        controlRemooCheckboxFilter = new FiltroPanels.CheckboxFilter();
        instalacionCheckboxFilter = new FiltroPanels.CheckboxFilter();
        precioMinSearchFilter = new FiltroPanels.SearchFilter();
        precioMaxSearchFilter = new FiltroPanels.SearchFilter();
        anchoSearchFilter = new FiltroPanels.SearchFilter();
        altoSearchFilter = new FiltroPanels.SearchFilter();
        refrigeranteDropdownFilter = new FiltroPanels.DropdownFilter();
        jButtonSearchInferior = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        jScrollPane1.setPreferredSize(new java.awt.Dimension(1280, 1600));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setPreferredSize(new java.awt.Dimension(1280, 1600));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable1.setPreferredSize(new java.awt.Dimension(400, 80));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTable1MousePressed(evt);
            }
        });
        jScrollPane2.setViewportView(jTable1);

        jButtonSearchSuperior.setBackground(new java.awt.Color(31, 106, 178));
        jButtonSearchSuperior.setText("BUSCAR");
        jButtonSearchSuperior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSearchSuperiorActionPerformed(evt);
            }
        });

        jButtonSearchInferior.setBackground(new java.awt.Color(31, 106, 178));
        jButtonSearchInferior.setText("BUSCAR");
        jButtonSearchInferior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSearchInferiorActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("Filtros");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(controlRemooCheckboxFilter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(capacidadDropdownFilter, javax.swing.GroupLayout.DEFAULT_SIZE, 506, Short.MAX_VALUE)
                                    .addComponent(tipoEquipoDropdownFilter, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(espacioMaximoSearchFilter, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButtonSearchSuperior, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(marcaDropdownFilter, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(modeloDropdownFilter, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(categoriaDropdownFilter, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(codigoSearchFilter, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addComponent(instalacionCheckboxFilter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(precioMinSearchFilter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(precioMaxSearchFilter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(anchoSearchFilter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(altoSearchFilter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(refrigeranteDropdownFilter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButtonSearchInferior, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addComponent(jLabel1)))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2))
                    .addComponent(barraBotones1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 5, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(barraBotones1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonSearchSuperior, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(codigoSearchFilter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(categoriaDropdownFilter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(capacidadDropdownFilter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(tipoEquipoDropdownFilter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(espacioMaximoSearchFilter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(marcaDropdownFilter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(modeloDropdownFilter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(controlRemooCheckboxFilter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(instalacionCheckboxFilter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(precioMinSearchFilter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(precioMaxSearchFilter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(anchoSearchFilter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(altoSearchFilter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(refrigeranteDropdownFilter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonSearchInferior, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 1341, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(42, Short.MAX_VALUE))
        );

        jScrollPane1.setViewportView(jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 720, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTable1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MousePressed
        
        if(evt.getClickCount() == 2){
            int row = jTable1.getSelectedRow();
            listadoController.GoItem(row);
        }
        else if(evt.getButton() == MouseEvent.BUTTON3)
        {
            if(DataConnection.userRole != 'A') return;
            //if(DataConnection.userId != 1) return;
            
            int row = jTable1.rowAtPoint(evt.getPoint());
            if (row >= 0 && row < jTable1.getRowCount()) {
                //se hizo click derecho en una fila que existe
                
                jTable1.setRowSelectionInterval(row, row);
                
                int respuesta = JOptionPane.showConfirmDialog(this, "¿Seguro que deseas eliminar este producto de la tienda?", "Eliminar producto", 0);
                
                if(respuesta == 0){
                    if(listadoController.deleteItem(lista.get(row).getId())){
                        lista.remove(row);
                        data.remove(row);
                        DefaultTableModel model  = new DefaultTableModel( data.stream().toArray(String[][]::new), colums );
                        jTable1.setModel( model );
                        JOptionPane.showMessageDialog(this, "Producto eliminado correctamente", "Exito",1);
                    }
                }
            } else {
                jTable1.clearSelection();
            }
        }
    }//GEN-LAST:event_jTable1MousePressed

    private void jButtonSearchSuperiorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSearchSuperiorActionPerformed
        updateTableModel();
    }//GEN-LAST:event_jButtonSearchSuperiorActionPerformed

    private void jButtonSearchInferiorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSearchInferiorActionPerformed
        updateTableModel();
    }//GEN-LAST:event_jButtonSearchInferiorActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
          try {
    UIManager.setLookAndFeel( new FlatLightLaf() );
} catch( Exception ex ) {
    System.err.println( "Failed to initialize LaF" );
}

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PantallaLista().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private FiltroPanels.SearchFilter altoSearchFilter;
    private FiltroPanels.SearchFilter anchoSearchFilter;
    private proyectosemestral.Paneles.BarraBotones barraBotones1;
    private proyectosemestral.Paneles.BarraBotonesSuperior barraBotonesSuperior1;
    private FiltroPanels.DropdownFilter capacidadDropdownFilter;
    private FiltroPanels.DropdownFilter categoriaDropdownFilter;
    private FiltroPanels.SearchFilter codigoSearchFilter;
    private FiltroPanels.CheckboxFilter controlRemooCheckboxFilter;
    private FiltroPanels.SearchFilter espacioMaximoSearchFilter;
    private FiltroPanels.CheckboxFilter instalacionCheckboxFilter;
    private javax.swing.JButton jButtonSearchInferior;
    private javax.swing.JButton jButtonSearchSuperior;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private FiltroPanels.DropdownFilter marcaDropdownFilter;
    private FiltroPanels.DropdownFilter modeloDropdownFilter;
    private FiltroPanels.SearchFilter precioMaxSearchFilter;
    private FiltroPanels.SearchFilter precioMinSearchFilter;
    private FiltroPanels.DropdownFilter refrigeranteDropdownFilter;
    private FiltroPanels.DropdownFilter tipoEquipoDropdownFilter;
    // End of variables declaration//GEN-END:variables
}
