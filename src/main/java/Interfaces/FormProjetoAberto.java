/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interfaces;

import Classes.Requisitos;
import Classes.*;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;



/**
 *
 * @author GUst
 */
public class FormProjetoAberto extends javax.swing.JFrame {

    Usuario usuario = new Usuario();
    Projeto projeto = new Projeto();
    Requisitos formReq;
    
 
    public FormProjetoAberto() {
        initComponents();
    
      
        formReq = new Requisitos();
        Vector listaReq = formReq.recuperarListaRequisitos(projeto.getId());

        Vector colunas = new Vector<>();

        colunas.add("id_requisito");
        colunas.add("nome");
        colunas.add("modulo");
        colunas.add("funcionalidades");
        colunas.add("dataCriacao");
        colunas.add("autor");
        colunas.add("dataAlteracao");
        colunas.add("autorAlteracao");
        colunas.add("versao");
        colunas.add("prioridade");
        colunas.add("complexidade");
        colunas.add("eforcoHoras");
        colunas.add("estado");
        colunas.add("fase");
        colunas.add("descricao");
        colunas.add("id_projeto");
      
        DefaultTableModel dataModel = new DefaultTableModel();

        dataModel.setDataVector(listaReq, colunas);

        tbReq.setModel(dataModel);
  
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
        btGerarRelatorio = new javax.swing.JButton();
        btVoltarTelaInicial = new javax.swing.JButton();
        btInserirRequisito = new javax.swing.JButton();
        btExcluir = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbReq = new javax.swing.JTable();
        btEditar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btMostrarTb = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lbTitulo1.setFont(new java.awt.Font("Goudy Old Style", 0, 24)); // NOI18N
        lbTitulo1.setText("Projeto");

        btGerarRelatorio.setText("Gerar Relatório");
        btGerarRelatorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btGerarRelatorioActionPerformed(evt);
            }
        });

        btVoltarTelaInicial.setText("Voltar");
        btVoltarTelaInicial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btVoltarTelaInicialActionPerformed(evt);
            }
        });

        btInserirRequisito.setText("Inserir Requisito");
        btInserirRequisito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btInserirRequisitoActionPerformed(evt);
            }
        });

        btExcluir.setText("Excluir");
        btExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExcluirActionPerformed(evt);
            }
        });

        tbReq.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "id_requisito", "nome", "modulo", "funcionalidades", "dataCriacao", "autor", "dataAlteracao", "autorAlteracao", "versao", "prioridade", "complexidade", "eforcoHoras", "estado", "fase", "descricao", "id_projeto"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true, true, true, true, true, true, true, true, true, true, true, true, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbReq.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbReqMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tbReq);

        btEditar.setText("Editar");
        btEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEditarActionPerformed(evt);
            }
        });

        jLabel1.setText("id");

        btMostrarTb.setText("Mostrar Tabela");
        btMostrarTb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btMostrarTbActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(329, 329, 329)
                .addComponent(lbTitulo1, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(123, 123, 123))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 27, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btMostrarTb)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 923, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btVoltarTelaInicial)
                .addGap(26, 26, 26)
                .addComponent(btEditar)
                .addGap(34, 34, 34)
                .addComponent(btExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(btGerarRelatorio, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btInserirRequisito, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(69, 69, 69))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbTitulo1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(9, 9, 9)
                .addComponent(btMostrarTb)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 68, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btVoltarTelaInicial)
                    .addComponent(btGerarRelatorio)
                    .addComponent(btExcluir)
                    .addComponent(btEditar)
                    .addComponent(btInserirRequisito))
                .addGap(32, 32, 32))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btGerarRelatorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btGerarRelatorioActionPerformed

    }//GEN-LAST:event_btGerarRelatorioActionPerformed

    private void btVoltarTelaInicialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btVoltarTelaInicialActionPerformed
        FormGerenciarProjeto formGerenciarProjeto = new FormGerenciarProjeto();

        formGerenciarProjeto.setVisible(true);
        formGerenciarProjeto.usuario = usuario;

        setVisible(false);
    }//GEN-LAST:event_btVoltarTelaInicialActionPerformed

    private void btInserirRequisitoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btInserirRequisitoActionPerformed
            FormInserirRequisito telaReq = new FormInserirRequisito();
            
            telaReq.proj=projeto;
            telaReq.usuario=usuario;
            
            
            telaReq.setVisible(true);
            
    }//GEN-LAST:event_btInserirRequisitoActionPerformed

    private void btExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExcluirActionPerformed
            Requisitos req = new Requisitos();
        
        if (tbReq.getSelectedRow() != -1){

            
            req.setId((int)tbReq.getValueAt(tbReq.getSelectedRow(), 0));


            req.excluirRequisito(req.getId());
            

        } else{
            JOptionPane.showMessageDialog(null, "Selecione uma linha para excluir");
        }
       
    }//GEN-LAST:event_btExcluirActionPerformed

    private void tbReqMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbReqMouseClicked

    }//GEN-LAST:event_tbReqMouseClicked

    private void btEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEditarActionPerformed
        FormEditarRequisito telaEditar = new FormEditarRequisito();
        if (tbReq.getSelectedRow() != -1){

            telaEditar.req.setId((int)tbReq.getValueAt(tbReq.getSelectedRow(), 0));
 
            telaEditar.usuario = usuario;
            telaEditar.proj = projeto;
            telaEditar.setVisible(true);
            
        } else{
            JOptionPane.showMessageDialog(null, "Selecione uma linha.");
        }
       
        
    }//GEN-LAST:event_btEditarActionPerformed

    private void btMostrarTbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btMostrarTbActionPerformed
            
      
        formReq = new Requisitos();
        Vector listaReq = formReq.recuperarListaRequisitos(projeto.getId());

        Vector colunas = new Vector<>();

        colunas.add("id_requisito");
        colunas.add("nome");
        colunas.add("modulo");
        colunas.add("funcionalidades");
        colunas.add("dataCriacao");
        colunas.add("autor");
        colunas.add("dataAlteracao");
        colunas.add("autorAlteracao");
        colunas.add("versao");
        colunas.add("prioridade");
        colunas.add("complexidade");
        colunas.add("eforcoHoras");
        colunas.add("estado");
        colunas.add("fase");
        colunas.add("descricao");
        colunas.add("id_projeto");
      
        DefaultTableModel dataModel = new DefaultTableModel();

        dataModel.setDataVector(listaReq, colunas);

        tbReq.setModel(dataModel);
  
    

    }//GEN-LAST:event_btMostrarTbActionPerformed

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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btEditar;
    private javax.swing.JButton btExcluir;
    private javax.swing.JButton btGerarRelatorio;
    private javax.swing.JButton btInserirRequisito;
    private javax.swing.JButton btMostrarTb;
    private javax.swing.JButton btVoltarTelaInicial;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lbTitulo1;
    private javax.swing.JTable tbReq;
    // End of variables declaration//GEN-END:variables
}
