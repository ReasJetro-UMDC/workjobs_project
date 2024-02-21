package cell;

import java.awt.Component;
import javax.swing.DefaultCellEditor;
import javax.swing.JCheckBox;
import javax.swing.JTable;

/**
 *
 * @author Jake Marson Nable
 */ 
public class CellEditor extends DefaultCellEditor {
    
    public CellEditor(){
        super(new JCheckBox());
    }
    
    @Override
    public Component getTableCellEditorComponent(JTable table, Object value, boolean isSelected, int row, int column) {
        panelAction action = new panelAction();
        action.setBackground(table.getSelectionBackground());
        return action;
    }
    
}
