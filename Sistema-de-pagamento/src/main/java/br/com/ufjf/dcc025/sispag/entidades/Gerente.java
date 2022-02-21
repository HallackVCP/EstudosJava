package br.com.ufjf.dcc025.sispag.entidades;

import java.util.ArrayList;
import java.util.List;

public class Gerente extends Funcionario{

    private List<Vendedor> vendedores;
    private double comissao;

    public Gerente() {}

    public Gerente(String nome, double salarioDiario, List<Vendedor> vendedores) {
        super(nome, salarioDiario);
        this.vendedores = vendedores;
    }

    public Gerente(String nome, double salarioDiario) {
        super(nome, salarioDiario);
        comissao=0;
        vendedores = new ArrayList<>();
    }

    public List<Vendedor> getVendedores() {
        return vendedores;
    }

    public void setVendedores(Vendedor vendedore) {
        this.vendedores.add(vendedore);
    }

    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }

    @Override
    public void calcComissao() {

        for (Vendedor vendedor:
             vendedores) {
            comissao += (0.5)*vendedor.getComissao();
        }
        this.setSalarioDiario(comissao);

    }
}
