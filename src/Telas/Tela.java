
package Telas;

import javax.swing.JComponent;
import Enumerations.EnumNomesMenus;
import Enumerations.EnumNomesTelas;

public class Tela {

    private EnumNomesTelas nomeTela;
    private EnumNomesMenus menu;
    private JComponent tela;



    public Tela (EnumNomesTelas nomeTela, EnumNomesMenus menu, JComponent tela){

        this.menu = menu;
        this.tela = tela;
        this.nomeTela = nomeTela;

    }



    public EnumNomesMenus getMenu(){
        return menu;
    }



    public JComponent getTela(){
        return tela;
    }



    public EnumNomesTelas getNomeTela(){
        return nomeTela;
    }
    
}
