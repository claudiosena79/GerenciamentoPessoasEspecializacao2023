package br.org.App;

import br.org.Pessoas.*;

import java.time.LocalDate;

import br.org.Composicao.*;
import br.org.Estruturas.ListaDeTelefones;

//import br.org.contabancaria.*;

/**
 * @author Claudio Sena
 * @version 1.0
 * @date 28/10/2023
 */

public class UsuarioApp {
        public static void main(String[] args) {
                // Conta conta01 = new Conta(1, 10000);

                Pessoa pessoa1 = new Pessoa();

                Endereco enderecoPessoa1 = new Endereco();

                Telefone telefonePessoa1 = new Telefone("83", "988789788");

                LocalDate nasscimentoPessoa1 = LocalDate.of(2000, 12, 01);

                enderecoPessoa1.cadastrar("Avenida Mar Caspio", "37", "58102-162", "Cabedelo", "PB", "BR");

                pessoa1.cadastrar("Claudio", nasscimentoPessoa1, enderecoPessoa1, telefonePessoa1);

                Cliente cliente1 = new Cliente();

                Endereco enderecoCliente1 = new Endereco();

                Telefone telefoneCliente1 = new Telefone("83", "988789788");

                Profissao profissaoCliente1 = new Profissao();

                LocalDate nascimentoCliente1 = LocalDate.of(1979, 12, 29);

                enderecoCliente1.cadastrar("BR230", "Km 13", "58109-303", "Cabedelo", "PB", "BR");

                profissaoCliente1.cadastrar("Engenheiro", "TI", "Analista de Sistemas");

                cliente1.cadastrar("011", profissaoCliente1, "Eduardo",
                                nascimentoCliente1, enderecoCliente1, telefoneCliente1);

                Funcionario funcionario1 = new Funcionario();

                Endereco enderecoFuncionario1 = new Endereco();

                Telefone telefoneFuncionario1 = new Telefone("83", "988789788");

                ListaDeTelefones listaTelefoneFuncionario1 = new ListaDeTelefones();

                listaTelefoneFuncionario1.adicionarTelefone(telefoneFuncionario1);
                listaTelefoneFuncionario1.adicionarTelefone(telefoneCliente1);
                listaTelefoneFuncionario1.adicionarTelefone(telefonePessoa1);

                listaTelefoneFuncionario1.imprimirTelefones();

                Cargo cargoFuncionario1 = new Cargo();

                LocalDate nascimentoFuncionario1 = LocalDate.of(1983, 4, 23);
                LocalDate admissaoFuncionario1 = LocalDate.of(2013, 2, 1);

                enderecoFuncionario1.cadastrar("BR230", "Km 9", "58102-162", "Cabedelo", "PB", "BR");

                cargoFuncionario1.cadastrar("Vendedor", "Vendas", "Vendas e suporte aos clientes");

                funcionario1.cadastrar(1, 9000.0, admissaoFuncionario1, cargoFuncionario1, "Sena",
                                nascimentoFuncionario1,
                                enderecoFuncionario1, telefoneFuncionario1);

                System.out.println("A pessoa de nome " + pessoa1.getNome() + " nascida em "
                                + pessoa1.getDataNascimento() + " tem endereco "
                                + pessoa1.getEndereco().toString() + " e telefone "
                                + pessoa1.getTelefoneContato().toString() + " e " + pessoa1.obterIdade()
                                + " anos de vida.");

                System.out.println("O funcionário de nome " + funcionario1.getNome()
                                + " tem cargo " + funcionario1.getCargo().toString() + " salario "
                                + funcionario1.getSalario() + " e endereco "
                                + funcionario1.getEndereco().toString() + " e " + funcionario1.obterIdade()
                                + " anos de vida.");

                System.out.println("O cliente de nome " + cliente1.getNome()
                                + " tem profissao " + cliente1.getProfissao().toString()
                                + " e reside em " + cliente1.getEndereco().toString() + " e " + cliente1.obterIdade()
                                + " anos de vida.");

        }

}
