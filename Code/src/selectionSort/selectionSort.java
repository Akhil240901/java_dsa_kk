package selectionSort;

import java.util.Arrays;

public class selectionSort {
    public static void main(String[] args) {
        int[] arr={4,-55,1,2,-33};
        System.out.println(Arrays.toString(selection(arr)));
        //System.out.println(Arrays.toString(arr));
    }

    static int [] selection(int[] arr) {
        //either run loop 0 to n-1 and swapped maxElement with last index,sec maxEle with secLast index ...so on or min element with 0th index and increasing pattern
        for (int i=0;i< arr.length;i++){
            //last index where max ele will be stored
            int last= arr.length-1-i;
            //will find out max element in curr iteration
            int maxIndex=getMaxElement(arr,0,last);

            swap(arr,maxIndex,last);
        }

        return arr;
    }

    static void swap(int[] arr, int last, int maxIndex) {
        int temp=arr[last];
         arr[last]=arr[maxIndex];
         arr[maxIndex]=temp;
    }

    static int getMaxElement(int[] arr, int start, int last) {
        int maxIndex=0;
        //System.out.println(Arrays.toString(arr));
        for(int i=start;i<=last;i++){
            if(arr[i]>arr[maxIndex]){
                maxIndex=i;
            }
        }
        return maxIndex;
    }
}
