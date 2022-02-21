package br.com.ufjf.dcc025.estoque.controller;

import br.com.ufjf.dcc025.estoque.model.domain.Produto;
import br.com.ufjf.dcc025.estoque.model.service.ProdutoService;

import java.util.List;

public class ProdutoController {
    private Produto produto;
    private ProdutoService service = new ProdutoService();


    public ProdutoController(Produto produto) {
        this.produto = produto;
    }
    public ProdutoController(String nome, String descricao, int quantidade, double preco){
        this.produto = new Produto(nome, descricao, quantidade, preco);
    }
    public void adicionarProduto(List<Produto> produtos){
        service.adicionarProduto(this.produto, produtos);
    }
    public void removerProduto(List<Produto> produtos){
        service.removerProduto(this.produto, produtos);
    }
}
