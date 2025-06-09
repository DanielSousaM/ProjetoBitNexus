/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.ClienteModel;
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
public class ClienteController {
        public boolean CadastroCliente(ClienteModel e) {
        String sql = "INSERT INTO CLIENTES (nomeCliente, emailCliente, cpfCliente, telefoneCliente, enderecoCliente) VALUES (?,?,?,?,?)";
        
                try(Connection conn = ConexaoComBancoDados.conectar();
                    PreparedStatement ps = conn.prepareStatement(sql)) {
            
                    ps.setString(1, e.getNomeCliente());
                    ps.setString(2, e.getEmailCliente());
                    ps.setString(3, e.getCpfCliente());
                    ps.setString(4, e.getTelefoneCliente());
                    ps.setString(5, e.getEnderecoCliente());
                    
                    int retorno = ps.executeUpdate();
                    return true;              
                } catch (SQLException er) {
                    er.getStackTrace();
                    return false;
    }   
}
        
        public List<ClienteModel> listarClientes(){
            // criar uma variavel tipo lista
            List<ClienteModel> lista = new ArrayList<>();
            // criar o comando sql para listar dados do BD
            String sql = "SELECT * FROM CLIENTES";
            
            try(Connection conn = ConexaoComBancoDados.conectar(); //conexao
                  PreparedStatement ps = conn.prepareStatement(sql); // comando para executar
                  ResultSet rs = ps.executeQuery()){ //guardar o resultado
                
                  //laço de repetição para percorrer o retorno do BD
                  while(rs.next()){
                      //criar um objeto da classe model
                      ClienteModel classeCliente = new ClienteModel();
                      //chamar os set e listar os dados do cliente
                      classeCliente.setIdCLIENTES(rs.getInt("IdCLIENTLES"));
                      classeCliente.setNomeCliente(rs.getString("nomeCliente"));
                      classeCliente.setEmailCliente(rs.getString("emailCliente"));
                      classeCliente.setCpfCliente(rs.getString("cpfCliente"));
                      classeCliente.setTelefoneCliente(rs.getString("telefoneCliente"));
                      classeCliente.setEnderecoCliente(rs.getString("enderecoCliente"));
                      classeCliente.setPLANOS_IdPLANOS(rs.getInt("PLANOS_IdPLANOS"));
                                            
                      //jogar o objeto monitoramento dentro da lista                      
                      lista.add(classeCliente);
                  }
                
            } catch(SQLException e){
                System.out.println("Erro ao listar clientes "+e);
            } // fim do catch
            return lista;
        }// fim do metodo listar clientes
}