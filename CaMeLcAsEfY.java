package lab5;

import java.util.Locale;
import java.util.Objects;

/**
 * classe que deixa as letras em indicies pares em maiusculas.
 */
public class CaMeLcAsEfY implements AlgoritmoTransformacao {
    private String nome;


    public CaMeLcAsEfY(String nome) {
        this.nome = nome;
    }

    /**
     * metodo que irá verificar a posição da letra, pois se estiver em um indicie par será alterada para maiuscula.
     * @param textoOriginal -> oque será alterado.
     * @return -> retornará o texto alterado.
     */
    public String transforma(String textoOriginal) {

        String palavra = "";

        for (int i = 0; i < textoOriginal.length(); i++) {
            char caractere = textoOriginal.charAt(i);
            String crctr = Character.toString(caractere);

            if (i % 2 == 0) {
                palavra += crctr.toUpperCase();


            } else {
                palavra += crctr.toLowerCase();
            }


        }
        return palavra;

    }
    public String getNome(){return this.nome;}


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CaMeLcAsEfY that = (CaMeLcAsEfY) o;
        return Objects.equals(nome, that.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome);
    }
}

