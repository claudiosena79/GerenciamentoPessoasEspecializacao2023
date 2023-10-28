package br.org.contabancaria;

public class Conta {

    private int numero;
    private double saldo;

    public boolean sacar(double valor) {
        if (this.saldo >= valor) {
            this.saldo = this.saldo - valor;
            return true;
        } else {
            return false;
        }
    }

    public boolean depositar(double valor) {

        this.saldo = this.saldo + valor;
        return true;

    }

    public double getSaldo() {

        return saldo;

    }

    public Conta(int numero, double saldo) {

        this.numero = numero;
        this.saldo = saldo;

    }

    public int getNumero() {
        return numero;
    }

    public void setSaldo(double novoSaldo) {
        this.saldo = novoSaldo;
    }

    public void setNumero(int novoNumero) {
        this.numero = novoNumero;
    }

}
