package br.org.Pessoas;

import java.time.LocalDate;
import br.org.Composicao.Endereco;
import br.org.Composicao.Profissao;
import br.org.Composicao.Telefone;

/**
 * @author Claudio Sena
 * @version 1.0
 * @date 28/10/2023
 */

public class Cliente extends Pessoa {
    private String codigo;
    private Profissao profissao;

    public String getCodigo() {
        return codigo;
    }

    public Profissao getProfissao() {
        return profissao;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setProfissao(Profissao profissao) {
        this.profissao = profissao;
    }

    public Cliente() {

    }

    public void cadastrar(String codigo, Profissao profissao,
            String nome, LocalDate dataNascimento, Endereco endereco, Telefone telefoneContato) {
        this.codigo = codigo;
        this.profissao = profissao;
        // setNome(nome);
        // setDataNascimento(dataNascimento);
        // setEndereco(endereco);
        // setTelefoneContato(telefoneContato);
        cadastrar(nome, dataNascimento, endereco, telefoneContato);

    }

}
