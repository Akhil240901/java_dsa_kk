package cyclicSort;

import java.util.Arrays;

public class implementation {
    public static void main(String[] args) {
        int [] arr={5,3,7,4,1,2,6};
        cyclicSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void cyclicSort(int[] arr) {
        int i=0;
        while (i< arr.length){
            int corrPosition=arr[i]-1;
            if(arr[i]!= i+1){
                swap(arr,i,corrPosition);
            }else{
                i++;
            }
        }
    }

    static void swap(int[] arr, int i, int corrPosition) {
        int temp=arr[i];
        arr[i]=arr[corrPosition];
        arr[corrPosition]=temp;
    }
}
