package interfaces.test;

import interfaces.dominio.DataBaseLoader;
import interfaces.dominio.FileLoader;

public class DataLoaderTest01 {
    public static void main(String[] args) {
        DataBaseLoader dataBaseLoader = new DataBaseLoader();
        FileLoader fileLoader = new FileLoader();

        dataBaseLoader.load();
        fileLoader.load();

        System.out.println("-----------------------------------------");
        dataBaseLoader.remove();
        fileLoader.remove();

        System.out.println("----------------------------------------");
        dataBaseLoader.checkPermission();
        fileLoader.checkPermission();
    }
}
