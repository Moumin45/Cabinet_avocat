
package semaine3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

// Import de la classe JTextField
import javax.swing.JTextField;
import semaine3.Meconnecter;

// Vérifiez que txtdate est bien déclaré en tant que JTextField quelque part dans votre classe.
// Par exemple :


/**
 *
 * @author JBDEV95
 */
public class Avocat extends javax.swing.JFrame {

    Connection con;
    PreparedStatement pst;
    ResultSet rs;

    public Avocat() {
        initComponents();
        CoordoneAvocat();
        Table();
        TableRdv();
    }
    String test;

    Avocat(String text) {
        initComponents();

        this.test = text;
        txtavocat.setText(text);
        CoordoneAvocat();
        Table();
        TableRdv();
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

    private void CoordoneAvocat() {

        try {
            Connect();
            int i = 1;
            String sql = "select code,paiement, salaire, nom, prenom, adresse,grade, numero, mot_de_passe  from login where nom_utilisateur=?";
            pst = con.prepareStatement(sql);
            pst.setString(1, txtavocat.getText());
            rs = pst.executeQuery();

            while (rs.next()) {
                txtcode.setText(rs.getString("code"));
                txtnom.setText(rs.getString("nom"));
                txtprenom.setText(rs.getString("prenom"));
                txtgrade.setText(rs.getString("grade"));
                txtnumero.setText(rs.getString("numero"));
                txtadresse.setText(rs.getString("adresse"));
                txtsalaire.setText(rs.getString("salaire"));
                txttypesalaire.addItem(rs.getString("paiement"));
                txtpassword.setText(rs.getString("mot_de_passe"));

            }
            con.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
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
  txtavocat = new javax.swing.JLabel();
  jLabel1 = new javax.swing.JLabel();
  jLabel6 = new javax.swing.JLabel();
  pnprincipale = new javax.swing.JPanel();
  pnacceuil = new javax.swing.JPanel();
  jPanel4 = new javax.swing.JPanel();
  jLabel2 = new javax.swing.JLabel();
  txtcode = new javax.swing.JTextField();
  jLabel3 = new javax.swing.JLabel();
  txtnom = new javax.swing.JTextField();
  jLabel4 = new javax.swing.JLabel();
  txtprenom = new javax.swing.JTextField();
  jLabel5 = new javax.swing.JLabel();
  txtgrade = new javax.swing.JTextField();
  jLabel7 = new javax.swing.JLabel();
  txtnumero = new javax.swing.JTextField();
  jLabel8 = new javax.swing.JLabel();
  txtadresse = new javax.swing.JTextField();
  jLabel9 = new javax.swing.JLabel();
  txtsalaire = new javax.swing.JTextField();
  jLabel10 = new javax.swing.JLabel();
  txtpassword = new javax.swing.JTextField();
  jLabel11 = new javax.swing.JLabel();
  txttypesalaire = new javax.swing.JComboBox<>();
  jLabel12 = new javax.swing.JLabel();
  panagenda = new javax.swing.JPanel();
  jPanel5 = new javax.swing.JPanel();
  jScrollPane2 = new javax.swing.JScrollPane();
  jTable2 = new javax.swing.JTable();
  txtheure = new javax.swing.JComboBox<>();
  jButton6 = new javax.swing.JButton();
  jButton7 = new javax.swing.JButton();
  jButton8 = new javax.swing.JButton();
  jScrollPane1 = new javax.swing.JScrollPane();
  jTable1 = new javax.swing.JTable();
  jPanel6 = new javax.swing.JPanel();
  jLabel13 = new javax.swing.JLabel();
  txtnomc = new javax.swing.JTextField();
  jLabel14 = new javax.swing.JLabel();
  txtnumeroc = new javax.swing.JTextField();
  jLabel15 = new javax.swing.JLabel();
  jScrollPane3 = new javax.swing.JScrollPane();
  txtproblemec = new javax.swing.JTextArea();
  jButton3 = new javax.swing.JButton();
  txtprixc = new javax.swing.JTextField();
  txtetat = new javax.swing.JTextField();

  setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

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

  jButton2.setBackground(new java.awt.Color(255, 255, 255));
  jButton2.setFont(new java.awt.Font("Tw Cen MT", 0, 30)); // NOI18N
  jButton2.setText("  Mon_agenda");
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

  txtavocat.setFont(new java.awt.Font("Tw Cen MT", 0, 24)); // NOI18N
  txtavocat.setForeground(new java.awt.Color(0, 153, 0));
  txtavocat.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
  txtavocat.setText("Avocat Mahado Osman");

  javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
  jPanel3.setLayout(jPanel3Layout);
  jPanel3Layout.setHorizontalGroup(
   jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
   .addGroup(jPanel3Layout.createSequentialGroup()
    .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 763, javax.swing.GroupLayout.PREFERRED_SIZE)
    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
    .addComponent(txtavocat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
  );
  jPanel3Layout.setVerticalGroup(
   jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
   .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
   .addComponent(txtavocat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
   .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
   .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
   .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
  );
  jPanel2Layout.setVerticalGroup(
   jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
   .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
    .addComponent(jLabel1)
    .addGap(6, 6, 6)
    .addComponent(jLabel6)
    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
  );

  pnprincipale.setBackground(new java.awt.Color(255, 255, 255));
  pnprincipale.setLayout(new java.awt.CardLayout());

  pnacceuil.setBackground(new java.awt.Color(204, 204, 255));

  jPanel4.setBackground(new java.awt.Color(204, 204, 255));
  jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Mes Coordonnées", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tw Cen MT", 0, 24))); // NOI18N

  jLabel2.setFont(new java.awt.Font("Tw Cen MT", 0, 24)); // NOI18N
  jLabel2.setText("Cin");

  txtcode.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
  txtcode.setPreferredSize(new java.awt.Dimension(6, 30));

  jLabel3.setFont(new java.awt.Font("Tw Cen MT", 0, 24)); // NOI18N
  jLabel3.setText("Nom");

  txtnom.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
  txtnom.setPreferredSize(new java.awt.Dimension(6, 30));

  jLabel4.setFont(new java.awt.Font("Tw Cen MT", 0, 24)); // NOI18N
  jLabel4.setText("Prénom");

  txtprenom.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
  txtprenom.setPreferredSize(new java.awt.Dimension(6, 30));

  jLabel5.setFont(new java.awt.Font("Tw Cen MT", 0, 24)); // NOI18N
  jLabel5.setText("Grade");

  txtgrade.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
  txtgrade.setPreferredSize(new java.awt.Dimension(6, 30));

  jLabel7.setFont(new java.awt.Font("Tw Cen MT", 0, 24)); // NOI18N
  jLabel7.setText("Numero");

  txtnumero.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
  txtnumero.setPreferredSize(new java.awt.Dimension(6, 30));

  jLabel8.setFont(new java.awt.Font("Tw Cen MT", 0, 24)); // NOI18N
  jLabel8.setText("Adresse");

  txtadresse.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
  txtadresse.setPreferredSize(new java.awt.Dimension(6, 30));

  jLabel9.setFont(new java.awt.Font("Tw Cen MT", 0, 24)); // NOI18N
  jLabel9.setText("Salaire");

  txtsalaire.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
  txtsalaire.setPreferredSize(new java.awt.Dimension(6, 30));

  jLabel10.setFont(new java.awt.Font("Tw Cen MT", 0, 24)); // NOI18N
  jLabel10.setText("Password");

  txtpassword.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
  txtpassword.setPreferredSize(new java.awt.Dimension(6, 30));

  jLabel11.setFont(new java.awt.Font("Tw Cen MT", 0, 24)); // NOI18N
  jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
  jLabel11.setText("Type");

  txttypesalaire.setFont(new java.awt.Font("Tw Cen MT", 0, 24)); // NOI18N
  txttypesalaire.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Jour", "Heure", "Semaine", "Moi", "Année", "Procès", "autres..." }));

  javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
  jPanel4.setLayout(jPanel4Layout);
  jPanel4Layout.setHorizontalGroup(
   jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
   .addGroup(jPanel4Layout.createSequentialGroup()
    .addContainerGap()
    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
     .addGroup(jPanel4Layout.createSequentialGroup()
      .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
      .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
      .addComponent(txtcode, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
     .addGroup(jPanel4Layout.createSequentialGroup()
      .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
      .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
      .addComponent(txtnom, javax.swing.GroupLayout.DEFAULT_SIZE, 336, Short.MAX_VALUE))
     .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
      .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
      .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
      .addComponent(txtprenom, javax.swing.GroupLayout.DEFAULT_SIZE, 336, Short.MAX_VALUE))
     .addGroup(jPanel4Layout.createSequentialGroup()
      .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
      .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
      .addComponent(txtgrade, javax.swing.GroupLayout.DEFAULT_SIZE, 336, Short.MAX_VALUE))
     .addGroup(jPanel4Layout.createSequentialGroup()
      .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
      .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
      .addComponent(txtnumero, javax.swing.GroupLayout.DEFAULT_SIZE, 336, Short.MAX_VALUE))
     .addGroup(jPanel4Layout.createSequentialGroup()
      .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
      .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
      .addComponent(txtadresse, javax.swing.GroupLayout.DEFAULT_SIZE, 336, Short.MAX_VALUE))
     .addGroup(jPanel4Layout.createSequentialGroup()
      .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
      .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
      .addComponent(txtsalaire, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
      .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
      .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
      .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
      .addComponent(txttypesalaire, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
     .addGroup(jPanel4Layout.createSequentialGroup()
      .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
      .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
      .addComponent(txtpassword, javax.swing.GroupLayout.DEFAULT_SIZE, 336, Short.MAX_VALUE)))
    .addContainerGap())
  );
  jPanel4Layout.setVerticalGroup(
   jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
   .addGroup(jPanel4Layout.createSequentialGroup()
    .addContainerGap()
    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
     .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
     .addComponent(txtcode, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
     .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
     .addComponent(txtnom, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
     .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
     .addComponent(txtprenom, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
     .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
     .addComponent(txtgrade, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
     .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
     .addComponent(txtnumero, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
     .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
     .addComponent(txtadresse, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
     .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
      .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
      .addComponent(txtsalaire, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
     .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
     .addComponent(txttypesalaire, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
     .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
     .addComponent(txtpassword, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
  );

  jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/semaine3/image2.PNG"))); // NOI18N

  javax.swing.GroupLayout pnacceuilLayout = new javax.swing.GroupLayout(pnacceuil);
  pnacceuil.setLayout(pnacceuilLayout);
  pnacceuilLayout.setHorizontalGroup(
   pnacceuilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
   .addGroup(pnacceuilLayout.createSequentialGroup()
    .addContainerGap()
    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
    .addContainerGap())
  );
  pnacceuilLayout.setVerticalGroup(
   pnacceuilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
   .addGroup(pnacceuilLayout.createSequentialGroup()
    .addContainerGap()
    .addGroup(pnacceuilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
     .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
     .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    .addContainerGap())
  );

  pnprincipale.add(pnacceuil, "card2");

  panagenda.setBackground(new java.awt.Color(204, 204, 255));

  jPanel5.setBackground(new java.awt.Color(204, 204, 255));
  jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Calendrier", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tw Cen MT", 0, 24))); // NOI18N

  jTable2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
  jTable2.setModel(new javax.swing.table.DefaultTableModel(
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
  jTable2.setRowHeight(20);
  jTable2.setRowMargin(3);
  jTable2.addMouseListener(new java.awt.event.MouseAdapter() {
   public void mouseReleased(java.awt.event.MouseEvent evt) {
    jTable2MouseReleased(evt);
   }
  });
  jScrollPane2.setViewportView(jTable2);
  if (jTable2.getColumnModel().getColumnCount() > 0) {
   jTable2.getColumnModel().getColumn(3).setMinWidth(200);
   jTable2.getColumnModel().getColumn(3).setMaxWidth(200);
  }

  txtheure.setFont(new java.awt.Font("Tw Cen MT", 0, 24)); // NOI18N
  txtheure.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Heures", "9H - 10H", "10H - 11H", "11H - 12H", "12H - 13H", "13H - 14H", "14H - 15H", "15H - 16H", "16H - 17H", "17H - 18H", "18H - 19H", "19H - 20H" }));

  jButton6.setFont(new java.awt.Font("Tw Cen MT", 0, 24)); // NOI18N
  jButton6.setText("Enregistrer");
  jButton6.addActionListener(new java.awt.event.ActionListener() {
   public void actionPerformed(java.awt.event.ActionEvent evt) {
    jButton6ActionPerformed(evt);
   }
  });

  jButton7.setFont(new java.awt.Font("Tw Cen MT", 0, 24)); // NOI18N
  jButton7.setText("Modifier");
  jButton7.addActionListener(new java.awt.event.ActionListener() {
   public void actionPerformed(java.awt.event.ActionEvent evt) {
    jButton7ActionPerformed(evt);
   }
  });

  jButton8.setFont(new java.awt.Font("Tw Cen MT", 0, 24)); // NOI18N
  jButton8.setText("Supprimer");
  jButton8.addActionListener(new java.awt.event.ActionListener() {
   public void actionPerformed(java.awt.event.ActionEvent evt) {
    jButton8ActionPerformed(evt);
   }
  });

  javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
  jPanel5.setLayout(jPanel5Layout);
  jPanel5Layout.setHorizontalGroup(
   jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
   .addGroup(jPanel5Layout.createSequentialGroup()
    .addContainerGap()
    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
     .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING)
     .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
      .addGap(0, 245, Short.MAX_VALUE)
      .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
       .addComponent(jButton7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
       .addComponent(jButton8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
       .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
        .addComponent(txtheure, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
        .addComponent(jButton6)))))
    .addContainerGap())
  );
  jPanel5Layout.setVerticalGroup(
   jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
   .addGroup(jPanel5Layout.createSequentialGroup()
    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
     .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
     .addComponent(txtheure, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
    .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
    .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 361, Short.MAX_VALUE)
    .addContainerGap())
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
  jTable1.setRowHeight(20);
  jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
   public void mouseReleased(java.awt.event.MouseEvent evt) {
    jTable1MouseReleased(evt);
   }
  });
  jScrollPane1.setViewportView(jTable1);

  jPanel6.setBorder(javax.swing.BorderFactory.createEtchedBorder());

  jLabel13.setFont(new java.awt.Font("Tw Cen MT", 0, 24)); // NOI18N
  jLabel13.setText("Nom Client");

  txtnomc.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N

  jLabel14.setFont(new java.awt.Font("Tw Cen MT", 0, 24)); // NOI18N
  jLabel14.setText("Numero");

  txtnumeroc.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N

  jLabel15.setFont(new java.awt.Font("Tw Cen MT", 0, 24)); // NOI18N
  jLabel15.setText("Probleme");

  txtproblemec.setColumns(20);
  txtproblemec.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
  txtproblemec.setRows(5);
  jScrollPane3.setViewportView(txtproblemec);

  jButton3.setFont(new java.awt.Font("Tw Cen MT", 0, 24)); // NOI18N
  jButton3.setText("Valider");
  jButton3.addActionListener(new java.awt.event.ActionListener() {
   public void actionPerformed(java.awt.event.ActionEvent evt) {
    jButton3ActionPerformed(evt);
   }
  });

  txtprixc.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

  txtetat.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

  javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
  jPanel6.setLayout(jPanel6Layout);
  jPanel6Layout.setHorizontalGroup(
   jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
   .addGroup(jPanel6Layout.createSequentialGroup()
    .addContainerGap()
    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
     .addGroup(jPanel6Layout.createSequentialGroup()
      .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
       .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
       .addComponent(jButton3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
      .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
      .addComponent(jScrollPane3))
     .addGroup(jPanel6Layout.createSequentialGroup()
      .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
      .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
      .addComponent(txtnumeroc, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
      .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
      .addComponent(txtetat))
     .addGroup(jPanel6Layout.createSequentialGroup()
      .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
      .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
      .addComponent(txtnomc, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
      .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
      .addComponent(txtprixc)))
    .addContainerGap())
  );
  jPanel6Layout.setVerticalGroup(
   jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
   .addGroup(jPanel6Layout.createSequentialGroup()
    .addContainerGap()
    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
     .addComponent(txtprixc)
     .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
     .addComponent(txtnomc))
    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
     .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
      .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
      .addComponent(txtnumeroc, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
     .addComponent(txtetat, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
     .addGroup(jPanel6Layout.createSequentialGroup()
      .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
      .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
      .addComponent(jButton3))
     .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE)))
  );

  javax.swing.GroupLayout panagendaLayout = new javax.swing.GroupLayout(panagenda);
  panagenda.setLayout(panagendaLayout);
  panagendaLayout.setHorizontalGroup(
   panagendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
   .addGroup(panagendaLayout.createSequentialGroup()
    .addContainerGap()
    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
    .addGroup(panagendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
     .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
     .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    .addContainerGap())
  );
  panagendaLayout.setVerticalGroup(
   panagendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
   .addGroup(panagendaLayout.createSequentialGroup()
    .addContainerGap()
    .addGroup(panagendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
     .addGroup(panagendaLayout.createSequentialGroup()
      .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
      .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
      .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 325, Short.MAX_VALUE))
     .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    .addContainerGap())
  );

  pnprincipale.add(panagenda, "card3");

  javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
  jPanel1.setLayout(jPanel1Layout);
  jPanel1Layout.setHorizontalGroup(
   jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
   .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
   .addComponent(pnprincipale, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
  );
  jPanel1Layout.setVerticalGroup(
   jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
   .addGroup(jPanel1Layout.createSequentialGroup()
    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
    .addComponent(pnprincipale, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

  setSize(new java.awt.Dimension(1061, 634));
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

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        try {
            Connect();
            pst = con.prepareStatement("insert into calendrier (dat,heure, avocat)"
                    + "values(?,?,?)");
          
            pst.setString(2, txtheure.getSelectedItem().toString());
            pst.setString(3, txtavocat.getText());
            pst.executeUpdate();
            con.close();
            JOptionPane.showMessageDialog(null, " Ajouter");
            Table();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            e.printStackTrace();

        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        try {
            Connect();
            int i = jTable1.getSelectedRow();
            String selectionner = (String) jTable1.getValueAt(i, 0);
            
            pst = con.prepareStatement("update rendezvous set  etat=?"
                    + " where code=?");
            pst.setString(1,txtetat.getText() );
            pst.setString(2, selectionner);
            pst.executeUpdate();
            con.close();
            JOptionPane.showMessageDialog(null," Demande " +txtetat.getText().toString());
            TableRdv();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            e.printStackTrace();
           
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jTable1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseReleased
        int select  = jTable1.getSelectedRow();
        DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
        txtnomc.setText(model.getValueAt(select, 1).toString());
        txtnumeroc.setText(model.getValueAt(select, 2).toString());
        txtproblemec.setText(model.getValueAt(select,3).toString());
        txtprixc.setText(model.getValueAt(select,4).toString());
        txtetat.setText(model.getValueAt(select, 5).toString());
  
    }//GEN-LAST:event_jTable1MouseReleased

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        try {
            Connect();
            int i = jTable2.getSelectedRow();
            String selectionner = (String) jTable2.getValueAt(i, 0);
            pst = con.prepareStatement("update calendrier set dat=?, heure=?"
                    + "where code=?");
          
            pst.setString(2, txtheure.getSelectedItem().toString());
            pst.setString(3, selectionner);
            pst.executeUpdate();
            con.close();
            JOptionPane.showMessageDialog(null, " Modifier");
            Table();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            e.printStackTrace();

        }
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        try {
            Connect();
            int i = jTable2.getSelectedRow();
            String selectionner = (String) jTable2.getValueAt(i, 0);
            pst = con.prepareStatement("delete from calendrier where code=?");
            pst.setString(1, selectionner);
            pst.executeUpdate();
            con.close();
            JOptionPane.showMessageDialog(null, " Supprimer");
            Table();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            e.printStackTrace();

        }
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jTable2MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable2MouseReleased
        
        
    }//GEN-LAST:event_jTable2MouseReleased

    private void Table() {
        String[] patient = {"CODE", "DATE", "HEURE", "AVOCAT"};
        String[] montrer = new String[5];

        DefaultTableModel model = new DefaultTableModel(null, patient);

        String sql = "select * from calendrier where avocat=?";
        try {
            Connect();
            pst = con.prepareStatement(sql);
            pst.setString(1,txtavocat.getText());
            rs = pst.executeQuery();

            while (rs.next()) {
                montrer[0] = rs.getString("code");
                montrer[1] = rs.getString("dat");
                montrer[2] = rs.getString("heure");
                montrer[3] = rs.getString("avocat");

                model.addRow(montrer);
            }
            jTable2.setModel(model);
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void TableRdv() {
        String[] patient = {"CODE","NOM", "NUMERO", "PROBLEME", "PRIX", "ETAT"};
        String[] montrer = new String[7];

        DefaultTableModel model = new DefaultTableModel(null, patient);

        String sql = "select * from rendezvous where avocat=?";
        try {
            Connect();
            pst = con.prepareStatement(sql);
            pst.setString(1,txtavocat.getText());
            rs = pst.executeQuery();

            while (rs.next()) {
                montrer[0] = rs.getString("code");
                montrer[1] = rs.getString("nom");
                montrer[2] = rs.getString("numero");
                montrer[3] = rs.getString("probleme");
                montrer[4] = rs.getString("prix");
                montrer[5] = rs.getString("etat");

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
            java.util.logging.Logger.getLogger(Avocat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Avocat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Avocat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Avocat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Avocat().setVisible(true);
            }
        });
    }

 // Variables declaration - do not modify//GEN-BEGIN:variables
 private javax.swing.JButton jButton1;
 private javax.swing.JButton jButton2;
 private javax.swing.JButton jButton3;
 private javax.swing.JButton jButton4;
 private javax.swing.JButton jButton6;
 private javax.swing.JButton jButton7;
 private javax.swing.JButton jButton8;
 private javax.swing.JLabel jLabel1;
 private javax.swing.JLabel jLabel10;
 private javax.swing.JLabel jLabel11;
 private javax.swing.JLabel jLabel12;
 private javax.swing.JLabel jLabel13;
 private javax.swing.JLabel jLabel14;
 private javax.swing.JLabel jLabel15;
 private javax.swing.JLabel jLabel2;
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
 private javax.swing.JPanel jPanel4;
 private javax.swing.JPanel jPanel5;
 private javax.swing.JPanel jPanel6;
 private javax.swing.JScrollPane jScrollPane1;
 private javax.swing.JScrollPane jScrollPane2;
 private javax.swing.JScrollPane jScrollPane3;
 private javax.swing.JTable jTable1;
 private javax.swing.JTable jTable2;
 private javax.swing.JToolBar jToolBar1;
 private javax.swing.JPanel panagenda;
 private javax.swing.JPanel pnacceuil;
 private javax.swing.JPanel pnprincipale;
 private javax.swing.JTextField txtadresse;
 private javax.swing.JLabel txtavocat;
 private javax.swing.JTextField txtcode;
 private javax.swing.JTextField txtetat;
 private javax.swing.JTextField txtgrade;
 private javax.swing.JComboBox<String> txtheure;
 private javax.swing.JTextField txtnom;
 private javax.swing.JTextField txtnomc;
 private javax.swing.JTextField txtnumero;
 private javax.swing.JTextField txtnumeroc;
 private javax.swing.JTextField txtpassword;
 private javax.swing.JTextField txtprenom;
 private javax.swing.JTextField txtprixc;
 private javax.swing.JTextArea txtproblemec;
 private javax.swing.JTextField txtsalaire;
 private javax.swing.JComboBox<String> txttypesalaire;
 // End of variables declaration//GEN-END:variables
}
