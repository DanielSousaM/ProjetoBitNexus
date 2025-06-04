/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.CadastroDeFuncionarioModel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;


/**
 *
 * @author ALUNO
 */
public class CadastroDeFuncionarioController {
    
    public boolean CadastroDeFuncionario(CadastroDeFuncionarioModel e) {
        String sql = "INSERT INTO FUNCIONARIOS (nomeFuncionario, datanascimentoFuncionario, telefoneFuncionario, cpfFuncionario, emailFuncionario, senhaFuncionario, sexo) VALUES (?,?,?,?,?,?,?)";
        
        try (Connection conn = ConexaoComBancoDados.conectar();
               PreparedStatement ps = conn.prepareStatement(sql)) {
            
               ps.setString(1, e.getNomeFuncionario());
               ps.setString(2, e.getDatanascimentoFuncionario());
               ps.setString(3, e.getTelefoneFuncionario());
               ps.setString(4, e.getCpfFuncionario());
               ps.setString(5, e.getEmailFuncionario());
               ps.setString(6, e.getSenhaFuncionario());
               ps.setString(7, e.getSexo());
               
               int retorno = ps.executeUpdate();
               return retorno > 0;
        }catch (SQLException er){
            er.getStackTrace();
            return false;
        }
    }
    }
    