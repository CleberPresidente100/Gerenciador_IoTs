
package BancoDeDados;

import java.sql.*;

import Interfaces.I_Conexao;


public class ConexaoMySQL implements I_Conexao{
    
    private static Connection conexao;

    // Parâmetros para se Estabelecer a Conexão com o Banco de Dados
    private static final String DataBaseAdrress = "den1.mysql6.gear.host";
    private static final String DataBaseName = "gerenciadoriots";
    private static final String Parameters = "";
    private static final String URL_DB = "jdbc:mysql://" + DataBaseAdrress + "/" + DataBaseName + Parameters;
    private static final String usuario = "gerenciadoriots";
    private static final String senha = "Un8XM~6L3zJ_";


    // CONSTRUTOR
    public ConexaoMySQL(){

        if(ConexaoMySQL.conexao == null){

            System.out.print("\n\n\nEndereço --> " + URL_DB + "\n\n");

            try{
                Class.forName("com.mysql.cj.jdbc.Driver");
                ConexaoMySQL.conexao = DriverManager.getConnection(URL_DB, usuario, senha);
                System.out.print("Conexão com o Banco de Dados \"" + DataBaseAdrress + "/" + DataBaseName + "\" foi estabelecida com Sucesso !\n\n\n");
            }
            catch(Exception ex){
                ex.printStackTrace();
                System.out.print(ex);
            }
        }
    }



    public Connection getConexao(){
        return ConexaoMySQL.conexao;
    }



    public void closeConexao(){

        if(ConexaoMySQL.conexao != null){

            try{

                ConexaoMySQL.conexao.close();
                System.out.print("Conexão com o Banco de Dados \"" + DataBaseAdrress + "/" + DataBaseName + "\" foi encerrada com Sucesso !");
            }
            catch(Exception ex){
                ex.printStackTrace();
                System.out.print(ex);
            }
        }
    }

    
}


