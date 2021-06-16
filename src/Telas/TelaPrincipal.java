
package Telas;

import javax.swing.*;

import Enumerations.EnumNomesMenus;

import java.awt.event.*;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.util.ArrayList;
import java.awt.BorderLayout;
import java.awt.Color;



public class TelaPrincipal extends JFrame implements ActionListener{

    private static JMenuBar barraMenu;
    private static Container containerTelaPrincipal;
    private static ArrayList<Tela>listaTelas;

    // CONSTRUTOR MONO STATE / SINGLETON
    public TelaPrincipal(ArrayList<Tela>listaTelas){

        // MONO STATE / SINGLETON
        if(containerTelaPrincipal == null){

            this.listaTelas = listaTelas;

            containerTelaPrincipal = getContentPane();
    
            ConfigurarTelaPrincipal();
            ConfigurarBarraMenus();
            MontarTelaPrincipal(null);
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

        JMenu menuAdministrar = new JMenu(EnumNomesMenus.ADMINISTAR.descricao);
        menuAdministrar.setAlignmentX(Component.LEFT_ALIGNMENT);

        JMenu menuListaIoTs = new JMenu(EnumNomesMenus.MONITORAR_IOTS.descricao);
        menuListaIoTs.setAlignmentX(Component.LEFT_ALIGNMENT);


        // ADICONA AS TELAS NOS SEUS RESPECTIVOS MENUS
        for (Tela tela : listaTelas) {

            switch(tela.getMenu()){

                case ADMINISTAR:
                    itemMenu = new JMenuItem(tela.getNomeTela().descricao);
                    itemMenu.addActionListener(this);
                    menuAdministrar.add(itemMenu);
                    break;

                case MONITORAR_IOTS:
                    itemMenu = new JMenuItem(tela.getNomeTela().descricao);
                    itemMenu.addActionListener(this);
                    menuListaIoTs.add(itemMenu);
                    break;
            }
        }



        // ADICIONA OS MENUS NA BARRA DE MENUS NA ORDEM EM QUE DEVEM APARECER
        barraMenu.add(menuAdministrar);
        barraMenu.add(menuListaIoTs);
    }



    private void MontarTelaPrincipal(JComponent tela){

        containerTelaPrincipal.setVisible(false);
        containerTelaPrincipal.removeAll();

        // ADICIONA BARRA DE MENU NA TELA PRINCIPAL
        containerTelaPrincipal.add(barraMenu, BorderLayout.PAGE_START);

        // ADICIONA TELA NO CORPO DA TELA PRINCIPAL
        if(tela != null){

            containerTelaPrincipal.add(tela, BorderLayout.CENTER);
        }


        containerTelaPrincipal.setVisible(true);
    }



    @Override
    public void actionPerformed(ActionEvent e) {

        System.out.println(e.getActionCommand());

        for (Tela tela : listaTelas) {

            if(tela.getNomeTela().descricao == e.getActionCommand()){

                MontarTelaPrincipal(tela.getTela());
                return;
            }            
        }
    }
    
}
