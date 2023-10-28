package br.org.Pessoas;

public class Cliente extends Pessoa {
    private String codigo;
    private String profissao;

    public String getCodigo() {
        return codigo;
    }

    public String getProfissao() {
        return profissao;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    public Cliente() {

    }

    public void cadastrar(String codigo, String profissao,
            String nome, String dataNascimento, String endereco, String telefoneContato) {
        this.codigo = codigo;
        this.profissao = profissao;
        setNome(nome);
        setDataNascimento(dataNascimento);
        setEndereco(endereco);
        setTelefoneContato(telefoneContato);

    }

}
