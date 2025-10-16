package modificadorFinal;

public class Carro {
    private String nome;
    public static final  double VELOCIDADE_MAXIMA = 250;
    public  final Comprador COMPRADOR = new Comprador();

    @Override
    public String toString(){
        return "Carro: " + this.nome + "  Veloociade máxima: " + VELOCIDADE_MAXIMA + " Comprador: " + this.COMPRADOR.getNome();
    }
    public String getNome(){
        return this.nome;
    }

    public void setNome(String nome){
        this.nome =  nome;
    }
}
