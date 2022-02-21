package br.com.ufjf.dcc02.bingo.entidades;

import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class Jogo {
    public int nmrJogadores;
    public Set<Jogador> jogadores = new HashSet<>();
    public int ganhadores = 0;
    public Jogo(int nmrJogadores){
        this.nmrJogadores=nmrJogadores;
        jogadores = criaJogadores(nmrJogadores, jogadores);
    }
    public Set<Jogador> criaJogadores(int nmrJogadores, Set<Jogador> jogadores){
        for(int i = 0; i<nmrJogadores;i++){
            jogadores.add(new Jogador());
        }
        return jogadores;
    }
    public int sorteiaNumero(){
        System.out.println("Digite 1 para sortear um numero aleatorio");
        int a;
        Scanner in = new Scanner(System.in);
        a = in.nextInt();
        int x;
        if(a ==1)
        {

            Random random = new Random();
            x = random.nextInt(75)+1;
            System.out.println("O numero sorteado foi: "+x);
            return x;

        }
        else{
            System.out.println("Nao havera sorteio nesse turno");
            x = 0;
        }
        return x;
    }
    public void verificaNmr(int x){
        for (Jogador jogador:this.jogadores) {
            for(int i=0;i<5;i++){
                for(int j=0;j<5;j++){
                    if(i!=3 && j!=3){
                        jogador.verificaPos(x, i, j);
                    }
                }
            }
        }
    }
    public void jogar(){
        int turno = 1;
        printaCartelas();
        while(!acabou()){
            System.out.println("Turno: " + turno);
            int x = sorteiaNumero();
            verificaNmr(x);
            printaCartelas();
            for (Jogador jogador:jogadores
                 ) {
                if(jogGanhou(jogador)){
                    jogadores.remove(jogador);
                }
            }
            turno ++;

        }
    }

    private void printaCartelas() {
        for (Jogador jogador:jogadores){
            jogador.printaCartela();
            System.out.println("-------------------------------");
        }
    }
    private boolean jogGanhou(Jogador jogador){
        return jogador.ganhou();
    }

    public boolean acabou(){
        for (Jogador jogador:this.jogadores)
        {
            if(jogador.verificaCartela()){
                ganhadores+=1;
            }
        }
        if(ganhadores == this.nmrJogadores){
            return true;
        }
        else{
            return false;
        }
    }
}
