package academy.intrometodos;

public class CalculadoraTeste02 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        calculadora.multiplicaDoisNumeros(10, 20);
    }

    public static class Pessoa {
        private String nome;
        private int idade;

        public void imprime(){
            System.out.println(this.nome);
            System.out.println(this.idade);
        }

        public void setNome(String nome){
            this.nome = nome;
        }
        public void setIdade(int idade){
            if(idade <0){
                System.out.println("Idade invalida");
                return;
            }
            this.idade = idade;
        }
        public String getNome(){
            return this.nome;
        }
        public int getIdade(){
            return this.idade;
        }
    }
}
