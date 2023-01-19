package tema.proiect.chainOfResponsibility;

public abstract class Company {
    public static int TM =4;
    public static int MM =3;
    public static int FLM =2;
    public static int Emp =1;
    protected int lvl;

    protected Company nextInCommand;

    public void setNextInCommand(Company nextInCommand) {
        this.nextInCommand = nextInCommand;
    }

    public void Message(int lvl, String message){
        if(this.lvl <= lvl){
            write(message);
        }
        if(nextInCommand != null){
            nextInCommand.Message(lvl,message);
        }
    }
    abstract protected void write(String message);
}
