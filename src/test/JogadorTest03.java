package test;

import dominio.Jogador;
import dominio.Time;

public class JogadorTest03 {

    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Cafu");
        Jogador jogador2 = new Jogador("Pelé");
        Jogador[] jogadores = {jogador1, jogador2};
        Time time = new Time("Brasil");

        time.setJogadores(jogadores);

        jogador1.setTime(time);
        jogador2.setTime(time);

        System.out.println("--- Jogador ---");

        jogador1.imprime();
        jogador2.imprime();

        System.out.println("--- Time ---");

        time.imprime();


    }
}
