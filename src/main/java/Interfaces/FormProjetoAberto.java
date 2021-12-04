/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interfaces;

/**
 *
 * @author GUst
 */
public class FormProjetoAberto extends javax.swing.JFrame {

    private String nomeUsuario;

    public String getNomeUsuario() {
        return nomeUsuario;
    }

    public void setNomeUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }
    
    /**
     * Creates new form FormProjetoAberto
     */
    public FormProjetoAberto() {
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

        lbTitulo1 = new javax.swing.JLabel();
        scrolPainel = new javax.swing.JScrollPane();
        txaDescricaoProjAberto = new javax.swing.JTextArea();
        lbNomeProj = new javax.swing.JLabel();
        txfNomeProjAberto = new javax.swing.JTextField();
        lbDescricaoProj = new javax.swing.JLabel();
        btAbrirProjeto = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbProj = new javax.swing.JTable();
        btVoltarTelaInicial = new javax.swing.JButton();
        btAbrirProjeto1 = new javax.swing.JButton();
        btAbrirProjeto2 = new javax.swing.JButton();
        btAbrirProjeto3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lbTitulo1.setFont(new java.awt.Font("Goudy Old Style", 0, 24)); // NOI18N
        lbTitulo1.setText("Projeto");

        txaDescricaoProjAberto.setColumns(20);
        txaDescricaoProjAberto.setRows(5);
        scrolPainel.setViewportView(txaDescricaoProjAberto);

        lbNomeProj.setText("Nome:");

        txfNomeProjAberto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txfNomeProjAbertoActionPerformed(evt);
            }
        });

        lbDescricaoProj.setText("Descrição do Projeto:");

        btAbrirProjeto.setText("Gerar Relatório");
        btAbrirProjeto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAbrirProjetoActionPerformed(evt);
            }
        });

        tbProj.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "id_requisito", "nome", "modulo", "funcionalidades", "dataCriacao", "autor", "dataAlteracao", "autorAlteracao", "versao", "prioridade", "complexidade", "eforcoHoras", "estado", "fase", "descricao", "id_projeto"
            }
        ));
        tbProj.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbProjMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tbProj);

        jScrollPane1.setViewportView(jScrollPane2);

        btVoltarTelaInicial.setText("Voltar");
        btVoltarTelaInicial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btVoltarTelaInicialActionPerformed(evt);
            }
        });

        btAbrirProjeto1.setText("Inserir Requisito");
        btAbrirProjeto1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAbrirProjeto1ActionPerformed(evt);
            }
        });

        btAbrirProjeto2.setText("Editar");
        btAbrirProjeto2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAbrirProjeto2ActionPerformed(evt);
            }
        });

        btAbrirProjeto3.setText("Excluir");
        btAbrirProjeto3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAbrirProjeto3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(214, 214, 214)
                        .addComponent(lbTitulo1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btVoltarTelaInicial)
                                .addGap(28, 28, 28)
                                .addComponent(btAbrirProjeto2, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27)
                                .addComponent(btAbrirProjeto3, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btAbrirProjeto, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(lbDescricaoProj, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(lbNomeProj, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txfNomeProjAberto))
                                    .addComponent(scrolPainel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 434, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 446, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btAbrirProjeto1, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(43, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(lbTitulo1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbNomeProj, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txfNomeProjAberto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbDescricaoProj, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scrolPainel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btAbrirProjeto1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btVoltarTelaInicial)
                    .addComponent(btAbrirProjeto)
                    .addComponent(btAbrirProjeto2)
                    .addComponent(btAbrirProjeto3))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txfNomeProjAbertoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txfNomeProjAbertoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txfNomeProjAbertoActionPerformed

    private void btAbrirProjetoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAbrirProjetoActionPerformed
        FormProjetoAberto formProjetoAberto = new FormProjetoAberto();
        formProjetoAberto.setVisible(true);
        setVisible(false);

    }//GEN-LAST:event_btAbrirProjetoActionPerformed

    private void tbProjMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbProjMouseClicked
        if(tbProj.getSelectedRow() != -1){

            txfNomeProjAberto.setText(tbProj.getValueAt(tbProj.getSelectedRow(), 1).toString());
            txaDescricaoProjAberto.setText(tbProj.getValueAt(tbProj.getSelectedRow(), 2).toString());

        }
    }//GEN-LAST:event_tbProjMouseClicked

    private void btVoltarTelaInicialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btVoltarTelaInicialActionPerformed
        FormGerenciarProjeto formGerenciarProjeto = new FormGerenciarProjeto();

        formGerenciarProjeto.setVisible(true);
        formGerenciarProjeto.setNomeUsuario(nomeUsuario);

        setVisible(false);
    }//GEN-LAST:event_btVoltarTelaInicialActionPerformed

    private void btAbrirProjeto1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAbrirProjeto1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btAbrirProjeto1ActionPerformed

    private void btAbrirProjeto2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAbrirProjeto2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btAbrirProjeto2ActionPerformed

    private void btAbrirProjeto3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAbrirProjeto3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btAbrirProjeto3ActionPerformed

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
            java.util.logging.Logger.getLogger(FormProjetoAberto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormProjetoAberto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormProjetoAberto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormProjetoAberto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormProjetoAberto().setVisible(true);
            }
        });
    }

   public void recebendoTexto(String t){
       txfNomeProjAberto.setText(t);
       txaDescricaoProjAberto.setText(t);
   }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAbrirProjeto;
    private javax.swing.JButton btAbrirProjeto1;
    private javax.swing.JButton btAbrirProjeto2;
    private javax.swing.JButton btAbrirProjeto3;
    private javax.swing.JButton btVoltarTelaInicial;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lbDescricaoProj;
    private javax.swing.JLabel lbNomeProj;
    private javax.swing.JLabel lbTitulo1;
    private javax.swing.JScrollPane scrolPainel;
    private javax.swing.JTable tbProj;
    private javax.swing.JTextArea txaDescricaoProjAberto;
    private javax.swing.JTextField txfNomeProjAberto;
    // End of variables declaration//GEN-END:variables
}
