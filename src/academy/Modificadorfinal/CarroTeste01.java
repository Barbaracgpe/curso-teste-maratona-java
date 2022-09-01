package academy.Modificadorfinal;

public class CarroTeste01 {
    public static void main(String[] args) {
        Carro carro = new Carro();

        System.out.println(Carro.VELOCIDADE_LIMITE);
        System.out.println(Carro.COMPRADOR);
        carro.COMPRADOR.setNome("kuririn");
        System.out.println(carro.COMPRADOR);
    }
}
