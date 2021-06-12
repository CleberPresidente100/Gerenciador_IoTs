
package IoTs;

import java.util.ArrayList;
import java.util.Collections;


// Caso não se utilize o Banco de Dados, esta classe MonoState pode ser
// utilizada para se armazenar os dados.
public class ListaLampadas {

    private static ArrayList<Lampada> listaLampadas;


    // CONSTRUTOR MONOSTATE / SINGLETON
    public ListaLampadas(){

        if(listaLampadas == null){
            listaLampadas = new ArrayList<Lampada>();
        }
    }

    public ArrayList<Lampada> getListaLampadas(){
        return listaLampadas;
    }

    public void addLampada(Lampada lampada){

        listaLampadas.add(lampada);
        Collections.sort(listaLampadas);
    }

    public void editarLampada(Lampada lampadaAtual, Lampada novaLampada){

        listaLampadas.remove(lampadaAtual);
        listaLampadas.add(novaLampada);
        Collections.sort(listaLampadas);
    }

    public void removerLampada(Lampada lampada){

        listaLampadas.remove(lampada);
    }

    
}
