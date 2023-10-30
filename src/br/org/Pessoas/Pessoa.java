package br.org.Pessoas;

import br.org.Composicao.Endereco;

public class Pessoa {
    private String nome;
    private String dataNascimento;
    private Endereco endereco;
    private String telefoneContato;

    public Pessoa() {

    }

    public void cadastrar(String nome, String dataNascimento, Endereco endereco, String telefoneContato) {
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

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
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

    public Endereco getEndereco() {
        return endereco;
    }

    public String getTelefoneContato() {
        return telefoneContato;
    }

}
