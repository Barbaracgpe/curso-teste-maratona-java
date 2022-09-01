package academy.devdojo.maratonajava.javacore.introducaoclasses;

public class CarroTeste01 {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        Carro carro2 = new Carro();

        carro1.nome = "Ogromovel";
        carro1.modelo = "Fiori";
        carro1.ano = 2021;

        carro2.nome = "Habber";
        carro2.modelo = "Fusca";
        carro2.ano = 1990;

        System.out.println("Carro 1");
        System.out.println(carro1.nome);
        System.out.println(carro1.modelo);
        System.out.println(carro1.ano);

        System.out.println("\n Carro 2");
        System.out.println(carro2.nome);
        System.out.println(carro2.modelo);
        System.out.println(carro2.ano);
    }
}
