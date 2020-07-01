package Games;

import javax.swing.JOptionPane;

public class TicTacToe extends javax.swing.JFrame {
    int inc = 0;
    boolean win = false;
    public TicTacToe() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField2 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        J9 = new javax.swing.JButton();
        J6 = new javax.swing.JButton();
        J3 = new javax.swing.JButton();
        J8 = new javax.swing.JButton();
        J5 = new javax.swing.JButton();
        J2 = new javax.swing.JButton();
        J7 = new javax.swing.JButton();
        J4 = new javax.swing.JButton();
        J1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        jTextField2.setEditable(false);
        jTextField2.setBackground(new java.awt.Color(255, 102, 102));
        jTextField2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextField2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField2.setText("Player 2: O");
        jTextField2.setBorder(null);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(255, 102, 102));

        J9.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        J9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                J9ActionPerformed(evt);
            }
        });

        J6.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        J6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                J6ActionPerformed(evt);
            }
        });

        J3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        J3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                J3ActionPerformed(evt);
            }
        });

        J8.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        J8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                J8ActionPerformed(evt);
            }
        });

        J5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        J5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                J5ActionPerformed(evt);
            }
        });

        J2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        J2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                J2ActionPerformed(evt);
            }
        });

        J7.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        J7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                J7ActionPerformed(evt);
            }
        });

        J4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        J4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                J4ActionPerformed(evt);
            }
        });

        J1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        J1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                J1ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Tic Tac Toe");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Player 2: O");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Player 1: X");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(J4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(J7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(J1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(J5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(J8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(J2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(J6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(J9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(J3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(99, 99, 99)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 42, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(J3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(J6, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(J9, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(J2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(J5, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(J8, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(J1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(J4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(J7, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void J1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_J1ActionPerformed
        if(J1.getText() == "")
        {
            inc++;
            if(inc % 2 == 0) J1.setText("O");
            else             J1.setText("X");
        }else JOptionPane.showMessageDialog(null, "Can't play this", "FULL", JOptionPane.ERROR_MESSAGE);
        TestGain();
    }//GEN-LAST:event_J1ActionPerformed

    private void J2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_J2ActionPerformed
        if(J2.getText() == "")
        {
            inc++;
            if(inc % 2 == 0) J2.setText("O");
            else             J2.setText("X");
        }else JOptionPane.showMessageDialog(null, "Can't play this", "FULL", JOptionPane.ERROR_MESSAGE);
        TestGain();
    }//GEN-LAST:event_J2ActionPerformed

    private void J3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_J3ActionPerformed
        if(J3.getText() == "")
        {
            inc++;
            if(inc % 2 == 0) J3.setText("O");
            else             J3.setText("X");
        }else JOptionPane.showMessageDialog(null, "Can't play this", "FULL", JOptionPane.ERROR_MESSAGE);
        TestGain();
    }//GEN-LAST:event_J3ActionPerformed

    private void J4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_J4ActionPerformed
        if(J4.getText() == "")
        {
            inc++;
            if(inc % 2 == 0) J4.setText("O");
            else             J4.setText("X");
        }else JOptionPane.showMessageDialog(null, "Can't play this", "FULL", JOptionPane.ERROR_MESSAGE);
        TestGain();
    }//GEN-LAST:event_J4ActionPerformed

    private void J5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_J5ActionPerformed
        if(J5.getText() == "")
        {
            inc++;
            if(inc % 2 == 0) J5.setText("O");
            else             J5.setText("X");
        }else JOptionPane.showMessageDialog(null, "Can't play this", "FULL", JOptionPane.ERROR_MESSAGE);
        TestGain();
    }//GEN-LAST:event_J5ActionPerformed

    private void J6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_J6ActionPerformed
        if(J6.getText() == "")
        {
            inc++;
            if(inc % 2 == 0) J6.setText("O");
            else             J6.setText("X");
        }else JOptionPane.showMessageDialog(null, "Can't play this", "FULL", JOptionPane.ERROR_MESSAGE);
        TestGain();
    }//GEN-LAST:event_J6ActionPerformed

    private void J7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_J7ActionPerformed
        if(J7.getText() == "")
        {
            inc++;
            if(inc % 2 == 0) J7.setText("O");
            else             J7.setText("X");
        }else JOptionPane.showMessageDialog(null, "Can't play this", "FULL", JOptionPane.ERROR_MESSAGE);
        TestGain();
    }//GEN-LAST:event_J7ActionPerformed

    private void J8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_J8ActionPerformed
        if(J8.getText() == "")
        {
            inc++;
            if(inc % 2 == 0) J8.setText("O");
            else             J8.setText("X");
        }else JOptionPane.showMessageDialog(null, "Can't play this", "FULL", JOptionPane.ERROR_MESSAGE);
        TestGain();
    }//GEN-LAST:event_J8ActionPerformed

    private void J9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_J9ActionPerformed
        if(J9.getText() == "")
        {
            inc++;
            if(inc % 2 == 0) J9.setText("O");
            else             J9.setText("X");
        }else JOptionPane.showMessageDialog(null, "Can't play this", "FULL", JOptionPane.ERROR_MESSAGE);
        TestGain();
    }//GEN-LAST:event_J9ActionPerformed

    /**
     * @param args the command line arguments
     */
    public void TestGain()
    {
        win =false;
        if((J2.getText() == J5.getText()) && (J5.getText() == J8.getText()) ||
           (J4.getText() == J5.getText()) && (J5.getText() == J6.getText()) ||
           (J3.getText() == J5.getText()) && (J5.getText() == J7.getText()) ||
           (J1.getText() == J5.getText()) && (J5.getText() == J9.getText()))
           {
               if(J5.getText() == "X")
               {
                   JOptionPane.showMessageDialog(null, "The Winner is Player 1", "Congratulations",WIDTH);
                   win = true;
               }
               else if(J5.getText() == "O")
               {
                   JOptionPane.showMessageDialog(null, "The Winner is Player 2", "Congratulations", WIDTH);
                   win = true;
               }
           }
        else
        {
          if((J1.getText() == J2.getText()) && (J2.getText() == J3.getText()) ||
             (J1.getText() == J4.getText()) && (J4.getText() == J7.getText()))
            {
              if(J1.getText() == "X")
                {
                   JOptionPane.showMessageDialog(null, "The Winner is Player 1", "Congratulations", WIDTH);
                   win = true;
                }
                else if(J1.getText() == "O")
                    {
                      JOptionPane.showMessageDialog(null, "The Winner is Player 2", "Congratulations", WIDTH);
                      win = true;
                    }
            }
            else
            {
             if((J9.getText() == J6.getText()) && (J6.getText() == J3.getText()) ||
                (J9.getText() == J8.getText()) && (J8.getText() == J7.getText()) )
                {
                    if(J9.getText() == "X")
                    {
                        JOptionPane.showMessageDialog(null, "The Winner is Player 1", "Congratulations", WIDTH);
                        win = true;
                    }
                    else if(J9.getText() == "O")
                        {
                            JOptionPane.showMessageDialog(null, "The Winner is Player 2", "Congratulations", WIDTH);
                            win = true;
                        }
                }
            }
        }
        if(win)
        {
            inc = 0;
            J1.setText(""); J2.setText(""); J3.setText(""); J4.setText(""); J5.setText("");
            J6.setText(""); J7.setText(""); J8.setText(""); J9.setText("");
        }
        else TestFinish();
    }
    public void TestFinish()
    {
        if(J1.getText() != "" && J2.getText() != "" && J3.getText() != "" && J4.getText() != "" &&
           J5.getText() != "" && J6.getText() != "" && J7.getText() != "" && J8.getText() != "" && J9.getText() != "")
        {
            JOptionPane.showMessageDialog(null, "No Winner");
            inc++;
            J1.setText(""); J2.setText(""); J3.setText(""); J4.setText(""); J5.setText("");
            J6.setText(""); J7.setText(""); J8.setText(""); J9.setText("");
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
            java.util.logging.Logger.getLogger(TicTacToe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TicTacToe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TicTacToe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TicTacToe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TicTacToe().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton J1;
    private javax.swing.JButton J2;
    private javax.swing.JButton J3;
    private javax.swing.JButton J4;
    private javax.swing.JButton J5;
    private javax.swing.JButton J6;
    private javax.swing.JButton J7;
    private javax.swing.JButton J8;
    private javax.swing.JButton J9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}
