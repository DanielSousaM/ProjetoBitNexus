/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author ALUNO
 */
public class CodigoCaixaModel {
    
    private int idCAIXA;
    private String tipoServico;
    private double valor;
    private String formadepagamento;
    private String dataUso;
    private double tempo;

    public CodigoCaixaModel(int idCAIXA, String tipoServico, double valor, String formadepagamento, String dataUso, double tempo) {
        this.idCAIXA = idCAIXA;
        this.tipoServico = tipoServico;
        this.valor = valor;
        this.formadepagamento = formadepagamento;
        this.dataUso = dataUso;
        this.tempo = tempo;
    }

    public CodigoCaixaModel() {
    }   
     // metodos getter e setter

    // metodo com retorno do tipo String
    
    // metodo com parametro e sem retorno

    public int getIdCAIXA() {
        return idCAIXA;
    }

    public void setIdCAIXA(int idCAIXA) {
        this.idCAIXA = idCAIXA;
    }

    public String getTipoServico() {
        return tipoServico;
    }

    public void setTipoServico(String tipoServico) {
        this.tipoServico = tipoServico;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getFormadepagamento() {
        return formadepagamento;
    }

    public void setFormadepagamento(String formadepagamento) {
        this.formadepagamento = formadepagamento;
    }

    public String getDataUso() {
        return dataUso;
    }

    public void setDataUso(String dataUso) {
        this.dataUso = dataUso;
    }

    public double getTempo() {
        return tempo;
    }

    public void setTempo(double tempo) {
        this.tempo = tempo;
    }
}