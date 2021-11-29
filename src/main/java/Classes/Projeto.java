/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;
import javax.swing.JOptionPane;

/**
 *
 * @author GUst
 */
public class Projeto {
    private int id;
    private String nomeProj;
    private String descricaoProj;
    private String usuarioProprietario;

    public String getNomeProj() {
        return nomeProj;
    }

    public void setNomeProj(String nomeProj) {
        this.nomeProj = nomeProj;
    }

    public String getDescricaoProj() {
        return descricaoProj;
    }

    public void setDescricaoProj(String descricaoProj) {
        this.descricaoProj = descricaoProj;
    }

    public String getUsuarioProprietario() {
        return usuarioProprietario;
    }

    public void setUsuarioProprietario(String usuarioProprietario) {
        this.usuarioProprietario = usuarioProprietario;
    }
    
     public void inserirProj() {
        String sql = "insert into projetos (id_projeto, nome_projeto, descricao, usuario_proprietario) values (default, '"+nomeProj+"', '"+descricaoProj+"', '"+usuarioProprietario+"');";
                                                                                              
        try{    
            
        ConexaoBD conexao = new ConexaoBD();
        
        Connection conn = conexao.criarConexao();
        
        Statement stm = conn.createStatement();
        
        stm.executeUpdate(sql);
        
        conexao.fecharConexao();
        
        JOptionPane.showMessageDialog(null, "Projeto criado com sucesso.");
        
        }catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Não foi possivel criar o projeto.");
        }
        
      }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
     
     public Vector recuperarListaProjetos(){

        Vector listaProj = new Vector<>();

        String sql ="Select * from projetos";

        try{

            ConexaoBD conexao = new ConexaoBD();
            Connection con = conexao.criarConexao();

            Statement stmt = con.createStatement();

            ResultSet rs= stmt.executeQuery(sql);

            while(rs.next()){
                
                int idResult = rs.getInt("id_projeto");
                String nomeProjetoResult = rs.getString("nome_projeto");
                String descricaoResult = rs.getString("descricao");
                String usuario_proprietarioResult = rs.getString("usuario_proprietario");
                
                Vector temp = new Vector();

                temp.add(idResult);
                temp.add(nomeProjetoResult);
                temp.add(descricaoResult);
                temp.add(usuario_proprietarioResult);
               

                listaProj.addElement(temp);

            }


            conexao.fecharConexao();
            return listaProj;

        }catch (SQLException e){
            return null;
        } 
        
    }
    
    public void editarProj() {
        String sql = "UPDATE projetos SET nome_projeto='"+nomeProj+"', descricao='"+descricaoProj+"', usuario_proprietario='"+usuarioProprietario+"' WHERE id_projeto="+id;
                                                                                              
        try{    
            
        ConexaoBD conexao = new ConexaoBD();
        
        Connection conn = conexao.criarConexao();
        
        Statement stm = conn.createStatement();
        
        stm.executeUpdate(sql);
        
        conexao.fecharConexao();
        
        JOptionPane.showMessageDialog(null, "Projeto editado com sucesso.");
        
        }catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Não foi possivel editar o projeto.");
        }
        
      }
    
        public void excluirProj(int idTroca) {
         
        String sql = "delete from projetos where id_projeto="+idTroca;
                                                                                              
        try{    
            
        ConexaoBD conexao = new ConexaoBD();
        
        Connection conn = conexao.criarConexao();
        
        Statement stm = conn.createStatement();
        
        stm.executeUpdate(sql);
        
        conexao.fecharConexao();
        
        JOptionPane.showMessageDialog(null, "Projeto excluido com sucesso.");
        
        }catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Não foi possivel excluir o projeto.");
        }
        
      }
    
    
    
                
}
