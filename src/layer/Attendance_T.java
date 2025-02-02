package layer;

import java.awt.Color;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Abhishek
 */
public class Attendance_T extends javax.swing.JFrame {

    /**
     * Creates new form Attendance
     */
     PreparedStatement pts_sem;
    Connection con_sem;
    ResultSet rs_sem;
    String query_sem;
    sem1_T ob1;
    sem2_T ob2;
    sem3_T ob3;
    sem4_T ob4;
    sem5_T ob5;
    sem6_T ob6;
    sem7_T ob7;
    sem8_T ob8;
    String reg_str,semm;
    sem1_u sem1;
    sem2_u sem2;
    sem3_u sem3;
    sem4_u sem4;
    sem5_u sem5;
    sem6_u sem6;
    sem7_u sem7;
     sem8_u sem8;
    
    public Attendance_T(String reg_ob) throws ClassNotFoundException {
        initComponents();
        //reg_str=reg_ob;
       sem1=new sem1_u();
       sem2=new sem2_u();
       sem3=new sem3_u();
       sem4=new sem4_u();
       sem5=new sem5_u();
       sem6=new sem6_u();
       sem7=new sem7_u();
       sem8=new sem8_u();
         BufferedImage bi;
         jLabel3.setVisible(false);
         try
         {
              //reg_str=reg_ob;
               //System.out.print(reg_str+"attendance");
        
              Class.forName("com.mysql.jdbc.Driver");
              
             
                con_sem=DriverManager.getConnection("jdbc:mysql://localhost:3306/college","root","root");
             
               
                      
         }
         catch(SQLException ae)
         {
             System.out.print(ae);
         }
        try {
            bi = ImageIO.read(new File("C:\\Users\\Abhishek\\Downloads\\download1.png"));
             Image img=bi.getScaledInstance(87,121,Image.SCALE_SMOOTH);
        ImageIcon mi=new ImageIcon(img);
        jLabel2.setIcon(mi);
        } catch (IOException ex) {
            Logger.getLogger(Attendance_T.class.getName()).log(Level.SEVERE, null, ex);
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLayeredPane1 = new javax.swing.JLayeredPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 153, 153));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Attendance Sheet");

        jTextField1.setBackground(new java.awt.Color(51, 51, 51));
        jTextField1.setForeground(new java.awt.Color(204, 204, 204));
        jTextField1.setText("Registration Number & Press Enter");
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jTextField1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField1FocusGained(evt);
            }
        });
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField1KeyPressed(evt);
            }
        });

        jLabel3.setBackground(new java.awt.Color(102, 102, 102));
        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setText("        Press Enter");

        jPanel3.setBackground(new java.awt.Color(102, 102, 102));
        jPanel3.setToolTipText("");
        jPanel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel3MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel3MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jPanel3MouseReleased(evt);
            }
        });

        jLabel4.setBackground(new java.awt.Color(0, 204, 204));
        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 204, 204));
        jLabel4.setText("Update");
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel4MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel4MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLabel4MouseReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jLabel4)
                .addContainerGap(52, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 20, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 610, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addContainerGap())
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(42, 42, 42)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 13, Short.MAX_VALUE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jLayeredPane1.setBackground(new java.awt.Color(102, 102, 102));
        jLayeredPane1.setLayout(new java.awt.CardLayout());

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 704, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        setSize(new java.awt.Dimension(1092, 906));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField1FocusGained
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jTextField1FocusGained

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyPressed
        // TODO add your handling code here:
         if(jTextField1.getText().equals("Registration Number & Press Enter"))
        {
        jTextField1.setText("");
         jLabel3.setVisible(true);
        }
        if(evt.getKeyCode()==KeyEvent.VK_ENTER)
        {
           reg_str=jTextField1.getText();
           try
           {
               query_sem="select sem from signup where registration=?";
                pts_sem=con_sem.prepareStatement(query_sem);
                pts_sem.setString(1,reg_str);
                rs_sem=pts_sem.executeQuery();
                if(rs_sem.next())
                semm=rs_sem.getString("sem");
               // System.out.print(semm+"semester");
                switch(semm)
                {
                    case "1":
                                ob1=new sem1_T(reg_str);
                                jLayeredPane1.add(ob1);
                                ob1.setVisible(true);
                                
                        break;
                    case "2":
                                ob2=new sem2_T(reg_str);
                                jLayeredPane1.add(ob2);
                                ob2.setVisible(true);
                        break;
                    case "3":
                                ob3=new sem3_T(reg_str);
                                jLayeredPane1.add(ob3);
                                ob3.setVisible(true);
                        break;
                    case "4":
                                ob4=new sem4_T(reg_str);
                                jLayeredPane1.add(ob4);
                                ob4.setVisible(true);
                        break;
                    case "5":
                                ob5=new sem5_T(reg_str);
                                jLayeredPane1.add(ob5);
                                ob5.setVisible(true);
                        break;
                    case "6":
                                ob6=new sem6_T(reg_str);
                                jLayeredPane1.add(ob6);
                                ob6.setVisible(true);
                        break;
                    case "7":
                                ob7=new sem7_T(reg_str);
                                jLayeredPane1.add(ob7);
                                ob7.setVisible(true);
                        break;
                    case "8":
                                ob8=new sem8_T(reg_str);
                                jLayeredPane1.add(ob8);
                                ob8.setVisible(true);
                        break;
                        
                        
                }
           }
           catch(SQLException ae)
           {
               System.out.print(ae);
           }
           
        }
    }//GEN-LAST:event_jTextField1KeyPressed

    private void jLabel4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseEntered
        // TODO add your handling code here:
        jLabel4.setBackground(new Color(51,51,51));
    }//GEN-LAST:event_jLabel4MouseEntered

    private void jLabel4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseExited
        // TODO add your handling code here:
        jLabel4.setBackground(new Color(102,102,102));
    }//GEN-LAST:event_jLabel4MouseExited

    private void jLabel4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MousePressed
        // TODO add your handling code here:
        jLabel4.setBackground(new Color(0,102,102));
    }//GEN-LAST:event_jLabel4MousePressed

    private void jLabel4MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseReleased
        // TODO add your handling code here:
         jLabel4.setBackground(new Color(102,102,102));
    }//GEN-LAST:event_jLabel4MouseReleased

    private void jPanel3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MouseEntered
        // TODO add your handling code here:
        jPanel3.setBackground(new Color(51,51,51));
    }//GEN-LAST:event_jPanel3MouseEntered

    private void jPanel3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MouseExited
        // TODO add your handling code here:\
        jPanel3.setBackground(new Color(102,102,102));
    }//GEN-LAST:event_jPanel3MouseExited

    private void jPanel3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MousePressed
        // TODO add your handling code here:
      
    }//GEN-LAST:event_jPanel3MousePressed

    private void jPanel3MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MouseReleased
        // TODO add your handling code here:
       jPanel3.setBackground(new Color(102,102,102));
    }//GEN-LAST:event_jPanel3MouseReleased

    private void jPanel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MouseClicked
        // TODO add your handling code here:
         jPanel3.setBackground(new Color(0,102,102));
          switch(semm)
                {
                    case "1":
                                sem1.setVisible(true);
                                sem2.setVisible(false);
                                sem3.setVisible(false);
                                sem4.setVisible(false);
                                sem5.setVisible(false);
                                sem6.setVisible(false);
                                sem7.setVisible(false);
                                sem8.setVisible(false);
                                sem1.pack();
                                sem1.setLocationRelativeTo(null);
                                sem1.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                                
                        break;
                    case "2":
                                sem2.setVisible(true);
                                 sem1.setVisible(false);
                               
                                sem3.setVisible(false);
                                sem4.setVisible(false);
                                sem5.setVisible(false);
                                sem6.setVisible(false);
                                sem7.setVisible(false);
                                sem8.setVisible(false);
                                sem2.pack();
                                sem2.setLocationRelativeTo(null);
                                sem2.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                        break;
                    case "3":
                                sem3.setVisible(true);
                                 sem1.setVisible(false);
                                sem2.setVisible(false);
                                
                                sem4.setVisible(false);
                                sem5.setVisible(false);
                                sem6.setVisible(false);
                                sem7.setVisible(false);
                                sem8.setVisible(false);
                                sem3.pack();
                                sem3.setLocationRelativeTo(null);
                                sem3.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                        break;
                    case "4":
                              sem4.setVisible(true);
                               sem1.setVisible(false);
                                sem2.setVisible(false);
                                sem3.setVisible(false);
                                
                                sem5.setVisible(false);
                                sem6.setVisible(false);
                                sem7.setVisible(false);
                                sem8.setVisible(false);
                                sem4.pack();
                                sem4.setLocationRelativeTo(null);
                                sem4.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                        break;
                    case "5":
                                sem5.setVisible(true);
                                 sem1.setVisible(false);
                                sem2.setVisible(false);
                                sem3.setVisible(false);
                                sem4.setVisible(false);
                                
                                sem6.setVisible(false);
                                sem7.setVisible(false);
                                sem8.setVisible(false);
                                sem5.pack();
                                sem5.setLocationRelativeTo(null);
                                sem5.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                        break;
                    case "6":
                                sem6.setVisible(true);
                                 sem1.setVisible(false);
                                sem2.setVisible(false);
                                sem3.setVisible(false);
                                sem4.setVisible(false);
                                sem5.setVisible(false);
                                
                                sem7.setVisible(false);
                                sem8.setVisible(false);
                                sem6.pack();
                                sem6.setLocationRelativeTo(null);
                                sem6.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                        break;
                    case "7":
                               sem7.setVisible(true);
                                sem1.setVisible(false);
                                sem2.setVisible(false);
                                sem3.setVisible(false);
                                sem4.setVisible(false);
                                sem5.setVisible(false);
                                sem6.setVisible(false);
                                
                                sem8.setVisible(false);
                                sem7.pack();
                                sem7.setLocationRelativeTo(null);
                                sem7.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                        break;
                    case "8":
                               sem8.setVisible(true);
                                sem1.setVisible(false);
                                sem2.setVisible(false);
                                sem3.setVisible(false);
                                sem4.setVisible(false);
                                sem5.setVisible(false);
                                sem6.setVisible(false);
                                sem7.setVisible(false);
                                
                                sem8.pack();
                                sem8.setLocationRelativeTo(null);
                                sem8.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                        break;
                        
                        
                }
       
    }//GEN-LAST:event_jPanel3MouseClicked

    /**
     * @param args the command line arguments
     */
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
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Attendance_T.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Attendance_T.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Attendance_T.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Attendance_T.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new Attendance().setVisible(true);
//            }
//        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
