/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
/**
 *
 * @author GUst
 */
public class ConexaoBD {
    
        private String hostname = "remotemysql.com";
        private int port = 3306;
        private String dbname = "9d9398m27x";
        private String username = "9d9398m27x";
        private String password = "nlStMP7fUK";
        
        private Connection conexao;
        
        public Connection criarConexao(){
            Connection conexao=null;
            
            String conexaoString = "jdbc:mysql://"+hostname+":"+port+"/"+dbname+"?user="+username+"&password="+password;
            
            try{
            
               conexao = DriverManager.getConnection(conexaoString);
            } catch (Exception e) {
                return null;
            }
            return conexao;
        }
        
        public void fecharConexao(){
            if (conexao!=null){
                try {
                    conexao.close();
                    conexao=null;
                } catch (Exception e) {
                   
                }
            }
        };
}
