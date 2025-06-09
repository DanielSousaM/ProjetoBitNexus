/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author ALUNO
 */
public class ClienteModel {
   private int idCLIENTES;
   private int PLANOS__IdPLANOS;
   private String nomeCliente;
   private String emailCliente;
   private String cpfCliente;
   private String telefoneCliente;
   private String enderecoCliente;
   
   

    public ClienteModel(int idCLIENTES, int PLANOS__IdPLANOS, String nomeCliente, String emailCliente, String cpfCliente, String telefoneCliente, String enderecoCliente) {
        this.idCLIENTES = idCLIENTES;
        this.PLANOS__IdPLANOS = PLANOS__IdPLANOS;
        this.nomeCliente = nomeCliente;
        this.emailCliente = emailCliente;
        this.cpfCliente = cpfCliente;
        this.telefoneCliente = telefoneCliente;
        this.enderecoCliente = enderecoCliente;
    }

    public int getIdCLIENTES() {
        return idCLIENTES;
    }

    public void setIdCLIENTES(int idCLIENTES) {
        this.idCLIENTES = idCLIENTES;
    }

    public int getPLANOS__IdPLANOS() {
        return PLANOS__IdPLANOS;
    }

    public void setPLANOS__IdPLANOS(int PLANOS__IdPLANOS) {
        this.PLANOS__IdPLANOS = PLANOS__IdPLANOS;
    }

    public ClienteModel() {
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getEmailCliente() {
        return emailCliente;
    }

    public void setEmailCliente(String emailCliente) {
        this.emailCliente = emailCliente;
    }

    public String getCpfCliente() {
        return cpfCliente;
    }

    public void setCpfCliente(String cpfCliente) {
        this.cpfCliente = cpfCliente;
    }

    public String getTelefoneCliente() {
        return telefoneCliente;
    }

    public void setTelefoneCliente(String telefoneCliente) {
        this.telefoneCliente = telefoneCliente;
    }

    public String getEnderecoCliente() {
        return enderecoCliente;
    }

    public void setEnderecoCliente(String enderecoCliente) {
        this.enderecoCliente = enderecoCliente;
    }

    public void setPLANOS_IdPLANOS(int aInt) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}