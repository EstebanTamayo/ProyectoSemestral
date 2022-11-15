/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default
 * .txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to
 * edit this template
 */
package proyectosemestral;

import com.formdev.flatlaf.FlatLightLaf;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;

/**
 * @author lr56c
 */
public class TestD extends javax.swing.JFrame
{

  private String stringDB = "jdbc:mysql://localhost:3306/test";
  private String user     = "root";
  //private String pass     = "Mauricio!Ignacio!Herrera!Ortega@12";
  private String pass     = "";
  private String[]          colums = { "id", "nombre" };
  private ArrayList<String[]> data   = new ArrayList<>();

  /**
   * Creates new form TestD
   */
  public TestD()
  {
    initComponents();
    data.add( new String[]{ "50", "Mauricio" });
    data.add( new String[]{ "51", "Ignacio" } );
    DefaultTableModel model  = new DefaultTableModel( data.stream().toArray(String[][]::new), colums );
    jTable1.setModel( model );
    conexionTest();
    //insertTest();
  }
  /**
   * This method is called from within the constructor to initialize the form.
   * WARNING: Do NOT modify this code. The content of this method is always
   * regenerated by the Form Editor.
   */
  @SuppressWarnings( "unchecked" )
  // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        checkboxFilter1 = new FiltroPanels.CheckboxFilter();
        dropdownFilter1 = new FiltroPanels.DropdownFilter();
        searchFilter1 = new FiltroPanels.SearchFilter();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();

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
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(jTable2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(searchFilter1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(dropdownFilter1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(checkboxFilter1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(dropdownFilter1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(checkboxFilter1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(searchFilter1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void insertTest(){
        try{
         String sql = "INSERT INTO dd(f,d,b,bb) VALUES(?, ?, ?, ?)";
            Connection connection = DriverManager.getConnection( stringDB, user,
            pass );

            PreparedStatement statement = connection.prepareStatement( sql );
            
            statement.setFloat(1, 50.2f);
            statement.setDouble(2, 4.3);
            statement.setBoolean(3, true);
            statement.setBoolean(4, false);
            statement.executeUpdate();
        }
          catch ( Exception ex )
        {
          ex.printStackTrace();
        }
    }
    
    private void conexionTest(){
        try
        {
          String sql = "SELECT * FROM dd";
          Connection connection = DriverManager.getConnection( stringDB, user,
            pass );

          Statement statement = connection.prepareStatement( sql );
          ResultSet resultSet = statement.executeQuery( sql );

          //String text = label.getText();
          // if(text.length > 0)
          // else System.out.println("Choose id again");

          ArrayList<String[]> lista = new ArrayList<>();

          while ( resultSet.next() )
          {
            float campo1 = resultSet.getFloat(2 );
            double campo2 = resultSet.getDouble(3 );
            boolean campo3 = resultSet.getBoolean(4 );
            boolean campo4 = resultSet.getBoolean(5 );
            //lista.add( new String[] { campo1, campo2 } );
            System.out.println(campo1);
            System.out.println(campo2);
            System.out.println(campo3);
            System.out.println(campo4);            
          }

          connection.close();
//          String[][] newData = lista.stream().toArray(String[][]::new);
//          DefaultTableModel model = new DefaultTableModel(newData, colums );
//          jTable1.setModel( model );
        }
        catch ( Exception ex )
        {
            ex.printStackTrace();
          System.err.println( "Failed connection database" );
        }
    }
    
  /**
   * @param args
   *   the command line arguments
   */
  public static void main( String args[] )
  {
    /* Set the Nimbus look and feel */
    try
    {
      UIManager.setLookAndFeel( new FlatLightLaf() );
    }
    catch ( Exception ex )
    {
      System.err.println( "Failed to initialize LaF" );
    }

    /* Create and display the form */
    java.awt.EventQueue.invokeLater( new Runnable()
    {
      public void run()
      {
        new TestD().setVisible( true );
      }
    } );
  }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private FiltroPanels.CheckboxFilter checkboxFilter1;
    private FiltroPanels.DropdownFilter dropdownFilter1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private FiltroPanels.SearchFilter searchFilter1;
    // End of variables declaration//GEN-END:variables
}
