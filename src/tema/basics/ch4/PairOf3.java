package tema.basics.ch4;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class PairOf3 {
    public static int[] delete(int[] myArray, int index){
        if (myArray == null || index < 0 || index >= myArray.length){
            System.out.println("non-existing index");
            return myArray;
        }
        List<Integer> arrayList = IntStream.of(myArray) .boxed().collect(Collectors.toList());

        arrayList.remove(index);
        return arrayList.stream().mapToInt(Integer::intValue).toArray();
    }

    public static void main(String[] args) {
        int[] myArray = new int[]{-1, -1, -1, 2};
        int nr=0;

        for (int i = 0; i < myArray.length; i++) {
            System.out.print(myArray[i] + " ");
        }

        for(int i = 0; i < myArray.length; i++)
            for(int j = i + 1; j < myArray.length; j++)
                for(int k = j + 1; k < myArray.length; k++)
                {
                    if(myArray[i] + myArray[j] + myArray[k] == 0){
                        nr++;

                        myArray = delete(myArray,i);
                        myArray = delete(myArray,j-1);
                        myArray = delete(myArray,k-2);

                    }
                }


        System.out.println();
        System.out.println(nr);

    }

}
