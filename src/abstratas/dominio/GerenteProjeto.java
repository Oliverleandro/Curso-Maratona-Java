package abstratas.dominio;

public class GerenteProjeto extends Funcionario {
    public GerenteProjeto(String nome, String funcao, double salario) {
        super(nome, funcao, salario);
    }

    @Override
    public void calculaBonus(){
        this.salario = this.salario + this.salario * 0.1;
    }
}
