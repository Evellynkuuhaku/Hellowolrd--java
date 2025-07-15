package Desafio;

import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        double mediaAvaliacao = 0;
        double nota;

        for (int i = 0; i < 3; i ++) {
            System.out.println("Qual a avaliacao para o filme?");

            nota = leitura.nextDouble();
            mediaAvaliacao += nota;
        }

        System.out.println("Media de avaliação" + mediaAvaliacao/3);
    }
}
