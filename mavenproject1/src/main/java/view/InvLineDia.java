
package view;

import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class InvLineDia extends JDialog {
    
    private JTextField itemName;
    private JTextField itemCount;
    private JTextField itemPrice;
    private JLabel itemNameLbl;
    private JLabel itemCountLbl;
    private JLabel itemPriceLbl;
    private JButton okBtn;
    private JButton cancelBtn;
public InvLineDia(InvoiceFrame josframe) {
        itemName = new JTextField(20);
        itemNameLbl = new JLabel("Item Name");
        
        itemCount = new JTextField(20);
        itemCountLbl = new JLabel("Item Count");
        
        itemPrice = new JTextField(20);
        itemPriceLbl = new JLabel("Item Price");
        
        okBtn = new JButton("OK");
        cancelBtn = new JButton("Cancel");
        
        okBtn.setActionCommand("newLineOK");
        cancelBtn.setActionCommand("newLineCancel");
        
        okBtn.addActionListener(josframe.getActionListener());
        cancelBtn.addActionListener(josframe.getActionListener());
        setLayout(new GridLayout(4, 2));
        
        add(itemNameLbl);
        add(itemName);
        add(itemCountLbl);
        add(itemCount);
        add(itemPriceLbl);
        add(itemPrice);
        add(okBtn);
        add(cancelBtn);
        
        pack();
    }

    public JTextField getItemName() {
        return itemName;
    }

    public JTextField getItemCount() {
        return itemCount;
    }

    public JTextField getItemPrice() {
        return itemPrice;
    }
}
