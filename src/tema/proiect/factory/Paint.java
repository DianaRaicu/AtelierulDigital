package tema.proiect.factory;

public class Paint implements Art{
    @Override
    public void instrument() {
        System.out.println("Painting requires a brush.");
    }

    @Override
    public void type() {
        System.out.println("Painting is a graphic art.");
    }
}
