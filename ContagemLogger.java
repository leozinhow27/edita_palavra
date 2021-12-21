package lab5;
import java.util.HashMap;

/**
 * logger que ficará responsável por contar quantas vezes cada metodo de alteração foi acionado.
 */
public class ContagemLogger implements Logger
{
    /**
     * mapa que guardará as o nemero de vezes que um metodo foi acionado.
     */
    private HashMap<String, Integer> mapinha;


    public ContagemLogger() {
        this.mapinha = new HashMap<>();
    }

    /**
     * metodo que irá adicior os metodos que foram acionados.
     * @param nomeMetodo -> nome do metodo que foi acionado.
     * @return -> retorna os metodos e as vezes que eles foram acionados.
     */
    public String exibeMetodo(String nomeMetodo, String parametro) {


        if (this.mapinha.containsKey(nomeMetodo)) {
            int soma = this.mapinha.get(nomeMetodo);
            this.mapinha.put(nomeMetodo, soma + 1);

        } else {
            this.mapinha.put(nomeMetodo, 1);
        }
        return "";
    }

    /**
     * metodo que irá pegar qunatas vezes os metodos foram acionados e guardará no mapa.
     * @return -> adiciona na lista "guarda".
     */
    @Override
    public String toString() {
        String guarda = "";
        for (String nomeMetodo : this.mapinha.keySet()) {
            int somar = this.mapinha.get(nomeMetodo);
            guarda += nomeMetodo + " - " + somar + "\n";
        }
        return guarda;
    }
}