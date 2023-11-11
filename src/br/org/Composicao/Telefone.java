package br.org.Composicao;

/**
 * Classe Telefone - separa o atributo em 2 Strings (DDD + TELEFONE)
 */

public class Telefone {
    private String ddd;
    private String telefone;

    public Telefone(String ddd, String telefone) {
        this.ddd = ddd;
        this.telefone = telefone;
    }

    @Override
    public String toString() {
        return "(" + ddd + ")" + telefone;
    }

    public void setDdd(String ddd) {
        this.ddd = ddd;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getDdd() {
        return ddd;
    }

    public String getTelefone() {
        return telefone;
    }

}
