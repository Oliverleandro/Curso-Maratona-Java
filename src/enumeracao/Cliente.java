package enumeracao;

public class Cliente {
    private String nome;
    private TipoCliente tipoCliente;
    private TipoPagamento tipoPagamento;

    public Cliente(String nome, TipoCliente tipoCliente) {
        this.nome = nome;
        this.tipoCliente = tipoCliente;
        this.tipoPagamento = tipoPagamento;
    }

    @Override
    public String toString() {
        return "Nome: " + this.nome + " Tipo Clienteint: " + tipoCliente.getVALOR() + " Tipo Cliente: " + tipoCliente.getRelatorioPessoal();
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome (String nome){
        this.nome = nome;
    }

    public TipoCliente getTipoCliente(){
        return this.tipoCliente;
    }

    public TipoPagamento getTipoPagamento(){
        return this.tipoPagamento;
    }

}
