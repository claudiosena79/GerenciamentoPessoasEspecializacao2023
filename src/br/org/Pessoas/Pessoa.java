package br.org.Pessoas;

import br.org.Composicao.Endereco;
import br.org.Composicao.Telefone;

public class Pessoa {
    private String nome;
    private String dataNascimento;
    private Endereco endereco;
    private Telefone telefoneContato;

    public Pessoa() {

    }

    public void cadastrar(String nome, String dataNascimento, Endereco endereco, Telefone telefoneContato) {
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

    public void setTelefoneContato(Telefone telefoneContato) {
        this.telefoneContato = telefoneContato;
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

    public Telefone getTelefoneContato() {
        return telefoneContato;
    }

}
