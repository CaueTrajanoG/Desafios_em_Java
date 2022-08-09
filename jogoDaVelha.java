import java.util.Scanner;

public class jogoDaVelha {
    public static void main(String[] args) {

        /*
         * Faça um programa para jogar o jogo da velha. O programa deve
         * permitir que dois jogadores façam uma partida do jogo da velha,
         * usando o computador para ver o tabuleiro. Cada jogador vai
         * alternadamente informando a posição onde deseja colocar a sua
         * peça (‘O’ ou ‘X’). O programa deve impedir jogadas inválidas e
         * determinar automaticamente quando o jogo terminou e quem foi o
         * vencedor (jogador1 ou jogador2). A cada nova jogada, o programa
         * deve atualizar a situação do tabuleiro na tela.
         */

        String[][] jogoDaVelha = new String[3][3];
        Scanner teclado = new Scanner(System.in);

        // Desenhando Tabuleiro
        for (int i = 0; i < jogoDaVelha.length; i++) {
            System.out.print((i + 1) + " ->");
            for (int j = 0; j < jogoDaVelha[i].length; j++) {
                jogoDaVelha[i][j] = "_";
                System.out.print(" | " + jogoDaVelha[i][j]);
            }
            System.out.println(" |");

        }
        System.out.println("       ^   ^   ^");
        System.out.println("       1   2   3");
        // instanciando variaveis
        int linha = 0;
        int coluna = 0;
        int jogador = 1;
        boolean terminou = false;
        int contador = 0;
        // Iniciando o jogo
        while (!terminou) {
            // Jogador 01 seleciona linha e coluna validas
            if (jogador == 1) {
                boolean linhaValida = false;
                while (!linhaValida) {
                    System.out.print("Linha 1, 2 ou 3: ");
                    linha = teclado.nextInt();

                    if (linha >= 1 && linha <= 3) {
                        linhaValida = true;

                    } else {
                        System.out.println("Linha invalida");
                        contador--;
                    }
                }
                boolean colunaValida = false;
                while (!colunaValida) {
                    System.out.print("Coluna 1, 2 ou 3: ");
                    coluna = teclado.nextInt();

                    if (coluna >= 1 && coluna <= 3) {
                        colunaValida = true;
                    } else {
                        System.out.println("Coluna invalida");
                        contador--;
                    }
                }
            }

            // Jogador 02 seleciona linha e coluna validas
            if (jogador == 2) {
                boolean linhaValida = false;
                while (!linhaValida) {
                    System.out.print("Linha 1, 2 ou 3: ");
                    linha = teclado.nextInt();
                    if (linha >= 1 && linha <= 3) {
                        linhaValida = true;

                    } else {
                        System.out.println("Linha invalida");
                        contador--;
                    }
                }
                boolean colunaValida = false;
                while (!colunaValida) {
                    System.out.print("Coluna 1,2 ou 3: ");
                    coluna = teclado.nextInt();

                    if (coluna >= 1 && coluna <= 3) {
                        colunaValida = true;
                    } else {
                        System.out.println("Coluna invalida");
                        contador--;
                    }
                }

            }
            linha--;
            coluna--;
            // Verifica se a casa escolhida ja foi jogada
            if (jogoDaVelha[linha][coluna] != "X" && jogador == 1 &&
                    jogoDaVelha[linha][coluna] != "O") {

                jogoDaVelha[linha][coluna] = "X";
                System.out.println("Jogador 1 jogou");
                System.out.println();
                jogador = 2;

            } else if (jogoDaVelha[linha][coluna] != "X" && jogador == 2 &&
                    jogoDaVelha[linha][coluna] != "O") {

                jogoDaVelha[linha][coluna] = "O";
                System.out.println("Jogador 2 jogou");
                System.out.println();
                jogador = 1;

            } else if (jogoDaVelha[linha][coluna] == "X" ||
                    jogoDaVelha[linha][coluna] == "O") {
                System.out.println("Local desenhado escolha outro");
                contador--;
                System.out.println();

            }

            // Redesenha o campo
            for (int i = 0; i < jogoDaVelha.length; i++) {
                System.out.print((i + 1) + " ->");
                for (int j = 0; j < jogoDaVelha[i].length; j++) {
                    System.out.print(" | " + jogoDaVelha[i][j]);
                }
                System.out.println(" | ");
            }
            System.out.println("       ^   ^   ^");
            System.out.println("       1   2   3");

            if (jogoDaVelha[0][0] == "X" && jogoDaVelha[0][1] == "X" && jogoDaVelha[0][2] == "X" ||
                    jogoDaVelha[1][0] == "X" && jogoDaVelha[1][1] == "X" && jogoDaVelha[1][2] == "X" ||
                    jogoDaVelha[2][0] == "X" && jogoDaVelha[2][1] == "X" && jogoDaVelha[2][2] == "X" ||
                    jogoDaVelha[0][0] == "X" && jogoDaVelha[1][0] == "X" && jogoDaVelha[2][0] == "X" ||
                    jogoDaVelha[0][1] == "X" && jogoDaVelha[1][1] == "X" && jogoDaVelha[2][1] == "X" ||
                    jogoDaVelha[0][2] == "X" && jogoDaVelha[1][2] == "X" && jogoDaVelha[2][2] == "X" ||
                    jogoDaVelha[0][0] == "X" && jogoDaVelha[1][1] == "X" && jogoDaVelha[2][2] == "X" ||
                    jogoDaVelha[0][2] == "X" && jogoDaVelha[1][1] == "X" && jogoDaVelha[2][0] == "X") {

                System.out.println("*#*#*#*#*#*#*#*#*#* PLAYER 1 WINS *#*#*#*#*#*#*#*#*#*#*");
                terminou = true;
            }
            if (jogoDaVelha[0][0] == "O" && jogoDaVelha[0][1] == "O" && jogoDaVelha[0][2] == "O" ||
                    jogoDaVelha[1][0] == "O" && jogoDaVelha[1][1] == "O" && jogoDaVelha[1][2] == "O" ||
                    jogoDaVelha[2][0] == "O" && jogoDaVelha[2][1] == "O" && jogoDaVelha[2][2] == "O" ||
                    jogoDaVelha[0][0] == "O" && jogoDaVelha[1][0] == "O" && jogoDaVelha[2][0] == "O" ||
                    jogoDaVelha[0][1] == "O" && jogoDaVelha[1][1] == "O" && jogoDaVelha[2][1] == "O" ||
                    jogoDaVelha[0][2] == "O" && jogoDaVelha[1][2] == "O" && jogoDaVelha[2][2] == "O" ||
                    jogoDaVelha[0][0] == "O" && jogoDaVelha[1][1] == "O" && jogoDaVelha[2][2] == "O" ||
                    jogoDaVelha[0][2] == "O" && jogoDaVelha[1][1] == "O" && jogoDaVelha[2][0] == "O") {

                System.out.println("*#*#*#*#*#*#*#*#*#* PLAYER 2 WINS *#*#*#*#*#*#*#*#*#*#*");
                terminou = true;
            }
            contador++;
            System.out.println(contador);
            if (contador > 8) {
                System.out.println(" ################ Deu Velha ################");
                terminou = true;
            }

        }
        teclado.close();
    }

}
