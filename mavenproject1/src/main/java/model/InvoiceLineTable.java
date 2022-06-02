
package model;
  
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

public class InvoiceLineTable extends AbstractTableModel {
     private  ArrayList<LineInvoice> LinesArray;
     private  String[] columnsss = { "Item Name", "Item Price", "Count", "Item Total"};
    
     public InvoiceLineTable(ArrayList<LineInvoice> LinesArray) {
     
        this.LinesArray = LinesArray;
    }
    
    @Override
    public int getRowCount() {

        return LinesArray ==null ? 0 : LinesArray.size();
         }

    @Override
    public int getColumnCount() {
        return columnsss.length;
         }

           @Override
    public String getColumnName(int column) {
        return columnsss [column];
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        
        if (LinesArray == null) {
            return "";
        } else {
        LineInvoice line = LinesArray.get(rowIndex);
        switch (columnIndex) {
            case 0 -> {
                return line.getItem();
            }
            case 1 -> {
               return line.getPrice();
            }
            case 2 -> {
               return line.getCount();
              }
            case 3 -> { 
                return line.getlineTatol();
                }
                        
            
              
                  default -> {
                          return "";
                }
                        }
        }
       
        }}
    
        
        
        
 

    
