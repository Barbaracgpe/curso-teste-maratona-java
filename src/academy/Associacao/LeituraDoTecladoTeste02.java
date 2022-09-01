package academy.Associacao;

import java.util.Scanner;

public class LeituraDoTecladoTeste02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("O grande Software de previsão do futuro");
        System.out.println("Digite sua pergunta que direi sim ou não");
        String pergunta = input.nextLine();
        if(pergunta.charAt(0) == ' '){
            System.out.println("sim");

        }else{
            System.out.println("nãoBáb");
        }
    }
}
