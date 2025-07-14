package Desafio;

public class SinopseFilme {
    public static <Srting> void main(String[] args) {
    System.out.println("Rei Leão");

        int anodelancamento = 1998;
        System.out.println("ano de lançamento: " + anodelancamento);
        boolean incluindonoplano = true;
        double notadofilme = 6.4;

        double media = (5.6 + 5.7 + 7.9) / 3;
        System.out.println(media);

        // 11/07 - dentro das 3 aspas o texto sai na formatação na qual foi escrito.

        String sinopse;
        sinopse = """
                Este desenho animado da Disney mostra as aventuras de um leão jovem 
                de nome Simba, o herdeiro de seu pai, Mufasa. O tio malvado de Simba, 
                Scar, planeja roubar o trono de Mufasa atraindo pai e filho para uma emboscada. 
                Simba consegue escapar e somente Mufasa morre. Com a ajuda de seus amigos,Timon 
                e Pumba, ele reaparece como adulto para recuperar sua terra, que foi roubada por 
                seu tio Scar.
                """;

    }
}
