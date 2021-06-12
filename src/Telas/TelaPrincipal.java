
package Telas;

import javax.swing.*;
// import java.awt.event.*;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.BorderLayout;
import java.awt.Color;



public class TelaPrincipal extends JFrame{

    private static JMenuBar barraMenu;
    private static JPanel areaTelaPrincipal;
    private static Container containerTelaPrincipal;

    // CONSTRUTOR MONO STATE / SINGLETON
    public TelaPrincipal(){

        // MONO STATE / SINGLETON
        if(containerTelaPrincipal == null){

            containerTelaPrincipal = getContentPane();
    
            ConfigurarTelaPrincipal();
            ConfigurarBarraMenus();
            MontarTelaPrincipal();
            ExibirTelaPrincipal();
        }
    }



    private void ExibirTelaPrincipal(){

        setVisible(true);
    }



    private void ConfigurarTelaPrincipal(){

        setTitle("Gerenciador de IoTs");
        
        setLayout(new BorderLayout());
        setSize(500, 500);
        
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }



    private void ConfigurarBarraMenus(){

        barraMenu = new JMenuBar();
        // barraMenu.setBackground(new Color(0, 128, 192)); // Azul
        barraMenu.setBackground(new Color(128, 128, 192)); // Roxo
        barraMenu.setPreferredSize(new Dimension(0,25));
        
        JMenuItem itemMenu = null;

        JMenu menuAdministrar = new JMenu("Administrar");
        menuAdministrar.setAlignmentX(Component.LEFT_ALIGNMENT);

        JMenu menuListaIoTs = new JMenu("Monitorar IoTs");
        menuListaIoTs.setAlignmentX(Component.LEFT_ALIGNMENT);


        // ADICIONA OS MENUS NA BARRA DE MENUS NA ORDEM EM QUE DEVEM APARECER
        barraMenu.add(menuAdministrar);
        barraMenu.add(menuListaIoTs);
    }



    private void MontarTelaPrincipal(){

        containerTelaPrincipal.setVisible(false);

        // ADICIONA BARRA DE MENU NA TELA PRINCIPAL
        containerTelaPrincipal.add(barraMenu, BorderLayout.PAGE_START);


        containerTelaPrincipal.setVisible(true);
    }
    
}
