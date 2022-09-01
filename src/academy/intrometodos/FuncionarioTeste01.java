package academy.intrometodos;

import academy.intrometodos.Funcionarios;

public class FuncionarioTeste01 {
    public static void main(String[] args) {
        Funcionarios funcionarios = new Funcionarios();
        funcionarios.setNome("danilo");
        funcionarios.setIdade(38);
        funcionarios.setSalarios(new double[] {1200, 988, 1800});
        System.out.println("Média " + funcionarios.getMedia());

    }
}
