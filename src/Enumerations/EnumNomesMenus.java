
package Enumerations;

public enum EnumNomesMenus {

    ADMINISTAR ("Administrar"),
    MONITORAR_IOTS ("Monitorar IoTs");

    public final String descricao;

    private EnumNomesMenus(String descricao){
        this.descricao = descricao;
    }
    
}
