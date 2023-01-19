package tema.collections.ch4;

public class ZigZag {
    public static void zigzag(Integer[] l){
        int aux=0;

        for(int i=0;i<l.length-1;i++){
            if(i%2==0){
                if(l[i]>l[i+1]){
                    aux=l[i];
                    l[i]=l[i+1];
                    l[i+1]=aux;
                }
            }else{
                if(l[i]<l[i+1]){
                    aux=l[i];
                    l[i]=l[i+1];
                    l[i+1]=aux;
                }
            }
        }
        System.out.print("{ ");
       for(int i=0; i<l.length-1; i++){
           System.out.print(l[i] + ", ");
       }
        System.out.print(l[l.length-1] + " }");
        System.out.println();
    }

    public static void main(String[] args) {
        Integer[] l1={4, 3, 7, 8, 6, 2, 1};
        Integer[] l2={1, 4, 3, 2};

        zigzag(l1);
        zigzag(l2);
    }
}
