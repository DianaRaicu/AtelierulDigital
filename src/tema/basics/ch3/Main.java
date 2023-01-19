package tema.basics.ch3;

public class Main {
    static int nr=0;

    public static int[] removeDuplicates( int[] myArray){
        for (int i = 0; i < myArray.length; i++) {
            System.out.print(myArray[i] + " ");
        }
        int[] newArray = new int[myArray.length];
        int nr = 0;

        for (int i = 0; i < myArray.length; i++) {
            boolean added = false;
            for (int j = 0; j < newArray.length; j++) {
                if (myArray[i] == newArray[j]) {
                    added = true;
                }
            }
            if(added == false) {
                newArray[nr++] = myArray[i];
            }
        }
        return newArray;
    }
    public static void main(String[] args) {
        int[] myArray = new int[]{3, 2, -3, -2, 3, 0};
        for (int i = 0; i < myArray.length; i++) {
            System.out.print(myArray[i] + " ");
        }
        int[] newArray = new int[myArray.length];
        int nr = 0;

        for (int i = 0; i < myArray.length; i++) {
            boolean added = false;
            for (int j = 0; j < newArray.length; j++) {
                if (myArray[i] == newArray[j]) {
                    added = true;
                }
            }
            if(added == false) {
                newArray[nr++] = myArray[i];
            }
        }
        System.out.println("");
        for(int i=0;i<nr;i++) {
            System.out.print(newArray[i] + " ");
        }

        int contor = 0;
        Pair[] pairs = new Pair[nr];
        for(int i=0;i<nr;i++) {
            for(int j=i+1; j<nr; j++) {
                if( newArray[i] + newArray[j] == 0) {
                    pairs[contor++] = new Pair(newArray[i], newArray[j]);
                }
            }
        }
        System.out.println("Number of pairs " + contor);
    }
}
