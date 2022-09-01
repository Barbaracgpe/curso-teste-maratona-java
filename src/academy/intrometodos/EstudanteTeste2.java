package academy.intrometodos;

public class EstudanteTeste2 {
    public static void main(String[] args) {
        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();
        ImpressoraEstudante impressora = new ImpressoraEstudante();

        estudante01.nome = "Jurema";
        estudante01.idade = 22;
        estudante01.sexo= 'F';

        estudante02.nome = "Valtinho";
        estudante02.idade = 29;
        estudante02.sexo= 'M';

        estudante01.imprime();
        estudante02.imprime();
    }
}
