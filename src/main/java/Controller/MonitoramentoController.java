/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.MonitoramentoModel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

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
            return retorno > 0;
        } catch (SQLException er) {
            er.getStackTrace();
            return false;
        }
    }
}