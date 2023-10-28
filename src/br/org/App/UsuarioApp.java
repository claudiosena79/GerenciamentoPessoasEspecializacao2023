package br.org.App;

import br.org.Pessoas.*;

//import br.org.contabancaria.Conta;

public class UsuarioApp {
    public static void main(String[] args) {
        // Conta conta01 = new Conta(1, 10000);

        Pessoa pessoa1 = new Pessoa();

        pessoa1.cadastrar("Claudio", "29/12/1979", "Uniesp", "83 999454249");

        Cliente cliente1 = new Cliente();

        cliente1.cadastrar("1", "estudante", "Eduardo", "01/01/2001", "Praia", "83 988780788");

        Funcionario funcionario1 = new Funcionario();

        funcionario1.cadastrar(1, 5000.0, "01/01/2021", "vendedor", "Almeida", "01/01/2002", "Loja", "83 988081937");
        ;

        System.out.println(
                "O funcionário de nome " + funcionario1.getNome() + " tem salario " + funcionario1.getSalario());

        System.out
                .println("O cliente de nome " + cliente1.getNome() + " tem como código " + cliente1.getCodigo());

    }

}
