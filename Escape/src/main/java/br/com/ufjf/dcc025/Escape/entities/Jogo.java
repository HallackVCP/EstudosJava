package br.com.ufjf.dcc025.Escape.entities;

import java.io.IOException;
import java.util.Scanner;

public class Jogo {
    private int qtd;
    public Board tabuleiro;
    private char dir;
    private int qtdMove;
    public Jogo(int qtd){
        this.qtd = qtd;
        tabuleiro = new Board(qtd);
        tabuleiro.setBoard();
    }
    public void printaJogo(){
        tabuleiro.printBoard();
    }
    public boolean ganhou(){
        return tabuleiro.ganhou;
    }
    public boolean perdeu(){
        return tabuleiro.perdeu;
    }
    public void Jogar() throws IOException {
        printaJogo();
        while(!ganhou() && !perdeu()){
            System.out.println("Digite sua proxima jogada:");
            tabuleiro.jogada();
            printaJogo();
        }
        System.out.println("Suas jogadas foram: ");
        tabuleiro.getPedidos();
    }

}
