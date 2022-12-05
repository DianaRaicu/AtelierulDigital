package patterns.Iterator;

public class ArrayCustomIterator {
    private int[] arr;
    private int index=0;
public ArrayCustomIterator (int [] arr){
    this.arr=arr;
}

    public  boolean hasNext(){
      if (index >= arr.length)
    return false;
      return true;
    }

    public Integer next() {
        if (hasNext())
   return arr[index++];
       else
    return null;

    }
}
