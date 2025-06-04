/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.CodigoCaixaModel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author ALUNO
 */
public class CodigoCaixaController {
    public boolean CodigoCaixa(CodigoCaixaModel e){
        String sql = "INSERT INTO CAIXA (tipoServico, valor, formadepagamento, dataUso, tempo) VALUES (?,?,?,?,?)";
        
        try (Connection conn = ConexaoComBancoDados.conectar();
             PreparedStatement ps = conn.prepareStatement(sql)) {
            
            ps.setString(1, e.getTipoServico());
            ps.setDouble(2, e.getValor());
            ps.setString(3, e.getFormadepagamento());
            ps.setString(4, e.getDataUso());
            ps.setDouble(5, e.getTempo());
            
            int retorno = ps.executeUpdate();
            return retorno > 0;
        } catch (SQLException er) {
            er.getStackTrace();
            return false;
        }
    }
}
