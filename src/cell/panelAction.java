/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package cell;


import static forms.appointment.pending_table;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.DriverManager;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Vector;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import static forms.add_appointment.txtCheckin;
import static forms.add_appointment.txtTime;
import static forms.add_appointment.txtcstname;
import static forms.add_appointment.txtsr;
import static forms.add_appointment.txtprice;
import static forms.add_appointment.txtea;
import forms.to_ongoing;

import javax.swing.table.TableModel;


/**
 *
 * @author Jake Marson Nable
 */
public class panelAction extends javax.swing.JPanel {

   private static final String username = "root" ;
    private static final String password = "1234" ;
    private static final String dataconn = "jdbc:mysql://127.0.0.1:3306/workjob" ; 
    
    Connection sql = null;
    PreparedStatement pst  = null;
    ResultSet rs = null;
    int i, q, id;
    
    private int deleteItem;
  
  

    /**
     * Creates new form panelAction
     */
    public panelAction() {
        initComponents();
    }
 public void UpdateDb () {
    try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        sql = DriverManager.getConnection(dataconn,username,password);
        pst = sql.prepareStatement("select * from workjob");
        rs = pst.executeQuery();
        ResultSetMetaData stdata = rs.getMetaData();
        q = stdata.getColumnCount();
        DefaultTableModel RecordTable = (DefaultTableModel)pending_table.getModel();
                RecordTable.setRowCount(0);
        while (rs.next()){
            Vector columnData = new Vector();
            
            for ( i = 1; i < q; i++)
            
             {  
                
                 columnData.add(rs.getString("check_in"));
                 columnData.add(rs.getString("Time"));
                 columnData.add(rs.getString("Customer_name"));
                 columnData.add(rs.getString("Service_rendered"));
                 columnData.add(rs.getString("Price"));
                 columnData.add(rs.getString("Employee_Assigned"));
            }
            RecordTable.addRow(columnData);
        }        
    }
    catch (Exception e) {
        JOptionPane.showMessageDialog(null, e);
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

        TAB_add = new cell.actionButton();
        TAB_edit = new cell.actionButton();
        TAB_delete = new cell.actionButton();

        TAB_add.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-eye-24.png"))); // NOI18N
        TAB_add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TAB_addActionPerformed(evt);
            }
        });

        TAB_edit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-edit-24.png"))); // NOI18N
        TAB_edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TAB_editActionPerformed(evt);
            }
        });

        TAB_delete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-delete-24.png"))); // NOI18N
        TAB_delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TAB_deleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(TAB_add, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TAB_edit, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TAB_delete, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(11, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TAB_delete, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TAB_edit, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TAB_add, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 14, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void TAB_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TAB_deleteActionPerformed
        // TODO add your handling code here:
        DefaultTableModel recordTable = (DefaultTableModel)pending_table.getModel();
        int SelectedRows = pending_table.getSelectedRow();
      try {
          id = Integer.parseInt(recordTable.getValueAt(SelectedRows, 0).toString());
          deleteItem = JOptionPane.showConfirmDialog(null, "Confirm if you want to delete item", "warning",JOptionPane.YES_NO_OPTION);
          if(deleteItem == JOptionPane.YES_OPTION){
              
              Class.forName("com.mysql.cj.jdbc.Driver");
                Connection sql = DriverManager.getConnection(dataconn, username, password);
                pst = sql.prepareStatement("delete from workjob where id=?");
                
               pst.setInt(1, id);
               pst.executeUpdate();
               JOptionPane.showMessageDialog(this, "Record deleted");
               UpdateDb();
                
              txtCheckin.setText("");
              txtCheckin.requestFocus();
              txtTime.setText("");
              txtcstname.setText("");
              txtsr.setText("");
              txtprice.setText("");
              txtea.setText("");
              
          } 
          
} catch (ClassNotFoundException ex) {
    JOptionPane.showMessageDialog(this, "Database driver not found", "Error", JOptionPane.ERROR_MESSAGE);
} catch (SQLException ex) {
    JOptionPane.showMessageDialog(this, "Error deleting record: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
} catch (NumberFormatException ex) {
    JOptionPane.showMessageDialog(this, "Please enter a valid ID", "Error", JOptionPane.ERROR_MESSAGE);
}
    }//GEN-LAST:event_TAB_deleteActionPerformed

    private void TAB_editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TAB_editActionPerformed
       

try {
    
    Class.forName("com.mysql.cj.jdbc.Driver");
    Connection sql = DriverManager.getConnection(dataconn, username, password);
    PreparedStatement pst = sql.prepareStatement("UPDATE workjob SET check_in = ?, Time = ?, Customer_name = ?, Service_rendered = ?, Price = ?, Employee_Assigned = ? WHERE id = ?");
    
    DefaultTableModel recordTable = (DefaultTableModel) pending_table.getModel();
        int selectedRow = pending_table.getSelectedRow();
    pst.setString(1, txtCheckin.getText());
    pst.setString(2, txtTime.getText());
    pst.setString(3, txtcstname.getText());
    pst.setString(4, txtsr.getText());
    pst.setString(5, txtprice.getText());
    pst.setString(6, txtea.getText());
    pst.setInt(7, id);

    int rowsAffected = pst.executeUpdate();
    if (rowsAffected > 0) {
        JOptionPane.showMessageDialog(this, "Record Updated");
        UpdateDb();
        
    } else {
        JOptionPane.showMessageDialog(this, "No record updated", "Warning", JOptionPane.WARNING_MESSAGE);
    }

} catch (ClassNotFoundException | SQLException | NumberFormatException ex) {
    JOptionPane.showMessageDialog(this, "Error: " + ex.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
}



        // TODO add your handling code here:
    }//GEN-LAST:event_TAB_editActionPerformed

    private void TAB_addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TAB_addActionPerformed
        // TODO add your handling code here:
        
       
      
          int index = pending_table.getSelectedRow();
          TableModel model = pending_table.getModel();
          
          
          String check_in = model.getValueAt(index, 0).toString();
          String time = model.getValueAt(index,1).toString();
          String customerN = model.getValueAt(index, 2).toString();
          String SR = model.getValueAt(index, 3).toString();
          String Price = model.getValueAt(index, 4).toString();
          String EA = model.getValueAt(index, 5).toString();
           
        to_ongoing ongoingtb = new to_ongoing();
        ongoingtb.setVisible(true);
        ongoingtb.pack();
        ongoingtb.setLocationRelativeTo(ongoingtb);
        ongoingtb.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        
        ongoingtb.txtCheckin2.setText(check_in);
        ongoingtb.txtTime2.setText(time);
        ongoingtb.txtcstname2.setText(customerN);
        ongoingtb.txtsr2.setText(SR);
        ongoingtb.txtprice2.setText(Price);
        ongoingtb.txtea2.setText(EA);
        
    
         
    
   
    
      

    }//GEN-LAST:event_TAB_addActionPerformed

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private cell.actionButton TAB_add;
    private cell.actionButton TAB_delete;
    private cell.actionButton TAB_edit;
    // End of variables declaration//GEN-END:variables

   
   

   
}