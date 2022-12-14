package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static List getList(){
        List list = new LinkedList();
        list.add("First");
        list.add("Second");
        list.add("Third");
        list.add("Empty");
        list.add("Something");
        System.out.println(list);
        return list;
    }

    public static void main(String[] args) {
        List a = getList();
        Iterator<String> it = a.iterator();
        String currentString = new String();
        while(it.hasNext()){
            if(currentString == "Third"){
                it.remove();
                a.remove(2);
            }
        }
        System.out.println(a);
    }
}
