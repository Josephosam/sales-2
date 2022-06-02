
package model;

import view.InvoiceFrame;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;



public class InvoiceHeaderTable extends AbstractTableModel {

    private ArrayList<InvoiceHeader> invoicesArray;
    private String[] columnsss = {"No", " Date", "Customer Name","total" };
    
    public InvoiceHeaderTable(ArrayList<InvoiceHeader> invoicesArray) {
        this.invoicesArray = invoicesArray;
    }

    @Override
    public int getRowCount() {
        return invoicesArray.size();
    }

    @Override
    public int getColumnCount() {
        return columnsss.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        InvoiceHeader inv = invoicesArray.get(rowIndex);
        switch (columnIndex) {
            case 0 -> {
                return inv.getNum();
            }
            case 1 -> {
                return InvoiceFrame.joo22.format(inv.getInvDate());
            }
            case 2 -> {
                return inv.getCustomer();
              }
            case 3 -> {
                 return inv.getInvoiceTotal();
                
            }}
        
        return "";
    }
        
    @Override
    public String getColumnName(int column) {
        return columnsss[column];
        }
}
