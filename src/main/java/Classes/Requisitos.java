package Classes;

import Classes.ConexaoBD;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author frank
 */
public class Requisitos {

    private int id;
    private int idProjeto;
    private String nome;
    private String modulo;
    private String funcionalidades;
    private Date dataCriacao;
    private String autor;
    private Date dataAlteracao;
    private String autorAlteracao;
    private int versao;
    private int prioridade;
    private int complexidade;
    private int esforcoHoras;
    private String estado;
    private String fase;
    private String descricao;   
    
   
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getModulo() {
        return modulo;
    }

    public void setModulo(String modulo) {
        this.modulo = modulo;
    }

    public String getFuncionalidades() {
        return funcionalidades;
    }

    public void setFuncionalidades(String funcionalidades) {
        this.funcionalidades = funcionalidades;
    }

    public Date getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(Date dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public Date getDataAlteracao() {
        return dataAlteracao;
    }

    public void setDataAlteracao(Date dataAlteracao) {
        this.dataAlteracao = dataAlteracao;
    }

    public String getAutorAlteracao() {
        return autorAlteracao;
    }

    public void setAutorAlteracao(String autorAlteracao) {
        this.autorAlteracao = autorAlteracao;
    }

    public int getVersao() {
        return versao;
    }

    public void setVersao(int versao) {
        this.versao = versao;
    }

    public int getPrioridade() {
        return prioridade;
    }

    public void setPrioridade(int prioridade) {
        this.prioridade = prioridade;
    }

    public int getComplexidade() {
        return complexidade;
    }

    public void setComplexidade(int complexidade) {
        this.complexidade = complexidade;
    }

    public int getEforcoHoras() {
        return esforcoHoras;
    }

    public void setEforcoHoras(int eforcoHoras) {
        this.esforcoHoras = eforcoHoras;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getFase() {
        return fase;
    }

    public void setFase(String fase) {
        this.fase = fase;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
    public void inserirRequisitos() {
        String sql = "insert into requisitos (id_requisito, nome_requisito, modulo, funcionalidades, data_criacao, data_alteracao, autor, autor_alteracao, versao, prioridade, complexidade, esforco_horas, estado, fase, descricao) values (default, '"+nome+"', '"+modulo+"', '"+funcionalidades+"', '"+dataCriacao+"', '"+dataAlteracao+"', '"+autor+"',, '"+autorAlteracao+"', '"+versao+"', '"+prioridade+"', '"+esforcoHoras+"', '"+estado+"', '"+fase+"', '"+descricao+"');";
        
        try{    
            
        ConexaoBD conexao = new ConexaoBD();
        
        Connection conn = conexao.criarConexao();
        
        Statement stm = conn.createStatement();
        
        stm.executeUpdate(sql);
        
        conexao.fecharConexao();
        
        JOptionPane.showMessageDialog(null, "Requisito criado com sucesso.");
        
        }catch (Exception e) {
            JOptionPane.showMessageDialog(null, "NÃ£o foi possivel criar o requisito.");
        }
        
    }
    
    public void editarRequiso(Requisitos r) {
        String sql = "UPDATE requisitos SET  nome=?, modulo=?, funcionalidades=?, dataAlteracao="+dataAlteracao+", autorAlteracao=?, versao=?, prioridade=?, complexidade=?, eforcoHoras=?, estado=?, fase=?, descricao=? WHERE id_requisito=?";
        ConexaoBD conexao = new ConexaoBD();
        try{
            
            
            Connection conn = conexao.criarConexao();
            PreparedStatement stm = (PreparedStatement) conn.prepareStatement(sql);
            
            
            stm.setString(1, r.getNome());
            stm.setString(2, r.getModulo());
            stm.setString(3, r.getFuncionalidades());
            stm.setString(4, r.getAutorAlteracao());
            stm.setInt(5, r.getVersao());
            stm.setInt(6, r.getPrioridade());
            stm.setInt(7, r.getComplexidade());
            stm.setInt(8, r.getEforcoHoras());
            stm.setString(9, r.getEstado());
            stm.setString(10, r.getFase());
            stm.setString(11, r.getDescricao());
            stm.setInt(12, r.getId());
            
            
            
            stm.executeUpdate();

            JOptionPane.showMessageDialog(null, "Requisito atualizado com sucesso.");
        
        }catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Não foi possivel editar o requisito.");
        } finally{
            conexao.fecharConexao();
        }

      }

    public int getIdProjeto() {
        return idProjeto;
    }

    public void setIdProjeto(int idProjeto) {
        this.idProjeto = idProjeto;
    }

    public int getEsforcoHoras() {
        return esforcoHoras;
    }

    public void setEsforcoHoras(int esforcoHoras) {
        this.esforcoHoras = esforcoHoras;
    }
    
    public void excluirRequisito(int idTroca) {
         
        String sql = "delete from requisitos where id_requisito="+idTroca;
                                                                                              
        try{    
            
        ConexaoBD conexao = new ConexaoBD();
        
        Connection conn = conexao.criarConexao();
        
        Statement stm = conn.createStatement();
        
        stm.executeUpdate(sql);
        
        conexao.fecharConexao();
        
        JOptionPane.showMessageDialog(null, "Requisito excluido com sucesso.");
        
        }catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Não foi possivel excluir o requisito.");
        }
        
      }
    
}
