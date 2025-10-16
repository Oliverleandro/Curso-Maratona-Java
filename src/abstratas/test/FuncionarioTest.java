package abstratas.test;

import abstratas.dominio.Desenvolvedor;
import abstratas.dominio.GerenteProjeto;

public class FuncionarioTest {
    public static void main(String[] args) {
        GerenteProjeto gerenteProjeto = new GerenteProjeto("Gabriel", "Gerente de Projetos IA e Automação", 12000);
        Desenvolvedor desenvolvedor = new Desenvolvedor("Leandro", "Desenvolvedor Backend", 7000);

        System.out.println(gerenteProjeto);
        System.out.println(desenvolvedor);
    }
}
