
import Telas.GerenciadorTelas;
import Enumerations.EnumTiposBancosDeDados;
import BancoDeDados.GerenciadorConexaoBancoDados;

public class Main{

    public static void main(String[] args) throws InterruptedException{

        // SE CONECTA NO BANCO DE DADOS
        // GerenciadorConexaoBancoDados gerenciadorConexaoBancoDados = new GerenciadorConexaoBancoDados();
        // gerenciadorConexaoBancoDados.CriarConexao(EnumTiposBancosDeDados.MYSQL);

        // INICIA A APLICAÇÃO
        GerenciadorTelas gerenciadorTelas = new GerenciadorTelas();

    }
}



