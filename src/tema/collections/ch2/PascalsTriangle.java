package tema.collections.ch2;

public class PascalsTriangle {
    public static void Pascal(int n){
        int var;
        for(int i=1; i<=n; i++){
            for(int j=0; j<=n-i;j++) {
                System.out.print(" ");
            }
            var=1;
            for(int k=1; k<=i; k++){
                System.out.print(var + " ");
                var=var*(i-k)/k;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n=5;
        Pascal(n);
    }
}
