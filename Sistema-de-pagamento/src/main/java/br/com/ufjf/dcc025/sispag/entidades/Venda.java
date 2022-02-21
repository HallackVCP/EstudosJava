package br.com.ufjf.dcc025.sispag.entidades;

public class Venda {
    private double valorTotal;

    public Venda(){}

    public Venda(double valorTotal){
        this.valorTotal = valorTotal;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }
}
