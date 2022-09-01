package academy.Polimorfismo.servico;

import academy.Polimorfismo.Computador;
import academy.Polimorfismo.Produto;
import academy.Polimorfismo.Tomate;

public class CalculadoraImposto {

    public static void calcularImposto (Produto produto){
        System.out.println("Relatorio de imposto");
        double imposto = produto.calcularImposto();
        System.out.println("Produto: " + produto.getNome());
        System.out.println("Preço: " + produto.getValor());
        System.out.println("imposto a ser pago : " + imposto);
        if(produto instanceof Tomate) {
            Tomate tomate = (Tomate) produto;

            System.out.println(((Tomate) produto).getDataValidade());
        }

    }
}