
package IoTs;

import DTOs.LampadaDTO;
import Interfaces.I_IoT;

// A Interface Comparable é utilizada para realizar a ordenação de objetos da Classe Lampada.
public class Lampada implements I_IoT, Comparable<Lampada>{

    private LampadaDTO lampada;

    // CONSTRUTOR
    public Lampada(LampadaDTO lampada){

        this.lampada = lampada;
    }



    @Override
    public int compareTo(Lampada lampada) {
        return this.lampada.Id - lampada.getId();
    }



    @Override
    public int getId() {
        return lampada.Id;
    }



    @Override
    public void ligar() {
        lampada.Estado = true;
    }



    @Override
    public void desligar() {
        lampada.Estado = false;
    }



    @Override
    public boolean getEstado() {
        return lampada.Estado;
    }



    @Override
    public String getNome() {
        return lampada.Nome;
    }



    @Override
    public void setNome(String nome) {
        lampada.Nome = nome;
    }



    @Override
    public String getLocalizacao() {
        return lampada.Localizacao;
    }



    @Override
    public void setLocalizacao(String localizacao) {
        lampada.Localizacao = localizacao;
    }



    @Override
    public String getNomeCategoria() {
        return lampada.NomeCategoria;
    }



    @Override
    public String getNomeFabricante() {
        return lampada.NomeFabricante;
    }



    @Override
    public int getIdCategoria() {
        return lampada.CategoriaId;
    }



    @Override
    public int getIdFabricante() {
        return lampada.FabricanteId;
    }
}
