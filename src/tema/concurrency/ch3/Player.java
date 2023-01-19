package tema.concurrency.ch3;

public class Player extends Thread{
    private String[] list= {"rock","paper","scissors"};
    private String option;

    @Override
    public void run(){
        int choice = (int)(Math.random()*3);
        this.option = list[choice];
        System.out.println(this.getName() + " chooses " + this.option);
    }
    public String getMove(){
        return this.option;
    }

}
