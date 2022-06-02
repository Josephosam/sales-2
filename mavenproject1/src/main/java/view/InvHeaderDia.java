
package view;


import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTextField;


public class InvHeaderDia extends JDialog {
    private JTextField custName;
    private JTextField invDate;
    private JLabel custNam;
    private JLabel invDatej;
    private JButton okBtn;
    private JButton cancelBtn;

    public InvHeaderDia(InvoiceFrame josframe) {
        custNam = new JLabel("Customer Name:");
        custName = new JTextField(20);
        invDatej = new JLabel("Invoice Date:");
        invDate = new JTextField(20);
        okBtn = new JButton("OK");
        cancelBtn = new JButton("Cancel");
        
        okBtn.setActionCommand("newInvoiceOK");
        cancelBtn.setActionCommand("newInvoiceCancel");
        
        okBtn.addActionListener(josframe.getActionListener());
        cancelBtn.addActionListener(josframe.getActionListener());
        setLayout(new GridLayout(3, 2));
        
        add(invDatej);
        add(invDate);
        add(custNam);
        add(custName);
        add(okBtn);
        add(cancelBtn);
        
        pack();
        
    }

    public JTextField getCustName() {
        return custName;
    }

    public JTextField getInvDate() {
        return invDate;
    }
    
}
