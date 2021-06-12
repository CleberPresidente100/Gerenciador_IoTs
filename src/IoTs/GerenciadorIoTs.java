
package IoTs;

import BancoDeDados.GerenciadorConexaoBancoDados;

import java.sql.Connection;




public class GerenciadorIoTs {

    private Connection conexaoBancoDeDados;
    
    // CONSTRUTOR
    public GerenciadorIoTs(){

        GerenciadorConexaoBancoDados gerenciadorConexaoBancoDados = new GerenciadorConexaoBancoDados();

        conexaoBancoDeDados = gerenciadorConexaoBancoDados.getConexao();
    }



    public void CarregarListaDeIoTs(){

    }




}
