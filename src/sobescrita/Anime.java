package sobescrita;

public class Anime {
    private String nome;

    @Override
    public String toString() {
        return "Anime: " + this.nome;
    }

    public String getNome(){
        return this.nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

}
