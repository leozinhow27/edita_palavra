package lab5;

import java.util.Objects;

public class UpperCase implements AlgoritmoTransformacao {

    private String nome;


    public UpperCase(String nome) {
        this.nome = nome;
    }

    public String transforma(String textoOriginal) {
        return textoOriginal.toUpperCase();
    }

    public String getNome() {
        return this.nome;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UpperCase upperCase = (UpperCase) o;
        return Objects.equals(nome, upperCase.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome);
    }
}
