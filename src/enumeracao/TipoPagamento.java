package enumeracao;

public enum TipoPagamento {
    DEBITO {
        @Override
        public double calcularEmCimaValor(double valor) {
            return valor * 0.1;
        }
    }, CREDITO{
        @Override
        public double calcularEmCimaValor(double valor) {
            return valor * 0.05;
        }
    };

    public abstract double calcularEmCimaValor(double valor);
}

