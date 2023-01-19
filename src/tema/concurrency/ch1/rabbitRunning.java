package tema.concurrency.ch1;

public class rabbitRunning implements Runnable{
    private int nr;

    public rabbitRunning(int nr) {
        this.nr = nr;
    }

    @Override
    public void run() {
        System.out.printf("Rabbit %s is running \n", nr);
    }
}
