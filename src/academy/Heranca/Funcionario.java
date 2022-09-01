package academy.Heranca;

public class Funcionario extends Pessoa {
    private Double salario;
    static {
        System.out.println("Dentro do bloco inicialização estático de funcionário");
    }
    {
        System.out.println("Dentro do bloco inicialização de funcionário 1");
    }
    {
        System.out.println("Dentro do bloco inicialização de funcionário 2");
    }


    public Funcionario(String nome){
        super(nome);
        System.out.println("Dentro do construtor funcionário");

    }


    public void imprime(){
        super.imprime();
        System.out.println(this.salario);
    }

    public  void relatorioPagamento(){
        System.out.println("Eu "+this.nome+" Recebi o salario de: "+this.salario);
    }


    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }
}
