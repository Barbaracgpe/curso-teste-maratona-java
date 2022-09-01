package academy.Interfaces;

public class DatabaseLoader implements DataLoader, DataRemover{

    @Override
    public void load() {
        System.out.println("Carregando dados do banco de dados");
    }

    @Override
    public void remove() {
        System.out.println("Removendo dados do banco de dados");
    }

    @Override
    public void checkPermission() {
        System.out.println("Checando permissão do nosso banco de dados");
    }
    public static void retrieveMAX_DATA_SIZE(){
        System.out.println("Dentro do retrieveMAX_DATA_SIZE na interface");
    }
}
