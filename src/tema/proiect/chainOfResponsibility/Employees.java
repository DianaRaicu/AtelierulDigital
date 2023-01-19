package tema.proiect.chainOfResponsibility;

public class Employees extends Company{

    public Employees(int lvl){
        this.lvl=lvl;
    }

    @Override
    protected void write(String message) {
        System.out.println("Employees job: " + message);
    }
}
