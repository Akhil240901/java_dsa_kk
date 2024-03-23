package bubbleSort;

import java.util.Arrays;

import static java.util.Arrays.sort;

public class bubbleSort {
    public static void main(String[] args) {
        int [] arr={2,4,3,6,1,8,5};
        System.out.println(Arrays.toString(sortFunc(arr)));
    }

     static int[] sortFunc(int[] arr) {
        //This loop will run n-1 times,finds out max element each time
        for(int i=0;i< arr.length-1;i++){
            //initialize isSwapped variable to check if whether swapping has done or if not means array is sorted
            boolean isSwapped=false;
            //inner loop will run n-i time,compare each element with previous one gets swapped if condition is true
            for (int j=1;j<arr.length-i;j++){
                if(arr[j-1]>arr[j]){
                    int temp=arr[j-1];
                        arr[j-1]=arr[j];
                        arr[j]=temp;
                    isSwapped=true;
                }
            }
            if (!isSwapped){
                break; //stops the outer loop
            }
        }
        return arr;
    }
}
