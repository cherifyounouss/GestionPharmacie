
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author administrateur
 */
public class lenregistrement_medoc extends javax.swing.JFrame {

    /**
     * Creates new form lenregistrement_medoc
     */
    public lenregistrement_medoc() {
        initComponents();
    }

  
          
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jId = new javax.swing.JTextField();
        jNomMedicament = new javax.swing.JTextField();
        jQté = new javax.swing.JTextField();
        jPrix = new javax.swing.JTextField();
        jDatePerem = new javax.swing.JTextField();
        jNomFournisseur = new javax.swing.JComboBox<>();
        jValider = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 204, 51));
        setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        setForeground(java.awt.Color.green);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel1.setText("Enregistrement des livraisons");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel2.setText("Identifiant:");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel3.setText("Prix:");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel4.setText("Nom:");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel5.setText("Date de peremption:");

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel6.setText("Nom fournisseur:");

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel7.setText("Quantité:");

        jId.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jIdActionPerformed(evt);
            }
        });

        jNomMedicament.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jNomMedicament.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jNomMedicamentActionPerformed(evt);
            }
        });

        jQté.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jQté.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jQtéActionPerformed(evt);
            }
        });

        jPrix.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jPrix.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPrixActionPerformed(evt);
            }
        });

        jDatePerem.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jDatePerem.setText("yyyy-mm-dd");

        jNomFournisseur.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jNomFournisseur.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "annie", "fatou", "DiayGarab" }));
        jNomFournisseur.setAutoscrolls(true);
        jNomFournisseur.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jNomFournisseur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jNomFournisseurActionPerformed(evt);
            }
        });

        jValider.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jValider.setText("Valider");
        jValider.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jValiderMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(jNomFournisseur, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4))
                        .addGap(57, 57, 57)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jId, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jNomMedicament, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 177, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jQté, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(jDatePerem, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPrix, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(48, 48, 48))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(281, 281, 281)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(357, 357, 357)
                        .addComponent(jValider)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(69, 69, 69)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel5)
                            .addComponent(jId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jDatePerem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(49, 49, 49)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jNomMedicament, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(jPrix, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel4))
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jQté, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6)
                        .addComponent(jNomFournisseur, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 109, Short.MAX_VALUE)
                .addComponent(jValider)
                .addGap(198, 198, 198))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jIdActionPerformed
       
    }//GEN-LAST:event_jIdActionPerformed

    private void jNomFournisseurActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jNomFournisseurActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jNomFournisseurActionPerformed

    private void jValiderMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jValiderMouseClicked

        String nomFournisseur=jNomFournisseur.getSelectedItem().toString();
        String id=jId.getText();
        String nomMedicament=jNomMedicament.getText();
        String datePerem = jDatePerem.getText();
        String qté=jQté.getText();
        String prix=jPrix.getText();

        if ((id.equals("")) || (nomMedicament.equals(""))|| (prix.equals("")) || (datePerem.equals("yyyy-mm-dd")) || (nomFournisseur.equals("")) || (qté.equals("")) ){
            JOptionPane.showMessageDialog(null,"Veuillez remplir tous les champs");}
        else{
            String url ="jdbc:mysql://localhost/pharmacie";
            String login="root";
            String passwd= "";
            java.sql.Connection cn=null;
            
            try{
                
                Class.forName("com.mysql.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://localHost:3306/pharmacie","root","");
             
                PreparedStatement st = con.prepareStatement("INSERT INTO`medicament`( id_medicament,`nom_medicament`,quantite,`nom_fournisseur`,prix, date_expiration) VALUES (?,?,?,?,?,?)");
               
                st.setInt(1,Integer.parseInt(id));
                st.setString(2,nomMedicament);
                st.setFloat(3,Integer.parseInt(qté));
                st.setString(4,nomFournisseur);
                st.setFloat(5,Integer.parseInt(prix));
                st.setDate(6,java.sql.Date.valueOf(datePerem));
                System.out.println("ca arrive ici");
                st.executeUpdate();
                JOptionPane.showMessageDialog(null,"Enregistrement réussi");
                jId.setText("");
                jNomMedicament.setText("");
                jQté.setText("");
               
                jPrix.setText("");
                jDatePerem.setText("yyyy-mm-dd");
                
            }
            catch (ClassNotFoundException | SQLException ex) {
                Logger.getLogger(lenregistrement_medoc.class.getName()).log(Level.SEVERE, null, ex);
            }

        }

    }//GEN-LAST:event_jValiderMouseClicked

    private void jNomMedicamentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jNomMedicamentActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jNomMedicamentActionPerformed

    private void jPrixActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPrixActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPrixActionPerformed

    private void jQtéActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jQtéActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jQtéActionPerformed

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
            java.util.logging.Logger.getLogger(lenregistrement_medoc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(lenregistrement_medoc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(lenregistrement_medoc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(lenregistrement_medoc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new lenregistrement_medoc().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField jDatePerem;
    private javax.swing.JTextField jId;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JComboBox<String> jNomFournisseur;
    private javax.swing.JTextField jNomMedicament;
    private javax.swing.JTextField jPrix;
    private javax.swing.JTextField jQté;
    private javax.swing.JButton jValider;
    // End of variables declaration//GEN-END:variables
}
