package br.org.contabancaria;

public class ContaInvestimento extends Conta {
    private double taxa;
    private int prazo;

    public boolean sacar(double valor) {
        if (getSaldo() >= valor) {
            double novoSaldo = getSaldo() - valor;
            setSaldo(novoSaldo);
            return true;
        } else {
            return false;
        }
    }

    public boolean depositar(double valor) {
        double novoSaldo = getSaldo() + valor;
        setSaldo(novoSaldo);
        return true;
    }

    public void aplicarRendimento(double taxa) {
        double novoSaldo = getSaldo() * Math.pow((1 + taxa / 100), prazo);
        setSaldo(novoSaldo);

    }

    public ContaInvestimento(int numero, double saldo, double taxa, int prazo) {
        super(numero, saldo);
        this.taxa = taxa;
        this.prazo = prazo;

    }

    public void getTaxa() {
        this.taxa = taxa;

    }

    public double setTaxa() {
        return taxa;
    }

    public void getPrazo() {
        this.prazo = prazo;
    }

    public double setPrazo() {
        return prazo;
    }

}
