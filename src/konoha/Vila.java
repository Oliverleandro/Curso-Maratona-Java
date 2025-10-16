package konoha;

import java.util.ArrayList;
import java.util.List;

public class Vila {
    public static void main(String[] args) {

        NinjaAluno ninjaAluno1 = new NinjaAluno("Naruto");
        NinjaAluno ninjaAluno2 = new NinjaAluno("Sakura");
        NinjaAluno ninjaAluno3 = new NinjaAluno("Saske");

        List<NinjaAluno> time7 = new ArrayList<>();
        time7.add(ninjaAluno1);
        time7.add(ninjaAluno2);
        time7.add(ninjaAluno3);

        Senseis senseis =new Senseis("Kakashi", time7);
        System.out.println(senseis);


    }
}
