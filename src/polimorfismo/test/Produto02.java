package polimorfismo.test;

import polimorfismo.dominio.Computador;
import polimorfismo.dominio.Produto;
import polimorfismo.dominio.Tomate;

public class Produto02 {
    public static void main(String[] args) {
        Produto produto01 = new Computador("Ryzen i7", 10000);
        System.out.println(produto01.getNome());
        System.out.println(produto01.getValor());
        System.out.println(produto01.calcularImposto());

        System.out.println("------------------------");
        Produto produto02= new Tomate("Tomate Americano", 20.50);
        System.out.println(produto02.getNome());
        System.out.println(produto02.getValor());
        System.out.println(produto02.calcularImposto());
    }
}
