package br.org.contabancaria;

public class Usuario {
    public static void main(String[] args) {
        Conta contaOriginal = new Conta(01, 100000);
        ContaInvestimento contaInvestimento = new ContaInvestimento(2, 30000, 5, 6);
        ContaEspecial contaEspecial = new ContaEspecial(3, 10000, 8000);

        // System.out.println("Número de Conta Original: " + contaOriginal.numero);
        // System.out.println("Saldo de Conta Original: " + contaOriginal.saldo);

        contaOriginal.sacar(3000);
        contaOriginal.getSaldo();

    }

}
