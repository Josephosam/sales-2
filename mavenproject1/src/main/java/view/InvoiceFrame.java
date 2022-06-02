
package view;

import controller.Invoicelistener;
import controller.selectedj;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.swing.JLabel;
import javax.swing.JTable;
import model.InvoiceHeader;
import model.InvoiceHeaderTable;
import model.InvoiceLineTable;
import model.LineInvoice;


public class InvoiceFrame extends javax.swing.JFrame {
    
    public InvoiceFrame() {
        
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jScrollPane1 = new javax.swing.JScrollPane();
        TH = new javax.swing.JTable();
        Createnewinvoice = new java.awt.Button();
        Deleteinvoice = new java.awt.Button();
        jScrollPane2 = new javax.swing.JScrollPane();
        TL = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        saveline = new java.awt.Button();
        Deleteline = new java.awt.Button();
        Datinv = new javax.swing.JLabel();
        Noinv = new javax.swing.JLabel();
        Cutinv = new javax.swing.JLabel();
        Invitems = new javax.swing.JLabel();
        file = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        Load = new javax.swing.JMenuItem();
        Save = new javax.swing.JMenuItem();
        Exit = new javax.swing.JMenuItem();

        jMenuItem1.setText("jMenuItem1");

        jMenuItem2.setText("jMenuItem2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Invoice");
        setBackground(javax.swing.UIManager.getDefaults().getColor("Actions.GreyInline"));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        TH.setBackground(new java.awt.Color(204, 204, 204));
        TH.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        TH.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "No.", "Data", "Customer Name"
            }
        ));
        TH.getSelectionModel().addListSelectionListener(selectionListener);
        TH.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                THAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jScrollPane1.setViewportView(TH);

        Createnewinvoice.setLabel("Create New Invoice");
        Createnewinvoice.setName(""); // NOI18N
        Createnewinvoice.addActionListener(JactionListener);
        Createnewinvoice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CreatenewinvoiceActionPerformed(evt);
            }
        });

        Deleteinvoice.setLabel("Delete Invoice");
        Deleteinvoice.addActionListener(JactionListener);

        TL.setBackground(new java.awt.Color(204, 204, 204));
        TL.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        TL.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(TL);

        jLabel2.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        jLabel2.setText("Invoice Total");

        jLabel3.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        jLabel3.setText("Invoice Number");

        jLabel4.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        jLabel4.setText("Invoice Data");

        jLabel5.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        jLabel5.setText("Customer Name");

        saveline.setLabel("Save Line");
        saveline.addActionListener(JactionListener);
        saveline.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                savelineActionPerformed(evt);
            }
        });

        Deleteline.setLabel("Delete Line");
        Deleteline.addActionListener(JactionListener);

        jMenu1.setText("File");

        Load.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        Load.setText("load");
        Load.addActionListener(JactionListener);
        jMenu1.add(Load);

        Save.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        Save.setText("Save");
        Save.addActionListener(JactionListener);
        jMenu1.add(Save);

        Exit.setText("Exit");
        Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitActionPerformed(evt);
            }
        });
        jMenu1.add(Exit);

        file.add(jMenu1);

        setJMenuBar(file);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(Createnewinvoice, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(Deleteinvoice, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(saveline, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(Deleteline, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel2))
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Noinv, javax.swing.GroupLayout.DEFAULT_SIZE, 1, Short.MAX_VALUE)
                            .addComponent(Cutinv, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Invitems, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(Datinv)))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 416, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Datinv)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel7)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel8))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3)
                                    .addComponent(Noinv, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Cutinv, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(Invitems, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 395, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Createnewinvoice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Deleteinvoice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(saveline, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Deleteline, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitActionPerformed
        // TODO add your handling code here:

        System.exit(0);
        
    }//GEN-LAST:event_ExitActionPerformed

    private void THAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_THAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_THAncestorAdded

    private void CreatenewinvoiceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CreatenewinvoiceActionPerformed
        // TODO add your handling code here:
   
    }//GEN-LAST:event_CreatenewinvoiceActionPerformed
    private void savelineActionPerformed(java.awt.event.ActionEvent evt) {
    }

                                               

    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InvoiceFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new InvoiceFrame().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button Createnewinvoice;
    private javax.swing.JLabel Cutinv;
    private javax.swing.JLabel Datinv;
    private java.awt.Button Deleteinvoice;
    private java.awt.Button Deleteline;
    private javax.swing.JMenuItem Exit;
    private javax.swing.JLabel Invitems;
    private javax.swing.JMenuItem Load;
    private javax.swing.JLabel Noinv;
    private javax.swing.JMenuItem Save;
    private javax.swing.JTable TH;
    private javax.swing.JTable TL;
    private javax.swing.JMenuBar file;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private java.awt.Button saveline;
    // End of variables declaration//GEN-END:variables



private Invoicelistener JactionListener =new Invoicelistener(this);  
private ArrayList<InvoiceHeader> invoicesArray;
private ArrayList<LineInvoice> IvoiceslineArray;
private InvoiceHeaderTable headerTableMode;
private InvoiceLineTable LineTableMode;
public static SimpleDateFormat joo22 = new SimpleDateFormat("dd-MM-yyyy");
private selectedj selectionListener = new selectedj(this);
public void setInvoicesArray(ArrayList<InvoiceHeader> invoicesArray) {
        this.invoicesArray = invoicesArray;
    }

 public ArrayList<LineInvoice> getLinesArray() {
        return IvoiceslineArray;
    }

    public void setLinesArray(ArrayList<LineInvoice> linesArray) {
        this.IvoiceslineArray = linesArray;
    }

    public ArrayList<InvoiceHeader> getInvoicesArray() {
        return invoicesArray;
    }
     public ArrayList<InvoiceHeader> getInvoices() {
        if (invoicesArray == null) invoicesArray = new ArrayList<>();
        return invoicesArray;
    }
    
    public InvoiceHeader getInvObj(int JOScode) {
        for (InvoiceHeader inv : invoicesArray) {
            if (inv.getNum() == JOScode) {
                return inv;
            }
        }
        return null;
    }

    public InvoiceHeaderTable getHeaderTableModel() {
        return headerTableMode;
    }
    


 public void setHeaderTableModel(InvoiceHeaderTable headerTableModel) {
        this.headerTableMode = headerTableModel;
    }

 
     public InvoiceLineTable getLineTableModel() {
        return LineTableMode;
    }
 
     public void setLineTableModel(InvoiceLineTable LineTableMode) {
        this.LineTableMode = LineTableMode;
    }
 
    public JTable getTH() {
        return TH;
        
    }

    public JTable getTL() {
        return TL;
    }

    public JLabel getCutinv() {
        return Cutinv;
    }

    public JLabel getDatinv() {
        return Datinv;
    }

    public JLabel getNoinv() {
        return Noinv;
    }

    public JLabel getInvitems() {
        return Invitems;
    }

    public Invoicelistener getActionListener () {
        return JactionListener;
    }

   
   
}