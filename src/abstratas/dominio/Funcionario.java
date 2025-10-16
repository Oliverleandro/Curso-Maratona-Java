package abstratas.dominio;

public abstract class Funcionario {
    protected String nome;
    protected String funcao;
    protected double salario;

    public Funcionario(String nome, String funcao, double salario){
        this.nome = nome;
        this.funcao = funcao;
        this.salario = salario;
        calculaBonus();
    }

    @Override
    public String toString(){
        return "Nome: " + this.nome + " Função: " + this.funcao + " Salário: " + this.salario;
    }

    public abstract void calculaBonus();
}
