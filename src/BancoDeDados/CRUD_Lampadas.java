
package BancoDeDados;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Types;
import java.util.ArrayList;

import DTOs.LampadaDTO;


public class CRUD_Lampadas {

    private static Connection conexao;

    // CONSTRUTOR
    public CRUD_Lampadas (Connection conexao){
        CRUD_Lampadas.conexao = conexao;
    }


//    C --> Create
    public boolean incluirIoT(LampadaDTO lampada) {

        try {
            PreparedStatement comando =
                    conexao.prepareStatement("INSERT INTO IOTS (CATEGORIA_ID, FABRICANTE_ID, NOME_APELIDO, LOCALIZACAO) VALUES (?,?,?,?)");

            comando.setInt(1, lampada.CategoriaId);
            if(lampada.FabricanteId == null || lampada.FabricanteId == 0){
                comando.setNull(2, Types.INTEGER);
            }
            else{
                comando.setInt(2, lampada.FabricanteId);
            }
            comando.setString(3, lampada.Nome);
            comando.setString(4, lampada.Localizacao);
            comando.execute();
            return true;

        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }


//    R -> Read
    public ArrayList<LampadaDTO> getListaLampadas() {

        ResultSet resposta = null;
        ArrayList<LampadaDTO> listaLampadas = new ArrayList<LampadaDTO>();


        try {
            
            PreparedStatement comando = conexao.prepareStatement("SELECT * FROM IOTS");
            resposta = comando.executeQuery();

            while (resposta.next()) {

                LampadaDTO item = new LampadaDTO();

                item.Id = resposta.getInt("ID");
                item.CategoriaId = resposta.getInt("CATEGORIA_ID");
                item.FabricanteId = resposta.getInt("FABRICANTE_ID");
                item.Nome = resposta.getString("NOME_APELIDO");
                item.Localizacao = resposta.getString("LOCALIZACAO");

                listaLampadas.add(item);
              }

        } catch (Exception e) {
            e.printStackTrace();
        }

        
        return listaLampadas;
    }


//    U - Update
    public boolean atualizarDadosIoT(LampadaDTO lampada)
    {
        try {
            PreparedStatement comando =
                    conexao.prepareStatement("UPDATE IOTS SET CATEGORIA_ID=?, FABRICANTE_ID=?, NOME_APELIDO=?, LOCALIZACAO=? WHERE id=?");
            comando.setInt(1, lampada.CategoriaId);
            if(lampada.FabricanteId == null || lampada.FabricanteId == 0){
                comando.setNull(2, Types.INTEGER);
            }
            else{
                comando.setInt(2, lampada.FabricanteId);
            }
            comando.setString(3, lampada.Nome);
            comando.setString(4, lampada.Localizacao);
            comando.setInt(5, lampada.Id);
            comando.execute();
            return true;

        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }


//    D - Delete
    public boolean excluirIoT(int idLampada)
    {
        try {
            PreparedStatement comando =
                    conexao.prepareStatement("DELETE FROM IOTS WHERE id=?");
            comando.setInt(1, idLampada);
            comando.execute();
            return true;

        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
    
}
