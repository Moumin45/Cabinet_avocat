/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semaine3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Random;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author JBDEV95
 */
public class Manager extends javax.swing.JFrame {

    Connection con;
    PreparedStatement pst;
    ResultSet rs;

    public Manager() {
        initComponents();
        Table();
    }
    String test;

    Manager(String mana) {
        initComponents();
        this.test = mana;
        txtmanager.setText("Bienvenue " + mana);
        Table();
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
  jPanel3 = new javax.swing.JPanel();
  jToolBar1 = new javax.swing.JToolBar();
  jButton1 = new javax.swing.JButton();
  jButton2 = new javax.swing.JButton();
  jButton4 = new javax.swing.JButton();
  txtmanager = new javax.swing.JLabel();
  jLabel1 = new javax.swing.JLabel();
  jLabel6 = new javax.swing.JLabel();
  pnprincipale = new javax.swing.JPanel();
  pnacceuil = new javax.swing.JPanel();
  jLabel12 = new javax.swing.JLabel();
  jLabel17 = new javax.swing.JLabel();
  jLabel18 = new javax.swing.JLabel();
  jLabel13 = new javax.swing.JLabel();
  panagenda = new javax.swing.JPanel();
  jPanel5 = new javax.swing.JPanel();
  txtcode = new javax.swing.JTextField();
  jLabel3 = new javax.swing.JLabel();
  txtnom = new javax.swing.JTextField();
  jLabel4 = new javax.swing.JLabel();
  jLabel5 = new javax.swing.JLabel();
  txtprenom = new javax.swing.JTextField();
  jLabel7 = new javax.swing.JLabel();
  txtadresse = new javax.swing.JTextField();
  txtlogin = new javax.swing.JTextField();
  txtpassword = new javax.swing.JTextField();
  txttype = new javax.swing.JComboBox<>();
  jButton5 = new javax.swing.JButton();
  jButton6 = new javax.swing.JButton();
  jButton7 = new javax.swing.JButton();
  jButton8 = new javax.swing.JButton();
  jLabel8 = new javax.swing.JLabel();
  txtgrade = new javax.swing.JTextField();
  jLabel9 = new javax.swing.JLabel();
  txtnumero = new javax.swing.JTextField();
  jLabel10 = new javax.swing.JLabel();
  txtsalaire = new javax.swing.JTextField();
  jLabel11 = new javax.swing.JLabel();
  txtpaiement = new javax.swing.JComboBox<>();
  jButton9 = new javax.swing.JButton();
  jButton10 = new javax.swing.JButton();
  jScrollPane1 = new javax.swing.JScrollPane();
  jTable1 = new javax.swing.JTable();

  setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
  setUndecorated(true);

  jPanel1.setBackground(new java.awt.Color(255, 255, 255));

  jPanel2.setBackground(new java.awt.Color(204, 204, 255));
  jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

  jPanel3.setBackground(new java.awt.Color(204, 204, 255));
  jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

  jToolBar1.setBackground(new java.awt.Color(204, 204, 255));
  jToolBar1.setRollover(true);

  jButton1.setBackground(new java.awt.Color(255, 255, 255));
  jButton1.setFont(new java.awt.Font("Tw Cen MT", 0, 30)); // NOI18N
  jButton1.setText("Acceuil");
  jButton1.setFocusable(false);
  jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
  jButton1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
  jButton1.addActionListener(new java.awt.event.ActionListener() {
   public void actionPerformed(java.awt.event.ActionEvent evt) {
    jButton1ActionPerformed(evt);
   }
  });
  jToolBar1.add(jButton1);

  jButton2.setFont(new java.awt.Font("Tw Cen MT", 0, 30)); // NOI18N
  jButton2.setText("  Ajouter un personnels");
  jButton2.setFocusable(false);
  jButton2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
  jButton2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
  jButton2.addActionListener(new java.awt.event.ActionListener() {
   public void actionPerformed(java.awt.event.ActionEvent evt) {
    jButton2ActionPerformed(evt);
   }
  });
  jToolBar1.add(jButton2);

  jButton4.setBackground(new java.awt.Color(204, 204, 204));
  jButton4.setFont(new java.awt.Font("Tw Cen MT", 0, 30)); // NOI18N
  jButton4.setText("  Deconnecter");
  jButton4.setFocusable(false);
  jButton4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
  jButton4.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
  jButton4.addActionListener(new java.awt.event.ActionListener() {
   public void actionPerformed(java.awt.event.ActionEvent evt) {
    jButton4ActionPerformed(evt);
   }
  });
  jToolBar1.add(jButton4);

  txtmanager.setFont(new java.awt.Font("Tw Cen MT", 0, 24)); // NOI18N
  txtmanager.setForeground(new java.awt.Color(0, 153, 0));
  txtmanager.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
  txtmanager.setText("Manager Mohamed Farah");

  javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
  jPanel3.setLayout(jPanel3Layout);
  jPanel3Layout.setHorizontalGroup(
   jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
   .addGroup(jPanel3Layout.createSequentialGroup()
    .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 760, javax.swing.GroupLayout.PREFERRED_SIZE)
    .addGap(13, 13, 13)
    .addComponent(txtmanager, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE))
  );
  jPanel3Layout.setVerticalGroup(
   jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
   .addGroup(jPanel3Layout.createSequentialGroup()
    .addComponent(txtmanager, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
    .addGap(0, 0, Short.MAX_VALUE))
   .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
  );

  jLabel1.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 36)); // NOI18N
  jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
  jLabel1.setText("Gérer mes rendez-vous !!");

  jLabel6.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 36)); // NOI18N
  jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
  jLabel6.setText("Cabinet d'avocat");

  javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
  jPanel2.setLayout(jPanel2Layout);
  jPanel2Layout.setHorizontalGroup(
   jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
   .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1041, javax.swing.GroupLayout.PREFERRED_SIZE)
   .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 1041, javax.swing.GroupLayout.PREFERRED_SIZE)
   .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
  );
  jPanel2Layout.setVerticalGroup(
   jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
   .addGroup(jPanel2Layout.createSequentialGroup()
    .addComponent(jLabel1)
    .addGap(6, 6, 6)
    .addComponent(jLabel6)
    .addGap(6, 6, 6)
    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
  );

  pnprincipale.setBackground(new java.awt.Color(255, 255, 255));
  pnprincipale.setLayout(new java.awt.CardLayout());

  pnacceuil.setBackground(new java.awt.Color(204, 204, 255));

  jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/semaine3/image1.PNG"))); // NOI18N

  jLabel17.setFont(new java.awt.Font("Tw Cen MT", 0, 24)); // NOI18N
  jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
  jLabel17.setText("\" Tout le monde déteste l'avocat de la défenses");

  jLabel18.setFont(new java.awt.Font("Tw Cen MT", 0, 24)); // NOI18N
  jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
  jLabel18.setText("jusqu'au moment ou en a besoin \"");

  jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
  jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/semaine3/droit1.jpg"))); // NOI18N

  javax.swing.GroupLayout pnacceuilLayout = new javax.swing.GroupLayout(pnacceuil);
  pnacceuil.setLayout(pnacceuilLayout);
  pnacceuilLayout.setHorizontalGroup(
   pnacceuilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
   .addGroup(pnacceuilLayout.createSequentialGroup()
    .addContainerGap()
    .addComponent(jLabel12)
    .addGap(18, 18, 18)
    .addGroup(pnacceuilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
     .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
     .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
     .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    .addContainerGap())
  );
  pnacceuilLayout.setVerticalGroup(
   pnacceuilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
   .addGroup(pnacceuilLayout.createSequentialGroup()
    .addContainerGap()
    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
    .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
    .addContainerGap())
   .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
  );

  pnprincipale.add(pnacceuil, "card2");

  panagenda.setBackground(new java.awt.Color(204, 204, 255));

  jPanel5.setBackground(new java.awt.Color(204, 204, 255));
  jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Personnels", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tw Cen MT", 0, 24))); // NOI18N

  txtcode.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
  txtcode.setPreferredSize(new java.awt.Dimension(6, 30));

  jLabel3.setFont(new java.awt.Font("Tw Cen MT", 0, 24)); // NOI18N
  jLabel3.setText("Type");

  txtnom.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
  txtnom.setPreferredSize(new java.awt.Dimension(6, 30));

  jLabel4.setFont(new java.awt.Font("Tw Cen MT", 0, 24)); // NOI18N
  jLabel4.setText("Nom");

  jLabel5.setFont(new java.awt.Font("Tw Cen MT", 0, 24)); // NOI18N
  jLabel5.setText("Prenom");

  txtprenom.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
  txtprenom.setPreferredSize(new java.awt.Dimension(6, 30));

  jLabel7.setFont(new java.awt.Font("Tw Cen MT", 0, 24)); // NOI18N
  jLabel7.setText("Adresse");

  txtadresse.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
  txtadresse.setPreferredSize(new java.awt.Dimension(6, 30));

  txtlogin.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
  txtlogin.setPreferredSize(new java.awt.Dimension(6, 30));

  txtpassword.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
  txtpassword.setPreferredSize(new java.awt.Dimension(6, 30));

  txttype.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
  txttype.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Avocat", "Employées", "Manager" }));

  jButton5.setFont(new java.awt.Font("Tw Cen MT", 0, 20)); // NOI18N
  jButton5.setText("Login");
  jButton5.addActionListener(new java.awt.event.ActionListener() {
   public void actionPerformed(java.awt.event.ActionEvent evt) {
    jButton5ActionPerformed(evt);
   }
  });

  jButton6.setFont(new java.awt.Font("Tw Cen MT", 0, 24)); // NOI18N
  jButton6.setText("Password");
  jButton6.addActionListener(new java.awt.event.ActionListener() {
   public void actionPerformed(java.awt.event.ActionEvent evt) {
    jButton6ActionPerformed(evt);
   }
  });

  jButton7.setFont(new java.awt.Font("Tw Cen MT", 0, 20)); // NOI18N
  jButton7.setText("Cin");
  jButton7.addActionListener(new java.awt.event.ActionListener() {
   public void actionPerformed(java.awt.event.ActionEvent evt) {
    jButton7ActionPerformed(evt);
   }
  });

  jButton8.setFont(new java.awt.Font("Tw Cen MT", 0, 24)); // NOI18N
  jButton8.setText("Enregistrer");
  jButton8.addActionListener(new java.awt.event.ActionListener() {
   public void actionPerformed(java.awt.event.ActionEvent evt) {
    jButton8ActionPerformed(evt);
   }
  });

  jLabel8.setFont(new java.awt.Font("Tw Cen MT", 0, 24)); // NOI18N
  jLabel8.setText("Grade");

  txtgrade.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
  txtgrade.setPreferredSize(new java.awt.Dimension(6, 30));

  jLabel9.setFont(new java.awt.Font("Tw Cen MT", 0, 24)); // NOI18N
  jLabel9.setText("Numero");

  txtnumero.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
  txtnumero.setPreferredSize(new java.awt.Dimension(6, 30));

  jLabel10.setFont(new java.awt.Font("Tw Cen MT", 0, 24)); // NOI18N
  jLabel10.setText("Salaire");

  txtsalaire.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
  txtsalaire.setHorizontalAlignment(javax.swing.JTextField.CENTER);

  jLabel11.setFont(new java.awt.Font("Tw Cen MT", 0, 24)); // NOI18N
  jLabel11.setText("Payer");

  txtpaiement.setFont(new java.awt.Font("Tw Cen MT", 0, 24)); // NOI18N
  txtpaiement.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Jour", "Heure", "Semaine", "Moi", "Année", "Procès", "autres..." }));

  jButton9.setFont(new java.awt.Font("Tw Cen MT", 0, 24)); // NOI18N
  jButton9.setText("Modifier");
  jButton9.addActionListener(new java.awt.event.ActionListener() {
   public void actionPerformed(java.awt.event.ActionEvent evt) {
    jButton9ActionPerformed(evt);
   }
  });

  jButton10.setFont(new java.awt.Font("Tw Cen MT", 0, 24)); // NOI18N
  jButton10.setText("Supprimer");
  jButton10.addActionListener(new java.awt.event.ActionListener() {
   public void actionPerformed(java.awt.event.ActionEvent evt) {
    jButton10ActionPerformed(evt);
   }
  });

  javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
  jPanel5.setLayout(jPanel5Layout);
  jPanel5Layout.setHorizontalGroup(
   jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
   .addGroup(jPanel5Layout.createSequentialGroup()
    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
     .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
      .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
      .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
      .addComponent(txtpassword, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE))
     .addGroup(jPanel5Layout.createSequentialGroup()
      .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
       .addComponent(jButton7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
       .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
       .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
       .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
       .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
       .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 93, Short.MAX_VALUE))
      .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
      .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
       .addComponent(txtprenom, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
       .addComponent(txtadresse, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
       .addComponent(txtgrade, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
       .addComponent(txtnom, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
       .addGroup(jPanel5Layout.createSequentialGroup()
        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
         .addComponent(txtcode, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
         .addComponent(txttype, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
         .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addComponent(txtpaiement, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
         .addComponent(txtsalaire)))))
     .addGroup(jPanel5Layout.createSequentialGroup()
      .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
       .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
       .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 93, Short.MAX_VALUE))
      .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
      .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
       .addComponent(txtnumero, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
       .addComponent(txtlogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
    .addContainerGap())
   .addGroup(jPanel5Layout.createSequentialGroup()
    .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
    .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
    .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
  );
  jPanel5Layout.setVerticalGroup(
   jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
   .addGroup(jPanel5Layout.createSequentialGroup()
    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
     .addGroup(javax.swing.GroupLayout.Alignment.CENTER, jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
      .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
      .addComponent(txtpaiement, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
     .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
      .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
      .addComponent(txtcode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
    .addGap(7, 7, 7)
    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
     .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
     .addGroup(jPanel5Layout.createSequentialGroup()
      .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
       .addComponent(txttype, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
       .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
      .addGap(1, 1, 1))
     .addComponent(txtsalaire))
    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
     .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
     .addComponent(txtnom, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
     .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
     .addComponent(txtprenom, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
     .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
     .addComponent(txtadresse, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
     .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
     .addComponent(txtgrade, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
     .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
     .addComponent(txtnumero, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 218, Short.MAX_VALUE)
    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
     .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
     .addComponent(txtlogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
    .addGap(11, 11, 11)
    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
     .addComponent(txtpassword, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
     .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
     .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
     .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
     .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
  );

  jTable1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
  jTable1.setModel(new javax.swing.table.DefaultTableModel(
   new Object [][] {
    {null, null, null, null},
    {null, null, null, null},
    {null, null, null, null},
    {null, null, null, null}
   },
   new String [] {
    "Title 1", "Title 2", "Title 3", "Title 4"
   }
  ));
  jTable1.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
  jTable1.setRowHeight(20);
  jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
   public void mouseReleased(java.awt.event.MouseEvent evt) {
    jTable1MouseReleased(evt);
   }
  });
  jScrollPane1.setViewportView(jTable1);

  javax.swing.GroupLayout panagendaLayout = new javax.swing.GroupLayout(panagenda);
  panagenda.setLayout(panagendaLayout);
  panagendaLayout.setHorizontalGroup(
   panagendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
   .addGroup(panagendaLayout.createSequentialGroup()
    .addContainerGap()
    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 538, Short.MAX_VALUE)
    .addContainerGap())
  );
  panagendaLayout.setVerticalGroup(
   panagendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
   .addGroup(panagendaLayout.createSequentialGroup()
    .addContainerGap()
    .addGroup(panagendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
     .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
     .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
    .addContainerGap())
  );

  pnprincipale.add(panagenda, "card3");

  javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
  jPanel1.setLayout(jPanel1Layout);
  jPanel1Layout.setHorizontalGroup(
   jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
   .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
   .addComponent(pnprincipale, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
  );
  jPanel1Layout.setVerticalGroup(
   jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
   .addGroup(jPanel1Layout.createSequentialGroup()
    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
    .addComponent(pnprincipale, javax.swing.GroupLayout.DEFAULT_SIZE, 638, Short.MAX_VALUE))
  );

  javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
  getContentPane().setLayout(layout);
  layout.setHorizontalGroup(
   layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
   .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
  );
  layout.setVerticalGroup(
   layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
   .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
  );

  setSize(new java.awt.Dimension(1045, 595));
  setLocationRelativeTo(null);
 }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        pnprincipale.removeAll();
        pnprincipale.repaint();
        pnprincipale.revalidate();

        pnprincipale.add(panagenda);
        pnprincipale.repaint();
        pnprincipale.revalidate();

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        super.dispose();
        Meconnecter meconnecter = new Meconnecter();
        meconnecter.setVisible(true);

    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        pnprincipale.removeAll();
        pnprincipale.repaint();
        pnprincipale.revalidate();

        pnprincipale.add(pnacceuil);
        pnprincipale.repaint();
        pnprincipale.revalidate();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        String nom = txtprenom.getText();
        String cin = txtcode.getText();
        txtlogin.setText(nom + cin);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        int max = 100;
        int min = 1;

        Random random = new Random();
        int show = min + random.nextInt(max);
        txtcode.setText(String.valueOf(show));

    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        int max = 1000;
        int min = 1;

        Random random = new Random();
        int show = min + random.nextInt(max);
        txtpassword.setText(String.valueOf(show));
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        try {
            Connect();
            pst = con.prepareStatement("insert into login (code, type,paiement, salaire, nom, prenom, adresse,grade, numero, nom_utilisateur,"
                    + "mot_de_passe) values(?,?,?,?,?,?,?,?,?,?,?)");
            pst.setString(1, txtcode.getText());
            pst.setString(2, txttype.getSelectedItem().toString());
            pst.setString(3, txtpaiement.getSelectedItem().toString());
            pst.setString(4, txtsalaire.getText());
            pst.setString(5, txtnom.getText());
            pst.setString(6, txtprenom.getText());
            pst.setString(7, txtadresse.getText());
            pst.setString(8, txtgrade.getText());
            pst.setString(9, txtnumero.getText());
            pst.setString(10, txtlogin.getText());
            pst.setString(11, txtpassword.getText());
            pst.executeUpdate();
            con.close();
            JOptionPane.showMessageDialog(null, txttype.getSelectedItem().toString() + " Ajouter");
            Table();
            Actualiser();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            e.printStackTrace();

        }
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        try {
            Connect();
            pst = con.prepareStatement("update login set type=?,paiement=?, salaire=?, nom=?, prenom=?, adresse=?,grade=?, numero=?, nom_utilisateur=?,"
                    + "mot_de_passe=? where code=?");

            pst.setString(1, txttype.getSelectedItem().toString());
            pst.setString(2, txtpaiement.getSelectedItem().toString());
            pst.setString(3, txtsalaire.getText());
            pst.setString(4, txtnom.getText());
            pst.setString(5, txtprenom.getText());
            pst.setString(6, txtadresse.getText());
            pst.setString(7, txtgrade.getText());
            pst.setString(8, txtnumero.getText());
            pst.setString(9, txtlogin.getText());
            pst.setString(10, txtpassword.getText());
            pst.setString(11, txtcode.getText());
            pst.executeUpdate();
            con.close();
            JOptionPane.showMessageDialog(null, txttype.getSelectedItem().toString() + " Modifier");
            Table();
            Actualiser();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            e.printStackTrace();

        }
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        try {
            Connect();
            pst = con.prepareStatement("delete  from login where code=?");
            pst.setString(1, txtcode.getText());
            pst.executeUpdate();
            pst.close();
            con.close();
            
            JOptionPane.showMessageDialog(null, txttype.getSelectedItem().toString() + " Supprimer");
            Table();
            Actualiser();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            e.printStackTrace();

        }
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jTable1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseReleased
        int selectioner = jTable1.getSelectedRow();
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        txtcode.setText(model.getValueAt(selectioner, 0).toString());
        txttype.setSelectedItem(model.getValueAt(selectioner, 1).toString());
        txtpaiement.setSelectedItem(model.getValueAt(selectioner, 2).toString());
        txtsalaire.setText(model.getValueAt(selectioner, 3).toString());
        txtnom.setText(model.getValueAt(selectioner, 4).toString());
        txtprenom.setText(model.getValueAt(selectioner, 5).toString());
        txtadresse.setText(model.getValueAt(selectioner, 6).toString());
        txtgrade.setText(model.getValueAt(selectioner, 7).toString());
        txtnumero.setText(model.getValueAt(selectioner, 8).toString());
        txtlogin.setText(model.getValueAt(selectioner, 9).toString());
        txtpassword.setText(model.getValueAt(selectioner, 10).toString());

    }//GEN-LAST:event_jTable1MouseReleased
    private void Actualiser() {

        txttype.setSelectedItem(null);
        txtpaiement.setSelectedItem(null);
        txtsalaire.setText("");
        txtnom.setText("");
        txtcode.setText("");
        txtprenom.setText("");
        txtadresse.setText("");
        txtgrade.setText("");
        txtnumero.setText("");
        txtlogin.setText("");
        txtpassword.setText("");
    }

    private void Table() {
        String[] patient = {"CODE", "TYPE", "PAYER", "SALAIRE", "NOM", "PRENOM", "ADRESSE", "GRADE", "NUMERO", "LOGING", "PASSWORD"};
        String[] montrer = new String[11];

        DefaultTableModel model = new DefaultTableModel(null, patient);

        String sql = "select * from login";
        try {
            Connect();
            Statement st = con.createStatement();
            rs = st.executeQuery(sql);

            while (rs.next()) {
                montrer[0] = rs.getString("code");
                montrer[1] = rs.getString("type");
                montrer[2] = rs.getString("paiement");
                montrer[3] = rs.getString("salaire");
                montrer[4] = rs.getString("nom");
                montrer[5] = rs.getString("prenom");
                montrer[6] = rs.getString("adresse");
                montrer[7] = rs.getString("grade");
                montrer[8] = rs.getString("numero");
                montrer[9] = rs.getString("nom_utilisateur");
                montrer[10] = rs.getString("mot_de_passe");

                model.addRow(montrer);
            }
            jTable1.setModel(model);
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

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
            java.util.logging.Logger.getLogger(Manager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Manager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Manager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Manager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Manager().setVisible(true);
            }
        });
    }

 // Variables declaration - do not modify//GEN-BEGIN:variables
 private javax.swing.JButton jButton1;
 private javax.swing.JButton jButton10;
 private javax.swing.JButton jButton2;
 private javax.swing.JButton jButton4;
 private javax.swing.JButton jButton5;
 private javax.swing.JButton jButton6;
 private javax.swing.JButton jButton7;
 private javax.swing.JButton jButton8;
 private javax.swing.JButton jButton9;
 private javax.swing.JLabel jLabel1;
 private javax.swing.JLabel jLabel10;
 private javax.swing.JLabel jLabel11;
 private javax.swing.JLabel jLabel12;
 private javax.swing.JLabel jLabel13;
 private javax.swing.JLabel jLabel17;
 private javax.swing.JLabel jLabel18;
 private javax.swing.JLabel jLabel3;
 private javax.swing.JLabel jLabel4;
 private javax.swing.JLabel jLabel5;
 private javax.swing.JLabel jLabel6;
 private javax.swing.JLabel jLabel7;
 private javax.swing.JLabel jLabel8;
 private javax.swing.JLabel jLabel9;
 private javax.swing.JPanel jPanel1;
 private javax.swing.JPanel jPanel2;
 private javax.swing.JPanel jPanel3;
 private javax.swing.JPanel jPanel5;
 private javax.swing.JScrollPane jScrollPane1;
 private javax.swing.JTable jTable1;
 private javax.swing.JToolBar jToolBar1;
 private javax.swing.JPanel panagenda;
 private javax.swing.JPanel pnacceuil;
 private javax.swing.JPanel pnprincipale;
 private javax.swing.JTextField txtadresse;
 private javax.swing.JTextField txtcode;
 private javax.swing.JTextField txtgrade;
 private javax.swing.JTextField txtlogin;
 private javax.swing.JLabel txtmanager;
 private javax.swing.JTextField txtnom;
 private javax.swing.JTextField txtnumero;
 private javax.swing.JComboBox<String> txtpaiement;
 private javax.swing.JTextField txtpassword;
 private javax.swing.JTextField txtprenom;
 private javax.swing.JTextField txtsalaire;
 private javax.swing.JComboBox<String> txttype;
 // End of variables declaration//GEN-END:variables
}
