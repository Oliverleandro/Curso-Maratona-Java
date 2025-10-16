package test;

import modificadorFinal.Carro;

public class CarroTest {
    public static void main(String[] args) {
        Carro carro = new Carro();

        carro.setNome("BMW");
        carro.COMPRADOR.setNome("Leandro");
        System.out.println(carro);

    }
}
