package tema.basics.ch1;

public class FizzBuzz {
    public static void main(String[] args) {
        int nr;
        for (int i = 1; i <= 100; i++) {
            nr=0;


            if (i % 7 == 0) {
                System.out.println("Rizz ");
                nr++;
                continue;
            }

            if (i % 11 == 0) {
                System.out.println("Jazz ");
                nr++;
                continue;
            }


            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz ");
                nr++;
                continue;
            }

            if (i % 3 == 0) {
                System.out.println("Fizz ");
                nr++;
                continue;
            }

            if (i % 5 == 0) {
                System.out.println("Buzz ");
                nr++;
                continue;
            }



            if (nr==0){
                System.out.println(i);
                continue;
            }

        }
    }
}
