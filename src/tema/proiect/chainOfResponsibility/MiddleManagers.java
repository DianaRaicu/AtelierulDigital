package tema.proiect.chainOfResponsibility;

public class MiddleManagers extends Company{

    public MiddleManagers(int lvl){
        this.lvl=lvl;
    }

    @Override
    protected void write(String message) {
        System.out.println("Middle Managers job: " + message);
    }
}
