package abstratas.dominio;

public class Desenvolvedor extends Funcionario {

    public Desenvolvedor(String nome, String funcao, double salario) {
        super(nome, funcao, salario);
    }

    @Override
    public void calculaBonus(){
        this.salario = this.salario + this.salario * 0.05;
    }
}
