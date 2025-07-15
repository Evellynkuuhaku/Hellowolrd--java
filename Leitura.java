package Desafio;

import java.util.Scanner;

public class Leitura {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.print("Digite seu filme favorrito:");
        String filme = leitura.nextLine();

        System.out.println("Qual o ano de lançamento?");
        int AnodeLançamento = leitura.nextInt();

        System.out.println("Qual a avaliacao para o filme?");
        double avaliacao = leitura.nextDouble();

        System.out.println("Então seu filme favorito é " + filme + ", seu ano de lançamento é " + AnodeLançamento + " e foi avaliado em " + avaliacao);

    }
}

