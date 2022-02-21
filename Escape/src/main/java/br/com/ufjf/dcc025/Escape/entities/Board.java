package br.com.ufjf.dcc025.Escape.entities;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Board {
    private int initialPos[] = {0,0};
    private char board[][] = new char[10][10];
    private List<Bomb> bombs = new ArrayList<>();
    private Player player = new Player(initialPos);
    private Saida saida = new Saida(initialPos);
    private int qtdBombs;
    public List<char[]> pedidos = new ArrayList();
    public boolean perdeu = false;
    public boolean ganhou = false;


    public Board(int qtdBombs){
        this.qtdBombs = qtdBombs;
        setInitialBoard();
        setSaida();
        setBombs();
        setBoard();
    }

    public char[][] getBoard() {
        return board;
    }
    public void setInitialBoard(){
        for(int i = 0; i<10; i++){
            for(int j = 0; j<10; j++){
                board[i][j] = 0;
            }
        }
    }

    public void getPedidos() {
        for (char[]pedido:pedidos) {
            for (int i = 0; i < 3; i++) {
                System.out.print(pedido[i]);
            }
            System.out.print(" ");
        }

    }

    public void setBoard() {
        int aux[]= player.getPos();
        int x = aux[0];
        int y = aux[1];
        board[x][y] = player.getTipo();
        int auxS[] = saida.getPos();
        x = auxS[0];
        y=auxS[1];
        board[x][y] = saida.getTipo();
        for (Bomb bomb:bombs){
            aux = bomb.getPos();
            x = aux[0];
            y = aux[1];
            board[x][y] = bomb.getTipo();
        }



    }
    public void setBoardPos(){
        int aux[]= player.getPos();
        int x = aux[0];
        int y = aux[1];
        Bomb bomb = new Bomb(aux);

        if((board[x][y] != bomb.getTipo()) && (board[x][y] != saida.getTipo())){
            board[x][y] = player.getTipo();
        }
        else if(board[x][y] == this.saida.getTipo()){
            this.ganhou = true;
            System.out.println("Voce venceu!");
        }
        else if (board[x][y] == bomb.getTipo()){
            this.perdeu = true;
            System.out.println("G A M E  O V E R");
        }
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer() {
        setBoardPos();
    }

    public List<Bomb> getBombs() {
        return bombs;
    }

    public void setBomb() {
        int x;
        int y;
        Random in = new Random();
        x = in.nextInt(10);
        y = in.nextInt(10);

        if(x!=0 && y!=0){
            int aux[] = {x,y};
            bombs.add(new Bomb(aux));
        }
        else{
            x = in.nextInt(10);
            y = in.nextInt(10);
            int aux[] = {x,y};
            bombs.add(new Bomb(aux));
        }

    }
    public void setBombs(){
        for(int i=0;i<qtdBombs;i++){
            setBomb();
        }
    }

    public Saida getSaida() {
        return saida;
    }

    public void setSaida() {
        saida.setSaida();
    }
    public void printBoard(){
        for(int i = 0; i<10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println(" ");
        }

    }
    public boolean ganhou(){
        boolean ganhou = player.getPos() == saida.getPos();
        if(ganhou){
            System.out.println("Parabens,voce ganhou!");
            printBoard();
        }
        return ganhou;
    }
    public boolean perdeu(){
        for (Bomb bomb:bombs){
            if(bomb.getPos() == player.getPos()){
                System.out.println("G A M E   O V E R!");
                printBoard();
                return true;
            }
        }
        return false;
    }
    public void jogada() throws IOException {
        int[] auxRemove = player.getPos();
        int x = auxRemove[0];
        int y = auxRemove[1];
        System.out.println
                ("Digite sua proxima jogada:um caractere de direcao e a quantidade de posicoes a se mover");
        Scanner in = new Scanner(System.in);
        char[] entrada = in.next().toCharArray();
        pedidos.add(entrada);
        System.out.println(entrada[0] + " " + entrada[2]);
        player.movePlayer(entrada[0], Character.getNumericValue(entrada[2]));
        setPlayer();
        board[x][y] = 0;


    }

}
