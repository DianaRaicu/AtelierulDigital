package collections.challenge1;

import java.util.ArrayList;
import java.util.List;

public class Leaders {
    public void printLeaders(List<Integer> list){
        int ok=0;

        for(int i=0; i<list.size(); i++){
            for(int j=i+1; j<list.size(); j++){
                if(list.get(i)>list.get(j)){
                    ok=ok+1;
                }
            }
            if(ok==(list.size()-i-1)){
                System.out.println(list.get(i));
                System.out.println();
            }
            ok=0;
        }

    }

    public static void main(String[] args) {
       List<Integer> list = new ArrayList<Integer>(List.of(1,2,9,5,6,5,2));
       Leaders obj = new Leaders();
       obj.printLeaders(list);

    }
}
