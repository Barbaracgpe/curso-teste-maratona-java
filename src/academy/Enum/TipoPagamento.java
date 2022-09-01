package academy.Enum;

public enum TipoPagamento {
    DEBITO{
        @Override
        public double calcularDesconto(double valor) {
            return valor * 0.1;
        }
    }, CREDITO;

    public double calcularDesconto(double valor){
        return valor * 0.05;
    }
}
