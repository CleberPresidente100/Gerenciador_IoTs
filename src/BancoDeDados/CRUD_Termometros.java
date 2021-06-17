
package BancoDeDados;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Types;
import java.util.ArrayList;

import DTOs.TermometroDTO;


public class CRUD_Termometros {

    private static Connection conexao;

    // CONSTRUTOR
    public CRUD_Termometros (Connection conexao){
        CRUD_Termometros.conexao = conexao;
    }


//    C --> Create
    public boolean incluirIoT(TermometroDTO termometro) {

        try {
            PreparedStatement comando =
                    conexao.prepareStatement("INSERT INTO IOTS (CATEGORIA_ID, FABRICANTE_ID, NOME_APELIDO, LOCALIZACAO, LIMITE_INFERIOR, LIMITE_SUPERIOR) VALUES (?,?,?,?)");

            comando.setInt(1, termometro.CategoriaId);
            if(termometro.FabricanteId == null || termometro.FabricanteId == 0){
                comando.setNull(2, Types.INTEGER);
            }
            else{
                comando.setInt(2, termometro.FabricanteId);
            }
            comando.setString(3, termometro.Nome);
            comando.setString(4, termometro.Localizacao);
            comando.setDouble(5, termometro.LimiteInferiorSensorTemperatura);
            comando.setDouble(6, termometro.LimiteSuperiorSensorTemperatura);
            comando.execute();
            return true;

        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }


//    R -> Read
    public ArrayList<TermometroDTO> getListaIoTs() {

        ResultSet resposta = null;
        ArrayList<TermometroDTO> listaTermometros = new ArrayList<TermometroDTO>();


        try {
            
            PreparedStatement comando = conexao.prepareStatement("SELECT * FROM IOTS");
            resposta = comando.executeQuery();

            while (resposta.next()) {

                TermometroDTO item = new TermometroDTO();

                item.Id = resposta.getInt("ID");
                item.CategoriaId = resposta.getInt("CATEGORIA_ID");
                item.FabricanteId = resposta.getInt("FABRICANTE_ID");
                item.Nome = resposta.getString("NOME_APELIDO");
                item.Localizacao = resposta.getString("LOCALIZACAO");
                item.LimiteInferiorSensorTemperatura = resposta.getDouble("LIMITE_INFERIOR");
                item.LimiteSuperiorSensorTemperatura = resposta.getDouble("LIMITE_SUPERIOR");

                listaTermometros.add(item);
              }

        } catch (Exception e) {
            e.printStackTrace();
        }

        
        return listaTermometros;
    }


//    U - Update
    public boolean atualizarDadosIoT(TermometroDTO termometro)
    {
        try {
            PreparedStatement comando =
                    conexao.prepareStatement("UPDATE IOTS SET CATEGORIA_ID=?, FABRICANTE_ID=?, NOME_APELIDO=?, LOCALIZACAO=?, LIMITE_INFERIOR=?, LIMITE_SUPERIOR=? WHERE id=?");
            comando.setInt(1, termometro.CategoriaId);
            if(termometro.FabricanteId == null || termometro.FabricanteId == 0){
                comando.setNull(2, Types.INTEGER);
            }
            else{
                comando.setInt(2, termometro.FabricanteId);
            }
            comando.setString(3, termometro.Nome);
            comando.setString(4, termometro.Localizacao);
            comando.setDouble(5, termometro.LimiteInferiorSensorTemperatura);
            comando.setDouble(6, termometro.LimiteSuperiorSensorTemperatura);
            comando.setInt(7, termometro.Id);
            comando.execute();
            return true;

        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }


//    D - Delete
    public boolean excluirIoT(int idTermometro)
    {
        try {
            PreparedStatement comando =
                    conexao.prepareStatement("DELETE FROM IOTS WHERE id=?");
            comando.setInt(1, idTermometro);
            comando.execute();
            return true;

        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
    
}
