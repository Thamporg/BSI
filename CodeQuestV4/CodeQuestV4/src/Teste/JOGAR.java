/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Teste;

/**
 *
 * @author LAB118-PC01
 */
public class JOGAR extends javax.swing.JFrame {

    /**
     * Creates new form JOGAR
     */
    public JOGAR() {
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

        jButton3 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();

        jButton3.setText("jButton1");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("2");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton4.setText("3");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("4");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jLabel1.setText("Questão:");

        jLabel2.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jLabel2AncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        jButton6.setText("X");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(83, 83, 83)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                            .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(80, 94, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(62, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String escolha = "a";
        if (TextResp.verificarResposta(IdPergunta.idPergunta, escolha) == true) {IdPergunta.pontuacao++;}
        
        if (IdPergunta.idPergunta == 12) {
            Final fim = new Final();
            fim.setVisible(true);
            this.dispose();
        }
        
        else if (IdPergunta.idPergunta == 1) {
            IdPergunta.idPergunta = 2;
            String pergunta = TextPerg.getPergunta(IdPergunta.idPergunta);
            String[] alternativas = TextResp.getAlternativas(IdPergunta.idPergunta);
            jLabel2.setText(pergunta);
            jButton1.setText(alternativas[0]);
            jButton2.setText(alternativas[1]);
            jButton4.setText(alternativas[2]);
            jButton5.setText(alternativas[3]);}
        
        else {
        IdPergunta.idPergunta++;
        String pergunta = TextPerg.getPergunta(IdPergunta.idPergunta);
        String[] alternativas = TextResp.getAlternativas(IdPergunta.idPergunta);
        jLabel2.setText(pergunta);
        jButton1.setText(alternativas[0]);
        jButton2.setText(alternativas[1]);
        jButton4.setText(alternativas[2]);
        jButton5.setText(alternativas[3]);}
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        String escolha = "b";
        if (TextResp.verificarResposta(IdPergunta.idPergunta, escolha) == true) {IdPergunta.pontuacao++;}
        
        if (IdPergunta.idPergunta == 12) {
            Final fim = new Final();
            fim.setVisible(true);
            this.dispose();
        }
        
        else if (IdPergunta.idPergunta == 1) {
            IdPergunta.idPergunta = 2;
            String pergunta = TextPerg.getPergunta(IdPergunta.idPergunta);
            String[] alternativas = TextResp.getAlternativas(IdPergunta.idPergunta);
            jLabel2.setText(pergunta);
            jButton1.setText(alternativas[0]);
            jButton2.setText(alternativas[1]);
            jButton4.setText(alternativas[2]);
            jButton5.setText(alternativas[3]);}
        
        else {
        IdPergunta.idPergunta++;
        String pergunta = TextPerg.getPergunta(IdPergunta.idPergunta);
        String[] alternativas = TextResp.getAlternativas(IdPergunta.idPergunta);
        jLabel2.setText(pergunta);
        jButton1.setText(alternativas[0]);
        jButton2.setText(alternativas[1]);
        jButton4.setText(alternativas[2]);
        jButton5.setText(alternativas[3]);}
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        String escolha = "c";
        if (TextResp.verificarResposta(IdPergunta.idPergunta, escolha) == true) {IdPergunta.pontuacao++;}
        
        if (IdPergunta.idPergunta == 12) {
            Final fim = new Final();
            fim.setVisible(true);
            this.dispose();
        }
        
        else if (IdPergunta.idPergunta == 1) {
            IdPergunta.idPergunta = 2;
            String pergunta = TextPerg.getPergunta(IdPergunta.idPergunta);
            String[] alternativas = TextResp.getAlternativas(IdPergunta.idPergunta);
            jLabel2.setText(pergunta);
            jButton1.setText(alternativas[0]);
            jButton2.setText(alternativas[1]);
            jButton4.setText(alternativas[2]);
            jButton5.setText(alternativas[3]);}
        
        else {
        IdPergunta.idPergunta++;
        String pergunta = TextPerg.getPergunta(IdPergunta.idPergunta);
        String[] alternativas = TextResp.getAlternativas(IdPergunta.idPergunta);
        jLabel2.setText(pergunta);
        jButton1.setText(alternativas[0]);
        jButton2.setText(alternativas[1]);
        jButton4.setText(alternativas[2]);
        jButton5.setText(alternativas[3]);}
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        String escolha = "d";
        if (TextResp.verificarResposta(IdPergunta.idPergunta, escolha) == true) {IdPergunta.pontuacao++;}
        
        if (IdPergunta.idPergunta == 12) {
            Final fim = new Final();
            fim.setVisible(true);
            this.dispose();
        }
        else if (IdPergunta.idPergunta == 1) {
            IdPergunta.idPergunta = 2;
            String pergunta = TextPerg.getPergunta(IdPergunta.idPergunta);
            String[] alternativas = TextResp.getAlternativas(IdPergunta.idPergunta);
            jLabel2.setText(pergunta);
            jButton1.setText(alternativas[0]);
            jButton2.setText(alternativas[1]);
            jButton4.setText(alternativas[2]);
            jButton5.setText(alternativas[3]);
        }
        else {
        IdPergunta.idPergunta++;
        String pergunta = TextPerg.getPergunta(IdPergunta.idPergunta);
        String[] alternativas = TextResp.getAlternativas(IdPergunta.idPergunta);
        jLabel2.setText(pergunta);
        jButton1.setText(alternativas[0]);
        jButton2.setText(alternativas[1]);
        jButton4.setText(alternativas[2]);
        jButton5.setText(alternativas[3]);}
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        IdPergunta.idPergunta = 1;
        IdPergunta.pontuacao = 0;
        Tela menu = new Tela();
        menu.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jLabel2AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jLabel2AncestorAdded
        
        String pergunta = TextPerg.getPergunta(IdPergunta.idPergunta);
        String[] alternativas = TextResp.getAlternativas(IdPergunta.idPergunta);
        jLabel2.setText(pergunta);
        jButton1.setText(alternativas[0]);
        jButton2.setText(alternativas[1]);
        jButton4.setText(alternativas[2]);
        jButton5.setText(alternativas[3]);
    }//GEN-LAST:event_jLabel2AncestorAdded

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
            java.util.logging.Logger.getLogger(JOGAR.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JOGAR.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JOGAR.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JOGAR.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JOGAR().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
