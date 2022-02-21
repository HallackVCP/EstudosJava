package br.com.ufjf.dcc025.Escape.main;

import br.com.ufjf.dcc025.Escape.entities.Jogo;


import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String args[]) throws IOException {
        int saida = 1;
        while(saida!=0){
            System.out.println("Bem vindo ao jogo de escape");
            System.out.println("Digite com quantas bombas deseja iniciar o jogo: ");
            int qtd = new Scanner(System.in).nextInt();
            Jogo jogo = new Jogo(qtd);
            jogo.Jogar();
            System.out.println("Digite 1 para jogar novamente,0 para sair");
            int replay = new Scanner(System.in).nextInt();
            saida = replay;
        }

    }

}
