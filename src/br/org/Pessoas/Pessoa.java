package br.org.Pessoas;

public class Pessoa {
    private String nome;
    private String dataNascimento;
    private String endereco;
    private String telefoneContato;

    public Pessoa() {

    }

    public void cadastrar(String nome, String dataNascimento, String endereco, String telefoneContato) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.endereco = endereco;
        this.telefoneContato = telefoneContato;

    }

    public int obterIdade() {
        int idade = 0;
        // lógica para calculo de idade
        return idade;

    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public void setEndereco(String novoEndereco) {
        this.endereco = novoEndereco;
    }

    public void setTelefoneContato(String novoTelefoneContato) {
        this.telefoneContato = novoTelefoneContato;
    }

    public String getNome() {
        return nome;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getTelefoneContato() {
        return telefoneContato;
    }

}
