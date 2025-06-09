/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.MonitoramentoModel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ALUNO
 */
public class MonitoramentoController {
        
    public boolean Monitoramento(MonitoramentoModel e) {
        String sql = "INSERT INTO MAQUINAS (nomeMaquina, tipoMaquina) VALUES (?,?)";
        
        try (Connection conn = ConexaoComBancoDados.conectar();
             PreparedStatement ps = conn.prepareStatement(sql)) {
            
            ps.setString(1, e.getNomeMaquina());
            ps.setString(2, e.getTipoMaquina());
            
            int retorno = ps.executeUpdate();
            return true;
        } catch (SQLException er) {
            er.getStackTrace();
            return false;
        }
    }
    
    public List<MonitoramentoModel> listarMaquinas(){
               // criar uma variavel tipo lista
               List<MonitoramentoModel> lista = new ArrayList<>();
               // criar o comando sql para listar dados do BD
               String sql = "SELECT * FROM MAQUINAS";
              
               try(Connection conn = ConexaoComBancoDados.conectar(); //conexao
                  PreparedStatement ps = conn.prepareStatement(sql); // comando para executar
                  ResultSet rs = ps.executeQuery()){//guardar o resultado
                    //laço de repetição para percorrer o retorno do BD
                  while(rs.next()){
                      //criar um objeto da classe model
                      MonitoramentoModel classemonitoramento = new MonitoramentoModel();
                      //chamar os set e listar os dados da maquina
                      classemonitoramento.setIdMAQUINAS(rs.getInt("IdMAQUINAS"));
                      classemonitoramento.setNomeMaquina(rs.getString("nomeMaquina"));
                      classemonitoramento.setTipoMaquina(rs.getString("tipoMaquina"));
                  
                      //jogar o objeto monitoramento dentro da lista
                      lista.add(classemonitoramento);
                  } 
                 
                 
                } catch(SQLException e){
                    System.out.println("Erro ao listar maquinas "+e);
                } // fim do catch
                    return lista;
    }
}