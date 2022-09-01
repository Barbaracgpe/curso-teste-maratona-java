package academy.Heranca;

import academy.intrometodos.Funcionarios;

public class HerancaTeste01 {
    public static void main(String[] args) {
        Endereco endereco = new Endereco();
        endereco.setRua("Rua 3");
        endereco.setCep("54410420");
        Pessoa pessoa = new Pessoa("Laura");
        pessoa.setCpf("11515161");
        pessoa.setEndereco(endereco);
        pessoa.imprime();

        System.out.println("-----------");

        Funcionario funcionario = new Funcionario("Sr. Lunga");
        funcionario.setCpf("2222222");
        funcionario.setEndereco(endereco);
        funcionario.setSalario(20000.0);


        funcionario.imprime();
    }
}
