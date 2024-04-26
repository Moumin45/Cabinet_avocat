
package semaine3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author JBDEV95
 */
public class Meconnecter extends javax.swing.JFrame {

    Connection con;
    PreparedStatement pst;
    ResultSet rs;

    public Meconnecter() {
        initComponents();
    }

    public void Connect() {
        try {
           Class.forName("com.mysql.cj.jdbc.Driver");
                 con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cabinet_avocat", "root", "");
            System.out.println("Connection Etablie");
        } catch (Exception e) {
            System.out.println("Erreur de connection");
            e.printStackTrace();
        }
    }

    @SuppressWarnings("unchecked")
 // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
 private void initComponents() {

  jPanel1 = new javax.swing.JPanel();
  jPanel2 = new javax.swing.JPanel();
  jLabel8 = new javax.swing.JLabel();
  jLabel1 = new javax.swing.JLabel();
  jLabel6 = new javax.swing.JLabel();
  jPanel3 = new javax.swing.JPanel();
  txtnomutilisateur = new javax.swing.JTextField();
  jLabel2 = new javax.swing.JLabel();
  jLabel3 = new javax.swing.JLabel();
  jLabel4 = new javax.swing.JLabel();
  jPanel4 = new javax.swing.JPanel();
  jLabel5 = new javax.swing.JLabel();
  jButton1 = new javax.swing.JButton();
  jButton2 = new javax.swing.JButton();
  txttype = new javax.swing.JComboBox<>();
  txtmdp = new javax.swing.JPasswordField();
  jLabel7 = new javax.swing.JLabel();

  setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
  setUndecorated(true);

  jPanel1.setBackground(new java.awt.Color(255, 255, 255));

  jPanel2.setBackground(new java.awt.Color(204, 204, 204));
  jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
  jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

  jLabel8.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 36)); // NOI18N
  jLabel8.setForeground(new java.awt.Color(255, 0, 0));
  jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
  jLabel8.setText("X");
  jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
   public void mouseClicked(java.awt.event.MouseEvent evt) {
    jLabel8MouseClicked(evt);
   }
  });
  jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(784, 0, 60, 50));

  jLabel1.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 36)); // NOI18N
  jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
  jLabel1.setText("Gérer mes rendez-vous !!");
  jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 13, 824, -1));

  jLabel6.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 36)); // NOI18N
  jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
  jLabel6.setText("Cabinet d'avocat ");
  jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 59, 824, -1));

  jPanel3.setBackground(new java.awt.Color(204, 204, 255));
  jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

  txtnomutilisateur.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

  jLabel2.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 24)); // NOI18N
  jLabel2.setText("Nom d'utilisateur");

  jLabel3.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 24)); // NOI18N
  jLabel3.setText("Type");

  jLabel4.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 24)); // NOI18N
  jLabel4.setText("Mot de passe");

  jPanel4.setBackground(new java.awt.Color(204, 204, 204));
  jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());

  jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
  jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/semaine3/login.png"))); // NOI18N

  jButton1.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 24)); // NOI18N
  jButton1.setText("Me Connecter");
  jButton1.addActionListener(new java.awt.event.ActionListener() {
   public void actionPerformed(java.awt.event.ActionEvent evt) {
    jButton1ActionPerformed(evt);
   }
  });

  jButton2.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 24)); // NOI18N
  jButton2.setText("Actualiser");

  javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
  jPanel4.setLayout(jPanel4Layout);
  jPanel4Layout.setHorizontalGroup(
   jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
   .addGroup(jPanel4Layout.createSequentialGroup()
    .addContainerGap()
    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
     .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 308, Short.MAX_VALUE)
     .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
     .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    .addContainerGap())
  );
  jPanel4Layout.setVerticalGroup(
   jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
   .addGroup(jPanel4Layout.createSequentialGroup()
    .addContainerGap()
    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
    .addContainerGap(23, Short.MAX_VALUE))
  );

  txttype.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
  txttype.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Manager", "Avocat", "Employées" }));

  txtmdp.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

  javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
  jPanel3.setLayout(jPanel3Layout);
  jPanel3Layout.setHorizontalGroup(
   jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
   .addGroup(jPanel3Layout.createSequentialGroup()
    .addContainerGap()
    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
     .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
     .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
     .addComponent(txtnomutilisateur, javax.swing.GroupLayout.Alignment.LEADING)
     .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 304, Short.MAX_VALUE)
     .addComponent(txttype, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
     .addComponent(txtmdp))
    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
    .addContainerGap())
  );
  jPanel3Layout.setVerticalGroup(
   jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
   .addGroup(jPanel3Layout.createSequentialGroup()
    .addContainerGap()
    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
     .addGroup(jPanel3Layout.createSequentialGroup()
      .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
      .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
      .addComponent(txtnomutilisateur, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
      .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
      .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
      .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
      .addComponent(txttype, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
      .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
      .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
      .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
      .addComponent(txtmdp))
     .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
    .addContainerGap(63, Short.MAX_VALUE))
  );

  jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
  jLabel7.setForeground(new java.awt.Color(255, 0, 0));
  jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
  jLabel7.setText("Copyright 2024 M.DEEV");

  javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
  jPanel1.setLayout(jPanel1Layout);
  jPanel1Layout.setHorizontalGroup(
   jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
   .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 848, Short.MAX_VALUE)
   .addGroup(jPanel1Layout.createSequentialGroup()
    .addGap(156, 156, 156)
    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 547, javax.swing.GroupLayout.PREFERRED_SIZE)
    .addContainerGap(145, Short.MAX_VALUE))
   .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
    .addGap(75, 75, 75))
  );
  jPanel1Layout.setVerticalGroup(
   jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
   .addGroup(jPanel1Layout.createSequentialGroup()
    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
    .addGap(18, 18, 18)
    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE)
    .addContainerGap())
  );

  javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
  getContentPane().setLayout(layout);
  layout.setHorizontalGroup(
   layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
   .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
  );
  layout.setVerticalGroup(
   layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
   .addGroup(layout.createSequentialGroup()
    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
    .addGap(0, 0, Short.MAX_VALUE))
  );

  setSize(new java.awt.Dimension(848, 502));
  setLocationRelativeTo(null);
 }// </editor-fold>//GEN-END:initComponents

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel8MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            
            Connect();
            pst = con.prepareStatement("select nom_utilisateur from login where nom_utilisateur=? and type=? and  mot_de_passe=? ");
            pst.setString(1, txtnomutilisateur.getText().trim());
            pst.setString(2, txttype.getSelectedItem().toString());
            pst.setString(3, txtmdp.getText());
            rs = pst.executeQuery();

            if (rs.next()) {
                if (txttype.getSelectedItem().equals("Manager")) {
                    super.dispose();
                    new Manager(txtnomutilisateur.getText()).setVisible(true);
                } else if (txttype.getSelectedItem().equals("Avocat")) {
                    super.dispose();
                    new Avocat(txtnomutilisateur.getText()).setVisible(true);
                }
                  else{
                     super.dispose();
                    new Employees(txtnomutilisateur.getText()).setVisible(true);
                }

            } else {
                JOptionPane.showMessageDialog(null, "Erreure de connexion");
            }
            con.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Meconnecter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Meconnecter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Meconnecter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Meconnecter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Meconnecter().setVisible(true);
            }
        });
    }

 // Variables declaration - do not modify//GEN-BEGIN:variables
 private javax.swing.JButton jButton1;
 private javax.swing.JButton jButton2;
 private javax.swing.JLabel jLabel1;
 private javax.swing.JLabel jLabel2;
 private javax.swing.JLabel jLabel3;
 private javax.swing.JLabel jLabel4;
 private javax.swing.JLabel jLabel5;
 private javax.swing.JLabel jLabel6;
 private javax.swing.JLabel jLabel7;
 private javax.swing.JLabel jLabel8;
 private javax.swing.JPanel jPanel1;
 private javax.swing.JPanel jPanel2;
 private javax.swing.JPanel jPanel3;
 private javax.swing.JPanel jPanel4;
 private javax.swing.JPasswordField txtmdp;
 private javax.swing.JTextField txtnomutilisateur;
 private javax.swing.JComboBox<String> txttype;
 // End of variables declaration//GEN-END:variables
}
