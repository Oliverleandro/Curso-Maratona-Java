package interfaces.dominio;

public class FileLoader implements DataLoader, DataRemove{
    @Override
    public void load() {
        System.out.println("Carregando dados do Arquivos...");
    }

    @Override
    public void remove() {
        System.out.println("Removendo dados do Arquivo....");
    }

    @Override
    public void checkPermission() {
        System.out.println("Checando permissões nos Arquivos...");
    }
}
