package cyclicSort;

import java.util.Arrays;

//https://leetcode.com/problems/missing-number/description/
public class missingNumber {
    public static void main(String[] args) {
      int [] arr={2,3,0,1};
        System.out.println(findMissingNum(arr));
        System.out.println(Arrays.toString(arr));
    }

    static int  findMissingNum(int[] arr) {
        int i=0;
        while (i< arr.length){
            int corrPosition=arr[i];
            //ignore nth element,add arr[i] < n condition
            if(arr[i]< arr.length && arr[i]!=arr[corrPosition]){
                swap(arr,i,corrPosition);
            }else{
                i++;
            }
        }
        //case1: if 0 to n-1 is missing
        for(int j=0;j< arr.length;j++){
            if(arr[j]!=j){
                return j;
            }
        }

        //case2: if 0 to n-1 element is present return n
        return arr.length;
    }
    static void swap(int[] arr, int i, int corrPosition) {
        int temp=arr[i];
        arr[i]=arr[corrPosition];
        arr[corrPosition]=temp;
    }
}
