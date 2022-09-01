package academy.devdojo.maratonajava.javacore.introducaoclasses;

public class ProfessorTeste01 {
    public static void main(String[] args) {
        Professor professor = new Professor();
        professor.nome = "Mestre";
        professor.idade = 60;
        professor.sexo ='M';

        System.out.println("Nome:"+professor.nome + ", Idade: "+professor.idade + ", Sexo:"+professor.sexo);

    }
}
