
import BancoDeDados.GerenciadorConexaoBancoDados;
import Enumerations.EnumTiposBancosDeDados;
import Telas.GerenciadorTelas;

public class Main{

    public static void main(String[] args) throws InterruptedException{

        // SE CONECTA NO BANCO DE DADOS
        GerenciadorConexaoBancoDados gerenciadorConexaoBancoDados = new GerenciadorConexaoBancoDados();
        gerenciadorConexaoBancoDados.CriarConexao(EnumTiposBancosDeDados.MYSQL);

        // INICIA A APLICAÇÃO
        GerenciadorTelas gerenciadorTelas = new GerenciadorTelas();

    }
}



