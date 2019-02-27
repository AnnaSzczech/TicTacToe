package tictactoe;

import javax.swing.ButtonGroup;
import javax.swing.JLabel;

public class Game extends javax.swing.JFrame {

    public Board board = new Board();

    public Game() {
        initComponents();
        groupButtons();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        fieldA1 = new javax.swing.JLabel();
        fieldB2 = new javax.swing.JLabel();
        fieldA3 = new javax.swing.JLabel();
        fieldB1 = new javax.swing.JLabel();
        fieldA2 = new javax.swing.JLabel();
        fieldB3 = new javax.swing.JLabel();
        fieldC1 = new javax.swing.JLabel();
        fieldC2 = new javax.swing.JLabel();
        fieldC3 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        result = new javax.swing.JLabel();
        newGameButton = new javax.swing.JButton();
        PlayerVsPlayer = new javax.swing.JRadioButton();
        PlayerVsComputer = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Gra w Kółko i kryżyk");

        fieldA1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/PustePole.png"))); // NOI18N
        fieldA1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                a1(evt);
            }
        });

        fieldB2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/PustePole.png"))); // NOI18N
        fieldB2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                b2(evt);
            }
        });

        fieldA3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/PustePole.png"))); // NOI18N
        fieldA3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                a3(evt);
            }
        });

        fieldB1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/PustePole.png"))); // NOI18N
        fieldB1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                b1(evt);
            }
        });

        fieldA2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/PustePole.png"))); // NOI18N
        fieldA2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                a2(evt);
            }
        });

        fieldB3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/PustePole.png"))); // NOI18N
        fieldB3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                b3(evt);
            }
        });

        fieldC1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/PustePole.png"))); // NOI18N
        fieldC1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                c1(evt);
            }
        });

        fieldC2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/PustePole.png"))); // NOI18N
        fieldC2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                c2(evt);
            }
        });

        fieldC3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/PustePole.png"))); // NOI18N
        fieldC3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                c3(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(51, 51, 255));
        jLabel10.setText("KÓŁKO I KRZYŻYK");

        result.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        result.setForeground(new java.awt.Color(255, 51, 0));

        newGameButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        newGameButton.setText("NOWA GRA");
        newGameButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newGameButtonActionPerformed(evt);
            }
        });

        PlayerVsPlayer.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        PlayerVsPlayer.setSelected(true);
        PlayerVsPlayer.setText("Gracz vs Gracz");
        PlayerVsPlayer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PlayerVsPlayerActionPerformed(evt);
            }
        });

        PlayerVsComputer.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        PlayerVsComputer.setText("Gracz vs Komputer");
        PlayerVsComputer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PlayerVsComputerActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(fieldB1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fieldC1, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(fieldC2, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(fieldC3, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(result, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(fieldB2, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(fieldB3, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(PlayerVsPlayer, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(PlayerVsComputer, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(fieldA1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(fieldA2, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(fieldA3, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(newGameButton, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(50, Short.MAX_VALUE)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(50, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(fieldA1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fieldA2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fieldA3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(fieldB1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fieldB2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fieldB3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(newGameButton)
                        .addGap(38, 38, 38)
                        .addComponent(PlayerVsPlayer)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(PlayerVsComputer)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(fieldC1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fieldC2, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(result)
                        .addComponent(fieldC3, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void groupButtons() {
        ButtonGroup whoWillPlay = new ButtonGroup();
        whoWillPlay.add(PlayerVsPlayer);
        whoWillPlay.add(PlayerVsComputer);
    }

    private void setFieldOnBoard() {
        JLabel[][] fieldOnBoard = new JLabel[][]{{fieldA1, fieldA2, fieldA3}, {fieldB1, fieldB2, fieldB3}, {fieldC1, fieldC2, fieldC3}};

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                fieldOnBoard[i][j].setIcon(board.iconsBoardStatus()[i][j]);
            }
        }
    }
    private void a1(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_a1

        Logic.makeMove(0, 0);

        if (Logic.isWinner(Logic.boardStatus)) {
            result.setText("WYGRYWA " + Logic.whoWin);
        }

        if (Logic.isDraw()) {
            result.setText("REMIS");
        }
        setFieldOnBoard();

    }//GEN-LAST:event_a1

    private void a2(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_a2
        Logic.makeMove(0, 1);

        if (Logic.isWinner(Logic.boardStatus)) {
            result.setText("WYGRYWA " + Logic.whoWin);
        }

        if (Logic.isDraw()) {
            result.setText("REMIS");
        }
        setFieldOnBoard();

    }//GEN-LAST:event_a2

    private void a3(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_a3
        Logic.makeMove(0, 2);

        if (Logic.isWinner(Logic.boardStatus)) {
            result.setText("WYGRYWA " + Logic.whoWin);
        }

        if (Logic.isDraw()) {
            result.setText("REMIS");
        }
        setFieldOnBoard();

    }//GEN-LAST:event_a3

    private void b1(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b1
        Logic.makeMove(1, 0);

        if (Logic.isWinner(Logic.boardStatus)) {
            result.setText("WYGRYWA " + Logic.whoWin);
        }

        if (Logic.isDraw()) {
            result.setText("REMIS");
        }
        setFieldOnBoard();

    }//GEN-LAST:event_b1

    private void b2(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b2
        Logic.makeMove(1, 1);

        if (Logic.isWinner(Logic.boardStatus)) {
            result.setText("WYGRYWA " + Logic.whoWin);
        }

        if (Logic.isDraw()) {
            result.setText("REMIS");
        }
        setFieldOnBoard();

    }//GEN-LAST:event_b2

    private void b3(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b3
        Logic.makeMove(1, 2);

        if (Logic.isWinner(Logic.boardStatus)) {
            result.setText("WYGRYWA " + Logic.whoWin);
        }

        if (Logic.isDraw()) {
            result.setText("REMIS");
        }
        setFieldOnBoard();

    }//GEN-LAST:event_b3

    private void c1(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_c1
        Logic.makeMove(2, 0);

        if (Logic.isWinner(Logic.boardStatus)) {
            result.setText("WYGRYWA " + Logic.whoWin);
        }

        if (Logic.isDraw()) {
            result.setText("REMIS");
        }
        setFieldOnBoard();
    }//GEN-LAST:event_c1

    private void c2(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_c2
        Logic.makeMove(2, 1);

        if (Logic.isWinner(Logic.boardStatus)) {
            result.setText("WYGRYWA " + Logic.whoWin);
        }

        if (Logic.isDraw()) {
            result.setText("REMIS");
        }
        setFieldOnBoard();

    }//GEN-LAST:event_c2

    private void c3(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_c3
        Logic.makeMove(2, 2);

        if (Logic.isWinner(Logic.boardStatus)) {
            result.setText("WYGRYWA " + Logic.whoWin);
        }

        if (Logic.isDraw()) {
            result.setText("REMIS");
        }
        setFieldOnBoard();
    }//GEN-LAST:event_c3

    private void newGameButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newGameButtonActionPerformed
        result.setText("");
        Logic.resetGame();
        setFieldOnBoard();
    }//GEN-LAST:event_newGameButtonActionPerformed

    private void PlayerVsComputerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PlayerVsComputerActionPerformed
        Logic.setPlayerVsPlayer();
        newGameButtonActionPerformed(evt);
    }//GEN-LAST:event_PlayerVsComputerActionPerformed

    private void PlayerVsPlayerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PlayerVsPlayerActionPerformed
        Logic.setPlayerVsComputer();
        newGameButtonActionPerformed(evt);
    }//GEN-LAST:event_PlayerVsPlayerActionPerformed

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
            java.util.logging.Logger.getLogger(Game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Game().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton PlayerVsComputer;
    private javax.swing.JRadioButton PlayerVsPlayer;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.JLabel fieldA1;
    private javax.swing.JLabel fieldA2;
    private javax.swing.JLabel fieldA3;
    private javax.swing.JLabel fieldB1;
    private javax.swing.JLabel fieldB2;
    private javax.swing.JLabel fieldB3;
    private javax.swing.JLabel fieldC1;
    private javax.swing.JLabel fieldC2;
    private javax.swing.JLabel fieldC3;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JButton newGameButton;
    private javax.swing.JLabel result;
    // End of variables declaration//GEN-END:variables
}