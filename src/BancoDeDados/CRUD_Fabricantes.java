
package BancoDeDados;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import DTOs.FabricantesIoTsDTO;


public class CRUD_Fabricantes {

    private static Connection conexao;

    public CRUD_Fabricantes (Connection conexao){
        CRUD_Fabricantes.conexao = conexao;
    }


//    C --> Create


//    R -> Read
    public ArrayList<FabricantesIoTsDTO> getListaFabricantes() {

        ResultSet resposta = null;
        ArrayList<FabricantesIoTsDTO> listaFabricantes = new ArrayList<FabricantesIoTsDTO>();

        try {
            PreparedStatement comando =
                    conexao.prepareStatement("SELECT * FROM FABRICANTES");
            resposta = comando.executeQuery();

            while (resposta.next()) {

                FabricantesIoTsDTO item = new FabricantesIoTsDTO();

                item.Id = resposta.getInt("ID");
                item.Fabricante = resposta.getString("FABRICANTE");

                listaFabricantes.add(item);
              }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return listaFabricantes;
    }


//    U - Update


//    D - Delete
    
}
