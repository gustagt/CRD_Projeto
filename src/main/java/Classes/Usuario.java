/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

import Classes.ConexaoBD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author GUst
 */
public class Usuario {
    private int id;
    private String nomeCompleto;
    private String email;
    private int telefone;
    private String nomeUsuario;
    private String senha;
    
    ConexaoBD conexao = new ConexaoBD();
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public String getNomeUsuario() {
        return nomeUsuario;
    }

    public void setNomeUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }
    
    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    public void inserirUsario() {
        String sql = "INSERT INTO usuarios ( id , nome_completo, nome_usuario, senha, email, telefone) VALUES (default,'"+nomeCompleto+"', '"+nomeUsuario+"', '"+senha+"', '"+email+"', "+telefone+");";
                                                                                              
        try{    
            
        ConexaoBD conexao = new ConexaoBD();
        
        Connection conn = conexao.criarConexao();
        
        Statement stm = conn.createStatement();
        
        stm.executeUpdate(sql);
        
        conexao.fecharConexao();
        
        JOptionPane.showMessageDialog(null, "Usuario cadastrado com sucesso.");
        
        }catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Não foi possivel salvar o usuario");
        }
        
    }
    
    public Vector recuperarListaUsuarios(){

        Vector listaUsuarios = new Vector<>();
        
        String sql ="Select * from usuarios";
                
        try{              
            
            Connection con = conexao.criarConexao();        
            
            Statement stmt = con.createStatement();
            
            ResultSet rs= stmt.executeQuery(sql);
            
            while(rs.next()){
                int idResult = rs.getInt("id");
                String nomeCompletoResult = rs.getString("nome_completo");
                String emailResult = rs.getString("email");
                int telefoneResult = rs.getInt("telefone");
                String nomeUsuarioResult = rs.getString("nome_usuario");
                String senhaResult = rs.getString("senha");
                
                Vector temp = new Vector();
                
                temp.add(idResult);
                temp.add(nomeCompletoResult);
                temp.add(emailResult);
                temp.add(telefoneResult);
                temp.add(nomeUsuarioResult);
                temp.add(senhaResult);
                
                listaUsuarios.addElement(temp);
                
            }
            
            
            conexao.fecharConexao();
            return listaUsuarios;
            
        }catch (SQLException e){
            return null;
        } 
      
    }

    
    public void editarUsuario(Usuario u){

        String sql = "UPDATE usuarios SET nome_completo='"+nomeCompleto+"', nome_usuario='"+nomeUsuario+"', senha='"+senha+"', email='" + email+ "', telefone='" + telefone +"' WHERE id="+id;
        
        try{

            ConexaoBD conexao = new ConexaoBD();

            Connection conn = conexao.criarConexao();

            Statement stm = conn.createStatement();

            stm.executeUpdate(sql);

            conexao.fecharConexao();

            JOptionPane.showMessageDialog(null, "Usuário editado com sucesso.");

        }catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Não foi possivel editar o usuário.");
        }
   
    }
    
    public void deletarUsuario(Usuario u){
        
            
        String sql ="DELETE FROM usuarios where id=?";
       
        try{  
            
            Connection con = conexao.criarConexao();  
            PreparedStatement stmt = (PreparedStatement) con.prepareStatement(sql);
            stmt.setInt(1, u.getId());
            
            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Excluído com sucesso!");
            
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Erro ao excluir: " + ex);
        } finally{
            conexao.fecharConexao();
        }
    
    }
}

