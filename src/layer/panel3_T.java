/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package layer;

import java.awt.Desktop;
import java.awt.Dimension;
import java.awt.HeadlessException;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;
import javax.swing.table.TableModel;

/**
 *
 * @author Abhishek
 */
public class panel3_T extends javax.swing.JPanel {
   
    /**
     * Creates new form panel3
     */
    public panel3_T() {
        try {
            initComponents();
            DefaultTableModel model1 =new DefaultTableModel();
            model1.addColumn("SEM1");
            model1.addColumn("SEM2");
            BufferedImage bio=ImageIO.read(new File("C:\\Users\\Abhishek\\Downloads\\tttttt.jpg"));
            Image imo=bio.getScaledInstance(1600,990,Image.SCALE_SMOOTH);
            ImageIcon mio=new ImageIcon(imo);
            jLabel1.setIcon(mio);
        } catch (IOException ex) {
            Logger.getLogger(panel3_T.class.getName()).log(Level.SEVERE, null, ex);
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
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(102, 102, 102));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Abhishek\\Downloads\\zz.jpeg")); // NOI18N
        jButton1.setText("jButton1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 210, 240, 210));

        jButton2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Abhishek\\Downloads\\Pyq.jpeg")); // NOI18N
        jButton2.setText("jButton2");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 220, 230, 200));

        jButton3.setIcon(new javax.swing.ImageIcon("C:\\Users\\Abhishek\\Downloads\\images.jpeg")); // NOI18N
        jButton3.setText("jButton3");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 470, 240, 200));
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -2, 1453, 830));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        try{
//            File file =new File("https://drive.google.com/drive/folders/117rCdd012batCdoDLz1Ihu08xe7AZbf1?usp=sharing");
            
                if(Desktop.isDesktopSupported())
                {
                    try {
                        Desktop.getDesktop().browse(new URL("https://drive.google.com/drive/shared-with-me").toURI());
                    } catch (IOException | URISyntaxException ex) {
                        Logger.getLogger(panel3.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                else
                {
                     JOptionPane.showMessageDialog(this,"Wrong Registration Id","Enter Correct Registration Id",JOptionPane.INFORMATION_MESSAGE);
                }
            
        }
        catch(HeadlessException e)
        {
            System.out.println(e);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
         try{
//            File file =new File("https://drive.google.com/drive/folders/117rCdd012batCdoDLz1Ihu08xe7AZbf1?usp=sharing");
            
                if(Desktop.isDesktopSupported())
                {
                    try {
                        Desktop.getDesktop().browse(new URL("https://drive.google.com/drive/shared-with-me").toURI());
                    } catch (IOException | URISyntaxException ex) {
                        Logger.getLogger(panel3.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                else
                {
                     JOptionPane.showMessageDialog(this,"Wrong Registration Id","Enter Correct Registration Id",JOptionPane.INFORMATION_MESSAGE);
                }
            
        }
        catch(HeadlessException e)
        {
            System.out.println(e);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
         try{
//            File file =new File("https://drive.google.com/drive/folders/117rCdd012batCdoDLz1Ihu08xe7AZbf1?usp=sharing");
            
                if(Desktop.isDesktopSupported())
                {
                    try {
                        Desktop.getDesktop().browse(new URL("https://drive.google.com/drive/shared-with-me").toURI());
                    } catch (IOException | URISyntaxException ex) {
                        Logger.getLogger(panel3.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                else
                {
                     JOptionPane.showMessageDialog(this,"Wrong Registration Id","Enter Correct Registration Id",JOptionPane.INFORMATION_MESSAGE);
                }
            
        }
        catch(HeadlessException e)
        {
            System.out.println(e);
        }
    }//GEN-LAST:event_jButton3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
