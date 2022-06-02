
package controller;

import model.InvoiceHeader;
import model.LineInvoice;
import java.util.ArrayList;
import view.InvoiceFrame;
import model.InvoiceLineTable;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class selectedj implements ListSelectionListener{

    private InvoiceFrame josframe;

    public selectedj(InvoiceFrame josframe) {
        this.josframe = josframe;
    }

    @Override
    public  void valueChanged(ListSelectionEvent e) {
        int selecteInvIndex = josframe.getTH().getSelectedRow();
        System.out.println("Invoice selected: " + selecteInvIndex);
        if (selecteInvIndex != -1) {
           InvoiceHeader selectedInvoice = josframe.getInvoicesArray().get(selecteInvIndex);
           
            ArrayList<LineInvoice> lines = selectedInvoice.getLines();
            InvoiceLineTable lineTableM = new InvoiceLineTable(lines);
            josframe.setLinesArray(lines);
            josframe.getTL().setModel(lineTableM);
            josframe.getCutinv().setText(selectedInvoice.getCustomer()); 
            josframe.getNoinv().setText("" + selectedInvoice.getNum());
            josframe.getInvitems().setText("" + selectedInvoice.getInvoiceTotal());
            josframe.getDatinv().setText(InvoiceFrame.joo22.format(selectedInvoice.getInvDate()));
        }
    }}
