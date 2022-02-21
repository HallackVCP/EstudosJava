package br.com.ufjf.dcc025.estoque.model.service;

import br.com.ufjf.dcc025.estoque.model.domain.Produto;
import br.com.ufjf.dcc025.estoque.model.exceptions.InvalidInputException;

import javax.swing.*;
import java.util.List;

public class ProdutoService {

    private void verify(Produto produto) throws InvalidInputException {
        if(produto.getPreco() <= 0){
            throw new InvalidInputException("Preço deve ser maior que 0");
        }
        if(produto.getQuantidade() < 0){
            throw new InvalidInputException("Quantidade deve ser maior ou igual a 0");
        }
        if(produto.getDescricao().isEmpty()){
            throw new InvalidInputException("Descricao nao pode estar vazia");
        }
        if(produto.getNome().isEmpty()){
            throw new InvalidInputException("Nome nao pode estar vazio");
        }
    }
    public void adicionarProduto(Produto produto, List<Produto> produtos){
        try{
            verify(produto);
            produtos.add(produto);
        }catch (InvalidInputException e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }

    }
    public void removerProduto(Produto produto, List<Produto> produtos){
        try{
            verify(produto);
            produtos.remove(produto);
        }catch (InvalidInputException e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }


    }


}
