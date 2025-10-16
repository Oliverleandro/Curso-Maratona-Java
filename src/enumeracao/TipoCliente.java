package enumeracao;

public enum TipoCliente {
    PESSOA_FISICA(1, "Pessoa Física"),
    PESSOA_JURIDICA(2, "Pessoa Jurídica");

    private final int VALOR;
    private final String relatorioPessoal;
    TipoCliente(int valor, String relatorioPessoal){
        this.VALOR = valor;
        this.relatorioPessoal = relatorioPessoal;

    }

    public static  TipoCliente tipoClientePorNomeRelatorio(String nomeRelatorio){
        for(TipoCliente tipoCliente : values()){
            if (tipoCliente.getRelatorioPessoal().equals(nomeRelatorio)){
                return tipoCliente;
            }
        }
        return null;
    }

    public int getVALOR(){
        return this.VALOR;
    }

    public String getRelatorioPessoal(){
        return this.relatorioPessoal;
    }
}
