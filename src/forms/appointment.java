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
import static forms.add_appointment.txtCheckin;
import static forms.add_appointment.txtTime;
import static forms.add_appointment.txtcstname;
import static forms.add_appointment.txtsr;
import static forms.add_appointment.txtprice;
import static forms.add_appointment.txtea;
import static forms.to_ongoing.txtCheckin2;
import static forms.to_ongoing.txtTime2;
import static forms.to_ongoing.txtcstname2;
import static forms.to_ongoing.txtea2;
import static forms.to_ongoing.txtprice2;
import static forms.to_ongoing.txtsr2;
import javax.swing.JOptionPane;


public class appointment extends javax.swing.JPanel {

    static void setDefaultCloseOperation(int DISPOSE_ON_CLOSE) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    
   
    
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
        ongoing_panel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
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
        pending_table.setRowHeight(40);
        pending_table.setSelectionBackground(new java.awt.Color(153, 153, 153));
        pending_table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pending_tableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(pending_table);

        javax.swing.GroupLayout pending_panelLayout = new javax.swing.GroupLayout(pending_panel);
        pending_panel.setLayout(pending_panelLayout);
        pending_panelLayout.setHorizontalGroup(
            pending_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 700, Short.MAX_VALUE)
        );
        pending_panelLayout.setVerticalGroup(
            pending_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pending_panelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
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
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        ongoing_table.setRowHeight(40);
        ongoing_table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ongoing_tableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(ongoing_table);

        javax.swing.GroupLayout ongoing_panelLayout = new javax.swing.GroupLayout(ongoing_panel);
        ongoing_panel.setLayout(ongoing_panelLayout);
        ongoing_panelLayout.setHorizontalGroup(
            ongoing_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 910, Short.MAX_VALUE)
        );
        ongoing_panelLayout.setVerticalGroup(
            ongoing_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ongoing_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 195, Short.MAX_VALUE))
        );

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setFont(new java.awt.Font("Century Gothic", 1, 36)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Appointment Set-Up");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 355, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 45, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        add_button.setText("Add");
        add_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_buttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(add_button)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(add_button, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(205, 205, 205)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, 155, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(pending_panel, javax.swing.GroupLayout.DEFAULT_SIZE, 700, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(add_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(15, 15, 15))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(add_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pending_panel, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(15, 15, 15)
                .addComponent(ongoing_panel, javax.swing.GroupLayout.DEFAULT_SIZE, 244, Short.MAX_VALUE)
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
        DefaultTableModel recordTable = (DefaultTableModel) pending_table.getModel();
int selectedRow = pending_table.getSelectedRow();

try {
    if (selectedRow != -1) { // Check if a row is selected
        txtCheckin.setText(recordTable.getValueAt(selectedRow, 1).toString());
        txtTime.setText(recordTable.getValueAt(selectedRow, 2).toString());
        txtcstname.setText(recordTable.getValueAt(selectedRow, 3).toString());
        txtsr.setText(recordTable.getValueAt(selectedRow, 4).toString());
        txtprice.setText(recordTable.getValueAt(selectedRow, 5).toString());
        txtea.setText(recordTable.getValueAt(selectedRow, 6).toString());
    } else {
        JOptionPane.showMessageDialog(this, "Please select a row.", "Warning", JOptionPane.WARNING_MESSAGE);
    }
} catch (NullPointerException ex) {
    JOptionPane.showMessageDialog(this, "Error: " + ex.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
}
           
    }//GEN-LAST:event_pending_tableMouseClicked

    private void ongoing_tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ongoing_tableMouseClicked
        // TODO add your handling code here:
         DefaultTableModel recordTable = (DefaultTableModel) ongoing_table.getModel();
int selectedRow = ongoing_table.getSelectedRow();

try {
    if (selectedRow != -1) { // Check if a row is selected
        txtCheckin2.setText(recordTable.getValueAt(selectedRow, 1).toString());
        txtTime2.setText(recordTable.getValueAt(selectedRow, 2).toString());
        txtcstname2.setText(recordTable.getValueAt(selectedRow, 3).toString());
        txtsr2.setText(recordTable.getValueAt(selectedRow, 4).toString());
        txtprice2.setText(recordTable.getValueAt(selectedRow, 5).toString());
        txtea2.setText(recordTable.getValueAt(selectedRow, 6).toString());
    } else {
        JOptionPane.showMessageDialog(this, "Please select a row.", "Warning", JOptionPane.WARNING_MESSAGE);
    }
} catch (NullPointerException ex) {
    JOptionPane.showMessageDialog(this, "Error: " + ex.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
}
    }//GEN-LAST:event_ongoing_tableMouseClicked
public static void AddRowToJTable(Object[]dataRow) {
    DefaultTableModel model = (DefaultTableModel)pending_table.getModel();
    model.addRow(dataRow);
    
    
}
public static void AddRowToJTable2(Object[]dataRow) {
    DefaultTableModel model2 = (DefaultTableModel)ongoing_table.getModel();
    model2.addRow(dataRow);
    
}
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add_button;
    private javax.swing.JPanel add_panel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
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
