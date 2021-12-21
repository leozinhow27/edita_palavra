package lab5;

/**
 * logger que imprime qual transformação foi acionada.
 */
public class ConsoleLogger implements Logger{
    /**
     * exibe o metodo (transformação) acionado.
     * @param nomeMetodo -> metodo (transformação) que foi cionado.
     * @return -> retornará o metodo que foi acionado.
     */
    public String exibeMetodo(String nomeMetodo, String parametro){
     return " ["+ nomeMetodo +"] " + parametro;
    }
}

