package tema.proiect.factory;

public class Sing implements Art{
    @Override
    public void instrument() {
        System.out.println("Music needs a sheet music.");
    }

    @Override
    public void type() {
        System.out.println("Music is a performing art.");
    }
}
