package exercicioMaratonaJava01;

public class Main {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("Leandro", 20);
        Aluno aluno2 = new Aluno("Gabriel", 23);
        Aluno[] alunos = {aluno1, aluno2};

        Local local = new Local("Estacio madureira");

        Professor professor = new Professor("Sergio", "informática");

        Seminario seminario = new Seminario("Introdução a informatica",  alunos, local);
        Seminario seminario2 = new Seminario("Introdução a POO",  alunos, local);
        Seminario[] seminarios = {seminario, seminario2};

        aluno2.setSeminario(seminario);
        professor.setSeminarios(seminarios);
        professor.imprime();
        seminario.impirme();




    }
}
