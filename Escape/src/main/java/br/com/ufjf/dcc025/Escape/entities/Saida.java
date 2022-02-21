package br.com.ufjf.dcc025.Escape.entities;

import java.util.Random;

public class Saida extends EspacoTabuleiro{

    public Saida(int[] pos) {
        super(pos);
        setTipo('S');
    }

    public void setSaida(){
        int x;
        int y;
        int Aux[] = new int[2];
        Random in = new Random();
        x= in.nextInt(10);
        y = in.nextInt(10);
        Aux[0] = x;
        Aux[1] = y;

        setPos(Aux);
    }
}
