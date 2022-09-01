package academy.devdojo.maratonajava.javacore.introducaoclasses;

import javax.sound.midi.Soundbank;

public class EstudanteTeste01 {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();
        estudante.nome = "Barbara";
        estudante.idade = 30;
        estudante.sexo = 'F';

        System.out.println(estudante.nome);
        System.out.println(estudante.idade);
        System.out.println(estudante.sexo);
    }
}
