
package model;


    public class LineInvoice {
    
    private String item;
    private double price ;
    private int count ;
    private InvoiceHeader header ;
    
    
    
    public LineInvoice(){
        
    }

    public LineInvoice( String item, double price,  int count,InvoiceHeader header ) {
       
        this.item = item;
        this.price = price;
        this.count = count;
        this.header = header;
    }

   

    public InvoiceHeader getHeader() {
        return header;
    }

    public void setHeader(InvoiceHeader header) {
        this.header = header;
    
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

        
    public double getlineTatol (){
     return price * count ;
    }
     @Override
    public String toString() {
        return "InvoiceLine{" +  "item=" + item + " price=" + price + "count=" + count + " header=" + header + '}';
    }

    public Iterable<LineInvoice> getLines() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    public String getAsCSV() {
        return header.getNum() + "," + item + "," + price + "," + count;
    }
    
}
