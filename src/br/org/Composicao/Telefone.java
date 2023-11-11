package br.org.Composicao;

/**
 * Classe Telefone - separa o atributo em 2 Strings (DDD + TELEFONE)
 */

public class Telefone {
    private String ddd;
    private String telefone;

    // Subistituir os setters por um método cadastrar
    // public void setDdd() {
    // this.ddd = ddd;
    // }

    // public void setTelefone() {
    // this.telefone = telefone;

    public String getDdd() {
        return ddd;
    }

    public String getTelefone() {
        return telefone;
    }

    public void cadastrar(String ddd, String telefone) {
        this.ddd = ddd;
        this.telefone = telefone;

    }

    @Override
    public String toString() {
        return "(" + ddd + ")" + telefone;
    }
}
