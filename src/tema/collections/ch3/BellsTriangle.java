package tema.collections.ch3;

public class BellsTriangle {
    public static void Bell(int n){
        int[][] bell = new int[n+1][n+1];
        bell[0][0]=1;
        System.out.println(bell[0][0]);
        for(int i=1;i<=n;i++){
            bell[i][0]=bell[i-1][i-1];
            System.out.print(bell[i][0] + " ");
            for(int j=1;j<=i;j++){
               bell[i][j]=bell[i-1][j-1] + bell[i][j-1];
                System.out.print(bell[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n=4;
        Bell(n);
    }
}
