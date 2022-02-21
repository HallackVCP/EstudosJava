package br.com.ufjf.dcc025.sispag.entidades;

import java.util.ArrayList;
import java.util.List;

public class Vendedor extends Funcionario{
    private List<Venda> vendas;
    private double comissao;

    public Vendedor(){}

    public Vendedor(String nome, double salarioDiario, List<Venda> vendas) {
        super(nome, salarioDiario);
        this.vendas = vendas;
        comissao = 0;
    }

    public Vendedor(String nome, double salarioDiario) {
        super(nome, salarioDiario);
        comissao=0;
        vendas = new ArrayList<>();
    }

    public List<Venda> getVendas() {
        return vendas;
    }

    public void setVendas(double valVenda) {
        Venda venda = new Venda(valVenda);
        this.vendas.add(venda);
    }

    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }

    @Override
    public void calcComissao() {

        for (Venda venda:
             vendas) {
            comissao += (0.1/100)*venda.getValorTotal();
        }
        this.setSalarioDiario(comissao);

    }
}
