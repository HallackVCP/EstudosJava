package br.com.ufjf.dcc02.bingo.entidades;

import java.util.Random;

public class Cartela {
    public int[][] cartela = new int[5][5];
    private static int nmrCartela = 0;
    private int nCartela;
    public Cartela(){
        nmrCartela++;
        nCartela = nmrCartela;
        cartela = criaCartela(cartela);

    }
    public int[][]criaCartela(int [][]cartela){
        Random random = new Random();
        for(int i = 0; i<5;i++){
            for(int j = 0; j< 5; j++){
                if(j == 0){
                    cartela[i][j] = random.nextInt(15)+1;
                }
                else if(j==1){
                    cartela[i][j] = random.nextInt(15)+15;
                }
                else if(j==2){
                    cartela[i][j]= random.nextInt(15)+30;
                }
                else if(j==3){
                    cartela[i][j]= random.nextInt(15)+45;
                }
                else if(j==4){
                    cartela[i][j]= random.nextInt(15)+60;
                }
                if(i == 2 && j == 2){
                    cartela[i][j] = 0;
                }
            }
        }
        return cartela;
    }
    public void setPos(int x, int i, int j){
        if(x == this.cartela[i][j]){
            this.cartela[i][j] = 0;
        }
    }
    public void printaCartela(){
        System.out.println("Cartela: 00"+ this.nCartela);
        System.out.println("B  I  N  G  O");
        for(int i =0; i<5;i++){
            for(int j=0;j<5;j++){
                System.out.print(this.cartela[i][j]);
                if(i <= 4){
                    System.out.print("|");
                }

            }
            System.out.println("");
            System.out.println("------------");

        }
    }
}
