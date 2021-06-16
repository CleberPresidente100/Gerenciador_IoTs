
package Enumerations;

public enum EnumNomesTelas {

    LAMPADAS ("Lâmpadas"),
    TERMOMETROS ("Termômetros");

    public final String descricao;

    private EnumNomesTelas(String descricao){
        this.descricao = descricao;
    }
    
}
