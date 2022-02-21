import javax.annotation.Resource;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;
import java.util.Scanner;

/*
  autor: Vinicius Hallack Cobucci Perobelli da Silva
 */

public class Sudoku {

    // função que verifica se o numero avaliado respeita a regra das linhas
    public static boolean verficaLinhas(int[][] m, int valor, int linha, int coluna) {
        for (int i = 0; i < 9; i++) {
            if (valor == m[linha][i])
                return false;
        }
        return true;
    }

    // função que verifica se o numero avaliado respeita a regra das colunas
    public static boolean verificaColunas(int[][] m, int valor, int coluna, int linha) {
        for (int i = 0; i < 9; i++) {
            if (valor == m[i][coluna])
                return false;
        }
        return true;
    }

    // função que verifica se o numero avaliado respeita a regra dos quadrados 3x3
    public static boolean verificaQuadrados(int[][] m, int valor, int coluna, int linha) {
        for (int x = 0; x < 3; x++) {
            for (int y = 0; y < 3; y++) {
                if (m[linha - (linha % 3) + x][coluna - (coluna % 3) + y] == valor)
                    return false;
            }
        }
        return true;
    }

    public static int[][] jogoAleatorio(int n, int[][] jogo){
        Random random = new Random();
        int linha;
        int coluna;
        int valor;
        while(n>0){
            linha = random.nextInt(9);
            coluna = random.nextInt(9);
            valor = random.nextInt(9)+1;
            if(verficaLinhas(jogo,valor, linha, coluna)
                    &&verificaColunas(jogo, valor, coluna, linha)
                    &&verificaQuadrados(jogo, valor, coluna, linha)){
                jogo[linha][coluna] = valor;
                n--;
            }
        }


        return jogo;
    }

    public static int[][] jogoProprio(int [][] jogo) throws IOException {

        return jogada(jogo, true);
    }

    private static int[][] jogada(int[][] jogo, boolean criando) throws IOException {
        int linha;
        int coluna;
        int valor;
        int dica;
        Scanner in = new Scanner(System.in);
        do{
            printarJogo(jogo);
            if(!criando){
                System.out.println("Digite 1 para ver dicas para uma posicao");
                dica = in.nextInt();
                while(dica == 1){
                    System.out.println("Digite linha e coluna da posição a ser analisada: ");
                    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                    String  lines = br.readLine();

                    String[] strs = lines.trim().split(",");
                    linha = Integer.parseInt(strs[0])-1;
                    coluna = Integer.parseInt(strs[1])-1;
                    dicas(jogo, linha, coluna);
                    System.out.println("Se quiser ver outra dica digite 1, se quiser fazer sua jogada digite 2");
                    dica=in.nextInt();
                }
            }
            System.out.println("Digite a linha,coluna e o valor a ser inserido");
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String  lines = br.readLine();

            String[] strs = lines.trim().split(",");
            linha = Integer.parseInt(strs[0])-1;
            coluna = Integer.parseInt(strs[1])-1;
            valor = Integer.parseInt(strs[2]);


            if(verificaPos(linha)&&verificaPos(coluna)&&verificaValor(valor)){

                if(verificaQuadrados(jogo, valor, coluna, linha)&&verificaColunas(jogo, valor, coluna, linha)
                        &&verficaLinhas(jogo, valor, linha, coluna)){
                    jogo[linha][coluna] = valor;
                }
                else{
                    System.out.println("Valor inválido para a posição, digite novamente");
                }
            }
            else{
                System.out.println("Valor ou posição não permitidos");
            }


        }while(linha+1 != -1 && coluna+1 != -1 && valor != -1);
        return jogo;
    }



    private static boolean verificaPos(int pos){
        return ((pos)>=0) && ((pos)<9);
    }
    private static boolean verificaValor(int valor){
        return valor<=9 && valor>0;
    }

    public static void printarJogo(int [][] jogo){
        for(int i = 0; i<9;i++){
            for(int j=0;j<9;j++){
                System.out.print(jogo[i][j] + " ");
            }
            System.out.println("");
        }
    }

    public static int[][] jogar(int[][] jogo) throws IOException {
        Scanner in = new Scanner(System.in);
        int opcao;
        int saida;
        int cont = 0;
        do{
            System.out.println("Digite 1 para fazer uma nova jogada \n Digite 2 para remover uma jogada");
            opcao = in.nextInt();
            if(opcao == 1){
                jogada(jogo, false);
                cont++;
            }
            else if(opcao == 2){
                if(cont>=1){
                    removerJogada(jogo);
                    cont++;
                }
                else{
                    System.out.println("Nao remover na primeira jogada");
                }
            }
            else{
                System.out.println
                        ("Valor invalido, digite 1 para fazer uma nova jogada ou 2 para remover uma jogada");
            }
            printarJogo(jogo);
            System.out.println("Digite -1 para sair do jogo, digite 2 para continuar");

            saida = in.nextInt();

        }while(saida !=-1);


        return jogo;
    }

    public static int[][] removerJogada(int[][] jogo) throws IOException {
        int linha;
        int coluna;
        Scanner in = new Scanner(System.in);
        do{
            printarJogo(jogo);
            System.out.println("Digite a linha e coluna a ser removido");
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String  lines = br.readLine();

            String[] strs = lines.trim().split(",");
            linha = Integer.parseInt(strs[0])-1;
            coluna = Integer.parseInt(strs[1])-1;
            if(verificaPos(linha)&&verificaPos(coluna)){
                jogo[linha][coluna] = 0;
            }
            else{
                System.out.println("Posição inválida ou inexistente");
            }

        }while(linha+1 != -1 && coluna+1 != -1);
        return jogo;
    }

    public static boolean verifica(int[][] jogo) {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (jogo[i][j] != 0) {
                    int r = jogo[i][j];
                    jogo[i][j] = 0;
                    if (verficaLinhas(jogo, r, i, j) && verificaColunas(jogo, r, j, i) && verificaQuadrados(jogo, r, j, i))
                        jogo[i][j] = r;
                    else return false;
                }
            }
        }
        return true;
    }

    public static boolean verificaFim(int[][] jogo){
        int cont = 81;
        for(int i =0; i<9; i++){
            for(int j=0; j<9; j++){
                if(jogo[i][j] != 0){
                    cont--;
                }
            }
        }
        return cont ==0;
    }

    public static void dicas(int [][] jogo, int linha, int coluna){
        for(int i =0; i<9;i++){
            if(verficaLinhas(jogo, i, linha, coluna) && verificaColunas(jogo, i, coluna, linha) &&
                    verificaQuadrados(jogo, i, coluna, linha)){
                System.out.println("O valor " + i + "pode ser inserido nessa posicao");
            }
        }
    }

    private static int[][] criaJogo(int[][] jogo) throws IOException {
        for(int i =0; i<9;i++){
            for(int j=0; j<9;j++){
                jogo[i][j] = 0;
            }
        }
        System.out.println("Deseja iniciar com um jogo aleatorio ou criar o proprio jogo?");
        System.out.println("Digite 1 para criar um jogo aleatorio \n Digite 2 para criar o proprio jogo");
        Scanner in = new Scanner(System.in);
        int entrada = in.nextInt();
        switch(entrada){
            case 1:
                Random random = new Random();
                int n = random.nextInt(20)+10;
                jogoAleatorio(n, jogo);
                break;
            case 2:
                jogoProprio(jogo);
                break;
        }


        printarJogo(jogo);
        return jogo;
    }



    public static void main(String[] args) throws IOException {
        int[][] jogo = new int[9][9];

        Scanner in = new Scanner(System.in);
        jogo = criaJogo(jogo);
        System.out.println("Digite 1 para comecar");
        int a = in.nextInt();
        if(a==1){
            jogar(jogo);
        }

        if(verificaFim(jogo)){
            System.out.println("Parabens por concluir o jogo");
            System.out.println("Digite 1 para jogar novamente");
            int replay = in.nextInt();
            if(replay == 1){
                jogo = criaJogo(jogo);
            }
        }
        else{
            System.out.println("jogo incompleto...");
            System.out.println("Digite 1 para jogar novamente");
            int replay = in.nextInt();
            if(replay == 1){
                jogo = criaJogo(jogo);
            }
        }


    }




}
