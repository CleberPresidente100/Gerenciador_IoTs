
package Interfaces;

public interface I_IoT {
    
    int getId();

    void ligar();
    void desligar();
    boolean getEstado();

    String getNome();
    void setNome(String nome);

    String getLocalizacao();
    void setLocalizacao(String localizacao);

    String getNomeCategoria();
    String getNomeFabricante();

    int getIdCategoria();
    int getIdFabricante();
}
