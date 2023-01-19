package concurrency.ch1;

public class RabbitThred extends Thread {
    public int nr;

    public RabbitThred(int nr) {
        this.nr = nr;
    }

    @Override
    public void run() {
        System.out.printf("Rabbit %s is running \n", nr);
    }
}
