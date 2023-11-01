package br.org.Composicao;

public class Cargo {

    /**
     * titulo: Representa o título do cargo (por exemplo, “Gerente de Vendas”,
     * “Desenvolvedor Java Sênior”)
     */
    private String titulo;
    /**
     * departamento: Representa o departamento ao qual o cargo pertence (por
     * exemplo, “Vendas”, “TI”).
     */
    private String departamento;
    /**
     * descricao: Uma breve descrição das responsabilidades e deveres do cargo.
     */
    private String descricao;

    public String getTitulo() {
        return titulo;
    }

    public String getDepartamento() {
        return departamento;
    }

    public String getDescricao() {
        return descricao;
    }

    public void cadastrar(String titulo, String departamento, String descricao) {
        this.titulo = titulo;
        this.departamento = departamento;
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return "(" + titulo + ") " + "(" + departamento + ") " + "(" + descricao + ")";
    }

}
