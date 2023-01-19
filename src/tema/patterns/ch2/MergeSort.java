package tema.patterns.ch2;

public class MergeSort  implements SortingStrategy {

    void merge( Integer arr[], Integer[] l, Integer[] r, int left, int right){
        int i=0, j=0, k=0;

        while(i<left &&j<right){
            if(l[i] <= r[j]){
                arr[k++] = l[i++];
            }else{
                arr[k++] = r[j++];
            }
        }
        while(i<left){
            arr[k++] = l[i++];
        }
        while(j<right){
            arr[k++] = r[j++];
        }

    }



    @Override
    public void sort(Integer[] list) {
        int n;
        n=list.length;

        if(n<2){
            return;
        }

        int mid = n/2;
        Integer[] l = new Integer[mid];
        Integer[] r = new Integer[n-mid];

        for(int i = 0; i<mid; i++){
            l[i]=list[i];
        }
        for(int i = mid; i<n; i++){
            r[i-mid]=list[i];
        }

        sort(l);
        sort(r);

        merge(list, l, r, mid, n-mid);

    }




}
