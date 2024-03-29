/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package telas;

import javax.swing.ImageIcon;



/**
 *
 * @author Elessandro
 */
public class Principal extends javax.swing.JDialog {

    /**
     * Creates new form principal
     */
    public Principal() {
        initComponents();
        setLocationRelativeTo(null); 
        setModal(true);
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
        sair = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        btnovopaciente = new javax.swing.JLabel();
        btlocalizar = new javax.swing.JLabel();
        btTriagem = new javax.swing.JLabel();
        btprofissional = new javax.swing.JLabel();
        btnovoprocedimento = new javax.swing.JLabel();
        btobservacoes = new javax.swing.JLabel();
        btmedicacao = new javax.swing.JLabel();
        btbacukp = new javax.swing.JLabel();
        cadprofissional = new javax.swing.JLabel();
        atendimento = new javax.swing.JLabel();
        profissional = new javax.swing.JLabel();
        fundo2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        sair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/sair.jpg"))); // NOI18N
        sair.setToolTipText("");
        jPanel2.add(sair, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 20, -1, 50));

        jPanel3.setBackground(new java.awt.Color(199, 240, 254));
        jPanel3.setForeground(new java.awt.Color(102, 102, 102));

        btnovopaciente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/btnovopaciente.jpg"))); // NOI18N
        btnovopaciente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnovopaciente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnovopacienteMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnovopacienteMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnovopacienteMouseExited(evt);
            }
        });
        jPanel3.add(btnovopaciente);

        btlocalizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/btlocalizar.jpg"))); // NOI18N
        btlocalizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btlocalizarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btlocalizarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btlocalizarMouseExited(evt);
            }
        });
        jPanel3.add(btlocalizar);

        btTriagem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bttriagem.jpg"))); // NOI18N
        btTriagem.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btTriagem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btTriagemMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btTriagemMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btTriagemMouseExited(evt);
            }
        });
        jPanel3.add(btTriagem);

        btprofissional.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/btverde.jpg"))); // NOI18N
        btprofissional.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btprofissionalMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btprofissionalMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btprofissionalMouseExited(evt);
            }
        });
        jPanel3.add(btprofissional);

        btnovoprocedimento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/psicologo.jpg"))); // NOI18N
        btnovoprocedimento.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnovoprocedimentoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnovoprocedimentoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnovoprocedimentoMouseExited(evt);
            }
        });
        jPanel3.add(btnovoprocedimento);

        btobservacoes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/assistente.jpg"))); // NOI18N
        btobservacoes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btobservacoesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btobservacoesMouseExited(evt);
            }
        });
        jPanel3.add(btobservacoes);

        btmedicacao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/btevoluão.jpg"))); // NOI18N
        btmedicacao.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btmedicacaoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btmedicacaoMouseExited(evt);
            }
        });
        jPanel3.add(btmedicacao);

        btbacukp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/instituição.jpg"))); // NOI18N
        btbacukp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btbacukpMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btbacukpMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btbacukpMouseExited(evt);
            }
        });
        jPanel3.add(btbacukp);

        cadprofissional.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/profissional.jpg"))); // NOI18N
        cadprofissional.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cadprofissional.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cadprofissionalMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                cadprofissionalMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                cadprofissionalMouseExited(evt);
            }
        });
        jPanel3.add(cadprofissional);

        atendimento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/atendimentos.jpg"))); // NOI18N
        atendimento.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                atendimentoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                atendimentoMouseExited(evt);
            }
        });
        jPanel3.add(atendimento);

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 80, 770, 320));

        profissional.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/fundo1.jpg"))); // NOI18N
        jPanel2.add(profissional, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 880, 520));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 880, 510));

        fundo2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/fundo2.jpg"))); // NOI18N
        jPanel1.add(fundo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

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

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnovopacienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnovopacienteMouseClicked
      CadAtendimento p=new CadAtendimento();
        p.setVisible(true);
       
    }//GEN-LAST:event_btnovopacienteMouseClicked
    
    private void btprofissionalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btprofissionalMouseClicked
     
    }//GEN-LAST:event_btprofissionalMouseClicked

    private void cadprofissionalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cadprofissionalMouseClicked
        // TODO add your handling code here:
         CadProfissional p=new CadProfissional();
         p.setVisible(true);
         
    }//GEN-LAST:event_cadprofissionalMouseClicked

    private void btTriagemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btTriagemMouseClicked
        // TODO add your handling code here:
          CadTriagemAdmissao t=new CadTriagemAdmissao();
         t.setVisible(true);
         
    }//GEN-LAST:event_btTriagemMouseClicked

    private void btnovopacienteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnovopacienteMouseEntered
        // TODO add your handling code here:
        ImageIcon II = new ImageIcon(getClass().getResource("/imagens/btnovopaciente2.png"));
        btnovopaciente.setIcon(II);
    }//GEN-LAST:event_btnovopacienteMouseEntered

    private void btnovopacienteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnovopacienteMouseExited
        // TODO add your handling code here:
         ImageIcon II = new ImageIcon(getClass().getResource("/imagens/btnovopaciente.jpg"));
        btnovopaciente.setIcon(II);
    }//GEN-LAST:event_btnovopacienteMouseExited

    private void btlocalizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btlocalizarMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btlocalizarMouseClicked

    private void btlocalizarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btlocalizarMouseEntered
        // TODO add your handling code here:
        ImageIcon II = new ImageIcon(getClass().getResource("/imagens/btlocalizar2.png"));
        btlocalizar.setIcon(II);
    }//GEN-LAST:event_btlocalizarMouseEntered

    private void btlocalizarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btlocalizarMouseExited
        // TODO add your handling code here:
         ImageIcon II = new ImageIcon(getClass().getResource("/imagens/btlocalizar.jpg"));
       btlocalizar.setIcon(II);
    }//GEN-LAST:event_btlocalizarMouseExited

    private void btTriagemMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btTriagemMouseEntered
        // TODO add your handling code here:
       ImageIcon II = new ImageIcon(getClass().getResource("/imagens/bttriagem2.png"));
       btTriagem.setIcon(II);
    }//GEN-LAST:event_btTriagemMouseEntered

    private void btTriagemMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btTriagemMouseExited
        // TODO add your handling code here:
            ImageIcon II = new ImageIcon(getClass().getResource("/imagens/bttriagem.jpg"));
       btTriagem.setIcon(II);
    
    }//GEN-LAST:event_btTriagemMouseExited

    private void btprofissionalMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btprofissionalMouseEntered
        // TODO add your handling code here:
          ImageIcon II = new ImageIcon(getClass().getResource("/imagens/btverde2.png"));
       btprofissional.setIcon(II);
    }//GEN-LAST:event_btprofissionalMouseEntered

    private void btprofissionalMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btprofissionalMouseExited
        // TODO add your handling code here:
        ImageIcon II = new ImageIcon(getClass().getResource("/imagens/btverde.jpg"));
       btprofissional.setIcon(II);
    }//GEN-LAST:event_btprofissionalMouseExited

    private void btnovoprocedimentoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnovoprocedimentoMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnovoprocedimentoMouseClicked

    private void btnovoprocedimentoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnovoprocedimentoMouseEntered
        // TODO add your handling code here:
         ImageIcon II = new ImageIcon(getClass().getResource("/imagens/psicologo2.png"));
       btnovoprocedimento.setIcon(II);
    }//GEN-LAST:event_btnovoprocedimentoMouseEntered

    private void btnovoprocedimentoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnovoprocedimentoMouseExited
        // TODO add your handling code here:
        ImageIcon II = new ImageIcon(getClass().getResource("/imagens/psicologo.jpg"));
       btnovoprocedimento.setIcon(II);
    }//GEN-LAST:event_btnovoprocedimentoMouseExited

    private void btobservacoesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btobservacoesMouseEntered
      ImageIcon II = new ImageIcon(getClass().getResource("/imagens/assistente2.png"));
       btobservacoes.setIcon(II);
    }//GEN-LAST:event_btobservacoesMouseEntered

    private void btobservacoesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btobservacoesMouseExited
        // TODO add your handling code here:
        ImageIcon II = new ImageIcon(getClass().getResource("/imagens/assistente.jpg"));
       btobservacoes.setIcon(II);
    }//GEN-LAST:event_btobservacoesMouseExited

    private void btmedicacaoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btmedicacaoMouseEntered
        // TODO add your handling code here:
         ImageIcon II = new ImageIcon(getClass().getResource("/imagens/btevoluão2.png"));
       btmedicacao.setIcon(II);
    }//GEN-LAST:event_btmedicacaoMouseEntered

    private void btmedicacaoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btmedicacaoMouseExited
        // TODO add your handling code here:
         ImageIcon II = new ImageIcon(getClass().getResource("/imagens/btevoluão.jpg"));
       btmedicacao.setIcon(II);
    }//GEN-LAST:event_btmedicacaoMouseExited

    private void btbacukpMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btbacukpMouseEntered
        // TODO add your handling code here:
        ImageIcon II = new ImageIcon(getClass().getResource("/imagens/instituição2.png"));
       btbacukp.setIcon(II);
    }//GEN-LAST:event_btbacukpMouseEntered

    private void btbacukpMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btbacukpMouseExited
        // TODO add your handling code here:
        ImageIcon II = new ImageIcon(getClass().getResource("/imagens/instituição.jpg"));
       btbacukp.setIcon(II);
    }//GEN-LAST:event_btbacukpMouseExited

    private void cadprofissionalMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cadprofissionalMouseEntered
        // TODO add your handling code here:
         ImageIcon II = new ImageIcon(getClass().getResource("/imagens/profissional2.png"));
       cadprofissional.setIcon(II);
    }//GEN-LAST:event_cadprofissionalMouseEntered

    private void cadprofissionalMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cadprofissionalMouseExited
        // TODO add your handling code here:
        ImageIcon II = new ImageIcon(getClass().getResource("/imagens/profissional.jpg"));
       cadprofissional.setIcon(II);
    }//GEN-LAST:event_cadprofissionalMouseExited

    private void atendimentoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_atendimentoMouseEntered
        // TODO add your handling code here:
         ImageIcon II = new ImageIcon(getClass().getResource("/imagens/atendimentos2.png"));
       atendimento.setIcon(II);
    }//GEN-LAST:event_atendimentoMouseEntered

    private void atendimentoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_atendimentoMouseExited
        // TODO add your handling code here:
         ImageIcon II = new ImageIcon(getClass().getResource("/imagens/atendimentos.jpg"));
       atendimento.setIcon(II);
    }//GEN-LAST:event_atendimentoMouseExited

    private void btbacukpMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btbacukpMouseClicked
        // TODO add your handling code here:
        CadInstituicao I = new CadInstituicao();
        I.setVisible(true);
        
    }//GEN-LAST:event_btbacukpMouseClicked

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel atendimento;
    private javax.swing.JLabel btTriagem;
    private javax.swing.JLabel btbacukp;
    private javax.swing.JLabel btlocalizar;
    private javax.swing.JLabel btmedicacao;
    private javax.swing.JLabel btnovopaciente;
    private javax.swing.JLabel btnovoprocedimento;
    private javax.swing.JLabel btobservacoes;
    private javax.swing.JLabel btprofissional;
    private javax.swing.JLabel cadprofissional;
    private javax.swing.JLabel fundo2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel profissional;
    private javax.swing.JLabel sair;
    // End of variables declaration//GEN-END:variables

}
