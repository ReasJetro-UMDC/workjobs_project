/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package forms;

import cell.TableActionCellRender;
import cell.CellEditor;
import java.awt.Component;
import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;
import static forms.complete.completed_table;
import static forms.to_ongoing.txtCheckin2;
import static forms.to_ongoing.txtTime2;
import static forms.to_ongoing.txtcstname2;
import static forms.to_ongoing.txtea2;
import static forms.to_ongoing.txtprice2;
import static forms.to_ongoing.txtsr2;
import javax.swing.JOptionPane;
import javax.swing.table.TableModel;
import static forms.to_complete.txtCheckin3;
import static forms.to_complete.txtTime3;
import static forms.to_complete.txtcstname3;
import static forms.to_complete.txtea3;
import static forms.to_complete.txtprice3;
import static forms.to_complete.txtsr3;


public class appointment extends javax.swing.JPanel {


    
   
    
    public appointment() {
        initComponents();

        
        //pending table action buttons
        pending_table.getColumnModel().getColumn(6).setCellRenderer(new TableActionCellRender());
        pending_table.getColumnModel().getColumn(6).setCellEditor(new CellEditor());
        
        //ongoing table action buttons
        ongoing_table.getColumnModel().getColumn(6).setCellRenderer(new TableActionCellRender());
        ongoing_table.getColumnModel().getColumn(6).setCellEditor(new CellEditor());

    }
    
    private void forms(Component com){
        add_panel.removeAll();
        add_panel.add(com);
        repaint();
        revalidate();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pending_panel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jButton2 = new javax.swing.JButton();
        ongoing_panel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        add_button = new javax.swing.JButton();
        add_panel = new javax.swing.JPanel();
        time_panel1 = new other_forms.time_panel();

        setBackground(new java.awt.Color(204, 204, 204));
        setForeground(new java.awt.Color(204, 204, 204));
        setPreferredSize(new java.awt.Dimension(940, 610));

        pending_panel.setBackground(new java.awt.Color(255, 255, 255));
        pending_panel.setPreferredSize(new java.awt.Dimension(95, 286));

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Pending");

        pending_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Check In", "Time", "Customer Name", "Service Rendered", "price", "Employee Assigned", "action"
            }
        ));
        pending_table.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        pending_table.setRowHeight(40);
        pending_table.setSelectionBackground(new java.awt.Color(153, 153, 153));
        pending_table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pending_tableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(pending_table);

        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton2.setText("ADD TO ONGOING");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pending_panelLayout = new javax.swing.GroupLayout(pending_panel);
        pending_panel.setLayout(pending_panelLayout);
        pending_panelLayout.setHorizontalGroup(
            pending_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 700, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pending_panelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addGap(16, 16, 16))
        );
        pending_panelLayout.setVerticalGroup(
            pending_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pending_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton2)
                .addGap(8, 8, 8))
        );

        ongoing_panel.setBackground(new java.awt.Color(255, 255, 255));
        ongoing_panel.setPreferredSize(new java.awt.Dimension(95, 286));

        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Ongoing");
        jLabel2.setPreferredSize(new java.awt.Dimension(94, 182));

        ongoing_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Checked in", "Time", "Customer Name", "Service Rendered", "Price", "Employee Assigned", "Action"
            }
        ));
        ongoing_table.setRowHeight(40);
        ongoing_table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ongoing_tableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(ongoing_table);

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton1.setText("ADD TO COMPLETE");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ongoing_panelLayout = new javax.swing.GroupLayout(ongoing_panel);
        ongoing_panel.setLayout(ongoing_panelLayout);
        ongoing_panelLayout.setHorizontalGroup(
            ongoing_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 910, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ongoing_panelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(17, 17, 17))
        );
        ongoing_panelLayout.setVerticalGroup(
            ongoing_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ongoing_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        add_button.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        add_button.setText("ADD TO PENDING");
        add_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_buttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(add_button)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(add_button, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(9, Short.MAX_VALUE))
        );

        add_panel.setBackground(new java.awt.Color(255, 255, 255));
        add_panel.setPreferredSize(new java.awt.Dimension(198, 266));

        javax.swing.GroupLayout add_panelLayout = new javax.swing.GroupLayout(add_panel);
        add_panel.setLayout(add_panelLayout);
        add_panelLayout.setHorizontalGroup(
            add_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(time_panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        add_panelLayout.setVerticalGroup(
            add_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(time_panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ongoing_panel, javax.swing.GroupLayout.DEFAULT_SIZE, 910, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(pending_panel, javax.swing.GroupLayout.DEFAULT_SIZE, 700, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(add_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(23, 23, 23)))))
                .addGap(15, 15, 15))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(add_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(pending_panel, javax.swing.GroupLayout.DEFAULT_SIZE, 321, Short.MAX_VALUE))
                .addGap(15, 15, 15)
                .addComponent(ongoing_panel, javax.swing.GroupLayout.DEFAULT_SIZE, 248, Short.MAX_VALUE)
                .addGap(15, 15, 15))
        );
    }// </editor-fold>//GEN-END:initComponents

        
    private void add_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_buttonActionPerformed
       add_appointment appointment = new add_appointment();
       appointment.setVisible(true);
       appointment.pack();
       appointment.setLocationRelativeTo(null);
       appointment.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
      
    }//GEN-LAST:event_add_buttonActionPerformed

    private void pending_tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pending_tableMouseClicked
        // TODO add your handling code here:
       try {
    DefaultTableModel recordTable = (DefaultTableModel) pending_table.getModel();
    int selectedRow = pending_table.getSelectedRow();

    if (selectedRow != -1 && selectedRow < recordTable.getRowCount()) { // Check if a row is selected and within bounds
        // Retrieve data from the selected row
        Object checkinValue = recordTable.getValueAt(selectedRow, 0); // Assuming the index of check-in is 0
        Object timeValue = recordTable.getValueAt(selectedRow, 1); // Assuming the index of time is 1
        Object cstnameValue = recordTable.getValueAt(selectedRow, 2); // Assuming the index of customer name is 2
        Object srValue = recordTable.getValueAt(selectedRow, 3); // Assuming the index of service rendered is 3
        Object priceValue = recordTable.getValueAt(selectedRow, 4); // Assuming the index of price is 4
        Object eaValue = recordTable.getValueAt(selectedRow, 5); // Assuming the index of employee assigned is 5

        // Populate text fields with retrieved data
        txtCheckin2.setText(checkinValue != null ? checkinValue.toString() : "");
        txtTime2.setText(timeValue != null ? timeValue.toString() : "");
        txtcstname2.setText(cstnameValue != null ? cstnameValue.toString() : "");
        txtsr2.setText(srValue != null ? srValue.toString() : "");
        txtprice2.setText(priceValue != null ? priceValue.toString() : "");
        txtea2.setText(eaValue != null ? eaValue.toString() : "");
    } else {
        JOptionPane.showMessageDialog(this, "Please select a valid row.", "Warning", JOptionPane.WARNING_MESSAGE);
    }
} catch (Exception ex) {
    JOptionPane.showMessageDialog(this, "Error: " + ex.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
    ex.printStackTrace(); // Print stack trace for debugging
}





           
    }//GEN-LAST:event_pending_tableMouseClicked

    private void ongoing_tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ongoing_tableMouseClicked
        // TODO add your handling code here:
          try {
    DefaultTableModel recordTable = (DefaultTableModel) ongoing_table.getModel();
    int selectedRow = ongoing_table.getSelectedRow();

    if (selectedRow != -1 && selectedRow < recordTable.getRowCount()) { // Check if a row is selected and within bounds
        // Retrieve data from the selected row
        Object checkinValue = recordTable.getValueAt(selectedRow, 1);
        Object timeValue = recordTable.getValueAt(selectedRow, 2);
        Object cstnameValue = recordTable.getValueAt(selectedRow, 3);
        Object srValue = recordTable.getValueAt(selectedRow, 4);
        Object priceValue = recordTable.getValueAt(selectedRow, 5);
        Object eaValue = recordTable.getValueAt(selectedRow, 6);

        // Populate text fields with retrieved data
        txtCheckin2.setText(checkinValue != null ? checkinValue.toString() : "");
        txtTime2.setText(timeValue != null ? timeValue.toString() : "");
        txtcstname2.setText(cstnameValue != null ? cstnameValue.toString() : "");
        txtsr2.setText(srValue != null ? srValue.toString() : "");
        txtprice2.setText(priceValue != null ? priceValue.toString() : "");
        txtea2.setText(eaValue != null ? eaValue.toString() : "");
    } else {
        JOptionPane.showMessageDialog(this, "Please select a valid row.", "Warning", JOptionPane.WARNING_MESSAGE);
    }
} catch (Exception ex) {
    JOptionPane.showMessageDialog(this, "Error: " + ex.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
    ex.printStackTrace(); // Print stack trace for debugging
}
        
    }//GEN-LAST:event_ongoing_tableMouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        try {
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
        
        } catch (Exception e) {
        JOptionPane.showMessageDialog(null, e);
    }
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
          try {
         int index = ongoing_table.getSelectedRow();
          TableModel model = ongoing_table.getModel();
          
          
          String check_in = model.getValueAt(index, 0).toString();
          String time = model.getValueAt(index,1).toString();
          String customerN = model.getValueAt(index, 2).toString();
          String SR = model.getValueAt(index, 3).toString();
          String Price = model.getValueAt(index, 4).toString();
          String EA = model.getValueAt(index, 5).toString();
           
        to_complete ongoingtb = new to_complete();
        ongoingtb.setVisible(true);
        ongoingtb.pack();
        ongoingtb.setLocationRelativeTo(ongoingtb);
        ongoingtb.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        
        ongoingtb.txtCheckin3.setText(check_in);
        ongoingtb.txtTime3.setText(time);
        ongoingtb.txtcstname3.setText(customerN);
        ongoingtb.txtsr3.setText(SR);
        ongoingtb.txtprice3.setText(Price);
        ongoingtb.txtea3.setText(EA);
        
        
        } catch (Exception e) {
        JOptionPane.showMessageDialog(null, e);
    }

        
    }//GEN-LAST:event_jButton1ActionPerformed
public static void AddRowToJTable(Object[]dataRow) {
    DefaultTableModel model = (DefaultTableModel)pending_table.getModel();
    model.addRow(dataRow);
    
    
}
public static void AddRowToJTable2(Object[]dataRow) {
    DefaultTableModel model2 = (DefaultTableModel)ongoing_table.getModel();
    model2.addRow(dataRow);
    
}
public static void AddRowToJTable3(Object[]dataRow) {
    DefaultTableModel model3 = (DefaultTableModel)completed_table.getModel();
    model3.addRow(dataRow);
    
}
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add_button;
    private javax.swing.JPanel add_panel;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPanel ongoing_panel;
    public static final javax.swing.JTable ongoing_table = new javax.swing.JTable();
    private javax.swing.JPanel pending_panel;
    public static final javax.swing.JTable pending_table = new javax.swing.JTable();
    private other_forms.time_panel time_panel1;
    // End of variables declaration//GEN-END:variables

   
}
