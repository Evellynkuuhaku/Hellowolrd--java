package Desafio;

import java.util.Scanner;

public class outroLoop {
    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);

        double mediaAvaliacao = 0;
        double nota = 0;

        while (nota != -1) {
            System.out.println("Qual a avaliacao para o filme (ou -1 para encerrar)?");

            nota = leitura.nextDouble();
            mediaAvaliacao += nota;
        }

        System.out.println("Media de avaliação" + mediaAvaliacao / 3);
        
    }
}
