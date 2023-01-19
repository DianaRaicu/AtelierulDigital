package tema.proiect.factory;

public class Sculpt implements Art{
    @Override
    public void instrument() {
        System.out.println("Sculpting requires a chisel.");
    }

    @Override
    public void type() {
        System.out.println("Sculpting is a plastic art.");
    }
}
