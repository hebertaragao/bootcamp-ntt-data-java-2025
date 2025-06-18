package forca;

import java.util.HashSet;

public class PalavraSecreta {

    private String palavra;
    private HashSet<Character> letrasDescobertas = new HashSet<>();

    public PalavraSecreta(String palavra) {
        this.palavra = palavra.toUpperCase();
    }

    public boolean tentarLetra(char letra) {
        letra = Character.toUpperCase(letra);
        if (palavra.contains(String.valueOf(letra))) {
            letrasDescobertas.add(letra);
            return true;
        }
        return false;
    }

    public boolean estaCompleta() {
        for (char c : palavra.toCharArray()) {
            if (!letrasDescobertas.contains(c)) return false;
        }
        return true;
    }

    public String getPalavraParcial() {
        StringBuilder sb = new StringBuilder();
        for (char c : palavra.toCharArray()) {
            sb.append(letrasDescobertas.contains(c) ? c : "_").append(" ");
        }
        return sb.toString().trim();
    }

    public String getPalavraCompleta() {
        return palavra;
    }

}
