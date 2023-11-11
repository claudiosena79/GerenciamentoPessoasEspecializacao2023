package br.org.Pessoas;

import java.time.LocalDate;
import java.time.Period;

import br.org.Composicao.Endereco;
import br.org.Composicao.Telefone;

/**
 * @author Claudio Sena
 * @version 1.0
 * @date 14/10/2023
 * @param - nome, dataNascimento, endereco e telefoneContato
 */

public class Pessoa {
    private String nome;
    private LocalDate dataNascimento;
    private Endereco endereco;
    private Telefone telefoneContato;

    public Pessoa() {

    }

    public void cadastrar(String nome, LocalDate dataNascimento, Endereco endereco, Telefone telefoneContato) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.endereco = endereco;
        this.telefoneContato = telefoneContato;

    }

    public int obterIdade() {
        int idade = 0;
        LocalDate dataAtual = LocalDate.now();

        Period periodo = Period.between(dataNascimento, dataAtual);

        idade = periodo.getYears();

        return idade;

    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
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

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public Telefone getTelefoneContato() {
        return telefoneContato;
    }

}
