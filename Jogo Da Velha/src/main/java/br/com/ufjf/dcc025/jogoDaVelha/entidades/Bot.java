package br.com.ufjf.dcc025.jogoDaVelha.entidades;

import java.util.Random;

public class Bot extends Jogador{

    public Bot(int jogador){
        super(jogador);
        System.out.println("Jogador 'Computador' criado!");
    }

    @Override
    public void jogar(Tabuleiro tabuleiro){
        Tentativa(tabuleiro);
        tabuleiro.setPosicao(tentativa, jogador);
    }

    @Override
    public void Tentativa(Tabuleiro tabuleiro){
        Random rand = new Random();
        do{
            do{
                System.out.print("Linha: ");
                tentativa[0] = rand.nextInt(3)+1;

                if( tentativa[0] > 3 ||tentativa[0] < 1)
                    System.out.println("Linha inválida. É 1, 2 ou 3");

            }while( tentativa[0] > 3 ||tentativa[0] < 1);

            do{
                System.out.print("Coluna: ");
                tentativa[1] = rand.nextInt(3)+1;

                if(tentativa[1] > 3 ||tentativa[1] < 1)
                    System.out.println("Coluna inválida. É 1, 2 ou 3");

            }while(tentativa[1] > 3 ||tentativa[1] < 1);

            tentativa[0]--;
            tentativa[1]--;

            if(!checaTentativa(tentativa, tabuleiro))
                System.out.println("Esse local já foi marcado. Tente outro.");
        }while( !checaTentativa(tentativa, tabuleiro) );
    }
}
