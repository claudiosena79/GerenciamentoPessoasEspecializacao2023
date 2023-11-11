package br.org.Composicao;

/**
 * @author Claudio Sena
 * @version 1.0
 * @date 30/10/2023
 * @param - titulo, campo e descrição
 */

public class Profissao {
    /**
     * titulo: Representa o título do cargo (por exemplo, “Gerente de Vendas”,
     * “Desenvolvedor Java Sênior”)
     */
    private String titulo;
    /**
     * campo: Representa o campo ou indústria em que a profissão está (por exemplo,
     * “Tecnologia da Informação”, “Saúde”)
     */
    private String campo;
    /**
     * descricao: Uma breve descrição das responsabilidades e deveres do cargo.
     */
    private String descricao;

    public String getTitulo() {
        return titulo;
    }

    public String getCampo() {
        return campo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void cadastrar(String titulo, String campo, String descricao) {
        this.titulo = titulo;
        this.campo = campo;
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return "(" + titulo + ") " + "(" + campo + ") " + "(" + descricao + ")";
    }
}
