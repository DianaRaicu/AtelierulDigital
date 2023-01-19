package tema.concurrency.ch1;

public class RabbitThread extends Thread{
    public int nr;

    public RabbitThread(int nr){
        this.nr=nr;
    }

    @Override
    public void run(){
        System.out.printf("Rabbit %s is running \n", nr);
    }
}
