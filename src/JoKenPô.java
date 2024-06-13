import java.util.Random;
import java.util.Scanner;

public class JoKenPô {
    public static void main(String[] args){
        /* 1 - Papel; 2 - Pedra; 3 - Tesoura.
         * J(1) M(2) = -1, vencedor JOGADOR
         * J(1) M(3) = -2, vencedor MAQUINA
         * J(2) M(1) = 1, vencedor MAQUINA
         * J(2) M(3) = -1, vencedor JOGADOR
         * J(3) M(1) = 2, vencedor JOGADOR
         * J(3) M(2) = 1, vencedor MAQUINA
         */
        Scanner teclado = new Scanner(System.in); // Leitor do teclado
        Random gerador = new Random(); // Gerador aleatório
        int jogador, maquina, pontosJogador = 0, pontosMaquina = 0; // variavéis

        //Laço de repetição para 5 partidas
        for(int i = 0; i < 5; i++){
            jogador = teclado.nextInt();
            maquina = gerador.nextInt(3) + 1; //Gera um numero entre 1 e 3 

            //Imprimir a escolha do Jogador
            switch(jogador){
                case 1:
                    System.out.println("Jogador escolheu PAPEL");
                    break;
                case 2:
                    System.out.println("Jogador escolheu PEDRA");
                    break;
                case 3:
                    System.out.println("Jogador escolheu TESOURA");
                    break;
                default:
                    System.out.println("Opção invalida");
                    break;
            }
            //Imprimir a escolha da maquina
            switch(maquina){
                case 1:
                    System.out.println("Maquina escolheu PAPEL");
                    break;
                case 2:
                    System.out.println("Maquina escolheu PEDRA");
                    break;
                case 3:
                    System.out.println("Maquina escolheu TESOURA");
                    break;
                }
            //Verificação do resultado
            if(jogador == maquina){
                System.out.println("EMPATE");
            }
            else if ((jogador - maquina) == -1 || (jogador - maquina) == 2) {
                System.out.println("JOGADOR VERCEDOR DA PARTIDA");
                pontosJogador++;
            }
            else {
                System.out.println("MAQUINA VENCEDORA DA PARTIDA");
                pontosMaquina++;
            }
        }
        System.out.println("");
        //Imprimir a pontuação e o placar do jogo de 5 partidas 
        if(pontosJogador > pontosMaquina){
            System.out.println("***JOGADOR VENCEDOR DO JOGO***");
        }
        else if (pontosJogador < pontosMaquina) {
            System.out.println("***MAQUINA VENCEDORA DO JOGO***");
        }
        else {
            System.out.println("***EMPATE ENTRE O JOGADOR E A MAQUINA***");
        }
        System.out.println("---Placar do Jogo---");
        System.out.println("Pontos do jogador foi: " + pontosJogador);
        System.out.println("Pontos da maquina foi: " + pontosMaquina);
    }
}


