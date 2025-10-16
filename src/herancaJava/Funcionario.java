package herancaJava;

public class Funcionario extends Pessoa {
    private double salario;

    public Funcionario(String nome, String cpf) {
        super(nome, cpf);
    }

    public void imprime(){
        super.imprime();
        System.out.println("Salário: " + this.salario);
    }

    public void relatorioPagamenento(){
        System.out.println("Eu " + this.nome + " recebi o salario de " + salario + " reais");
    }

    public double getSalario(){
        return this.salario;
    }

    public void setSalario(double salario){
     this.salario = salario;
    }
}
