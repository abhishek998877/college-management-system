/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package layer;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.WindowConstants;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author Abhishek
 */
public class sem1_T extends javax.swing.JPanel {

    /**
     * Creates new form sem1
     */  Connection con;
  static PreparedStatement prt2,prt3;
  static Connection con2,con3;
  static ResultSet rs2,rs3;
  static String reg_str;
          PreparedStatement prt;
    ResultSet rs;
    String query;
   
    sem1_u sem1;
    public sem1_T(String reg_ob) {
        initComponents();
        try
        {   reg_str=reg_ob;
            sem1=new sem1_u();
             Class.forName("com.mysql.jdbc.Driver");
          con3=con2=con=DriverManager.getConnection("jdbc:mysql://localhost:3306/college","root","root");
           DefaultTableModel jt=(DefaultTableModel) jTable1.getModel();
               query="Select Date,math,English,bee,chemistry from subject where registration=?";
           prt=con.prepareStatement(query);
           prt.setString(1,reg_ob);
           rs=prt.executeQuery();
             while(rs.next())
           {
                String dta[]={rs.getString("Date"),rs.getString("math"),rs.getString("bee"),rs.getString("chemistry"),rs.getString("English")};
                 jt.addRow(dta);
           }
        }
        catch(ClassNotFoundException | SQLException ae)
        {
            System.out.print(ae);
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
                "Date", "Math", "BEE", "Chemistry", "English"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
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

    public static void update(Object[] data)
    {
        DefaultTableModel tbm=(DefaultTableModel) jTable1.getModel();
        if(jTable1.getSelectedColumnCount()==1)
        {
           
            tbm.setValueAt(data[0],jTable1.getSelectedRow(),0);
            tbm.setValueAt(data[1],jTable1.getSelectedRow(),1);
            tbm.setValueAt(data[2],jTable1.getSelectedRow(),2);
            tbm.setValueAt(data[3],jTable1.getSelectedRow(),3);
            tbm.setValueAt(data[4],jTable1.getSelectedRow(),4);
            String date=data[0].toString();
         String sub1=data[1].toString();
          String sub2=data[2].toString();
         String sub3=data[3].toString();
          String sub4=data[4].toString();
            String query_u="update subject set Date='"+date+"',math='"+sub1+"',English='"+sub2+"',bee='"+sub3+"',chemistry='"+sub4+"'  where registration=?";
            try {
                prt2=con2.prepareStatement(query_u);
                prt2.setString(1,reg_str);
                prt2.executeUpdate();
                
            } catch (SQLException ex) {
                Logger.getLogger(sem1_T.class.getName()).log(Level.SEVERE, null, ex);
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
             String query_a="insert into subject(Date,math,English,bee,chemistry,registration) values('"+data[0].toString()+"','"+data[1].toString()+"','"+data[2].toString()+"','"+data[3].toString()+"','"+data[4].toString()+"','"+reg_str+"')";
             prt3=con3.prepareStatement(query_a);
             prt3.executeUpdate();
         } catch (SQLException ex) {
             Logger.getLogger(sem1_T.class.getName()).log(Level.SEVERE, null, ex);
         }
    }
    
    
    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        int index=jTable1.getSelectedRow();
        TableModel model=jTable1.getModel();
        String date=model.getValueAt(index,0).toString();
         String sub1=model.getValueAt(index,1).toString();
          String sub2=model.getValueAt(index,2).toString();
         String sub3=model.getValueAt(index,3).toString();
          String sub4=model.getValueAt(index,4).toString();
          sem1.setVisible(true);
          sem1.pack();
          sem1.setLocationRelativeTo(null);
          sem1.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
          
          sem1.jTextField5.setText(date);
          sem1.jTextField1.setText(sub1);
          sem1.jTextField2.setText(sub2);
          sem1.jTextField3.setText(sub3);
          sem1.jTextField4.setText(sub4);
        
    }//GEN-LAST:event_jTable1MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private static javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
