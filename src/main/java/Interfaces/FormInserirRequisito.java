/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interfaces;

import Classes.Projeto;
import Classes.Requisitos;
import Classes.Usuario;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;

/**
 *
 * @author Angélica
 */
public class FormInserirRequisito extends javax.swing.JFrame {

    /**
     * Creates new form FormAdicionarRequisito
     */
    
    Usuario usuario = new Usuario();
    Projeto proj = new Projeto();
    
    public FormInserirRequisito() {
        initComponents();
    }
    
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btVoltar = new javax.swing.JButton();
        txfNome = new javax.swing.JTextField();
        txfModulo = new javax.swing.JTextField();
        txfFuncionalidades = new javax.swing.JTextField();
        lbRequisito = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lbModulo = new javax.swing.JLabel();
        lbPrioridade = new javax.swing.JLabel();
        lbNome = new javax.swing.JLabel();
        cbPrioridade = new javax.swing.JComboBox<>();
        btSalvar = new javax.swing.JButton();
        lbFuncionalidades = new javax.swing.JLabel();
        txfVersao = new javax.swing.JTextField();
        txfEsforcoEmHoras = new javax.swing.JTextField();
        lbNomeProjeto = new javax.swing.JLabel();
        lbVersao = new javax.swing.JLabel();
        lbComplexidade = new javax.swing.JLabel();
        cbComplexidade = new javax.swing.JComboBox<>();
        lbEsforcoEmHoras = new javax.swing.JLabel();
        lbEstado = new javax.swing.JLabel();
        cbEstado = new javax.swing.JComboBox<>();
        lbFase = new javax.swing.JLabel();
        cbFase = new javax.swing.JComboBox<>();
        lbDescricao = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txaDescricao = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btVoltar.setText("Voltar");
        btVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btVoltarActionPerformed(evt);
            }
        });

        txfNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txfNomeActionPerformed(evt);
            }
        });

        txfFuncionalidades.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txfFuncionalidadesActionPerformed(evt);
            }
        });

        lbRequisito.setFont(new java.awt.Font("Goudy Old Style", 0, 18)); // NOI18N
        lbRequisito.setText("Requisito");

        jLabel1.setText("ID");

        lbModulo.setText("Módulo");

        lbPrioridade.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbPrioridade.setText("Prioridade");
        lbPrioridade.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        lbNome.setText("Nome");

        cbPrioridade.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5" }));
        cbPrioridade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbPrioridadeActionPerformed(evt);
            }
        });

        btSalvar.setText("Salvar");
        btSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalvarActionPerformed(evt);
            }
        });

        lbFuncionalidades.setText("Funcionalidades");

        lbNomeProjeto.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        lbVersao.setText("Versão");

        lbComplexidade.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbComplexidade.setText("Complexidade");
        lbComplexidade.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        cbComplexidade.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5" }));
        cbComplexidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbComplexidadeActionPerformed(evt);
            }
        });

        lbEsforcoEmHoras.setText("Esforço em horas");

        lbEstado.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbEstado.setText("Estado");
        lbEstado.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        cbEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Aberto", "Em andamento", "Concluído", "Em espera" }));
        cbEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbEstadoActionPerformed(evt);
            }
        });

        lbFase.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbFase.setText("Fase");
        lbFase.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        cbFase.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Planejamento", "Execução", "Testes", "Encerramento" }));
        cbFase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbFaseActionPerformed(evt);
            }
        });

        lbDescricao.setText("Descrição");

        txaDescricao.setColumns(20);
        txaDescricao.setRows(5);
        jScrollPane1.setViewportView(txaDescricao);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lbModulo, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lbNome, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lbFuncionalidades))
                    .addComponent(lbRequisito, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(lbNomeProjeto, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txfNome, javax.swing.GroupLayout.DEFAULT_SIZE, 487, Short.MAX_VALUE)
                            .addComponent(txfModulo)
                            .addComponent(txfFuncionalidades))))
                .addGap(18, 18, 18)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbPrioridade, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbComplexidade, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(cbPrioridade, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(lbVersao, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(txfVersao, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(cbComplexidade, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(lbEsforcoEmHoras, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(cbEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(lbFase, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(cbFase, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txfEsforcoEmHoras, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(48, 48, 48))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lbRequisito)
                        .addComponent(lbNomeProjeto, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbNome, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txfNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txfModulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbModulo, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbFuncionalidades, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txfFuncionalidades, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbPrioridade, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbPrioridade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbVersao, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txfVersao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbComplexidade, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbComplexidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbEsforcoEmHoras, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txfEsforcoEmHoras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbFase, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbFase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btSalvar)
                    .addComponent(btVoltar))
                .addGap(35, 35, 35))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btVoltarActionPerformed
        setVisible(false);        // TODO add your handling code here:
    }//GEN-LAST:event_btVoltarActionPerformed

    private void txfNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txfNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txfNomeActionPerformed

    private void cbPrioridadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbPrioridadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbPrioridadeActionPerformed

    private void btSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalvarActionPerformed

        Requisitos requisito = new Requisitos();
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        LocalDate hoje = LocalDate.now();
        
        requisito.setNome(txfNome.getText());
        requisito.setModulo(txfModulo.getText());
        requisito.setFuncionalidades(txfFuncionalidades.getText());
        requisito.setDataCriacao(hoje.format(formato));
        requisito.setAutor(usuario.getNomeUsuario());
       
        String temp1 = ((String)cbPrioridade.getSelectedItem());
        requisito.setPrioridade(Integer.parseInt(temp1));
        
        requisito.setVersao(Integer.parseInt(txfVersao.getText()));
        
        String temp2 = ((String)cbComplexidade.getSelectedItem());
        requisito.setComplexidade(Integer.parseInt(temp2));
        
        requisito.setEsforcoHoras(Integer.parseInt(txfEsforcoEmHoras.getText()));
        requisito.setEstado((String)cbEstado.getSelectedItem());
        requisito.setFase((String)cbFase.getSelectedItem());
        requisito.setDescricao(txaDescricao.getText());
        requisito.setId_projeto(proj.getId());
       
        
        if(requisito.getNome().length()==0){
            JOptionPane.showMessageDialog(null,"O campo nome está vazio");
        }else if(requisito.getModulo().length()==0){
            JOptionPane.showMessageDialog(null,"O campo módulo está vazio");
        }else if(requisito.getFuncionalidades().length()==0){
            JOptionPane.showMessageDialog(null,"O campo funcionalidades está vazio");
        }else if(requisito.getAutor().length()==0){
            JOptionPane.showMessageDialog(null,"O campo autor está vazio");
        }else if(requisito.getVersao()<=0){
            JOptionPane.showMessageDialog(null,"Digite uma versão válida");
        }else if(requisito.getEsforcoHoras()<0){
            JOptionPane.showMessageDialog(null,"Digite o número de horas gastas no campo esforço em horas");
        }else if(requisito.getDescricao().length()==0){
            JOptionPane.showMessageDialog(null,"O campo descrição está vazio");
        }else {
            requisito.inserirRequisitos(requisito);
            this.setVisible(false);
        }
    }//GEN-LAST:event_btSalvarActionPerformed

    private void txfFuncionalidadesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txfFuncionalidadesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txfFuncionalidadesActionPerformed

    private void cbComplexidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbComplexidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbComplexidadeActionPerformed

    private void cbEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbEstadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbEstadoActionPerformed

    private void cbFaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbFaseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbFaseActionPerformed

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
            java.util.logging.Logger.getLogger(FormInserirRequisito.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormInserirRequisito.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormInserirRequisito.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormInserirRequisito.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormInserirRequisito().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btSalvar;
    private javax.swing.JButton btVoltar;
    private javax.swing.JComboBox<String> cbComplexidade;
    private javax.swing.JComboBox<String> cbEstado;
    private javax.swing.JComboBox<String> cbFase;
    private javax.swing.JComboBox<String> cbPrioridade;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbComplexidade;
    private javax.swing.JLabel lbDescricao;
    private javax.swing.JLabel lbEsforcoEmHoras;
    private javax.swing.JLabel lbEstado;
    private javax.swing.JLabel lbFase;
    private javax.swing.JLabel lbFuncionalidades;
    private javax.swing.JLabel lbModulo;
    private javax.swing.JLabel lbNome;
    private javax.swing.JLabel lbNomeProjeto;
    private javax.swing.JLabel lbPrioridade;
    private javax.swing.JLabel lbRequisito;
    private javax.swing.JLabel lbVersao;
    private javax.swing.JTextArea txaDescricao;
    private javax.swing.JTextField txfEsforcoEmHoras;
    private javax.swing.JTextField txfFuncionalidades;
    private javax.swing.JTextField txfModulo;
    private javax.swing.JTextField txfNome;
    private javax.swing.JTextField txfVersao;
    // End of variables declaration//GEN-END:variables
}
