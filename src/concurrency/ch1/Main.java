package concurrency.ch1;

public class Main {
    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            if (i % 2 ==0)
            {
                (new RabbitThred(i)).start();

            }
            else
            {
                (new Thread(new rabbitRunning(i))).start();
            }

        }
    }
}

