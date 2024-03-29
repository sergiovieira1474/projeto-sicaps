/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package telas;

import instituicao.Instituicao;
import instituicao.InstituicaoDAO;
import instituicao.InstituicaoTableModal;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import profissional.Profissional;
import profissional.profissionalDAO;

public class CadInstituicao extends javax.swing.JDialog {

    /**
     * Creates new form cadProfissional
     */
    Instituicao instituicao;
    //Instituicao pesquisacampos = new Instituicao();
    
    public CadInstituicao() {
        setLocationRelativeTo(null);
        initComponents();
        setModal(true);
        
         InstituicaoDAO listar = new  InstituicaoDAO();
        InstituicaoTableModal tb=new InstituicaoTableModal(listar.listar());
        tbListarInstituicao.setModel(tb);
        
       
    }
    public CadInstituicao(Instituicao instituicoes){
        setLocationRelativeTo(null);
        initComponents();
        setModal(true);
        this.instituicao=instituicoes;
        edtNum.setText(instituicoes.getNum());
        edtCNES.setText(instituicoes.getCnes());
        edtTelefone.setText(instituicoes.getTelefone());
        SimpleDateFormat sf = new SimpleDateFormat("dd/MM/yyyy");
        edtData.setText(sf.format(instituicao.getData()));
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
        nome1 = new javax.swing.JLabel();
        edtNome = new javax.swing.JTextField();
        RG1 = new javax.swing.JLabel();
        enderço1 = new javax.swing.JLabel();
        edtEndereco = new javax.swing.JTextField();
        N1 = new javax.swing.JLabel();
        edtNum = new javax.swing.JTextField();
        bairro1 = new javax.swing.JLabel();
        edtBairro = new javax.swing.JTextField();
        telefone1 = new javax.swing.JLabel();
        edtTelefone = new javax.swing.JFormattedTextField();
        jLabel2 = new javax.swing.JLabel();
        edtData = new javax.swing.JFormattedTextField();
        edtUF = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        edtCNES = new javax.swing.JFormattedTextField();
        edtFantasia = new javax.swing.JTextField();
        borda2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        Salvar = new javax.swing.JButton();
        limpar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbListarInstituicao = new javax.swing.JTable();
        editar = new javax.swing.JButton();
        excluir = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        nome1.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        nome1.setText("Nome.:");
        jPanel2.add(nome1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, -1, -1));

        edtNome.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jPanel2.add(edtNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 40, 320, -1));

        RG1.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        RG1.setText("Nome Fantasia.:");
        jPanel2.add(RG1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 40, -1, -1));

        enderço1.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        enderço1.setText("Endereço.:");
        enderço1.setToolTipText("");
        jPanel2.add(enderço1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, -1, -1));

        edtEndereco.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jPanel2.add(edtEndereco, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 80, 270, -1));

        N1.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        N1.setText("Nº.:");
        jPanel2.add(N1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 80, 30, 20));

        edtNum.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jPanel2.add(edtNum, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 80, 80, -1));

        bairro1.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        bairro1.setText("Bairro.:");
        jPanel2.add(bairro1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 80, -1, -1));

        edtBairro.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jPanel2.add(edtBairro, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 80, 250, -1));

        telefone1.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        telefone1.setText("Telefone.:");
        jPanel2.add(telefone1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, -1, -1));

        try {
            edtTelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        edtTelefone.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        edtTelefone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edtTelefoneActionPerformed(evt);
            }
        });
        jPanel2.add(edtTelefone, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 160, 160, -1));

        jLabel2.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel2.setText("CNES.:");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 120, -1, -1));

        try {
            edtData.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        edtData.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jPanel2.add(edtData, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 120, 160, -1));

        edtUF.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        edtUF.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Estado", "CE", "PE", "BH", "MA", " " }));
        jPanel2.add(edtUF, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 120, -1, -1));

        jLabel5.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel5.setText("Data.:");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, -1, -1));

        try {
            edtCNES.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#######")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        edtCNES.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jPanel2.add(edtCNES, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 120, 170, -1));

        edtFantasia.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jPanel2.add(edtFantasia, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 40, 250, -1));

        borda2.setBackground(new java.awt.Color(51, 51, 51));
        borda2.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        borda2.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true), "Cadastrar Instituição", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Verdana", 1, 14), new java.awt.Color(51, 51, 51))); // NOI18N
        borda2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel2.add(borda2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 860, 190));

        jPanel3.setBackground(java.awt.SystemColor.activeCaption);
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Salvar.setBackground(new java.awt.Color(255, 255, 255));
        Salvar.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        Salvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/salvar.png"))); // NOI18N
        Salvar.setText("Salvar");
        Salvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalvarActionPerformed(evt);
            }
        });
        jPanel3.add(Salvar, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 10, -1, -1));

        limpar.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        limpar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/limpar.png"))); // NOI18N
        limpar.setText("Limpar");
        limpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limparActionPerformed(evt);
            }
        });
        jPanel3.add(limpar, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 10, -1, -1));

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 870, 50));

        tbListarInstituicao.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Nome", "Nome Fantasia"
            }
        ));
        jScrollPane1.setViewportView(tbListarInstituicao);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, 720, 220));

        editar.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        editar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/editar.png"))); // NOI18N
        editar.setText("Editar");
        editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarActionPerformed(evt);
            }
        });
        jPanel2.add(editar, new org.netbeans.lib.awtextra.AbsoluteConstraints(743, 300, 130, -1));

        excluir.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        excluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/excluir.png"))); // NOI18N
        excluir.setText("Excluir");
        excluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                excluirActionPerformed(evt);
            }
        });
        jPanel2.add(excluir, new org.netbeans.lib.awtextra.AbsoluteConstraints(743, 340, 130, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 880, 510));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/fundo2.jpg"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void edtTelefoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edtTelefoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edtTelefoneActionPerformed

    private void SalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalvarActionPerformed
        // TODO add your handling code here:
         
        if(instituicao==null){
            instituicao = new Instituicao();
        }
       instituicao.setNomeInstituicao(edtNome.getText());
       instituicao.setNomeFantasia(edtFantasia.getText());  
       instituicao.setEndereco(edtEndereco.getText());
       instituicao.setNum(edtNum.getText());
       instituicao.setBairro(edtBairro.getText());
       instituicao.setCnes(edtCNES.getText());
       instituicao.setEstado(edtUF.getSelectedItem().toString());
     
       instituicao.setTelefone(edtTelefone.getText());
      
       try {
                if (!edtData.getText().replaceAll("/", "").isEmpty()) {
                    DateFormat fmt = new SimpleDateFormat("dd/MM/yyyy");
                    java.util.Date data;
                    data = new java.util.Date(fmt.parse(edtData.getText()).getTime());
                    instituicao.setData(data);
                }
            } catch (ParseException ex) {
                Logger.getLogger(CadInstituicao.class.getName()).log(Level.SEVERE, null, ex);

            }

       InstituicaoDAO pDao = new InstituicaoDAO();
       pDao.salvar(instituicao);
       
       JOptionPane.showMessageDialog(edtNome, 
                "Instituição : "+instituicao.getNomeInstituicao()+
                ", Cadastrada com Sucesso!");
        edtNome.setText("");
        edtFantasia.setText("");
        edtEndereco.setText("");
        edtNum.setText("");
        edtCNES.setText("");
        edtUF.setSelectedIndex(0);
        edtData.setText("");
        edtBairro.setText("");
        edtTelefone.setText("");
    
        InstituicaoDAO listar = new  InstituicaoDAO();
        InstituicaoTableModal tb=new InstituicaoTableModal(listar.listar());
        tbListarInstituicao.setModel(tb);
        

    }//GEN-LAST:event_SalvarActionPerformed

    private void editarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarActionPerformed
        // TODO add your handling code here:
       int linha = tbListarInstituicao.getSelectedRow();
        if(linha==-1){
            JOptionPane.showMessageDialog(rootPane, "Selecione a instituição para editar!");
            
        }else{
            Instituicao insti= new Instituicao();
            int codigo = (int)tbListarInstituicao.getValueAt(linha, 0);
            InstituicaoDAO instdao = new InstituicaoDAO();
            instituicao=instdao.pesquisaCodigo(codigo);
            edtBairro.setText(instituicao.getBairro());
            edtEndereco.setText(instituicao.getEndereco());
            edtNome.setText(instituicao.getNomeInstituicao());
            edtFantasia.setText(instituicao.getNomeFantasia());
            edtUF.setSelectedItem(instituicao.getEstado());
            edtNum.setText(instituicao.getNum());
            edtCNES.setText(instituicao.getCnes());
            edtTelefone.setText(instituicao.getTelefone());
            SimpleDateFormat sf = new SimpleDateFormat("dd/MM/yyyy");
            edtData.setText(sf.format(instituicao.getData()));
            
            
            
            
            
        }
        
    }//GEN-LAST:event_editarActionPerformed

    private void excluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_excluirActionPerformed
        // TODO add your handling code here:
        
        int linha = tbListarInstituicao.getSelectedRow();
        if(linha==-1){
            JOptionPane.showMessageDialog(rootPane, "Selecione a instituição a ser excluida!");
            
        }else{
            if(JOptionPane.showConfirmDialog(rootPane, "Deseja realmente excluir!","Excluir",JOptionPane.YES_NO_OPTION)==JOptionPane.YES_OPTION){
                Instituicao inst = new Instituicao();
                int codigo = (int)tbListarInstituicao.getValueAt(linha, 0);
                InstituicaoDAO instdao = new InstituicaoDAO();
                inst = instdao.pesquisaCodigo(codigo);
                instdao.excluir(inst);
                
                InstituicaoDAO in = new InstituicaoDAO();
                InstituicaoTableModal tbinst = new InstituicaoTableModal(in.listar());
                tbListarInstituicao.setModel(tbinst);
            }
        }
    }//GEN-LAST:event_excluirActionPerformed

    private void limparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limparActionPerformed
        // TODO add your handling code here:
        edtNome.setText("");
        edtFantasia.setText("");
        edtEndereco.setText("");
        edtNum.setText("");
        edtCNES.setText("");
        edtUF.setSelectedIndex(0);
        edtData.setText("");
        edtBairro.setText("");
        edtTelefone.setText("");
    }//GEN-LAST:event_limparActionPerformed
       
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
            java.util.logging.Logger.getLogger(CadInstituicao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadInstituicao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadInstituicao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadInstituicao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadInstituicao().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel N1;
    private javax.swing.JLabel RG1;
    private javax.swing.JButton Salvar;
    private javax.swing.JLabel bairro1;
    private javax.swing.JLabel borda2;
    private javax.swing.JButton editar;
    private javax.swing.JTextField edtBairro;
    private javax.swing.JFormattedTextField edtCNES;
    private javax.swing.JFormattedTextField edtData;
    private javax.swing.JTextField edtEndereco;
    private javax.swing.JTextField edtFantasia;
    private javax.swing.JTextField edtNome;
    private javax.swing.JTextField edtNum;
    private javax.swing.JFormattedTextField edtTelefone;
    private javax.swing.JComboBox edtUF;
    private javax.swing.JLabel enderço1;
    private javax.swing.JButton excluir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton limpar;
    private javax.swing.JLabel nome1;
    private javax.swing.JTable tbListarInstituicao;
    private javax.swing.JLabel telefone1;
    // End of variables declaration//GEN-END:variables
}
