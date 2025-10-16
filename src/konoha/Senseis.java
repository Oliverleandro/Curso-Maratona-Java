package konoha;

import java.util.ArrayList;
import java.util.List;

public class Senseis {
    private String nome;
    private ArrayList<NinjaAluno> alunos;

    public Senseis(String nome, List<NinjaAluno> alunos){
        this.nome = nome;
        this.alunos = (ArrayList<NinjaAluno>) alunos;
    }

    @Override
    public String toString() {
        String resultado = " Sensei: " + this.nome ;

        if (alunos != null && !alunos.isEmpty()){
            resultado += " Genins: ";
            for (NinjaAluno aluno : alunos){
                resultado += " - " + aluno.getNome() ;
            }
        }else {
            resultado += "Não possui alunos ";
        }
        return resultado;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<NinjaAluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(ArrayList<NinjaAluno> alunos) {
        this.alunos = alunos;
    }
}
