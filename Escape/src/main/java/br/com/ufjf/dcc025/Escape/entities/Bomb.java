package br.com.ufjf.dcc025.Escape.entities;

public class Bomb extends EspacoTabuleiro{
    public Bomb(int[] pos) {
        super(pos);
        setTipo('B');
    }
}
