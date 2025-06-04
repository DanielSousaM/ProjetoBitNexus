/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.ClienteModel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author ALUNO
 */
public class ClienteController {
        public boolean CadastroCliente(ClienteModel e){
        String sql = "INSERT INTO CLIENTES (nomeCliente, emailCliente, cpfCliente, telefoneCliente, enderecoCliente, senhaCliente) VALUES (?,?,?,?,?,?)";
        
                try(Connection conn = ConexaoComBancoDados.conectar();
                    PreparedStatement ps = conn.prepareStatement(sql)) {
            
                    ps.setString(1, e.getNomeCliente());
                    ps.setString(2, e.getEmailCliente());
                    ps.setString(3, e.getCpfCliente());
                    ps.setString(4, e.getTelefoneCliente());
                    ps.setString(5, e.getCpfCliente());
                    
                    int retorno = ps.executeUpdate();
                    return retorno > 0;              
                } catch (SQLException er) {
                    er.getStackTrace();
                    return false;
    }   
}
}