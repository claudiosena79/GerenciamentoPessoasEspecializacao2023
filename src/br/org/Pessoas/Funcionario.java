package br.org.Pessoas;

import java.time.LocalDate;
import br.org.Composicao.*;

/**
 * @author Claudio Sena
 * @version 1.0
 * @date 28/10/2023
 */

public class Funcionario extends Pessoa {
    private int matricula;
    private double salario;
    private String dataAdmissao;
    private Cargo cargo;

    public void promover(Cargo novoCargo) {
        this.cargo = novoCargo;
    }

    public void reajustarSalario(double percentual) {
        this.salario = this.salario * (1 + percentual / 100);
    }

    public int getMatricula() {
        return matricula;
    }

    public double getSalario() {
        return salario;
    }

    public String getdataAdmissao() {
        return dataAdmissao;
    }

    public Cargo getCargo() {
        return cargo;
    }

    // public void setSalario() {
    // this.salario = salario; método reajustar salário já faz isso
    // }

    public void setDataAdmissao(String dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
    }

    // public void setCargo() {
    // this.cargo = cargo; método promover já faz isso
    // }

    public Funcionario() {

    }

    public void cadastrar(int matricula, Double salario, String dataAdmissao, Cargo cargo,
            String nome, LocalDate dataNascimento, Endereco endereco, Telefone telefoneContato) {
        this.matricula = matricula;
        this.salario = salario;
        this.dataAdmissao = dataAdmissao;
        this.cargo = cargo;
        // setNome(nome);
        // setDataNascimento(dataNascimento);
        // setEndereco(endereco);
        // setTelefoneContato(telefoneContato);
        cadastrar(nome, dataNascimento, endereco, telefoneContato);

    }

}
