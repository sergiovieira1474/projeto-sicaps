/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package telas;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import login.LoginDAO;
import javax.swing.JOptionPane;
import javax.swing.Timer;

/**
 *
 * @author Elessandro
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    private Timer tempo;
    int cont;
    public final static int TWO_SECOND=5;
   
    
    public Login() {
        initComponents();
        setLocationRelativeTo(null); 
        barra.setVisible(false);   
        validar.setVisible(false);
        
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
        validar = new javax.swing.JLabel();
        barra = new javax.swing.JProgressBar();
        edtSenha = new javax.swing.JPasswordField();
        senha = new javax.swing.JLabel();
        btcancelar = new javax.swing.JLabel();
        btentrar = new javax.swing.JLabel();
        edtLogin = new javax.swing.JTextField();
        usuariio = new javax.swing.JLabel();
        login = new javax.swing.JLabel();
        validando = new javax.swing.JLabel();
        fundo2 = new javax.swing.JLabel();
        usuariio1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        validar.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        validar.setForeground(new java.awt.Color(255, 255, 255));
        validar.setText("Validando usuário...");
        jPanel1.add(validar, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 400, -1, -1));

        barra.setBackground(new java.awt.Color(0, 102, 255));
        barra.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 153, 153), null));
        jPanel1.add(barra, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 420, 438, 15));

        edtSenha.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        edtSenha.setBorder(null);
        jPanel1.add(edtSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(462, 324, 120, 20));

        senha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/senha.jpg"))); // NOI18N
        jPanel1.add(senha, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 320, -1, -1));

        btcancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/btcancelar.jpg"))); // NOI18N
        btcancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btcancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btcancelarMouseClicked(evt);
            }
        });
        jPanel1.add(btcancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 380, -1, -1));

        btentrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/btentrar.jpg"))); // NOI18N
        btentrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btentrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btentrarMouseClicked(evt);
            }
        });
        jPanel1.add(btentrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 380, -1, -1));

        edtLogin.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        edtLogin.setBorder(null);
        jPanel1.add(edtLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 270, 120, 20));

        usuariio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/usuario.jpg"))); // NOI18N
        jPanel1.add(usuariio, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 260, 200, 40));

        login.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/login.jpg"))); // NOI18N
        jPanel1.add(login, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 210, -1, -1));

        validando.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/fundo1.jpg"))); // NOI18N
        jPanel1.add(validando, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 880, -1));

        fundo2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/fundo2.jpg"))); // NOI18N
        jPanel1.add(fundo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, -1));

        usuariio1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/usuario.jpg"))); // NOI18N
        jPanel1.add(usuariio1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 260, 200, 40));

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

    private void btentrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btentrarMouseClicked
        // TODO add your handling code here:
        
         LoginDAO dao = new LoginDAO();
         
       if (dao.autenticacao(edtLogin.getText(), edtSenha.getText())){
           barra.setVisible(true);
           validar.setVisible(true);
           cont=-1;
           barra.setValue(0);
           barra.setStringPainted(true);
           tempo = new Timer(TWO_SECOND,new TimerListener());
          mostrar();
           
           
        } else {
            JOptionPane.showMessageDialog(rootPane, "Erro ao logar");
            
        }
        
    }//GEN-LAST:event_btentrarMouseClicked

    private void btcancelarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btcancelarMouseClicked
        dispose();
    }//GEN-LAST:event_btcancelarMouseClicked

    /**
     * @param args the command line arguments
     */
    
    class TimerListener implements ActionListener{
              public void actionPerformed(ActionEvent e)
              {
                  cont++;
                  barra.setValue(cont);
                  if(cont==100){
                      tempo.stop();
                      esconderbarra();
                      
                       dispose();
                        Principal tp = new Principal();
                        tp.setVisible(true);
                  }
            }
    }
    public void esconderbarra(){this.setVisible(false);}
    public void mostrar(){tempo.start();}
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JProgressBar barra;
    private javax.swing.JLabel btcancelar;
    private javax.swing.JLabel btentrar;
    private javax.swing.JTextField edtLogin;
    private javax.swing.JPasswordField edtSenha;
    private javax.swing.JLabel fundo2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel login;
    private javax.swing.JLabel senha;
    private javax.swing.JLabel usuariio;
    private javax.swing.JLabel usuariio1;
    private javax.swing.JLabel validando;
    private javax.swing.JLabel validar;
    // End of variables declaration//GEN-END:variables
}
