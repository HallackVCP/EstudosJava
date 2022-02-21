package br.com.ufjf.dcc02.bingo.entidades;

import java.util.Random;

public class Jogador {
    public Cartela cartela;
    public boolean ganhou;

    public Jogador(){
        cartela = new Cartela();
    }
    public void verificaPos(int x, int i, int j){
        this.cartela.setPos(x, i, j);
    }

    public boolean verificaCartela(){
        int ganhou = 0;
        for(int i=0;i<5;i++){
            for(int j=0;j<5;j++){
                if(this.cartela.cartela[i][j]==0){
                    ganhou ++;
                }
            }
        }
        return ganhou == 24;
    }
    public void printaCartela(){
        this.cartela.printaCartela();
    }
    public boolean ganhou (){
        if(verificaCartela()){
            System.out.println("Parabens voce ganhou!");
        }
        return verificaCartela();
    }



}
