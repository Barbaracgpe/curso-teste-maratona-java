package academy.classesabstratas;

public class FuncionarioTeste01 {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("Home", 5000);
        Desenvolvedor desenvolvedor = new Desenvolvedor("Taboia", 12000);
        System.out.println(gerente);
        System.out.println(desenvolvedor);
        gerente.imprime();
        desenvolvedor.imprime();
    }
}
