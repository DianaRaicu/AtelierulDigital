package tema.proiect.factory;

public class Write implements Art{
    @Override
    public void instrument() {
        System.out.println("Writing requires a pen.");
    }

    @Override
    public void type() {
        System.out.println("Writing is a literary art.");
    }
}
