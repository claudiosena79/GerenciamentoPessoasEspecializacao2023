package br.org.App;

import br.org.Pessoas.*;

import br.org.Composicao.*;

//import br.org.contabancaria.Conta;

public class UsuarioApp {
        public static void main(String[] args) {
                // Conta conta01 = new Conta(1, 10000);

                Pessoa pessoa1 = new Pessoa();

                Endereco enderecoPessoa1 = new Endereco();

                enderecoPessoa1.cadastrar("Avenida Mar Caspio", "37", "58102-162", "Cabedelo", "PB", "BR");

                pessoa1.cadastrar("Claudio", "29/12/1979", enderecoPessoa1, "83 988780788");

                Cliente cliente1 = new Cliente();

                Endereco enderecoCliente1 = new Endereco();

                enderecoCliente1.cadastrar("BR230", "Km 13", "58109-303", "Cabedelo", "PB", "BR");

                cliente1.cadastrar("011", "estudante", "Eduardo",
                                "01/01/2001", enderecoCliente1, "83 988780788");

                Funcionario funcionario1 = new Funcionario();

                Endereco enderecoFuncionario1 = new Endereco();

                enderecoFuncionario1.cadastrar("BR230", "Km 9", "58102-162", "Cabedelo", "PB", "BR");

                funcionario1.cadastrar(1, 9000.0, "01/01/2021", "Desenvolvedor", "Sena", "29/12/1979",
                                enderecoFuncionario1, "83 999454249");

                System.out.println(
                                "O funcionário de nome " + funcionario1.getNome() + " tem salario "
                                                + funcionario1.getSalario() + " e mora em "
                                                + funcionario1.getEndereco());

                System.out
                                .println("O cliente de nome " + cliente1.getNome() + " tem endereco "
                                                + cliente1.getEndereco());

                System.out.println("");
        }

}
