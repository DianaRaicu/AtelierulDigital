package tema.proiect.chainOfResponsibility;

public class TopManagers extends Company{

    public TopManagers(int lvl){
        this.lvl = lvl;
    }
    @Override
    protected void write(String message) {
        System.out.println("Top Managers job: " + message);
    }
}
