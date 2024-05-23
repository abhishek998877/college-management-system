/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.Format;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

/**
 *
 * @author Abhishek
 */
public class panel2 extends javax.swing.JPanel {

    /**
     * Creates new form panel2
     */
    PreparedStatement pts,pts_sem;
    Connection con,con_sem;
    ResultSet rs,rs_sem;
    String query,query_sem;
    //myJFrame reg_ob;
    String reg_str;
    
    public panel2(String reg_ob) {
        
            initComponents();
            reg_str=reg_ob;
            try
            {
            //  panel2.setBounds(0,0,1269, 650);
                System.out.printf("hello");
             // reg_ob=new myJFrame();
               
           System.out.printf(reg_str);
                Class.forName("com.mysql.jdbc.Driver");
                con_sem=con=DriverManager.getConnection("jdbc:mysql://localhost:3306/college","root","root");
                query="select Name,father,mother,gender,email,phone,cours,batch,sem,DOB,address,pic,sig_pic from signup where registration=?";
                query_sem="select sem from signup where registration=?";
                pts=con.prepareStatement(query);
                pts_sem=con_sem.prepareStatement(query_sem);
                pts_sem.setString(1,reg_str);
               pts.setString(1,reg_str);
                rs=pts.executeQuery();
                rs_sem=pts_sem.executeQuery();
                while(rs.next())
                {
                    name.setText(rs.getString("Name"));
                    father.setText(rs.getString("father"));
                    mother.setText(rs.getString("mother"));
                    gender.setText(rs.getString("gender"));
                    email.setText(rs.getString("email"));
                    pho.setText(rs.getString("phone"));
                    cours.setText(rs.getString("cours"));
                    batch.setText(rs.getString("batch"));
                    sem.setText(rs.getString("sem"));
                    dob.setText(rs.getString("DOB").toString());
                    address.setText(rs.getString("address"));
                    byte[] byt=rs.getBytes("pic");  
                    ImageIcon img1=new ImageIcon(byt);
                    Image im=img1.getImage();
                    Image im2=im.getScaledInstance(177, 213,Image.SCALE_SMOOTH);
                    ImageIcon finalimg=new ImageIcon(im2);
                    pic.setIcon(finalimg);
                    
                     byte[] byt1=rs.getBytes("sig_pic");
                    
                     img1=new ImageIcon(byt1);
                     im=img1.getImage();
                     im2=im.getScaledInstance(200,190,Image.SCALE_SMOOTH);
                     finalimg=new ImageIcon(im2);
                    signpic.setIcon(finalimg);
                }
                
                
            BufferedImage bi =ImageIO.read(new File("C:\\Users\\Abhishek\\Downloads\\pzLWoy0o_400x400.jpg"));
            Image img=bi.getScaledInstance(225,175,Image.SCALE_SMOOTH);
            ImageIcon mi=new ImageIcon(img);
            jLabel1.setIcon(mi);
            bi=ImageIO.read(new File("C:\\Users\\Abhishek\\Downloads\\Jmitlogo.jpg"));
            img=bi.getScaledInstance(258,421,Image.SCALE_SMOOTH);
            mi=new ImageIcon(img);
            jLabel28.setIcon(mi);
        } catch (IOException | ClassNotFoundException | SQLException ex) {
            Logger.getLogger(panel2.class.getName()).log(Level.SEVERE, null, ex);
            System.out.print(ex);
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        name = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        father = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        mother = new javax.swing.JLabel();
        gender = new javax.swing.JLabel();
        email = new javax.swing.JLabel();
        pho = new javax.swing.JLabel();
        cours = new javax.swing.JLabel();
        batch = new javax.swing.JLabel();
        sem = new javax.swing.JLabel();
        dob = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        address = new javax.swing.JTextArea();
        pic = new javax.swing.JLabel();
        signpic = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(1269, 650));
        setLayout(null);

        jLabel1.setText("jLabel1");
        add(jLabel1);
        jLabel1.setBounds(27, 21, 231, 148);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setText("Jai Prakash Mukand Lal Innovative Engineering & Technology Institute");
        add(jLabel2);
        jLabel2.setBounds(420, 30, 870, 45);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setText("                               Computer Science Engineering");
        add(jLabel3);
        jLabel3.setBounds(430, 70, 928, 44);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 102, 102));
        jLabel4.setText("                                                jmieti, Radaur, Haryana 135133");
        add(jLabel4);
        jLabel4.setBounds(440, 120, 928, 35);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setForeground(new java.awt.Color(102, 102, 102));
        jLabel5.setText("Name");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 39, 136, -1));

        name.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        name.setForeground(new java.awt.Color(102, 102, 102));
        name.setText("jLabel6");
        jPanel1.add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 39, 301, -1));

        jLabel7.setForeground(new java.awt.Color(102, 102, 102));
        jLabel7.setText("Mother Name");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 138, 136, -1));

        father.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        father.setForeground(new java.awt.Color(102, 102, 102));
        father.setText("jLabel6");
        jPanel1.add(father, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 91, 301, -1));

        jLabel9.setForeground(new java.awt.Color(102, 102, 102));
        jLabel9.setText("Father Name");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 91, 136, -1));

        jLabel10.setForeground(new java.awt.Color(102, 102, 102));
        jLabel10.setText("Gender");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 192, 136, -1));

        jLabel11.setForeground(new java.awt.Color(102, 102, 102));
        jLabel11.setText("Email");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 244, 136, -1));

        jLabel12.setForeground(new java.awt.Color(102, 102, 102));
        jLabel12.setText("Phone no.");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 296, 136, -1));

        jLabel13.setForeground(new java.awt.Color(102, 102, 102));
        jLabel13.setText("Cours");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 351, 136, -1));

        jLabel14.setForeground(new java.awt.Color(102, 102, 102));
        jLabel14.setText("Batch");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 393, 136, -1));

        jLabel15.setForeground(new java.awt.Color(102, 102, 102));
        jLabel15.setText("Semester");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 440, 136, -1));

        jLabel16.setForeground(new java.awt.Color(102, 102, 102));
        jLabel16.setText("Date of Birth");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 484, 136, -1));

        jLabel17.setForeground(new java.awt.Color(102, 102, 102));
        jLabel17.setText("Address");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 528, 136, -1));

        mother.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        mother.setForeground(new java.awt.Color(102, 102, 102));
        mother.setText("jLabel6");
        jPanel1.add(mother, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 138, 301, -1));

        gender.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        gender.setForeground(new java.awt.Color(102, 102, 102));
        gender.setText("jLabel6");
        jPanel1.add(gender, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 192, 301, -1));

        email.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        email.setForeground(new java.awt.Color(102, 102, 102));
        email.setText("jLabel6");
        jPanel1.add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 244, 301, -1));

        pho.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        pho.setForeground(new java.awt.Color(102, 102, 102));
        pho.setText("jLabel6");
        jPanel1.add(pho, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 296, 301, -1));

        cours.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        cours.setForeground(new java.awt.Color(102, 102, 102));
        cours.setText("jLabel6");
        jPanel1.add(cours, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 351, 301, -1));

        batch.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        batch.setForeground(new java.awt.Color(102, 102, 102));
        batch.setText("jLabel6");
        jPanel1.add(batch, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 393, 301, -1));

        sem.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        sem.setForeground(new java.awt.Color(102, 102, 102));
        sem.setText("jLabel6");
        jPanel1.add(sem, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 440, 301, -1));

        dob.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        dob.setForeground(new java.awt.Color(102, 102, 102));
        dob.setText("jLabel6");
        jPanel1.add(dob, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 484, 301, -1));

        address.setBackground(new java.awt.Color(240, 240, 240));
        address.setColumns(20);
        address.setForeground(new java.awt.Color(153, 153, 153));
        address.setRows(5);
        jScrollPane1.setViewportView(address);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 528, 301, -1));
        jPanel1.add(pic, new org.netbeans.lib.awtextra.AbsoluteConstraints(1280, 60, 177, 213));
        jPanel1.add(signpic, new org.netbeans.lib.awtextra.AbsoluteConstraints(1280, 280, 170, 60));
        jPanel1.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 280, 421, 258));

        add(jPanel1);
        jPanel1.setBounds(0, 176, 1490, 803);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea address;
    private javax.swing.JLabel batch;
    private javax.swing.JLabel cours;
    private javax.swing.JLabel dob;
    private javax.swing.JLabel email;
    private javax.swing.JLabel father;
    private javax.swing.JLabel gender;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel mother;
    private javax.swing.JLabel name;
    private javax.swing.JLabel pho;
    private javax.swing.JLabel pic;
    private javax.swing.JLabel sem;
    private javax.swing.JLabel signpic;
    // End of variables declaration//GEN-END:variables
}
