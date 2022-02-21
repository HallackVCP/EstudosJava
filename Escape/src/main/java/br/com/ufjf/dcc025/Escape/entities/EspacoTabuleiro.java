package br.com.ufjf.dcc025.Escape.entities;

public abstract class EspacoTabuleiro {
    private char tipo;
    private int[] pos = new int[2];
    public EspacoTabuleiro(int[] pos){
        this.pos = pos;
    }

    public char getTipo() {
        return tipo;
    }

    public void setTipo(char tipo) {
        this.tipo = tipo;
    }

    public int[] getPos() {
        return pos;
    }

    public void setPos(int[] pos) {
        this.pos = pos;
    }
}
