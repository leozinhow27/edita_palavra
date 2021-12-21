package lab5;

import java.util.ArrayList;
import java.util.HashMap;

public class TransfromaTexto {
    /**
     * mapa e lista responsáveis por guardar os nomes das transformações e seus histórico.
     */
    private HashMap<String, AlgoritmoTransformacao> transformacoes = new HashMap<>();
    private ArrayList<String> historico = new ArrayList<>();
    private int numtransformacoes = 0;

    /**
     * metodo que irá adicionar e guardar as transformações.
     * @param nome -> nome da transformação.
     * @param algoritmo -> objeto.
     */
    public void addtrasnform(String nome, AlgoritmoTransformacao algoritmo) {
        transformacoes.put(nome, algoritmo);
    }

    /**
     * metodo responsavel por manioular as trsnformaçoes e o historico.
     * @param nome -> nome da transformação.
     * @param textoOriginal -> oque será alterado pelas transformações.
     * @return -> retornara o texto alterado.
     */
    public String transforma(String nome, String textoOriginal) {
        AlgoritmoTransformacao trasformatexto = transformacoes.get(nome);

        String transformacao = trasformatexto.transforma(textoOriginal);
        String historico = textoOriginal + "->" + nome + "->" + transformacao;
        this.historico.add(historico);
        numtransformacoes += 1;
        return transformacao;


    }

    /**
     * metodo que irá listar as transformações.
     * @return -> retorna a lista de transformações que foram executadas.
     */
    public String listatransformacoes() {
        String lista = "";
        for (String nome : transformacoes.keySet()) {
            lista += nome + "\n";
        }
        return lista;


    }

    /**
     * metodo que apresenta o historico das transformações.
     * @param posicao -> posição da transformação em relação ao historico.
     * @return -> retorna o histórico das transformações.
     */
    public String historico(int posicao) {
        return historico.get(posicao);
    }

    /**
     * metodo que conta quantas transformações foram feitas.
     * @return -> retorna o número de transformações feitas.
     */
    public int contatransformacoes() {
        return numtransformacoes;
    }

}
