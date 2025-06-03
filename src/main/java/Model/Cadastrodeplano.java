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
    private String driscricaoplano;
    private double valorPlano;
    private double taxaPlano;
    private String statusPlano;

    public Cadastrodeplano(int idPLANOS, String nomePlano, String driscricaoplano, double valorPlano, double taxaPlano, String statusPlano) {
        this.idPLANOS = idPLANOS;
        this.nomePlano = nomePlano;
        this.driscricaoplano = driscricaoplano;
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

    public String getDriscricaoplano() {
        return driscricaoplano;
    }

    public void setDriscricaoplano(String driscricaoplano) {
        this.driscricaoplano = driscricaoplano;
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

    public void printStackTrace() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}