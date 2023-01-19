package tema.patterns.ch2;

public class BubbleSort  implements SortingStrategy {

    @Override
    public void sort(Integer[] list) {
        int aux = 0;

        for(int i=0; i<list.length; i++){
            for(int j=1; j<(list.length-i); j++){

                if(list[j-1]>list[j]){
                    aux = list[j-1];
                    list[j-1] = list[j];
                    list[j] = aux;
                }
            }
        }

    }



}
