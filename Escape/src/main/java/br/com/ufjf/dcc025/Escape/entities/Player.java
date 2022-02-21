package br.com.ufjf.dcc025.Escape.entities;

public class Player extends EspacoTabuleiro{
    public Player(int[] pos) {
        super(pos);
        setTipo('P');
    }
    public void movePlayer(char dir, int qtd){
        int aux[] = new int[2];
        int x;
        int y;
        aux = this.getPos();
        x = aux[0];
        y=aux[1];
        switch (dir){
            case('e'):
                y-=qtd;
                break;
            case('d'):
                y+=qtd;
                break;
            case('c'):
                x-=qtd;
                break;
            case('b'):
                x+=qtd;
                break;
            default:
                break;
        }
        aux[0]= x;
        aux[1] = y;
        this.setPos(aux);

    }
}
