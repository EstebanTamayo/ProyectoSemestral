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
import java.awt.event.ItemEvent;
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
        checkboxFilter.setVisible(false);
        
        for (VentiladorItemDTO ventiladorDTO : listadoController.getVentiladoresItems()) {
            lista.add(ventiladorDTO);
            data.add(new String[]{
                ventiladorDTO.getModelo(),
                ventiladorDTO.getMarca(),
                ventiladorDTO.getTipoEquipo(),
                ventiladorDTO.getPrecio().toString()
            });
        }
        
        DefaultTableModel model  = new DefaultTableModel( data.stream().toArray(String[][]::new), colums );
        jTable1.setModel( model );
        
        dropdownFilter.jLabelText.setText("filtrar por");
        
        dropdownFilter.jComboBox.addItem("Codigo");
        dropdownFilter.jComboBox.addItem("Categoria");
        dropdownFilter.jComboBox.addItem("Espacio Maximo");
        dropdownFilter.jComboBox.addItem("Precio Inferior a");
        dropdownFilter.jComboBox.addItem("Precio Superior a");
        dropdownFilter.jComboBox.addItem("Alto");
        dropdownFilter.jComboBox.addItem("Ancho");
        dropdownFilter.jComboBox.addItem("Tiene Control Remoto");
        dropdownFilter.jComboBox.addItem("Tiene Instalacion");
        dropdownFilter.jComboBox.addItem("Capacidad");
        dropdownFilter.jComboBox.addItem("Marca");
        dropdownFilter.jComboBox.addItem("Modelo");
        dropdownFilter.jComboBox.addItem("Refrigerante");
        dropdownFilter.jComboBox.addItem("Tipo Equipo");
        
        searchFilter.jLabelText.setText("ingrese busqueda");
        searchFilter.jTextField.setText("");
      
        checkboxFilter.jCheckBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                switch(dropdownFilter.jComboBox.getSelectedIndex()){
                    //            Tiene Control Remoto
                    case 8:
                        whereText = columSearch + " = " + (checkboxFilter.jCheckBox.isSelected() ? "1" : "0");
                        break;
                    //            Tiene Instalacion
                    case 9:
                        whereText = columSearch + " = " + (checkboxFilter.jCheckBox.isSelected() ? "1" : "0");
                        break;
                    default:
                        break;
                }
            }
        });
        
        dropdownFilter.jComboBox.addItemListener((ItemEvent e) -> {
            
            switch(dropdownFilter.jComboBox.getSelectedIndex()){
                case 1:
                    columSearch = "codigo";
                    visibleCheck(false);
                    break;
                case 2:
                    columSearch = "categoria";
                    visibleCheck(false);
                    break;
                case 3:
                    columSearch = "EspacioMaximo";
                    visibleCheck(false);
                    break;
                case 4:
                    columSearch = "precio";
                    visibleCheck(false);
                    break;
                case 5:
                    columSearch = "precio";
                    visibleCheck(false);
                    break;
                case 6:
                    columSearch = "alto";
                    visibleCheck(false);
                    break;
                case 7:
                    columSearch = "ancho";
                    visibleCheck(false);
                    break;
                case 8:
                    columSearch = "ControlRemoto";
                    visibleCheck(true);
                    break;
                case 9:
                    columSearch = "Instalacion";
                    visibleCheck(true);
                    break;
                case 10:
                    columSearch = "capacidad";
                    visibleCheck(false);
                    break;
                case 11:
                    columSearch = "marca";
                    visibleCheck(false);
                    break;
                case 12:
                    columSearch = "modelo";
                    visibleCheck(false);
                    break;
                case 13:
                    columSearch = "refrigerante";
                    visibleCheck(false);
                    break;
                case 14:
                    columSearch = "TipoEquipo";
                    visibleCheck(false);
                    break;
                default:
                    break;
            }
        });

        searchFilter.jTextField.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
            }

            @Override
            public void keyPressed(KeyEvent e) {
            }

            @Override
            public void keyReleased(KeyEvent e) {
                
            switch(dropdownFilter.jComboBox.getSelectedIndex()){
                //            Codigo
                case 1:
                    whereText = columSearch + " LIKE '%" + searchFilter.jTextField.getText().toUpperCase() + "%'";
                    break;
                //            Categoria
                case 2:
                    whereText = columSearch + " LIKE '%" + searchFilter.jTextField.getText().toUpperCase() + "%'";
                    break;
                //            Espacio Maximo
                case 3:
                    whereText = columSearch + " = " + searchFilter.jTextField.getText();
                    break;
                //            Precio Inferior a
                case 4:
                    whereText = columSearch + " <= " + searchFilter.jTextField.getText();
                    break;
                //            Precio Superior a
                case 5:
                    whereText = columSearch + " >= " + searchFilter.jTextField.getText();
                    break;
                //            Alto
                case 6:
                    whereText = columSearch + " = " + searchFilter.jTextField.getText();
                    break;
                //            Ancho
                case 7:
                    whereText = columSearch + " = " + searchFilter.jTextField.getText();
                    break;
                //            Capacidad
                case 10:
                    whereText = columSearch + " = " + searchFilter.jTextField.getText().toUpperCase();
                    break;
                //            Marca
                case 11:
                    whereText = columSearch + " LIKE '%" + searchFilter.jTextField.getText().toUpperCase() + "%'";
                    break;
                //            Modelo
                case 12:
                    whereText = columSearch + " LIKE '%" + searchFilter.jTextField.getText().toUpperCase() + "%'";
                    break;
                //            Refrigerante
                case 13:
                    whereText = columSearch + " LIKE '%" + searchFilter.jTextField.getText().toUpperCase() + "%'";
                    break;
                //            Tipo Equipo
                case 14:
                    whereText = columSearch + " LIKE '%" + searchFilter.jTextField.getText().toUpperCase() + "%'";
                    break;
                default:
                    break;
            }
            }
        });
    }

    private void visibleCheck(boolean value){
        searchFilter.setVisible(!value);
        checkboxFilter.setVisible(value);
    }
    
    private void updateTableModel(){
        
        ArrayList<Ventilador> listaTemp = listadoController.getVentiladorFilter(whereText);
        
        data   = new ArrayList<>();
        lista   = new ArrayList<>();
        
        if(listaTemp.isEmpty()){
            JOptionPane.showMessageDialog(this, "No se ha encontrado ningun dato", "Notificacion", 1);
        }
        else
        {
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
        }
        
        DefaultTableModel model  = new DefaultTableModel( data.stream().toArray(String[][]::new), colums );
        jTable1.setModel( model );
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
        searchFilter = new FiltroPanels.SearchFilter();
        dropdownFilter = new FiltroPanels.DropdownFilter();
        jLabel1 = new javax.swing.JLabel();
        checkboxFilter = new FiltroPanels.CheckboxFilter();

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
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButtonSearchSuperior, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(dropdownFilter, javax.swing.GroupLayout.DEFAULT_SIZE, 506, Short.MAX_VALUE)
                            .addComponent(searchFilter, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addComponent(jLabel1))
                            .addComponent(checkboxFilter, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2))
                    .addComponent(barraBotones1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 5, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(barraBotones1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonSearchSuperior, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(dropdownFilter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(searchFilter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(checkboxFilter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 486, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(897, Short.MAX_VALUE))
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
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 721, Short.MAX_VALUE)
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

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
          try {
    UIManager.setLookAndFeel( new FlatLightLaf());
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
    private proyectosemestral.Paneles.BarraBotones barraBotones1;
    private proyectosemestral.Paneles.BarraBotonesSuperior barraBotonesSuperior1;
    private FiltroPanels.CheckboxFilter checkboxFilter;
    private FiltroPanels.DropdownFilter dropdownFilter;
    private javax.swing.JButton jButtonSearchSuperior;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private FiltroPanels.SearchFilter searchFilter;
    // End of variables declaration//GEN-END:variables
}
