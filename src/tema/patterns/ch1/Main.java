package tema.patterns.ch1;


public class Main {
    public static <ArrayCustomIterator> void main(String[] args) {
        int[] arr = new int[] {1,2,3};
        tema.patterns.ch1.ArrayCustomIterator  it = (tema.patterns.ch1.ArrayCustomIterator ) new tema.patterns.ch1.ArrayCustomIterator (arr);
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }
}
