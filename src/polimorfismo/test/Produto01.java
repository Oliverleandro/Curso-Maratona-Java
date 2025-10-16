package polimorfismo.test;

import polimorfismo.dominio.Computador;
import polimorfismo.dominio.Televisao;
import polimorfismo.dominio.Tomate;
import polimorfismo.servico.CalculadoraImposto;

import static polimorfismo.servico.CalculadoraImposto.calcularImposto;

public class Produto01 {
    public static void main(String[] args) {
        Computador computador = new Computador("Decave ", 3500);
        calcularImposto(computador);

        System.out.println("---------------------------------------");
        Tomate tomate = new Tomate("siciliano", 10);
        calcularImposto(tomate);

        System.out.println("---------------------------------------");
        Televisao tv =  new Televisao("Samsung 50\" ", 5000);
        CalculadoraImposto.calcularImposto(tv);
    }
}
