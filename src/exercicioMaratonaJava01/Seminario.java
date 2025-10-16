package exercicioMaratonaJava01;


public class Seminario {
    private String titulo;
    private Aluno[] alunos;
    private Local local;

    public Seminario(String titulo, Aluno[] alunos, Local local) {
        this.titulo = titulo;
        this.alunos = alunos;
        this.local = local;
    }

    public void impirme(){
        if (local != null){
            System.out.println("Local: " + local.getEndereco());
        }

        if (alunos != null){
            for (Aluno aluno : alunos){
                System.out.println("Aluno: " + aluno.getNome() + " idade " + aluno.getIdade() + " anos");
            }
        } else {
            System.out.println("Nenhum aluno inscrito!");
        }
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Aluno[] getAlunos() {
        return alunos;
    }

    public void setAlunos(Aluno[] alunos) {
        this.alunos = alunos;
    }

    public Local getLocal() {
        return local;
    }

    public void setLocal(Local local) {
        this.local = local;
    }
}
