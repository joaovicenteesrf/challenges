package Challenges;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class GameLastNumber {

    public void game() {
        boolean turnPlayer1 = true;
        boolean fimDeJogo = false;

        Scanner sc = new Scanner(System.in);

        int numeroTorres = 2;
        int tamanhoOriginal = 6;
        int alturaTorres = tamanhoOriginal;

        Map<Integer, Integer> torres = new HashMap<Integer, Integer>();

        torres.put(1,6);
        torres.put(2,6);

        while (fimDeJogo == false) {

            if (turnPlayer1 == true) {
                System.out.println("Está na vez do primeiro jogador!");
                turnPlayer1 = false;
            } else {
                System.out.println("Está na vez do segundo jogador!");
                turnPlayer1 = true;
            }

            System.out.println("Qual torre você gostaria de modificar?");
            int torreEscolhida = sc.nextInt();
            alturaTorres = torres.get(torreEscolhida);

            System.out.println("Quantas peças você gostaria de tirar?");
            int jogada = sc.nextInt();

            boolean jogadaValida = false;

            while (jogadaValida == false) {

                try {
                    if (tamanhoOriginal % (torres.get(torreEscolhida) - jogada) == 0 && torres.get(torreEscolhida) != null) {
                        System.out.println("É possível remover! Retirando " + jogada + " peças.");
                        torres.put(torreEscolhida, alturaTorres -= jogada);

                        if (alturaTorres >= 0) {
                            jogadaValida = true;

                        } else {
                            System.out.println("Não é possível retirar mais dessa torre. Você perdeu!");
                            alturaTorres += jogada;
                            fimDeJogo = true;
                        }
                    } else {
                        System.out.println("Jogada inválida, tente novamente!");
                    }
                } catch (ArithmeticException exception) {
                    System.out.println("Não é possível retirar o total de peças disponíveis. Você perdeu!!");
                    fimDeJogo = true;
                    break;
                }

            }
        }
    }

}
