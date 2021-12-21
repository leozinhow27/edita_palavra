package lab5;
import java.util.Objects;

/**
 * classe que troca o ponto "." por uma interrogação.
 */
public class InterrogaPraPontos implements AlgoritmoTransformacao {

    private String nome;

    public InterrogaPraPontos(String nome) {
        this.nome = nome;
    }

    /**
     * metodo responsável por trocar o ponto "." por uma interrogação.
     * @param textoOriginal -> oque será alterado.
     * @return -> retornará o texto alterado.
     */
    public String transforma(String textoOriginal) {
        return textoOriginal.replace("?", ".");
    }

    public String getNome() {
        return this.nome;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        InterrogaPraPontos that = (InterrogaPraPontos) o;
        return Objects.equals(nome, that.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome);
    }
}




