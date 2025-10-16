package polimorfismo.test;

import polimorfismo.dominio.Computador;
import polimorfismo.dominio.Produto;
import polimorfismo.dominio.Tomate;
import polimorfismo.servico.CalculadoraImposto;

public class Produto03 {
    public static void main(String[] args) {
        Produto produto01 = new Computador("Ryzen i7", 10000);
        Tomate tomate = new Tomate("Americano", 20);
        tomate.setDataValidade("10/11/2025");


        CalculadoraImposto.calcularImposto(tomate);
        System.out.println("------------------------");
        CalculadoraImposto.calcularImposto(produto01);
    }
}
