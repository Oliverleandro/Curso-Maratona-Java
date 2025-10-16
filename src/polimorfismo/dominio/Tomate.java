package polimorfismo.dominio;

public class Tomate extends Produto{
    public static final double IMPOSTO_POR_CENTO = 0.2;
    private String dataValidade;
    public Tomate(String nome, double valor) {
        super(nome, valor);
    }

        @Override
        public double calcularImposto() {
            return this.getValor() * IMPOSTO_POR_CENTO;
    }

    public String getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(String dataValidade) {
        this.dataValidade = dataValidade;
    }
}


