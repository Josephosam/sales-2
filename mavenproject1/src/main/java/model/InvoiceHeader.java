
package model;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;



public class InvoiceHeader {
    private int invNum;
    private String customer;
    private Date invDate;
    private ArrayList<LineInvoice> lines;   
 
public InvoiceHeader(){
    
}
public InvoiceHeader(int num, String customer ,Date invDate ){
    this.invNum = num;
    this.customer = customer;
    this.invDate = invDate;
}
    public Date getInvDate() {
        return invDate;
    }

    public void setInvDate(Date invDate) {
        this.invDate = invDate;
    }
    public int getNum() {
        return invNum;
    }

    public void setNum(int num) {
        this.invNum = num;
    }

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public ArrayList<LineInvoice> getLines() {
         if (lines == null) {
            lines = new ArrayList<>();
        }
        return lines;
    }

    public void setLines(ArrayList<LineInvoice> lines) {
        this.lines = lines;
    }

    public  double getInvoiceTotal(){
        double total = 0.0;
        
        for (int i = 0; i < getLines().size(); i++) {
            total += getLines().get(i).getlineTatol();
        }
        
        return total;
    }
     @Override
    public String toString() {
        return "InvoiceHeader{" + "num=" + invNum + ", customer=" + customer + ", invDate=" + invDate + '}';
}

    public String getDataAsCSV() {
        DateFormat df = new SimpleDateFormat("dd-MM-yyyy");
        return "" + getNum() + "," + df.format(getInvDate()) + "," + getCustomer();
    }
}