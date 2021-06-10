
package BancoDeDados;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import DTOs.CategoriasIoTsDTO;


public class CRUD_CategoriasIoTs {

    private static Connection conexao;

    public CRUD_CategoriasIoTs (Connection conexao){
        CRUD_CategoriasIoTs.conexao = conexao;
    }


//    C --> Create
    

//    R -> Read
    public ArrayList<CategoriasIoTsDTO> getListaCategorias() {

        ResultSet resposta = null;
        ArrayList<CategoriasIoTsDTO> listaCategorias = new ArrayList<CategoriasIoTsDTO>();

        try {
            PreparedStatement comando =
                    conexao.prepareStatement("SELECT * FROM CATEGORIAS_IOTS");
            resposta = comando.executeQuery();

            while (resposta.next()) {

                CategoriasIoTsDTO item = new CategoriasIoTsDTO();

                item.Id = resposta.getInt("ID");
                item.Categoria = resposta.getString("CATEGORIA");

                listaCategorias.add(item);
              }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return listaCategorias;
    }


//    U - Update
    

//    D - Delete
        
}
