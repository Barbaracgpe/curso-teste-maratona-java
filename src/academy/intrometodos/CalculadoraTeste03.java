package academy.intrometodos;

public class CalculadoraTeste03 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        double result = calculadora.divideDoisNumeros(20,2);
        System.out.println(result);

    }

    public static class PessoaTeste01 {
        public static void main(String[] args) {
            CalculadoraTeste02.Pessoa pessoa = new CalculadoraTeste02.Pessoa();
    //        pessoa.nome = "Babi";
            pessoa.setNome("Babi");
            pessoa.setIdade(33);
    //        pessoa.imprime();
            System.out.println(pessoa.getNome());
            System.out.println(pessoa.getIdade());
        }
    }
}
