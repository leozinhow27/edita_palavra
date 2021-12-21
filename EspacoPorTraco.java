package lab5;
import java.util.Objects;

/**
 * classe que substitui o espaço pelo "-".
 */
public class EspacoPorTraco implements AlgoritmoTransformacao {

    private String nome;

    public EspacoPorTraco(String nome) {
        this.nome = nome;
    }

    /**
     * metodo responsável por trocar os espaços por "-".
     * @param textoOriginal ->  oque será alterao.
     * @return -> retornará o texto alterado.
     */
    public String transforma(String textoOriginal) {
        return textoOriginal.replace("", "-");
    }

    public String getNome() {
        return this.nome;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EspacoPorTraco that = (EspacoPorTraco) o;
        return Objects.equals(nome, that.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome);
    }
}

