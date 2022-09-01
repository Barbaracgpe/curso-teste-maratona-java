package academy.Polimorfismo.servico;

import academy.Polimorfismo.Computador;
import academy.Polimorfismo.Televisao;
import academy.Polimorfismo.Tomate;

public class ProdutoTeste01 {
    public static void main(String[] args) {
        Computador computador = new Computador("NUC10I7", 11000);
        Tomate tomate = new Tomate("Tomate Siciliano", 10);
        Televisao TV = new Televisao("Samsung 50", 5000);
        CalculadoraImposto.calcularImposto(computador);
        System.out.println("------------");
        CalculadoraImposto.calcularImposto(tomate);
        System.out.println("------------");
        CalculadoraImposto.calcularImposto(TV);
    }
}
