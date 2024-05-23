/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package layer;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Image;
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
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PiePlot;
import org.jfree.data.general.DefaultPieDataset;

/**
 *
 * @author Abhishek
 */


public class panel4 extends javax.swing.JPanel {

    /**
     * Creates new form panel4
     */
     private DefaultPieDataset piedata;
    private JFreeChart piecharte;
    private PiePlot pieplot;
    private ChartPanel piepanel;
    PreparedStatement prt ,pts_sem;
    Connection con,con_sem;
    ResultSet rs,rs_sem;
    String reg_str,semm,query_sem,query1;
    double m1=0,e2=0,b3=0,c4=0,m5=0,p6=0,p7=0,b8=0,e9=0,m10=0,o11=0,d12=0,d13=0,b14=0,p15=0,m16=0,d17=0,o18=0,i19=0,u20=0,m21=0,d22=0,a23=0,e24=0,c25=0,a26=0,c27=0,c28=0,e29=0,e30=0,o31=0,e32=0,e33=0,o34=0,e35=0,o36=0,o37=0;
   
    public panel4(String reg_ob) throws SQLException, IOException {
        initComponents();
        try {
             piedata =new DefaultPieDataset();
             BufferedImage bi =ImageIO.read(new File("C:\\Users\\Abhishek\\Downloads\\Using-Milestones-to-Monitor-Progress.jpg"));
            Image img=bi.getScaledInstance(197,162,Image.SCALE_SMOOTH);
            ImageIcon mi=new ImageIcon(img);
            jLabel1.setIcon(mi);
             //showPieChart();
            reg_str=reg_ob;
            Class.forName("com.mysql.jdbc.Driver");
         con_sem=con=DriverManager.getConnection("jdbc:mysql://localhost:3306/college","root","root");
              query_sem="select sem from signup where registration=?";
               pts_sem=con_sem.prepareStatement(query_sem);
                pts_sem.setString(1,reg_str);
                rs_sem=pts_sem.executeQuery();
                if(rs_sem.next())
                semm=rs_sem.getString("sem");
                 switch(semm)
                {
                    case "1":
                             query1="Select math,English,bee,chemistry from progress where registration=?";
                             prt=con.prepareStatement(query1); 
                              prt.setString(1,reg_str);
                              rs=prt.executeQuery();
                               while(rs.next())
                               {
                                  m1+=Integer.parseInt(rs.getString("math"));
                                   e2+=Integer.parseInt(rs.getString("English"));
                                   b3+=Integer.parseInt(rs.getString("bee"));
                                     c4+=Integer.parseInt(rs.getString("chemistry"));
                               } 
                         piedata.setValue("Mathe 1",m1);
                         piedata.setValue("English",e2);
                         piedata.setValue("Basic Electric Engineering",b3);
                         piedata.setValue("Chemishry",c4);
                         showPieChart();
                               
                    break;
                    case "2":
                                query1="Select math2,phy,PPS,Bio,EGD from progress where registration=?";
                                 prt=con.prepareStatement(query1);
                                 prt.setString(1,reg_str);
                                   rs=prt.executeQuery();
                               while(rs.next())
                               {
                                  m5+=Integer.parseInt(rs.getString("math2"));
                                   p6+=Integer.parseInt(rs.getString("phy"));
                                   p7+=Integer.parseInt(rs.getString("PPS"));
                                     b8+=Integer.parseInt(rs.getString("Bio"));
                                   e9+=Integer.parseInt(rs.getString("EGD"));
                               } 
                         piedata.setValue("Math 2",m5);
                         piedata.setValue("SemiConductor Physics",p6);
                         piedata.setValue("PPS",p7);
                         piedata.setValue("Biology",b8);
                         piedata.setValue("EGD",e9);
                         showPieChart();
                        break;
                    case "3":
                              query1="Select math3,OOPS,DSA,DE,BSI,PPL from progress where registration=?";
                               prt=con.prepareStatement(query1);
                               prt.setString(1,reg_str);
                                 rs=prt.executeQuery();
                               while(rs.next())
                               {
                                  m10+=Integer.parseInt(rs.getString("math3"));
                                   o11+=Integer.parseInt(rs.getString("OOPS"));
                                   d12+=Integer.parseInt(rs.getString("DSA"));
                                     d13+=Integer.parseInt(rs.getString("DE"));
                                    b14+=Integer.parseInt(rs.getString("BIS"));
                                     p15+=Integer.parseInt(rs.getString("PPL"));
                               } 
                         piedata.setValue("Mathe 3",m10);
                         piedata.setValue("OOPS",o11);
                         piedata.setValue("DSA",d12);
                         piedata.setValue("DE",d13);
                         piedata.setValue("BIS",b14);
                         piedata.setValue("PPL",p15);
                         showPieChart();
                        break;
                    case "4":
                                query1="Select math4,DAA,OS,ITM,UHV from progress  where registration=?";
                                 prt=con.prepareStatement(query1);
                                 prt.setString(1,reg_str);
                                   rs=prt.executeQuery();
                               while(rs.next())
                               {
                                  m16+=Integer.parseInt(rs.getString("math4"));
                                   d17+=Integer.parseInt(rs.getString("DAA"));
                                   o18+=Integer.parseInt(rs.getString("OS"));
                                     i19+=Integer.parseInt(rs.getString("ITM"));
                                   u20+=Integer.parseInt(rs.getString("UHV"));
                               } 
                         piedata.setValue("Mathe 4",m16);
                         piedata.setValue("DAA",d17);
                         piedata.setValue("OS",o18);
                         piedata.setValue("ITM",i19);
                         piedata.setValue("UHV",u20);
                         showPieChart();
                        break;
                    case "5":
                                 query1="Select micro,DBMS,automata,EIM,COA,AA from progress  where registration=?";
                                  prt=con.prepareStatement(query1);
                                  prt.setString(1,reg_str);
                                    rs=prt.executeQuery();
                               while(rs.next())
                               {
                                  m21+=Integer.parseInt(rs.getString("mico"));
                                   d22+=Integer.parseInt(rs.getString("DBMS"));
                                   a23+=Integer.parseInt(rs.getString("automata"));
                                     e24+=Integer.parseInt(rs.getString("EIM"));
                                  c25+=Integer.parseInt(rs.getString("COA"));
                                  a26+=Integer.parseInt(rs.getString("AA"));
                               } 
                         piedata.setValue("Microprocessor",m21);
                         piedata.setValue("DBMS",d22);
                         piedata.setValue("Autometa",a23);
                         piedata.setValue("EIM",e24);
                         piedata.setValue("COA",c25);
                         piedata.setValue("AA",a26);
                         showPieChart();
                        break;
                    case "6":
                                query1="Select CD,CN,elective2,elective3,openelective1 from progress where registration=?";
                                 prt=con.prepareStatement(query1); 
                                 prt.setString(1,reg_str);
                                   rs=prt.executeQuery();
                               while(rs.next())
                               {
                                  c27+=Integer.parseInt(rs.getString("CD"));
                                   c28+=Integer.parseInt(rs.getString("CN"));
                                   e29+=Integer.parseInt(rs.getString("elective2"));
                                     e30+=Integer.parseInt(rs.getString("elective3"));
                                   o31+=Integer.parseInt(rs.getString("openelective1"));
                               } 
                         piedata.setValue("CD",c27);
                         piedata.setValue("CN",c28);
                         piedata.setValue("Elective2",e29);
                         piedata.setValue("Elective3",e30);
                         piedata.setValue("openelective1",o31);
                         showPieChart();
                        break;
                    case "7":
                                query1="Select elective4,elective5,openelective2 from progress where registration=?";
                                 prt=con.prepareStatement(query1);
                                 prt.setString(1,reg_str);
                                   rs=prt.executeQuery();
                               while(rs.next())
                               {
                                  e32+=Integer.parseInt(rs.getString("elective4"));
                                   e33+=Integer.parseInt(rs.getString("elective5"));
                                   o34+=Integer.parseInt(rs.getString("openelective2"));
                                     
                               } 
                         piedata.setValue("elective4",e32);
                         piedata.setValue("elective5",e33);
                         piedata.setValue("Openelective2",o34);
                        
                         showPieChart();
                        break;
                    case "8":
                                query1="Select elective6,openelective3,openelective4 from progress where registration=?";
                                 prt=con.prepareStatement(query1);
                                 prt.setString(1,reg_str);
                                   rs=prt.executeQuery();
                               while(rs.next())
                               {
                                  e35+=Integer.parseInt(rs.getString("elective6"));
                                   o36+=Integer.parseInt(rs.getString("openelective3"));
                                   o37+=Integer.parseInt(rs.getString("openelective4"));
                                    
                               } 
                         piedata.setValue("elective6",e35);
                         piedata.setValue("openelective3",o36);
                         piedata.setValue("openelective4",o37);
                         
                         showPieChart();
                        break;
                        
                        
                }
            query1="Select math,English,bee,chemistry from progress where registration=?";
            prt=con.prepareStatement(query1);
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(panel4.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void showPieChart()
    {
       
       
        piecharte =ChartFactory.createPieChart3D("PROGRESS REPORT", piedata,true,true,true);
      //  piecharte.setBackgroundPaint(Color.BLACK);
        pieplot=(PiePlot) piecharte.getPlot();
        pieplot.setBackgroundPaint(Color.DARK_GRAY);
        piepanel=new ChartPanel(piecharte);
        jPanel1.removeAll();
        
        jPanel1.add(piepanel,BorderLayout.CENTER);
        piepanel.validate();
       
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
        jPanel1 = new javax.swing.JPanel();

        setBackground(new java.awt.Color(102, 102, 102));

        jPanel1.setLayout(new java.awt.BorderLayout());

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(955, Short.MAX_VALUE))
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 626, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
