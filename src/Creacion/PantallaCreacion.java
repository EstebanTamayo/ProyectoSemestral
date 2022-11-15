/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Creacion;

import Entidades.Ventilador;
import Entidades.TipoEquipo;
import Entidades.Categoria;
import Entidades.Capacidad;
import Entidades.Refrigerante;
import com.formdev.flatlaf.FlatLightLaf;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.ItemEvent;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.Set;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

/**
 *
 * @author lr56c
 */
public class PantallaCreacion extends javax.swing.JFrame {

    private CreationController creationController;
    
    private boolean firstCodigoEquipo = true;
    private boolean firstMarcaEquipo = true;
    private boolean firstModeloEquipo = true;
    private boolean firstEspacioMaximo = true;
    private boolean firstPrecio = true;
    private boolean firstAncho = true;
    private boolean firstAlto = true;
    private boolean firstDescripcion = true;
    
    private boolean codigoEquipoOK = false;
    private boolean marcaEquipoOK = false;
    private boolean modeloEquipoOK = false;
    private boolean espacioMaximoOK = false;
    private boolean precioOK = false;
    private boolean anchoOK = false;
    private boolean altoOK = false;
    private boolean descripcionOK = false;
    
    private boolean categoriaEquipoOK = false;
    private boolean tipoEquipoOK = false;
    private boolean capacidadOK = false;
    private boolean refrigeranteOK = false;
    
    private Set<String> numErrors;
  
    /**
     * Creates new form PantallaCreacion
     */
    public PantallaCreacion() {
        
        creationController = new CreationController(this);
        
        initComponents();
              
        jScrollPane1.getVerticalScrollBar().setUnitIncrement(16);
        
        barraPanelCreacion1.jBackButton.addActionListener((e) -> {
            creationController.BackButton();
        });
        barraPanelCreacion1.jContinueButton.setEnabled(false);
        barraPanelCreacion1.jContinueButton.addActionListener((ActionEvent e) -> {
            
            System.out.println("verificar");
            System.out.println(espacioMaximoOK);
            System.out.println(anchoOK);
            System.out.println(altoOK);
            System.out.println(precioOK);
            
            if(!espacioMaximoOK || !anchoOK || !altoOK || !precioOK){
                String msjError = "Los campos de ";
                if(!espacioMaximoOK){
                    msjError += "Espacio Maximo, ";
                }
                
                if(!anchoOK){
                    msjError += "Ancho, ";
                }
                
                if(!altoOK){
                    msjError += "Alto, ";
                }
                
                if(!precioOK){
                    msjError += "Precio, ";
                }
                msjError = msjError.substring(0, msjError.length() - 2);
                msjError += " deben ser numericos. Intente denuevo";
                JOptionPane.showMessageDialog(this, msjError, "Error", 0);
                return;
            }
            
            System.out.println("create ventilador");
            Ventilador v = new Ventilador(
                jCodigoEquipoField.jTextField.getText(),
                (String)jCategoriaEquipoField.jComboBox.getSelectedItem(),
                Integer.valueOf((String)jCapacidadField.jComboBox.getSelectedItem()),
                (String)jTipoEquipoField.jComboBox.getSelectedItem(),
                Integer.valueOf(jEspacioMaximoField.jTextField.getText()),
                jMarcaEquipoField.jTextField.getText(),
                jModeloEquipoField.jTextField.getText(),
                jControlRemotoField.jCheckBox.isSelected(),
                jInstalacionField.jCheckBox.isSelected(),
                Integer.valueOf(jPrecioField.jTextField.getText()),
                Integer.valueOf(jAnchoField.jTextField.getText()),
                Integer.valueOf(jAltoField.jTextField.getText()),
                jDescripcionField.jTextArea.getText(),
                (String)jRefrigeranteField.jComboBox.getSelectedItem()
            );
            
            if(creationController.addVentilador(v))
            {
                jCodigoEquipoField.jTextField.setText("");
                jCategoriaEquipoField.jComboBox.setSelectedIndex(0);
                jCapacidadField.jComboBox.setSelectedIndex(0);
                jTipoEquipoField.jComboBox.setSelectedIndex(0);
                jEspacioMaximoField.jTextField.setText("");
                jMarcaEquipoField.jTextField.setText("");
                jModeloEquipoField.jTextField.setText("");
                jControlRemotoField.jCheckBox.setSelected(false);
                jInstalacionField.jCheckBox.setSelected(false);
                jPrecioField.jTextField.setText("");
                jAnchoField.jTextField.setText("");
                jAltoField.jTextField.setText("");
                jDescripcionField.jTextArea.setText("");
                jRefrigeranteField.jComboBox.setSelectedIndex(0);
                JOptionPane.showMessageDialog(this, "Ventilador creado", "Exito", 1);
            }
            else
            {
                JOptionPane.showMessageDialog(this, "Error al crear. Intente denuevo", "Error", 0);
            }
        });
        
        jCodigoEquipoField.jTitleLabel.setText("Codigo del equipo");
        jCodigoEquipoField.jTextField.setText("escribe el codigo del equipo");
        jCodigoEquipoField.jTextField.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                if(firstCodigoEquipo){
                    jCodigoEquipoField.jTextField.setCaretPosition(jCodigoEquipoField.jTextField.getDocument().getLength());
                }
            }

            @Override
            public void focusLost(FocusEvent e) {
                if( jCodigoEquipoField.jTextField.getText().length() == 0){
                    jCodigoEquipoField.jTextField.setText("escribe el codigo del equipo");
                    jCodigoEquipoField.jTextField.setForeground(new Color(153,153,153));
                    firstCodigoEquipo = true;
                }
            }
        });
        jCodigoEquipoField.jTextField.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
                
            }

            @Override
            public void keyPressed(KeyEvent e) {
                if(firstCodigoEquipo){
                    jCodigoEquipoField.jTextField.setText("");
                    jCodigoEquipoField.jTextField.setForeground(new Color(51,51,51));
                    firstCodigoEquipo = false;
                }
            }

            @Override
            public void keyReleased(KeyEvent e) {
                codigoEquipoOK = jCodigoEquipoField.jTextField.getText().length() != 0;
                
                checkEnter();
            }
        });
        
        jMarcaEquipoField.jTitleLabel.setText("Marca Equipo");
        jMarcaEquipoField.jTextField.setText("escribe la marca del equipo");
        jMarcaEquipoField.jTextField.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                if(firstMarcaEquipo){
                    jMarcaEquipoField.jTextField.setCaretPosition(jMarcaEquipoField.jTextField.getDocument().getLength());
                }
            }

            @Override
            public void focusLost(FocusEvent e) {
                if( jMarcaEquipoField.jTextField.getText().length() == 0){
                    jMarcaEquipoField.jTextField.setText("escribe la marca del equipo");
                    jMarcaEquipoField.jTextField.setForeground(new Color(153,153,153));
                    firstMarcaEquipo = true;
                }
            }
        });
        jMarcaEquipoField.jTextField.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
                
            }

            @Override
            public void keyPressed(KeyEvent e) {
                if(firstMarcaEquipo){
                    jMarcaEquipoField.jTextField.setText("");
                    jMarcaEquipoField.jTextField.setForeground(new Color(51,51,51));
                    firstMarcaEquipo = false;
                }
            }

            @Override
            public void keyReleased(KeyEvent e) {
                marcaEquipoOK = jMarcaEquipoField.jTextField.getText().length() != 0;

                checkEnter();
            }
        });
        
        jModeloEquipoField.jTitleLabel.setText("Modelo Equipo");
        jModeloEquipoField.jTextField.setText("escribe el modelo del equipo");
        jModeloEquipoField.jTextField.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                if(firstModeloEquipo){
                    jModeloEquipoField.jTextField.setCaretPosition(jModeloEquipoField.jTextField.getDocument().getLength());
                }
            }

            @Override
            public void focusLost(FocusEvent e) {
                if( jModeloEquipoField.jTextField.getText().length() == 0){
                     jModeloEquipoField.jTextField.setText("escribe el modelo del equipo");
                     jModeloEquipoField.jTextField.setForeground(new Color(153,153,153));
                     firstModeloEquipo = true;
                }
            }
        });
        jModeloEquipoField.jTextField.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
                
            }

            @Override
            public void keyPressed(KeyEvent e) {
                if(firstModeloEquipo){
                    jModeloEquipoField.jTextField.setText("");
                    jModeloEquipoField.jTextField.setForeground(new Color(51,51,51));
                    firstModeloEquipo = false;
                }
            }

            @Override
            public void keyReleased(KeyEvent e) {
                modeloEquipoOK = jModeloEquipoField.jTextField.getText().length() != 0;

                checkEnter();
            }
        });
        
        jEspacioMaximoField.jTitleLabel.setText("Espacio maximo");
        jEspacioMaximoField.jTextField.setText("escribe metros cuadrados");
        jEspacioMaximoField.jTextField.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                if(firstEspacioMaximo){
                    jEspacioMaximoField.jTextField.setCaretPosition(jEspacioMaximoField.jTextField.getDocument().getLength());
                }
            }

            @Override
            public void focusLost(FocusEvent e) {
                if( jEspacioMaximoField.jTextField.getText().length() == 0){
                     jEspacioMaximoField.jTextField.setText("escribe metros cuadrados");
                     jModeloEquipoField.jTextField.setForeground(new Color(153,153,153));
                     firstEspacioMaximo = true;
                }
                else if(!espacioMaximoOK){
                    JOptionPane.showMessageDialog(null, "En el campo Espacio Maximo, ingrese solo numeros", "Error", 0);
                }
            }
        });
        jEspacioMaximoField.jTextField.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
                
            }

            @Override
            public void keyPressed(KeyEvent e) {
                if(firstEspacioMaximo){
                    jEspacioMaximoField.jTextField.setText("");
                    jEspacioMaximoField.jTextField.setForeground(new Color(51,51,51));
                    firstEspacioMaximo = false;
                }
            }

            @Override
            public void keyReleased(KeyEvent e) {
                try{
                    int value = Integer.valueOf(jEspacioMaximoField.jTextField.getText());
                    if(value < 0) return;
                    jEspacioMaximoField.jTextField.setForeground(new Color(51,51,51));
                    espacioMaximoOK = true;
                }
                catch(Exception ex){
                    //System.out.println(ex);
                    jEspacioMaximoField.jTextField.setForeground(new Color(255,0,0));
                    espacioMaximoOK = false;
                }
                
                checkEnter();
            }
        });
        
        jPrecioField.jTitleLabel.setText("Precio");
        jPrecioField.jTextField.setText("escribe el precio del equipo");
        jPrecioField.jTextField.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                if(firstPrecio){
                    jPrecioField.jTextField.setCaretPosition(jPrecioField.jTextField.getDocument().getLength());
                }
            }

            @Override
            public void focusLost(FocusEvent e) {
                if( jPrecioField.jTextField.getText().length() == 0){
                     jPrecioField.jTextField.setText("escribe el precio del equipo");
                     jPrecioField.jTextField.setForeground(new Color(153,153,153));
                     firstPrecio = true;
                }
                else if(!precioOK){
                    JOptionPane.showMessageDialog(null, "En el campo Precio, ingrese solo numeros", "Error", 0);
                }
            }
        });
        jPrecioField.jTextField.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
                
            }

            @Override
            public void keyPressed(KeyEvent e) {
                if(firstPrecio){
                    jPrecioField.jTextField.setText("");
                    jPrecioField.jTextField.setForeground(new Color(51,51,51));
                    firstPrecio = false;
                }
            }

            @Override
            public void keyReleased(KeyEvent e) {
                try{
                    int value = Integer.valueOf(jPrecioField.jTextField.getText());
                    if(value < 0) return;
                    jPrecioField.jTextField.setForeground(new Color(51,51,51));
                    precioOK = true;
                }
                catch(Exception ex){
                    //System.out.println(ex);
                    jPrecioField.jTextField.setForeground(new Color(255,0,0));
                    precioOK = false;
                }

                checkEnter();
            }
        });
        
        jAnchoField.jTitleLabel.setText("Ancho");
        jAnchoField.jTextField.setText("escribe el ancho del equipo");
        jAnchoField.jTextField.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                if(firstAncho){
                    jAnchoField.jTextField.setCaretPosition(jAnchoField.jTextField.getDocument().getLength());
                }
            }

            @Override
            public void focusLost(FocusEvent e) {
                if( jAnchoField.jTextField.getText().length() == 0){
                     jAnchoField.jTextField.setText("escribe el ancho del equipo");
                     jAnchoField.jTextField.setForeground(new Color(51,51,51));
                    firstAncho = false;
                }
                else if(!anchoOK){
                    JOptionPane.showMessageDialog(null, "En el campo Ancho, ingrese solo numeros", "Error", 0);
                }
            }
        });
        jAnchoField.jTextField.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
                
            }

            @Override
            public void keyPressed(KeyEvent e) {
                if(firstAncho){
                    jAnchoField.jTextField.setText("");
                    jAnchoField.jTextField.setForeground(new Color(51,51,51));
                    firstAncho = false;
                }
            }

            @Override
            public void keyReleased(KeyEvent e) {
                try{
                    int value = Integer.valueOf(jAnchoField.jTextField.getText());
                    if(value < 0) return;
                    jAnchoField.jTextField.setForeground(new Color(51,51,51));
                    anchoOK = true;
                }
                catch(Exception ex){
                    //System.out.println(ex);
                    jAnchoField.jTextField.setForeground(new Color(255,0,0));
                    anchoOK = false;
                }

                checkEnter();
            }
        });
        
        jAltoField.jTitleLabel.setText("Alto");
        jAltoField.jTextField.setText("escribe el ancho del equipo");
        jAltoField.jTextField.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                if(firstAlto){
                    jAltoField.jTextField.setCaretPosition(jAltoField.jTextField.getDocument().getLength());
                }
            }

            @Override
            public void focusLost(FocusEvent e) {
                if( jAltoField.jTextField.getText().length() == 0){
                     jAltoField.jTextField.setText("escribe el ancho del equipo");
                     jAltoField.jTextField.setForeground(new Color(51,51,51));
                    firstAlto = false;
                }
                else if(!altoOK){
                    JOptionPane.showMessageDialog(null, "En el campo Alto, ingrese solo numeros", "Error", 0);
                }
            }
        });
        jAltoField.jTextField.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
                
            }

            @Override
            public void keyPressed(KeyEvent e) {
                if(firstAlto){
                    jAltoField.jTextField.setText("");
                    jAltoField.jTextField.setForeground(new Color(51,51,51));
                    firstAlto = false;
                }
            }

            @Override
            public void keyReleased(KeyEvent e) {
                try{
                    int value = Integer.valueOf(jAltoField.jTextField.getText());
                    if(value < 0) return;
                    jAltoField.jTextField.setForeground(new Color(51,51,51));
                    altoOK = true;
                }
                catch(Exception ex){
                    //System.out.println(ex);
                    jAltoField.jTextField.setForeground(new Color(255,0,0));
                    altoOK = false;
                }

                checkEnter();
            }
        });
        
        jDescripcionField.jTitleLabel.setText("Descripcion del equipo");
        jDescripcionField.jTextArea.setText("descripcion del equipo");
        jDescripcionField.jTextArea.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                if(firstDescripcion){
                    jDescripcionField.jTextArea.setCaretPosition(jDescripcionField.jTextArea.getDocument().getLength());
                }
            }

            @Override
            public void focusLost(FocusEvent e) {
                if( jDescripcionField.jTextArea.getText().length() == 0){
                     jDescripcionField.jTextArea.setText("descripcion del equipo");
                     jDescripcionField.jTextArea.setForeground(new Color(153,153,153));
                     firstDescripcion = true;
                }
            }
        });
        jDescripcionField.jTextArea.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
                
            }

            @Override
            public void keyPressed(KeyEvent e) {
                if(firstDescripcion){
                    jDescripcionField.jTextArea.setText("");
                    jDescripcionField.jTextArea.setForeground(new Color(51,51,51));
                    firstDescripcion = false;
                }
            }

            @Override
            public void keyReleased(KeyEvent e) {
                descripcionOK = jDescripcionField.jTextArea.getText().length() != 0;

                checkEnter();
            }
        });
        
        jCategoriaEquipoField.jTitleLabel.setText("Categoria Equipo");
        jTipoEquipoField.jTitleLabel.setText("Tipo Equipo");
        jCapacidadField.jTitleLabel.setText("Capacidad");
        jRefrigeranteField.jTitleLabel.setText("Refrigerante");
        jControlRemotoField.jTitleLabel.setText("Control remoto");
        jInstalacionField.jTitleLabel.setText("Con instalacion");
        
        for (Categoria categoria : creationController.getCategorias()) {
            jCategoriaEquipoField.jComboBox.addItem(categoria.getDescripcion());
        }
        
        jCategoriaEquipoField.jComboBox.addItemListener((ItemEvent e) -> {
            jCategoriaEquipoField.jComboBox.setForeground(
                jCategoriaEquipoField.jComboBox.getSelectedIndex() != 0 ?
                new Color(51,51,51) : new Color(153,153,153)
            );
            categoriaEquipoOK = jCategoriaEquipoField.jComboBox.getSelectedIndex() != 0;
            checkEnter();
        });
        
        for (TipoEquipo tipoEquipo : creationController.getTipoEquipos()) {
            jTipoEquipoField.jComboBox.addItem(tipoEquipo.getName());
        }
        
        jTipoEquipoField.jComboBox.addItemListener((ItemEvent e) -> {
            jTipoEquipoField.jComboBox.setForeground(
                jTipoEquipoField.jComboBox.getSelectedIndex() != 0 ?
                new Color(51,51,51) : new Color(153,153,153)
            );
            tipoEquipoOK = jTipoEquipoField.jComboBox.getSelectedIndex() != 0;
            checkEnter();
        });
        
        for (Capacidad capacidad : creationController.getCapacidades()) {
            jCapacidadField.jComboBox.addItem(capacidad.getCapacidad().toString());
        }
        
        jCapacidadField.jComboBox.addItemListener((ItemEvent e) -> {
            jCapacidadField.jComboBox.setForeground(
                jCapacidadField.jComboBox.getSelectedIndex() != 0 ?
                new Color(51,51,51) : new Color(153,153,153)
            );
            capacidadOK = jCapacidadField.jComboBox.getSelectedIndex() != 0;
            checkEnter();
        });
        
        for (Refrigerante refrigerante : creationController.getRefrigerantes()) {
            jRefrigeranteField.jComboBox.addItem(refrigerante.getName());
        }
        
        jRefrigeranteField.jComboBox.addItemListener((ItemEvent e) -> {
            jRefrigeranteField.jComboBox.setForeground(
                jRefrigeranteField.jComboBox.getSelectedIndex() != 0 ?
                new Color(51,51,51) : new Color(153,153,153)
            );
            refrigeranteOK = jRefrigeranteField.jComboBox.getSelectedIndex() != 0;
            checkEnter();
        });
    }

    private void checkEnter(){
        
        if(codigoEquipoOK && marcaEquipoOK && modeloEquipoOK && espacioMaximoOK 
            && precioOK && anchoOK && altoOK && descripcionOK
            && categoriaEquipoOK && tipoEquipoOK && capacidadOK && refrigeranteOK
        ){  
            barraPanelCreacion1.jContinueButton.setEnabled(true);
        }
        else{
            barraPanelCreacion1.jContinueButton.setEnabled(false);
        }
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
        jMarcaEquipoField = new proyectosemestral.Paneles.ItemCreacionText();
        jModeloEquipoField = new proyectosemestral.Paneles.ItemCreacionText();
        jCategoriaEquipoField = new proyectosemestral.Paneles.ItemCreacionDropdown();
        jTipoEquipoField = new proyectosemestral.Paneles.ItemCreacionDropdown();
        jCapacidadField = new proyectosemestral.Paneles.ItemCreacionDropdown();
        jRefrigeranteField = new proyectosemestral.Paneles.ItemCreacionDropdown();
        jEspacioMaximoField = new proyectosemestral.Paneles.ItemCreacionText();
        jControlRemotoField = new proyectosemestral.Paneles.ItemCreacionCheckBox();
        jInstalacionField = new proyectosemestral.Paneles.ItemCreacionCheckBox();
        jPrecioField = new proyectosemestral.Paneles.ItemCreacionText();
        jAnchoField = new proyectosemestral.Paneles.ItemCreacionText();
        jAltoField = new proyectosemestral.Paneles.ItemCreacionText();
        jDescripcionField = new proyectosemestral.Paneles.ItemCreacionTextArea();
        jCodigoEquipoField = new proyectosemestral.Paneles.ItemCreacionText();
        barraPanelCreacion1 = new proyectosemestral.Paneles.BarraPanelCreacion();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1280, 720));

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        jScrollPane1.setPreferredSize(new java.awt.Dimension(1280, 720));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(1280, 1500));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(440, 440, 440)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jMarcaEquipoField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCodigoEquipoField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jModeloEquipoField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCategoriaEquipoField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTipoEquipoField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCapacidadField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRefrigeranteField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jEspacioMaximoField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jControlRemotoField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jInstalacionField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPrecioField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jAnchoField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jAltoField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jDescripcionField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(448, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jCodigoEquipoField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(jMarcaEquipoField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(jModeloEquipoField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(jCategoriaEquipoField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(jTipoEquipoField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(jCapacidadField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(jRefrigeranteField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(jEspacioMaximoField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(jControlRemotoField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(jInstalacionField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(jPrecioField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(jAnchoField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(jAltoField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(jDescripcionField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jScrollPane1.setViewportView(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(barraPanelCreacion1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(barraPanelCreacion1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 613, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
                new PantallaCreacion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private proyectosemestral.Paneles.BarraPanelCreacion barraPanelCreacion1;
    private proyectosemestral.Paneles.ItemCreacionText jAltoField;
    private proyectosemestral.Paneles.ItemCreacionText jAnchoField;
    private proyectosemestral.Paneles.ItemCreacionDropdown jCapacidadField;
    private proyectosemestral.Paneles.ItemCreacionDropdown jCategoriaEquipoField;
    private proyectosemestral.Paneles.ItemCreacionText jCodigoEquipoField;
    private proyectosemestral.Paneles.ItemCreacionCheckBox jControlRemotoField;
    private proyectosemestral.Paneles.ItemCreacionTextArea jDescripcionField;
    private proyectosemestral.Paneles.ItemCreacionText jEspacioMaximoField;
    private proyectosemestral.Paneles.ItemCreacionCheckBox jInstalacionField;
    private proyectosemestral.Paneles.ItemCreacionText jMarcaEquipoField;
    private proyectosemestral.Paneles.ItemCreacionText jModeloEquipoField;
    private javax.swing.JPanel jPanel1;
    private proyectosemestral.Paneles.ItemCreacionText jPrecioField;
    private proyectosemestral.Paneles.ItemCreacionDropdown jRefrigeranteField;
    private javax.swing.JScrollPane jScrollPane1;
    private proyectosemestral.Paneles.ItemCreacionDropdown jTipoEquipoField;
    // End of variables declaration//GEN-END:variables
}
