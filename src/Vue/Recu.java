/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vue;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ASUS
 */
public class Recu extends javax.swing.JFrame {

    /**
     * Creates new form Recus
     */
    public Recu() {
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

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        button1 = new java.awt.Button();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        button3 = new java.awt.Button();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtcmd = new javax.swing.JTextArea();
        navbar1 = new javax.swing.JPanel();
        home = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(20, 49, 9));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(235, 222, 212));
        jPanel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 22)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(20, 49, 9));
        jLabel2.setText("avec succès ! ");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(111, 78, 253, -1));

        jLabel4.setBackground(new java.awt.Color(69, 98, 78));
        jLabel4.setForeground(new java.awt.Color(69, 98, 78));
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(341, 232, -1, -1));

        button1.setActionCommand("Je commande");
        button1.setBackground(new java.awt.Color(20, 49, 9));
        button1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        button1.setForeground(new java.awt.Color(255, 255, 255));
        button1.setLabel("Afficher le reçu ");
        button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button1ActionPerformed(evt);
            }
        });
        jPanel2.add(button1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 269, 189, 36));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 22)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(20, 49, 9));
        jLabel3.setText("Votre commande a été effectué ");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(13, 44, -1, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(69, 98, 78));
        jLabel1.setText("Merci pour votre confiance , on espére vous revoir ");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 134, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(69, 98, 78));
        jLabel5.setText("très vite !");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(152, 155, -1, -1));

        button3.setActionCommand("Je commande");
        button3.setBackground(new java.awt.Color(20, 49, 9));
        button3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        button3.setForeground(new java.awt.Color(255, 255, 255));
        button3.setLabel("Telecharger le reçu ");
        button3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button3ActionPerformed(evt);
            }
        });
        jPanel2.add(button3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 328, 189, 36));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, 370, 400));

        txtcmd.setColumns(20);
        txtcmd.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        txtcmd.setRows(5);
        jScrollPane1.setViewportView(txtcmd);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 70, 360, 370));

        navbar1.setBackground(new java.awt.Color(227, 202, 171));
        navbar1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        home.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logo-vertmin.png"))); // NOI18N
        home.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                homeMouseClicked(evt);
            }
        });
        navbar1.add(home, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 20, 94, -1));

        jPanel1.add(navbar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 880, 60));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 534, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button1ActionPerformed
        float total = Float.parseFloat(Panier.txtprix.getText());
        DefaultTableModel dtm = new DefaultTableModel();
        dtm = (DefaultTableModel) Panier.tabpanier.getModel();
        txtcmd.setText(txtcmd.getText() + "\t   Reçu de commande \n");
        txtcmd.setText(txtcmd.getText() + "\t ______________________________ \n");
        txtcmd.setText(txtcmd.getText() + " Nom Revue" + "\t\t" + "Prix" + "\n");
        txtcmd.setText(txtcmd.getText() + "\n");

        for (int i = 0; i < dtm.getRowCount(); i++) {
            String nomrevue = (String) dtm.getValueAt(i, 0);
            txtcmd.setText("\t\t" + txtcmd.getText() + nomrevue + "\t " + dtm.getValueAt(i, 1) + "\t\n");
        }
        txtcmd.setText(txtcmd.getText() + "+ Prix Totale" + total + "\n");
        txtcmd.setText(txtcmd.getText() + "\n");
        txtcmd.setText(txtcmd.getText() + "\n");
        txtcmd.setText(txtcmd.getText() + "\n");
        txtcmd.setText(txtcmd.getText() + "\n");
        txtcmd.setText(txtcmd.getText() + "\n");
        txtcmd.setText(txtcmd.getText() + "\n");
        txtcmd.setText(txtcmd.getText() + "\n");
        txtcmd.setText(txtcmd.getText() + "\t______________________________ \n");
        txtcmd.setText(txtcmd.getText() + "\tMerci pour votre confiance et a bientot !\n");


    }//GEN-LAST:event_button1ActionPerformed

    private void button3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button3ActionPerformed
        try {
            txtcmd.print();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_button3ActionPerformed

    private void homeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeMouseClicked
        Lecteur login = new Lecteur();
        login.setVisible(true);
           this.setVisible(false);
        login.pack();
        login.setLocationRelativeTo(null);
    }//GEN-LAST:event_homeMouseClicked

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
            java.util.logging.Logger.getLogger(Recu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Recu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Recu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Recu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Recu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button button1;
    private java.awt.Button button3;
    private javax.swing.JLabel home;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel navbar1;
    private javax.swing.JTextArea txtcmd;
    // End of variables declaration//GEN-END:variables
}
