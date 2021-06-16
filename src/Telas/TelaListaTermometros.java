
package Telas;

import Enumerations.*;
import javax.swing.JPanel;
import javax.swing.BoxLayout;
import javax.swing.JComponent;


public class TelaListaTermometros extends JPanel{

    private JPanel telaListaTermometros;


    public TelaListaTermometros(){

        ConfigurarTela();
        MontarTela();
    }



    private void ConfigurarTela(){

        telaListaTermometros = this;
        telaListaTermometros.setSize(500, 500);
        telaListaTermometros.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        telaListaTermometros.setVisible(true);
    }



    private void MontarTela(){

    }



    public JComponent getTelaListaTermometros(){

        return telaListaTermometros;
    }



    public Tela getTela(){

        Tela tela = new Tela(
                                EnumNomesTelas.TERMOMETROS,
                                EnumNomesMenus.MONITORAR_IOTS,
                                telaListaTermometros
        );
        return tela;
    }

    
}
