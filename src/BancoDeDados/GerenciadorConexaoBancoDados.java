
package BancoDeDados;

import java.sql.Connection;

import Enumerations.EnumTiposBancosDeDados;
import Interfaces.I_Conexao;

public class GerenciadorConexaoBancoDados implements I_Conexao{

    private static Connection conexao;


    public void CriarConexao(EnumTiposBancosDeDados tipoBancoDeDados){

        switch(tipoBancoDeDados){

            case MYSQL:
                ConexaoMySQL conexaoMySQL = new ConexaoMySQL();
                conexao = conexaoMySQL.getConexao();
            break;

            
            case SQLSERVER:
            break;

            
            case SQLLITE:
            break;

            
            case MARIADB:
            break;
        }
    }


    public Connection getConexao() {
        return conexao;
    }

    
    public void closeConexao() {

        try{
            conexao.close();        
        }
        catch(Exception exception){
            System.out.println(exception);
        }
    }
    
}
