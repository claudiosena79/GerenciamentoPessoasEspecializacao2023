package br.org.contabancaria;

public class ContaEspecial extends Conta {
    private double limite;

    public boolean sacar(double valor) {
        if (getSaldo() >= valor) {
            double novoSaldo = getSaldo() - (0.99 * valor);
            setSaldo(novoSaldo);
            return true;
        } else {
            return false;
        }

    }

    public ContaEspecial(int numero, double saldo, double limite) {
        super(numero, saldo);
        this.limite = limite;
    }

}
