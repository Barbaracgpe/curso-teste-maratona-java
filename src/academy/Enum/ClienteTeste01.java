package academy.Enum;

public class ClienteTeste01 {
    public static void main(String[] args) {
        Cliente cliente1= new Cliente("Amaro", TipoCliente.PESSOA_FISICA, Cliente.TipoPagamento.DEBITO);
        Cliente cliente2= new Cliente("Gueco", TipoCliente.PESSOA_JURIDICA, Cliente.TipoPagamento.CREDITO);

        System.out.println(cliente1);
        System.out.println(cliente2);
        System.out.println(TipoPagamento.DEBITO.calcularDesconto (100));
        System.out.println(TipoPagamento.CREDITO.calcularDesconto (100));
        TipoCliente tipoCliente = TipoCliente.valueOf("PESSOA_FISICA");
        System.out.println(tipoCliente);
        TipoCliente tipoCliente2 = TipoCliente.tipoClientePorNomeRelatorio("Pessoa física");
        System.out.println(tipoCliente2);

    }
}
