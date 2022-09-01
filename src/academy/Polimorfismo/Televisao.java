package academy.Polimorfismo;

public class Televisao extends Produto {
    public static double IMPOSTO_POR_CENTO = 0.21;
    public Televisao (String nome, double valor){
        super(nome, valor);
    }

    @Override
    public double calcularImposto() {
        System.out.println("Calculando imposto da Televisão");
        return this.valor * IMPOSTO_POR_CENTO;
    }
}
