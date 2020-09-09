package gui;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class convertcase extends javax.swing.JFrame {

    Case c = new Case("", "", "", "","","");
    Manger m = new Manger("", "", "", "", "");
    public convertcase() throws Exception {
        initComponents();
        c.LoadFromFile();
        for(int i =0 ; i<c.Cases.size();i++)
        {
            if(c.Cases.get(i).Indecator == 0)
                jComboBox1.addItem(c.Cases.get(i).Name);
        }
        
        m.Mangers();
        for(int i =0 ; i<m.Mangers.size();i++)
        {
            jComboBox3.addItem(m.Mangers.get(i).UserName);
        }
        
        jTextField1.setEditable(false);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton2 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jComboBox3 = new javax.swing.JComboBox();
        jTextField1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Convert Case");
        getContentPane().setLayout(null);

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 51, 51));
        jButton2.setText("Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(1110, 20, 150, 90);

        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox1);
        jComboBox1.setBounds(390, 260, 330, 22);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setText("Case Name :");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(190, 260, 160, 29);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setText("Convert To :");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(190, 430, 160, 29);

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton1.setText("Convert");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(460, 590, 170, 90);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Convert From :");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(160, 350, 190, 30);

        getContentPane().add(jComboBox3);
        jComboBox3.setBounds(390, 440, 330, 22);

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField1);
        jTextField1.setBounds(390, 360, 330, 22);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("                    Time:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(140, 490, 170, 16);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText("Date:");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(240, 540, 170, 16);
        getContentPane().add(jTextField2);
        jTextField2.setBounds(380, 490, 360, 22);
        getContentPane().add(jTextField3);
        jTextField3.setBounds(380, 540, 360, 22);

        jLabel5.setIcon(new javax.swing.ImageIcon("C:\\Users\\mina ossama\\Documents\\NetBeansProjects\\gui\\end.jpeg")); // NOI18N
        getContentPane().add(jLabel5);
        jLabel5.setBounds(0, 0, 1280, 850);

        setSize(new java.awt.Dimension(1303, 897));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        manager f = null;
        try {
            f = new manager();
        } catch (Exception ex) {
            Logger.getLogger(deletemanager.class.getName()).log(Level.SEVERE, null, ex);
        }
        f.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        try {
            
            c.AddOrEditTransaction(jComboBox1.getSelectedItem().toString(),jTextField1.getText(),jComboBox3.getSelectedItem().toString(),jTextField2.getText(),jTextField3.getText());
        } catch (Exception ex) {
            Logger.getLogger(addtrans.class.getName()).log(Level.SEVERE, null, ex);
        }
        for(int i = 0 ;i<c.Cases.size();i++)
            {
                if(jComboBox1.getSelectedItem().toString()== c.Cases.get(i).Name)
                {
                    jTextField1.setText(c.Cases.get(i).CaseOwner);
                }
            }
        JOptionPane.showMessageDialog(this, "Added Sucssfully");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
        for(int i = 0 ;i<c.Cases.size();i++)
            {
                if(jComboBox1.getSelectedItem().toString()== c.Cases.get(i).Name)
                {
                    jTextField1.setText(c.Cases.get(i).CaseOwner);
                }
            }
    }//GEN-LAST:event_jComboBox1ActionPerformed

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
            java.util.logging.Logger.getLogger(convertcase.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(convertcase.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(convertcase.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(convertcase.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new convertcase().setVisible(true);
                } catch (Exception ex) {
                    Logger.getLogger(convertcase.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JComboBox jComboBox3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables
}
