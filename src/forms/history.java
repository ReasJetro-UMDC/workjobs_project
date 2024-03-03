/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package forms;

import javax.swing.RowFilter;
import javax.swing.table.TableRowSorter;
import static forms.to_complete.txtCheckin3;
import static forms.to_complete.txtTime3;
import static forms.to_complete.txtcstname3;
import static forms.to_complete.txtea3;
import static forms.to_complete.txtprice3;
import static forms.to_complete.txtsr3;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Jake Marson Nable
 */
public class history extends javax.swing.JPanel {
    
private static final String username = "root" ;
    private static final String password = "1234" ;
    private static final String dataconn = "jdbc:mysql://127.0.0.1:3306/workjob" ; 
    
    Connection sql = null;
    PreparedStatement pst1  = null;
    ResultSet rs = null;
   
    int p,r;
     
    
    
    DefaultTableModel model;
    /**
     * Creates new form history
     */
    public history() {
        initComponents();
        
       
      }
    
    public void UpdateDb1 () {
    try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        sql = DriverManager.getConnection(dataconn,username,password);
        
        pst1 = sql.prepareStatement("select * from history");
        rs = pst1.executeQuery();
        ResultSetMetaData stdata = rs.getMetaData();
        p = stdata.getColumnCount();
        DefaultTableModel RecordTable = (DefaultTableModel)history_table.getModel();
                RecordTable.setRowCount(0);
        while (rs.next()){
            Vector columnData = new Vector();
            
            for ( r = 1; r < p; r++)
            
             {  
                
                 columnData.add(rs.getString("Check_in"));
                 columnData.add(rs.getString("time"));
                 columnData.add(rs.getString("Costumer_Name"));
                 columnData.add(rs.getString("Service_Rendered"));
                 columnData.add(rs.getString("price"));
                 columnData.add(rs.getString("Emplooyee_Assigned"));
                 
            }
            RecordTable.addRow(columnData);
        }        
    }
    catch (Exception e) {
        JOptionPane.showMessageDialog(null, e);
    }
    
}
 public void search(String str) {
    model = (DefaultTableModel) history_table.getModel();
    TableRowSorter<DefaultTableModel> trs = new TableRowSorter<>(model);
    history_table.setRowSorter(trs);
    trs.setRowFilter(RowFilter.regexFilter(str));
    
 }
    // Set row

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
        history_table = new javax.swing.JTable();
        search_history = new javax.swing.JTextField();
        date_search = new com.toedter.calendar.JDateChooser();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(204, 204, 204));
        setPreferredSize(new java.awt.Dimension(940, 610));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        history_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Check In", "Time", "Costumer Name", "Service Rendered", "Price", "Employee Assigned"
            }
        ));
        history_table.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                history_tableAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        history_table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                history_tableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(history_table);

        search_history.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                search_historyActionPerformed(evt);
            }
        });
        search_history.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                search_historyKeyReleased(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("HISTORY");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(329, 329, 329)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 20, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 851, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(date_search, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(search_history, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(33, 33, 33))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(search_history, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(date_search, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 464, Short.MAX_VALUE)
                .addContainerGap())
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
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void history_tableAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_history_tableAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_history_tableAncestorAdded

    private void search_historyKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_search_historyKeyReleased
        // TODO add your handling code here:
        
        String searchString = search_history.getText();
        search(searchString);
    }//GEN-LAST:event_search_historyKeyReleased

    private void search_historyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_search_historyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_search_historyActionPerformed

    private void history_tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_history_tableMouseClicked
        // TODO add your handling code here:
         
        
    }//GEN-LAST:event_history_tableMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser date_search;
    public static javax.swing.JTable history_table;
    private javax.swing.JLabel jLabel1;
    public static javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField search_history;
    // End of variables declaration//GEN-END:variables

}
