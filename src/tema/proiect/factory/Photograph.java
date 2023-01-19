package tema.proiect.factory;

public class Photograph implements Art{
    @Override
    public void instrument() {
        System.out.println("Photography requires a camera.");
    }

    @Override
    public void type() {
        System.out.println("Photography is a graphic art.");
    }
}
