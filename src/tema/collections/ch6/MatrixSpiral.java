package tema.collections.ch6;

public class MatrixSpiral {
    public static void matrix(int n){
        int[][] A = new int[n][n];
        int left = 0;
        int top = n-1;
        int N = 1;

        for(int i=1; i<=n/2; i++,left++,top--){
            for(int j=left;j<=top;j++,N++){
                A[left][j]=N;
            }
            for(int j=left+1;j<=top;j++,N++){
                A[j][top]=N;
            }
            for(int j=top-1; j>=left; j--, N++){
                A[top][j]=N;
            }
            for(int j=top-1; j>=left+1; j--, N++){
                A[j][left]=N;
            }
        }

        for(int i=0;i<n;i++){
            for(int j=0; j<n; j++){
                if(A[i][j]==0){
                    A[i][j]=N;
                }
                System.out.print(A[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        matrix(4);
    }
}
