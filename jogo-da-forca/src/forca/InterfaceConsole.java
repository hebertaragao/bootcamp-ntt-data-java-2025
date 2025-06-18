package forca;

import java.util.Scanner;

import forca.Jogador.Jogador;

public class InterfaceConsole {

    private final Scanner scanner = new Scanner(System.in);
    private final int maxTentativas = 6;

    public void iniciarJogo() {
        System.out.println("=== JOGO DA FORCA ===");
        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();

        PalavraSecreta palavra = new PalavraSecreta("EXEMPLO");
        Jogador jogador = new Jogador(nome, maxTentativas);

        while (!palavra.estaCompleta() && jogador.temTentativas()) {
            System.out.println("\nPalavra: " + palavra.getPalavraParcial());
            System.out.println("Tentativas restantes: " + jogador.getTentativasRestantes());
            System.out.print("Digite uma letra: ");
            char letra = scanner.nextLine().charAt(0);

            if (jogador.letraJaUsada(letra)) {
                System.out.println("Você já tentou essa letra!");
                continue;
            }

            jogador.registrarLetra(letra);

            if (!palavra.tentarLetra(letra)) {
                jogador.reduzirTentativas();
                System.out.println("Letra incorreta!");
            } else {
                System.out.println("Boa! Letra correta.");
            }
        }

        if (palavra.estaCompleta()) {
            System.out.println("\nParabéns! Você venceu!");
        } else {
            System.out.println("\nFim de jogo! A palavra era: " + palavra.getPalavraCompleta());
        }
    }

}
