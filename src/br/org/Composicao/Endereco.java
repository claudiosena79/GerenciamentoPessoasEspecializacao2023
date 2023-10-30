package br.org.Composicao;

public class Endereco {

    private String rua;
    private String numero;
    private String cep;
    private String cidade;
    private String estado;
    private String pais;

    public String getRua() {
        return rua;
    }

    public String getNumero() {
        return numero;
    }

    public String getCep() {
        return cep;
    }

    public String getCidade() {
        return cidade;
    }

    public String getEstado() {
        return estado;
    }

    public String getPais() {
        return pais;
    }

    // subistituir setters por metetodo cadastrar
    // public void setRua(String rua) {
    // this.rua = rua;
    // }

    // public void setNumero(String numero) {
    // this.numero = numero;
    // }

    // public void setCep() {
    // this.cep = cep;
    // }

    // public void setCidade() {
    // this.cidade = cidade;
    // }

    // public void setEstado() {
    // this.estado = estado;
    // }

    // public void setPais() {
    // this.pais = pais;
    // }

    public void cadastrar(String rua, String numero, String cep, String cidade,
            String estado, String pais) {
        this.rua = rua;
        this.numero = numero;
        this.cep = cep;
        this.cidade = cidade;
        this.estado = estado;
        this.pais = pais;
    }

}
