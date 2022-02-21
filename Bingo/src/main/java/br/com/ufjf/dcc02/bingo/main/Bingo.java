/***
 * author: Vinicius Hallack Cobucci Perobelli da Silva-202065192A
 */

package br.com.ufjf.dcc02.bingo.main;

import br.com.ufjf.dcc02.bingo.entidades.Jogo;

import java.util.Scanner;

public class Bingo {
    public static void main(String args[]){
        System.out.println("Digite quantos jogadores serao: ");
        int nmr;
        Scanner in = new Scanner(System.in);
        nmr = in.nextInt();
        Jogo jogo = new Jogo(nmr);
        jogo.jogar();
    }
}
