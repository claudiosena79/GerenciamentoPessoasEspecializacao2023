package br.org.App;

import br.org.Pessoas.*;

import br.org.Composicao.*;

//import br.org.contabancaria.Conta;

public class UsuarioApp {
        public static void main(String[] args) {
                // Conta conta01 = new Conta(1, 10000);

                Pessoa pessoa1 = new Pessoa();

                Endereco enderecoPessoa1 = new Endereco();

                Telefone telefonePessoa1 = new Telefone();

                enderecoPessoa1.cadastrar("Avenida Mar Caspio", "37", "58102-162", "Cabedelo", "PB", "BR");

                telefonePessoa1.cadastrar("83", "999454249");

                pessoa1.cadastrar("Claudio", "29/12/1979", enderecoPessoa1, telefonePessoa1);

                Cliente cliente1 = new Cliente();

                Endereco enderecoCliente1 = new Endereco();

                Telefone telefoneCliente1 = new Telefone();

                enderecoCliente1.cadastrar("BR230", "Km 13", "58109-303", "Cabedelo", "PB", "BR");

                telefoneCliente1.cadastrar("83", "988789788");

                cliente1.cadastrar("011", "estudante", "Eduardo",
                                "01/01/2001", enderecoCliente1, telefoneCliente1);

                Funcionario funcionario1 = new Funcionario();

                Endereco enderecoFuncionario1 = new Endereco();

                Telefone telefoneFuncionario1 = new Telefone();

                enderecoFuncionario1.cadastrar("BR230", "Km 9", "58102-162", "Cabedelo", "PB", "BR");

                funcionario1.cadastrar(1, 9000.0, "01/01/2021", "Desenvolvedor", "Sena", "29/12/1979",
                                enderecoFuncionario1, telefoneFuncionario1);

                System.out.println("A pessoa de nome " + pessoa1.getNome() + " nascida em "
                                + pessoa1.getDataNascimento() + " tem endereco "
                                + pessoa1.getEndereco().toString() + " e telefone "
                                + pessoa1.getTelefoneContato().toString());

                System.out.println("O funcionário de nome " + funcionario1.getNome() + " tem salario "
                                + funcionario1.getSalario() + " e mora em "
                                + funcionario1.getEndereco().toString());

                System.out.println("O cliente de nome " + cliente1.getNome() + " tem endereco "
                                + cliente1.getEndereco().toString());

                System.out.println("");
        }

}
