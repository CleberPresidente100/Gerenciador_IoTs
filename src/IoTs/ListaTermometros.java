
package IoTs;

import java.util.ArrayList;
import java.util.Collections;

// Caso não se utilize o Banco de Dados, esta classe MonoState pode ser
// utilizada para se armazenar os dados.
public class ListaTermometros {

    private static ArrayList<Termometro> listaTermometros;


    // CONSTRUTOR MONOSTATE / SINGLETON
    public ListaTermometros(){

        if(listaTermometros == null){
            listaTermometros = new ArrayList<Termometro>();
        }
    }

    public ArrayList<Termometro> getListaTermometros(){
        return listaTermometros;
    }

    public void addLampada(Termometro termometro){

        listaTermometros.add(termometro);
        Collections.sort(listaTermometros);
    }

    public void editarLampada(Termometro termometroAtual, Termometro novoTermometro){

        listaTermometros.remove(termometroAtual);
        listaTermometros.add(novoTermometro);
        Collections.sort(listaTermometros);
    }

    public void removerLampada(Termometro termometro){

        listaTermometros.remove(termometro);
    }
    
}
