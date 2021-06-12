
package IoTs;

import DTOs.TermometroDTO;
import Interfaces.I_Termometro;


// A Interface Comparable é utilizada para realizar a ordenação de objetos da Classe Termometro.
public class Termometro implements I_Termometro, Comparable<Termometro>{
    
    private TermometroDTO termometro;

    // CONSTRUTOR
    public Termometro(TermometroDTO termometro){

        this.termometro = termometro;
    }



    public double getTemperatura(){
        return termometro.Temperatura;
    }



    @Override
    public void setTemperatura(double temperatura) {
        termometro.Temperatura = temperatura;
    }



    @Override
    public int compareTo(Termometro termometro) {
        return this.termometro.Id - termometro.getId();
    }



    @Override
    public int getId() {
        return termometro.Id;
    }



    @Override
    public void ligar() {
        termometro.Estado = true;
    }



    @Override
    public void desligar() {
        termometro.Estado = false;
    }



    @Override
    public boolean getEstado() {
        return termometro.Estado;
    }



    @Override
    public String getNome() {
        return termometro.Nome;
    }



    @Override
    public void setNome(String nome) {
        termometro.Nome = nome;
    }



    @Override
    public String getLocalizacao() {
        return termometro.Localizacao;
    }



    @Override
    public void setLocalizacao(String localizacao) {
        termometro.Localizacao = localizacao;
    }



    @Override
    public String getNomeCategoria() {
        return termometro.NomeCategoria;
    }



    @Override
    public String getNomeFabricante() {
        return termometro.NomeFabricante;
    }



    @Override
    public int getIdCategoria() {
        return termometro.CategoriaId;
    }



    @Override
    public int getIdFabricante() {
        return termometro.FabricanteId;
    }
}
