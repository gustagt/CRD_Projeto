package Interfaces;

import Classes.*;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author GUst
 */
public class FormGerenciarProjeto extends javax.swing.JFrame {

    /**
     * Creates new form formsAbrirProjeto
     */

    
    Projeto projForm ;
    Projeto proj = new Projeto();
    Usuario usuario = new Usuario();
    TableRowSorter trs;
    
    public FormGerenciarProjeto() {
        initComponents();

    }
    
    
    public void Filtro(){
        int ColumnTable = 1; //Coluna Nome do Projeto
        trs.setRowFilter(RowFilter.regexFilter(jtxtFiltro.getText(),ColumnTable));
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator2 = new javax.swing.JSeparator();
        jMenu1 = new javax.swing.JMenu();
        btEditarProjeto = new javax.swing.JButton();
        btExcluirProjeto = new javax.swing.JButton();
        btAtualizarProjeto = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbProj = new javax.swing.JTable();
        lbTitulo = new javax.swing.JLabel();
        lbNomeProj = new javax.swing.JLabel();
        txfNomeProj = new javax.swing.JTextField();
        lbDescricaoProj = new javax.swing.JLabel();
        scrolPainel = new javax.swing.JScrollPane();
        txaDescricaoProj = new javax.swing.JTextArea();
        btAbrirProjeto = new javax.swing.JButton();
        btCadastrarProjeto = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jtxtFiltro = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuGerenciarUsuarios = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        MenuSair = new javax.swing.JMenu();

        jMenu1.setText("jMenu1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("CDR - Requisitos");

        btEditarProjeto.setText("Editar");
        btEditarProjeto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEditarProjetoActionPerformed(evt);
            }
        });

        btExcluirProjeto.setText("Excluir");
        btExcluirProjeto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExcluirProjetoActionPerformed(evt);
            }
        });

        btAtualizarProjeto.setText("Gerar Relatório");
        btAtualizarProjeto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAtualizarProjetoActionPerformed(evt);
            }
        });

        tbProj.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "id_projeto", "nome_projeto", "descricao", "usuario_proprietario"
            }
        ));
        tbProj.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbProjMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tbProj);

        jScrollPane1.setViewportView(jScrollPane2);

        lbTitulo.setFont(new java.awt.Font("Goudy Old Style", 0, 24)); // NOI18N
        lbTitulo.setText("Gerenciar Projetos");

        lbNomeProj.setText("Nome:");

        txfNomeProj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txfNomeProjActionPerformed(evt);
            }
        });

        lbDescricaoProj.setText("Descrição do Projeto:");

        txaDescricaoProj.setColumns(20);
        txaDescricaoProj.setRows(5);
        scrolPainel.setViewportView(txaDescricaoProj);

        btAbrirProjeto.setText("Abrir Projeto");
        btAbrirProjeto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAbrirProjetoActionPerformed(evt);
            }
        });

        btCadastrarProjeto.setText("Cadastrar");
        btCadastrarProjeto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCadastrarProjetoActionPerformed(evt);
            }
        });

        jtxtFiltro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtFiltroActionPerformed(evt);
            }
        });
        jtxtFiltro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtxtFiltroKeyTyped(evt);
            }
        });

        jLabel2.setText("Filtrar:");

        menuGerenciarUsuarios.setText("Gerenciar Usuários");
        menuGerenciarUsuarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuGerenciarUsuariosMouseClicked(evt);
            }
        });
        jMenuBar1.add(menuGerenciarUsuarios);
        jMenuBar1.add(jMenu2);

        MenuSair.setText("Sair");
        MenuSair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MenuSairMouseClicked(evt);
            }
        });
        MenuSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuSairActionPerformed(evt);
            }
        });
        jMenuBar1.add(MenuSair);

        setJMenuBar(jMenuBar1);
        jMenuBar1.getAccessibleContext().setAccessibleDescription("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbDescricaoProj, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(jLabel2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jtxtFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btAtualizarProjeto)
                            .addGap(18, 18, 18)
                            .addComponent(btAbrirProjeto))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(btEditarProjeto)
                            .addGap(43, 43, 43)
                            .addComponent(btExcluirProjeto)
                            .addGap(35, 35, 35)
                            .addComponent(btCadastrarProjeto)
                            .addGap(98, 98, 98))
                        .addComponent(scrolPainel, javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(lbNomeProj)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txfNomeProj, javax.swing.GroupLayout.PREFERRED_SIZE, 408, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(20, Short.MAX_VALUE))
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(160, 160, 160))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(lbTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jtxtFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btAbrirProjeto)
                        .addComponent(btAtualizarProjeto)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbNomeProj, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txfNomeProj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbDescricaoProj, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scrolPainel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btEditarProjeto)
                    .addComponent(btExcluirProjeto)
                    .addComponent(btCadastrarProjeto))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btEditarProjetoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEditarProjetoActionPerformed
        Projeto proje = new Projeto();
        
        if (tbProj.getSelectedRow() != -1){

            proje.setId((int)tbProj.getValueAt(tbProj.getSelectedRow(), 0));
            proje.setNomeProj(txfNomeProj.getText());
            proje.setDescricaoProj(txaDescricaoProj.getText());
            

            
            proje.editarProj(proje);
           
        }else{
            JOptionPane.showMessageDialog(null, "Selecione uma linha para editar.");
        }

            
        
    }//GEN-LAST:event_btEditarProjetoActionPerformed

    private void btExcluirProjetoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExcluirProjetoActionPerformed
        Projeto proj = new Projeto();
        
        if (tbProj.getSelectedRow() != -1){


            proj.setId((int)tbProj.getValueAt(tbProj.getSelectedRow(), 0));


            proj.excluirProj(proj.getId());
            txfNomeProj.setText("");
            txaDescricaoProj.setText("");


        } else{
            JOptionPane.showMessageDialog(null, "Selecione uma linha para excluir.");
        }
       
    }//GEN-LAST:event_btExcluirProjetoActionPerformed

    private void btAtualizarProjetoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAtualizarProjetoActionPerformed
        projForm = new Projeto();
        Vector listaProj = projForm.recuperarListaProjetos();

        Vector colunas = new Vector<>();

        colunas.add("id_projeto");
        colunas.add("nome_projeto");
        colunas.add("descricao");
        colunas.add("nome_usuario");

      
        DefaultTableModel dataModel = new DefaultTableModel();

        dataModel.setDataVector(listaProj, colunas);

        tbProj.setModel(dataModel);

      
    }//GEN-LAST:event_btAtualizarProjetoActionPerformed

    private void btAbrirProjetoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAbrirProjetoActionPerformed
            FormProjetoAberto telaAberta = new FormProjetoAberto();    
            
            if (tbProj.getSelectedRow() != -1){

            
            proj.setNomeProj(tbProj.getValueAt(tbProj.getSelectedRow(), 0).toString());
            
            telaAberta.projeto.setId((int)tbProj.getValueAt(tbProj.getSelectedRow(), 0));
            telaAberta.usuario = usuario;
            
            telaAberta.recebeTexto(txfNomeProj.getText());
            
            telaAberta.setVisible(true); 
            this.setVisible(false);
            } else{
                JOptionPane.showMessageDialog(null, "Selecione uma linha.");
            }
        
            
        
    }//GEN-LAST:event_btAbrirProjetoActionPerformed

    private void tbProjMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbProjMouseClicked
        if(tbProj.getSelectedRow() != -1){

            txfNomeProj.setText(tbProj.getValueAt(tbProj.getSelectedRow(), 1).toString());
            txaDescricaoProj.setText(tbProj.getValueAt(tbProj.getSelectedRow(), 2).toString());


        }       
    }//GEN-LAST:event_tbProjMouseClicked

    private void btCadastrarProjetoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCadastrarProjetoActionPerformed
        
        proj.setNomeProj(txfNomeProj.getText());
        proj.setDescricaoProj(txaDescricaoProj.getText());
        proj.setIdUsuario(usuario.getId());

        if (proj.getNomeProj().length() == 0) {
            JOptionPane.showMessageDialog(null, "O campo nome está vazio");
        } else if (proj.getDescricaoProj().length() == 0) {
            JOptionPane.showMessageDialog(null, "O campo descrição está vazio");
        } else {
            proj.inserirProj(proj);
        }

    }//GEN-LAST:event_btCadastrarProjetoActionPerformed

    private void txfNomeProjActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txfNomeProjActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txfNomeProjActionPerformed

    private void MenuSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuSairActionPerformed
        
    }//GEN-LAST:event_MenuSairActionPerformed

    private void menuGerenciarUsuariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuGerenciarUsuariosMouseClicked
        FormGerenciarUsuario formGerenciarUsuario = new FormGerenciarUsuario();
        
        formGerenciarUsuario.setVisible(true); 
    }//GEN-LAST:event_menuGerenciarUsuariosMouseClicked

    private void jtxtFiltroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtFiltroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtFiltroActionPerformed

    private void jtxtFiltroKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtFiltroKeyTyped

        jtxtFiltro.addKeyListener(new KeyAdapter(){

            public void keyReleased(final KeyEvent e){
                String texto = (jtxtFiltro.getText());
                jtxtFiltro.setText(texto);
                Filtro();
            }
        });

        trs = new TableRowSorter(tbProj.getModel());
        tbProj.setRowSorter(trs);
    }//GEN-LAST:event_jtxtFiltroKeyTyped

    private void MenuSairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MenuSairMouseClicked
        System.exit(0);
    }//GEN-LAST:event_MenuSairMouseClicked

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
            java.util.logging.Logger.getLogger(FormGerenciarProjeto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormGerenciarProjeto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormGerenciarProjeto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormGerenciarProjeto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormGerenciarProjeto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu MenuSair;
    private javax.swing.JButton btAbrirProjeto;
    private javax.swing.JButton btAtualizarProjeto;
    private javax.swing.JButton btCadastrarProjeto;
    private javax.swing.JButton btEditarProjeto;
    private javax.swing.JButton btExcluirProjeto;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField jtxtFiltro;
    private javax.swing.JLabel lbDescricaoProj;
    private javax.swing.JLabel lbNomeProj;
    private javax.swing.JLabel lbTitulo;
    private javax.swing.JMenu menuGerenciarUsuarios;
    private javax.swing.JScrollPane scrolPainel;
    private javax.swing.JTable tbProj;
    private javax.swing.JTextArea txaDescricaoProj;
    private javax.swing.JTextField txfNomeProj;
    // End of variables declaration//GEN-END:variables
}
