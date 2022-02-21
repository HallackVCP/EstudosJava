package br.com.ufjf.dcc025.sispag.entidades;

public abstract class Funcionario {
    private String nome;
    private double salarioDiario;

    public Funcionario(){}

    public Funcionario(String nome, double salarioDiario) {
        this.nome = nome;
        this.salarioDiario = salarioDiario;
    }

    public String getNome() {
        return nome.trim();
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalarioDiario() {
        return salarioDiario;
    }

    public void setSalarioDiario(double com) {
        this.salarioDiario += com;
    }

    public abstract void calcComissao();
}
