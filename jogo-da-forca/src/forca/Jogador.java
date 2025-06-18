package forca;
import java.util.HashSet;

public class Jogador {

    private String nome;
    private int tentativasRestantes;
    private HashSet<Character> letrasUsadas = new HashSet<>();

    public Jogador(String nome, int maxTentativas) {
        this.nome = nome;
        this.tentativasRestantes = maxTentativas;
    }

    public boolean letraJaUsada(char letra) {
        return letrasUsadas.contains(letra);
    }

    public void registrarLetra(char letra) {
        letrasUsadas.add(letra);
    }

    public void reduzirTentativas() {
        tentativasRestantes--;
    }

    public boolean temTentativas() {
        return tentativasRestantes > 0;
    }

    public int getTentativasRestantes() {
        return tentativasRestantes;
    }

}
