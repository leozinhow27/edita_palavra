package lab5;

import java.util.Objects;

/**
 * classe que remove os sinais das frases e a acentuação das palavras.
 */
public class Clean implements AlgoritmoTransformacao {
    private String nome;

    public Clean(String nome) {
        this.nome = nome;
    }

    /**
     * metodo responsavel por apagar os sinais da frase e a acentuação das palavras.
     * @param textoOriginal -> oque passará pela transformação.
     * @return -> retornará o texto alterado.
     */
    public String transforma(String textoOriginal) {
        return textoOriginal.replaceAll("\\p{Punct}", "");
    }
    public String getNome() {return this.nome;}


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Clean clean = (Clean) o;
        return Objects.equals(nome, clean.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome);
    }
}