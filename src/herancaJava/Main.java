package herancaJava;

public class Main {
    public static void main(String[] args) {

        Endereco endereco = new Endereco();
        Pessoa pessoa = new Pessoa("Leandro","18798847716" );

        endereco.setRua("Travessa muribeca");
        endereco.setCep("21540150");
        pessoa.setEndereco(endereco);

        pessoa.imprime();

        Funcionario funcionario = new Funcionario("Gabriel", "111.222.333.44");
        funcionario.setEndereco(endereco);
        funcionario.setSalario(20000);

        System.out.println("---------------------");
        funcionario.imprime();
        funcionario.relatorioPagamenento();
    }
}
