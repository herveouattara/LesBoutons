
import java.awt.Color;


public class LesBoutons extends javax.swing.JFrame {


    public LesBoutons() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        GroupCouleur = new javax.swing.ButtonGroup();
        GroupEcriture = new javax.swing.ButtonGroup();
        GroupFonte = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        PRadioBoutons = new javax.swing.JPanel();
        LCouleur = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        PCheckBoutons = new javax.swing.JPanel();
        LFont = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        jCheckBox3 = new javax.swing.JCheckBox();
        jCheckBox4 = new javax.swing.JCheckBox();
        PToggleBoutons = new javax.swing.JPanel();
        LEcriture = new javax.swing.JLabel();
        jToggleButton1 = new javax.swing.JToggleButton();
        jToggleButton2 = new javax.swing.JToggleButton();
        jToggleButton3 = new javax.swing.JToggleButton();
        jToggleButton4 = new javax.swing.JToggleButton();
        Bouton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Choisissez les paramètres de votre bouton !");
        jPanel1.add(jLabel1);

        getContentPane().add(jPanel1, java.awt.BorderLayout.NORTH);

        jPanel2.setLayout(new java.awt.GridLayout(2, 2));

        PRadioBoutons.setLayout(new java.awt.GridLayout(6, 1));

        LCouleur.setText("Couleur  de fond ?");
        PRadioBoutons.add(LCouleur);

        GroupCouleur.add(jRadioButton1);
        jRadioButton1.setText("Rouge");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });
        PRadioBoutons.add(jRadioButton1);

        GroupCouleur.add(jRadioButton2);
        jRadioButton2.setText("Vert");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });
        PRadioBoutons.add(jRadioButton2);

        GroupCouleur.add(jRadioButton3);
        jRadioButton3.setText("Bleu");
        jRadioButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton3ActionPerformed(evt);
            }
        });
        PRadioBoutons.add(jRadioButton3);

        GroupCouleur.add(jRadioButton4);
        jRadioButton4.setText("Orange");
        jRadioButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton4ActionPerformed(evt);
            }
        });
        PRadioBoutons.add(jRadioButton4);

        jPanel2.add(PRadioBoutons);

        PCheckBoutons.setLayout(new java.awt.GridLayout(6, 1));

        LFont.setText("Fonte d'écriture ?");
        PCheckBoutons.add(LFont);

        GroupFonte.add(jCheckBox1);
        jCheckBox1.setText("Tahoma 36");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });
        PCheckBoutons.add(jCheckBox1);

        GroupFonte.add(jCheckBox2);
        jCheckBox2.setText("Tahoma 48");
        jCheckBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox2ActionPerformed(evt);
            }
        });
        PCheckBoutons.add(jCheckBox2);

        GroupFonte.add(jCheckBox3);
        jCheckBox3.setText("Lucida Calligarphy 36");
        jCheckBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox3ActionPerformed(evt);
            }
        });
        PCheckBoutons.add(jCheckBox3);

        GroupFonte.add(jCheckBox4);
        jCheckBox4.setText("Arial 18");
        jCheckBox4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox4ActionPerformed(evt);
            }
        });
        PCheckBoutons.add(jCheckBox4);

        jPanel2.add(PCheckBoutons);

        PToggleBoutons.setLayout(new java.awt.GridLayout(5, 1));

        LEcriture.setText("Couleur d'écriture ?");
        PToggleBoutons.add(LEcriture);

        GroupEcriture.add(jToggleButton1);
        jToggleButton1.setText("Rose");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });
        PToggleBoutons.add(jToggleButton1);

        GroupEcriture.add(jToggleButton2);
        jToggleButton2.setText("Magenta");
        jToggleButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton2ActionPerformed(evt);
            }
        });
        PToggleBoutons.add(jToggleButton2);

        GroupEcriture.add(jToggleButton3);
        jToggleButton3.setText("Jaune");
        jToggleButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton3ActionPerformed(evt);
            }
        });
        PToggleBoutons.add(jToggleButton3);

        GroupEcriture.add(jToggleButton4);
        jToggleButton4.setText("Gris");
        jToggleButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton4ActionPerformed(evt);
            }
        });
        PToggleBoutons.add(jToggleButton4);

        jPanel2.add(PToggleBoutons);

        Bouton.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        Bouton.setText("TEXTE");
        jPanel2.add(Bouton);

        getContentPane().add(jPanel2, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jCheckBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox2ActionPerformed
        Bouton.setFont(new java.awt.Font("Tahoma", 0, 48));
    }//GEN-LAST:event_jCheckBox2ActionPerformed

    private void jCheckBox4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox4ActionPerformed
        Bouton.setFont(new java.awt.Font("Arial", 0, 36));
    }//GEN-LAST:event_jCheckBox4ActionPerformed

    private void jToggleButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton3ActionPerformed
        Bouton.setForeground(Color.YELLOW);
    }//GEN-LAST:event_jToggleButton3ActionPerformed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        // TODO add your handling code here:
        Bouton.setBackground(Color.RED);
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        // TODO add your handling code here:
        Bouton.setBackground(Color.GREEN);
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void jRadioButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton3ActionPerformed
        // TODO add your handling code here:
        Bouton.setBackground(Color.BLUE);
    }//GEN-LAST:event_jRadioButton3ActionPerformed

    private void jRadioButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton4ActionPerformed
        // TODO add your handling code here:
        Bouton.setBackground(Color.ORANGE);
    }//GEN-LAST:event_jRadioButton4ActionPerformed

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        // TODO add your handling code here:
        Bouton.setForeground(Color.PINK);
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    private void jToggleButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton2ActionPerformed
        // TODO add your handling code here:
        Bouton.setForeground(Color.MAGENTA);
    }//GEN-LAST:event_jToggleButton2ActionPerformed

    private void jToggleButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton4ActionPerformed
        // TODO add your handling code here:
        Bouton.setForeground(Color.DARK_GRAY);
    }//GEN-LAST:event_jToggleButton4ActionPerformed

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        // TODO add your handling code here:
        Bouton.setFont(new java.awt.Font("Tahoma", 0, 36));
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void jCheckBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox3ActionPerformed
        // TODO add your handling code here:
        Bouton.setFont(new java.awt.Font("Lucida Calligraphy", 0, 36));
    }//GEN-LAST:event_jCheckBox3ActionPerformed

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
            java.util.logging.Logger.getLogger(LesBoutons.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LesBoutons.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LesBoutons.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LesBoutons.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LesBoutons().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Bouton;
    private javax.swing.ButtonGroup GroupCouleur;
    private javax.swing.ButtonGroup GroupEcriture;
    private javax.swing.ButtonGroup GroupFonte;
    private javax.swing.JLabel LCouleur;
    private javax.swing.JLabel LEcriture;
    private javax.swing.JLabel LFont;
    private javax.swing.JPanel PCheckBoutons;
    private javax.swing.JPanel PRadioBoutons;
    private javax.swing.JPanel PToggleBoutons;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JCheckBox jCheckBox4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JToggleButton jToggleButton2;
    private javax.swing.JToggleButton jToggleButton3;
    private javax.swing.JToggleButton jToggleButton4;
    // End of variables declaration//GEN-END:variables
}
