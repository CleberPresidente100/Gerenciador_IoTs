
package Telas;

import java.util.ArrayList;

public class GerenciadorTelas {

    private ArrayList<Tela> listaTelas;


    // CONSTRUTOR
    public GerenciadorTelas(){

        MontarListaTelas();

        TelaPrincipal telaPrincipal = new TelaPrincipal(listaTelas);
    }



    public void MontarListaTelas(){

        listaTelas = new ArrayList<Tela>();

        TelaListaLampadas telaListaLampadas = new TelaListaLampadas();
        TelaListaTermometros telaListaTermometros = new TelaListaTermometros();

        listaTelas.add(telaListaLampadas.getTela());
        listaTelas.add(telaListaTermometros.getTela());
    }
    
}
