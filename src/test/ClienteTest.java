package test;

import enumeracao.Cliente;
import enumeracao.TipoCliente;
import enumeracao.TipoPagamento;

public class ClienteTest {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Akim" , TipoCliente.PESSOA_JURIDICA);
        Cliente cliente2 = new Cliente("Atisubaba", TipoCliente.PESSOA_FISICA);


        System.out.println(cliente1);
        System.out.println(cliente2);
        System.out.println(TipoPagamento.DEBITO.calcularEmCimaValor(100));
        TipoCliente tipoCliente = TipoCliente.tipoClientePorNomeRelatorio("Pessoa Física");
        System.out.println(tipoCliente);
    }
}
