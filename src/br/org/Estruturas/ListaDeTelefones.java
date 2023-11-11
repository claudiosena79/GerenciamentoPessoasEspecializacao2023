package br.org.Estruturas;

import br.org.Composicao.Telefone;

// Lista de telefones não ordenados

public class ListaDeTelefones {
    private Telefone[] telefones;
    private int tamanho;
    private static final int CAPACIDADE_PADRAO = 10;

    public ListaDeTelefones() {
        this.telefones = new Telefone[CAPACIDADE_PADRAO];
        this.tamanho = 0;

    }

    public boolean isEmpty() {
        return this.tamanho == 0;
    }

    public void adicionarTelefone(Telefone telefone) {
        if (tamanho < telefones.length) {// length pega a capacidade atual
            telefones[tamanho] = telefone;
            tamanho = tamanho + 1;
        } else {
            System.out.println("Lista cheia");
        }

    }

    public void removerTelefone(Telefone telefone) {
        int index = buscarTelefoneIndex(telefone);
        if (index != -1) {
            for (int i = index; i < tamanho; i++) {
                telefones[i] = telefones[i + 1];
            }
            telefones[--tamanho] = null;
        }

    }

    private int buscarTelefoneIndex(Telefone telefone) {
        for (int i = 0; i < tamanho; i++) {
            if (telefones[i].equals(telefone)) {
                return i;
            }
        }
        return -1;
    }

    public boolean isFull() {
        return this.tamanho == telefones.length;
    }

    public void imprimirTelefones() {
        for (int i = 0; i < tamanho; i++) {
            System.out.println(telefones[i]);
        }

    }

}
