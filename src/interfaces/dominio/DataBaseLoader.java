package interfaces.dominio;

public class DataBaseLoader implements  DataLoader, DataRemove{
    @Override
    public void load() {
        System.out.println("Carregando dados do Banco de Dados.....");
    }

    @Override
    public void remove() {
        System.out.println("Removendo dados do Banco de Dados....");
    }

    @Override
    public void checkPermission() {
        System.out.println("Checando permissões no Banco de Dados....");
    }
}
