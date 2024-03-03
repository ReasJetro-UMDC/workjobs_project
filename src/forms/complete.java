/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package forms;
import cell.CellEditor;
import cell.TableActionCellRender;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
/**
 *
 * @author Jake Marson Nable
 */
public class complete extends javax.swing.JPanel {
    
    
private static final String username = "root" ;
    private static final String password = "1234" ;
    private static final String dataconn = "jdbc:mysql://127.0.0.1:3306/workjob" ; 
    
    Connection sql = null;
    PreparedStatement pst  = null;
    ResultSet rs = null;
    int q, i;
    
    
    DefaultTableModel model;
 

    

    /**
     * Creates new form complete
     */
    public complete() {
        initComponents();
           completed_table.getColumnModel().getColumn(6).setCellRenderer(new TableActionCellRender());
        completed_table.getColumnModel().getColumn(6).setCellEditor(new CellEditor());
        
        //ongoing table action buttons
        
    }
 public void UpdateDb () {
    try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        sql = DriverManager.getConnection(dataconn,username,password);
        pst = sql.prepareStatement("select * from complete");
        rs = pst.executeQuery();
        ResultSetMetaData stdata = rs.getMetaData();
        q = stdata.getColumnCount();
        DefaultTableModel RecordTable = (DefaultTableModel)completed_table.getModel();
                RecordTable.setRowCount(0);
        while (rs.next()){
            Vector columnData = new Vector();
            
            for ( i = 1; i < q; i++)
            
             {  
                
                 columnData.add(rs.getString("Check_in_complete"));
                 columnData.add(rs.getString("time_complete"));
                 columnData.add(rs.getString("Costumer_Name_complete"));
                 columnData.add(rs.getString("Service_Rendered_complete"));
                 columnData.add(rs.getString("price_complete"));
                 columnData.add(rs.getString("Emplooyee_Assigned_complete"));
            }
            RecordTable.addRow(columnData);
        }        
    }
    catch (Exception e) {
        JOptionPane.showMessageDialog(null, e);
    }
    
}
 
 public void search(String str) {
    model = (DefaultTableModel) completed_table.getModel();
    TableRowSorter<DefaultTableModel> trs = new TableRowSorter<>(model);
    completed_table.setRowSorter(trs);
    trs.setRowFilter(RowFilter.regexFilter(str));
    
 }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        completed_table = new javax.swing.JTable();
        search_complete = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(204, 204, 204));
        setPreferredSize(new java.awt.Dimension(940, 610));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        completed_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Check In", "Time", "Name", "Works", "Emplooyee Assigned", "Price", "Action"
            }
        ));
        completed_table.setRowHeight(40);
        completed_table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                completed_tableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(completed_table);

        search_complete.setText("  Search");
        search_complete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                search_completeActionPerformed(evt);
            }
        });
        search_complete.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                search_completeKeyReleased(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("COMPLETE");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(search_complete, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 880, Short.MAX_VALUE))
                .addGap(15, 15, 15))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(364, 364, 364)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(search_complete, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 467, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(7, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(15, 15, 15))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(15, 15, 15))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void search_completeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_search_completeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_search_completeActionPerformed

    private void completed_tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_completed_tableMouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_completed_tableMouseClicked

    private void search_completeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_search_completeKeyReleased
    String searchString = search_complete.getText();
        search(searchString);        // TODO add your handling code here:
    }//GEN-LAST:event_search_completeKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JTable completed_table;
    private javax.swing.JLabel jLabel1;
    public static javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JTextField search_complete;
    // End of variables declaration//GEN-END:variables

   


}
