package cell;

import java.awt.Color;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.JTable;
import java.awt.Component;



public class TableActionCellRender extends DefaultTableCellRenderer {

    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        Component com = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    
        panelAction action = new panelAction();
        if(isSelected == false&& row % 2 ==0){
            action.setBackground(Color.WHITE);
        } else {
            action.setBackground(com.getBackground());
        }
        action.setBackground(com.getBackground());
        return action;
    }
    
}
