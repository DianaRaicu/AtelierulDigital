package tema.proiect.chainOfResponsibility;

public class FrontLineManagers extends Company{

    public FrontLineManagers(int lvl){
        this.lvl=lvl;
    }

    @Override
    protected void write(String message) {
        System.out.println("Front-Line Managers job: " + message);

    }
}
