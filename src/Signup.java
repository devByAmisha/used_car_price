/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author hp
 */import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class Signup extends javax.swing.JFrame {
 String surl = "jdbc:mysql://localhost:3306/data";
    String suser = "root";
    String spassword = "@root123@";
    public Signup() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        id = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        namess = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        email = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        uid = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        pwd = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        Question = new javax.swing.JComboBox<>();
        Hints = new javax.swing.JTextField();
        kButton1 = new com.k33ptoo.components.KButton();
        kButton2 = new com.k33ptoo.components.KButton();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(132, 210, 226));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 102));
        jLabel1.setText("Hints");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, 80, 30));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 102, 102));
        jLabel2.setText("ID");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 80, 30));
        jPanel1.add(id, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 30, 160, 40));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 102, 102));
        jLabel3.setText("Name");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 80, 30));
        jPanel1.add(namess, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 100, 160, 40));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 102, 102));
        jLabel4.setText("Email");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 80, 30));
        jPanel1.add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 170, 160, 40));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 102, 102));
        jLabel5.setText("User Id");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 380, 80, 30));
        jPanel1.add(uid, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 370, 160, 40));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 102, 102));
        jLabel6.setText("Password");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 450, 110, 30));
        jPanel1.add(pwd, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 440, 160, 40));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 102, 102));
        jLabel7.setText("Question");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, 80, 30));

        Question.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "What is your mother's maiden name?", "What is the name of your first pet?", "What was your first car?", "What elementary school did you attend?", "What is the name of the town where you were born?", "When you were young, what did you want to be when you grew up?", "Who was your childhood hero?", "Where was your best family vacation as a kid?" }));
        jPanel1.add(Question, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 230, 160, 40));
        jPanel1.add(Hints, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 300, 160, 50));

        jPanel2.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 660, 520));

        kButton1.setText("Back");
        kButton1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        kButton1.setkEndColor(new java.awt.Color(204, 255, 255));
        kButton1.setkForeGround(new java.awt.Color(0, 102, 102));
        kButton1.setkHoverEndColor(new java.awt.Color(255, 255, 255));
        kButton1.setkHoverForeGround(new java.awt.Color(0, 102, 102));
        kButton1.setkHoverStartColor(new java.awt.Color(255, 255, 255));
        kButton1.setkStartColor(new java.awt.Color(204, 255, 255));
        kButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(kButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 450, 150, -1));

        kButton2.setText("Sign In");
        kButton2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        kButton2.setkEndColor(new java.awt.Color(204, 255, 255));
        kButton2.setkForeGround(new java.awt.Color(0, 102, 102));
        kButton2.setkHoverEndColor(new java.awt.Color(255, 255, 255));
        kButton2.setkHoverForeGround(new java.awt.Color(0, 102, 102));
        kButton2.setkHoverStartColor(new java.awt.Color(255, 255, 255));
        kButton2.setkStartColor(new java.awt.Color(204, 255, 255));
        kButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(kButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 380, 150, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 3, 36)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Register Yourself");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 10, 300, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 890, 600));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void kButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kButton2ActionPerformed
 try {
            Connection con = DriverManager.getConnection(surl,suser,spassword);
             PreparedStatement pst= con.prepareStatement("insert into signup3 values(?,?,?,?,?)");
            PreparedStatement pst1= con.prepareStatement("insert into login values(?,?)");
             JOptionPane.showMessageDialog(null, "Your Registration Is Confirmed...");  
               Login lg=new Login();
                lg.setVisible(true);
                dispose();
           //Signup Table
            pst.setString(1,id.getText());
            pst.setString(2,namess.getText());
            pst.setString(3,email.getText());
           
            pst.setString(4,Question.getSelectedItem().toString());
            pst.setString(5,Hints.getText());
         
            //login table
            pst1.setString(1,uid.getText());
            pst1.setString(2,pwd.getText());
           
            pst.executeUpdate();
            pst1.executeUpdate();
 }
        catch(Exception e)
        {
            System.err.println(e.toString());
        }        
    }//GEN-LAST:event_kButton2ActionPerformed

    private void kButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kButton1ActionPerformed
     mainpage pg=new mainpage();
     pg.show();
     dispose();
    }//GEN-LAST:event_kButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Signup().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Hints;
    private javax.swing.JComboBox<String> Question;
    private javax.swing.JTextField email;
    private javax.swing.JTextField id;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private com.k33ptoo.components.KButton kButton1;
    private com.k33ptoo.components.KButton kButton2;
    private javax.swing.JTextField namess;
    private javax.swing.JTextField pwd;
    private javax.swing.JTextField uid;
    // End of variables declaration//GEN-END:variables
}
