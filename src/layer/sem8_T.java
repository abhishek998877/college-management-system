/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package layer;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import static layer.sem7_T.prt2;
import static layer.sem7_T.prt3;

/**
 *
 * @author Abhishek
 */
public class sem8_T extends javax.swing.JPanel {

    /**
     * Creates new form sem1
     */  
      static PreparedStatement prt2,prt3;
  static Connection con2,con3;
  static ResultSet rs2,rs3;
static   String reg_str;
    Connection con;
    PreparedStatement prt;
    ResultSet rs;
    String query;
    sem8_u sem2;
    public sem8_T(String reg_ob) {
        initComponents();
        try
        {
            reg_str=reg_ob;
            sem2=new sem8_u();
             Class.forName("com.mysql.jdbc.Driver");
           con=DriverManager.getConnection("jdbc:mysql://localhost:3306/college","root","root");
           DefaultTableModel jt=(DefaultTableModel) jTable1.getModel();
               query="Select Date,elective6,openelective3,openelective4 from subject where registration=?";
           prt=con.prepareStatement(query);
           prt.setString(1,reg_ob);
           rs=prt.executeQuery();
             while(rs.next())
           {
                String dta[]={rs.getString("Date"),rs.getString("elective6"),rs.getString("openelective3"),rs.getString("openelective4")};
                 jt.addRow(dta);
           }
        }
        catch(ClassNotFoundException | SQLException ae)
        {
            System.out.print(ae);
        }
    }
public static void update(Object[] data)
    {
        DefaultTableModel tbm=(DefaultTableModel) jTable1.getModel();
        if(jTable1.getSelectedColumnCount()==1)
        {
            tbm.setValueAt(data[0],jTable1.getSelectedRow(),0);
            tbm.setValueAt(data[1],jTable1.getSelectedRow(),1);
            tbm.setValueAt(data[2],jTable1.getSelectedRow(),2);
            tbm.setValueAt(data[3],jTable1.getSelectedRow(),3);
          
            String date=data[0].toString();
         String sub1=data[1].toString();
          String sub2=data[2].toString();
         String sub3=data[3].toString();
       // Date,elective6,openelective3,openelective4
            String query_u="update subject Date='"+date+"',elective6='"+sub1+"',openelective3='"+sub2+"',openelective4='"+sub3+"' where registration=?";
            try {
                prt2=con2.prepareStatement(query_u);
                prt2.setString(1,reg_str);
                prt2.executeUpdate();
                
            } catch (SQLException ex) {
                System.out.print("done 2");
              //  Logger.getLogger(sem1_T.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        else
        {
            if(jTable1.getSelectedColumnCount()==0)
            { 
               
            
            }
            else
            {
            }
                
                
        }
    }
    public static void add(Object[] data)
    {
     DefaultTableModel tbm=(DefaultTableModel) jTable1.getModel();
     tbm.addRow(data);
        
      try {
            String date=data[0].toString();
         String sub1=data[1].toString();
          String sub2=data[2].toString();
         String sub3=data[3].toString();
         System.out.print(date);
             String query_a="insert into subject(Date,elective6,openelective3,openelective4,registration) values(?,?,?,?,?)";
             
             prt3=con3.prepareStatement(query_a);
             prt3.setString(1,date);
             prt3.setString(2,sub1);
             prt3.setString(3,sub2);
             prt3.setString(4,sub3);
             prt3.setString(5, reg_str);
             
             prt3.executeUpdate();
         }
       catch (SQLException ex) {
           System.out.print("done");
            // Logger.getLogger(sem1_T.class.getName()).log(Level.SEVERE, null, ex);
         }
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        jTable1.setBackground(new java.awt.Color(102, 102, 102));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Date", "elective6", "openelective3", "openelective4"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable1.setSelectionForeground(new java.awt.Color(153, 153, 153));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1032, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 805, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
          int index=jTable1.getSelectedRow();
        TableModel model=jTable1.getModel();
        String date=model.getValueAt(index,0).toString();
         String sub1=model.getValueAt(index,1).toString();
          String sub2=model.getValueAt(index,2).toString();
         String sub3=model.getValueAt(index,3).toString();
      
         
          
          sem2.setVisible(true);
          sem2.pack();
          sem2.setLocationRelativeTo(null);
          sem2.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
          
          sem2.jTextField4.setText(date);
          sem2.jTextField1.setText(sub1);
          sem2.jTextField2.setText(sub2);
          sem2.jTextField3.setText(sub3);
    }//GEN-LAST:event_jTable1MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private static javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
