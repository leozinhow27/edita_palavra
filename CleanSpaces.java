package lab5;

import java.util.Objects;

/**
 * classe que remove o espaço entre as palavras.
 */
public class CleanSpaces implements AlgoritmoTransformacao {

    private String nome;

    public CleanSpaces(String nome) {
    this.nome = nome;

    }

    /**
     * metodo que removerá os espaços das frases.
     * @param textoOriginal -> oque será alterado.
     * @return -> retorna a frase alterada.
     */
    public String transforma(String textoOriginal) {
        return textoOriginal.replaceAll("\\s+", "");
    }
    public String getNome() {return this.nome;}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CleanSpaces that = (CleanSpaces) o;
        return Objects.equals(nome, that.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome);
    }
}

