package academy.intrometodos;

public class Funcionarios {
    private String nome;
    private int idade;
    private double[] salarios;
    private double media;

    public void imprime(){
        System.out.println(this.nome);
        System.out.println(this.idade);
        if(salarios == null){
            return;
        }
        for (double salarios: salarios){
            System.out.println(salarios +" ");
        }
        imprimeMediaSalarial();
    }

    public void imprimeMediaSalarial(){
        if(salarios == null){
            return;
        }
        double media = 0;
        for(double salarios: salarios){
            media += salarios;
        }
        media /= salarios.length;
        System.out.println("\n Média salarial "+media);
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setSalarios(double[] salarios) {
        this.salarios = salarios;
    }
    public double setMedia() {
        return media;
    }


    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public double[] getSalarios() {
        return salarios;
    }

    public double getMedia() {
        return media;
    }
}
