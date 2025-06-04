/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.Cadastrodeplano;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author ALUNO
 */
public class CadastrodeplanoController {
    public boolean Cadastrodeplano(Cadastrodeplano e) throws SQLException{
        String sql = "INSET INTO PLANOS (nomePlano, descricaoPlano, valorPlano, taxaPlano, statusPlano) VALUES (?,?,?,?,?)";
        
        try (Connection conn = ConexaoComBancoDados.conectar();
                PreparedStatement ps = conn.prepareStatement(sql)) {
                
                ps.setString(1, e.getNomePlano());
                ps.setString(2, e.getDescricaoplano());
                ps.setDouble(3, e.getValorPlano());
                ps.setDouble(4, e.getTaxaPlano());
                ps.setString(5, e.getStatusPlano());
                
                 int retorno = ps.executeUpdate();
                 return retorno > 0;
        } catch (SQLException er) {
                er.getStackTrace();
                return false;
        }
    }
}
