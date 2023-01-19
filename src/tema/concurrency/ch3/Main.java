package tema.concurrency.ch3;

public class Main {
    public static void main(String[] args) {
        Player player1 = new Player();
        Player player2 = new Player();

        player1.setName("Player 1");
        player2.setName("Player 2");

        player1.start();
        player2.start();

        try{
            player1.join();
            player2.join();
        }catch(InterruptedException e){
            e.printStackTrace();
        }

        String p1move = player1.getMove();
        String p2move = player2.getMove();


        if(p1move.equals(p2move)){
            System.out.println("It's a tie!");
        }else if(p1move.equals("rock")&&p2move.equals("scissors")  || p1move.equals("paper")&&p2move.equals("rock")
                || p1move.equals("scissors")&&p2move.equals("paper") ){
            System.out.println("Player 1 wins!");
        }else{
            System.out.println("Player 2 wins!");
        }
    }
}
