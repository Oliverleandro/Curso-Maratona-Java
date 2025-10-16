package polimorfismo.servico;

import polimorfismo.dominio.Computador;
import polimorfismo.dominio.Produto;
import polimorfismo.dominio.Tomate;

public class CalculadoraImposto {
    public static void calcularImposto(Produto produto){
        System.out.println("Relátorio de imposto");
        double imposto = produto.calcularImposto();
        System.out.println("Produto: " + produto.getNome());
        System.out.println("Valor do produto: " + produto.getValor());
        System.out.println("Imposto a ser pago pelo produto: " + produto.calcularImposto());
        if (produto instanceof Tomate) {
            Tomate tomate = (Tomate) produto;
            System.out.println(tomate.getDataValidade());


//            pode ser feito de diversas maneiras como eu colocarei abaixo!
//            String dataValidade = (((Tomate) produto).getDataValidade());
//            System.out.println(dataValidade); <------ essa e a segunda forma de fazer o cast com instanceof.
//            System.out.println(((Tomate)produto).getDataValidade()); <---- terceira forma de fazer o cast com instanceof.

        }
    }
}
