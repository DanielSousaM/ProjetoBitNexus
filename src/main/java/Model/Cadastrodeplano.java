/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author ALUNO
 */
public class Cadastrodeplano {
    private int idPLANOS;
    private String nomePlano;
    private String descricaoplano;
    private double valorPlano;
    private double taxaPlano;
    private String statusPlano;

    public Cadastrodeplano(int idPLANOS, String nomePlano, String descricaoplano, double valorPlano, double taxaPlano, String statusPlano) {
        this.idPLANOS = idPLANOS;
        this.nomePlano = nomePlano;
        this.descricaoplano = descricaoplano;
        this.valorPlano = valorPlano;
        this.taxaPlano = taxaPlano;
        this.statusPlano = statusPlano;
    }

    
    
    public Cadastrodeplano(){
        
    }

    public int getIdPLANOS() {
        return idPLANOS;
    }

    public void setIdPLANOS(int idPLANOS) {
        this.idPLANOS = idPLANOS;
    }

    public String getNomePlano() {
        return nomePlano;
    }

    public void setNomePlano(String nomePlano) {
        this.nomePlano = nomePlano;
    }

    public String getDescricaoplano() {
        return descricaoplano;
    }

    public void setDescricaoplano(String descricaoplano) {
        this.descricaoplano = descricaoplano;
    }

    public double getValorPlano() {
        return valorPlano;
    }

    public void setValorPlano(double valorPlano) {
        this.valorPlano = valorPlano;
    }

    public double getTaxaPlano() {
        return taxaPlano;
    }

    public void setTaxaPlano(double taxaPlano) {
        this.taxaPlano = taxaPlano;
    }

    public String getStatusPlano() {
        return statusPlano;
    }

    public void setStatusPlano(String statusPlano) {
        this.statusPlano = statusPlano;
    }
    
}