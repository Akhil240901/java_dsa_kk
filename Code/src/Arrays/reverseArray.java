package Arrays;

import java.util.Arrays;

//public class reverseArray {
//    public static void main(String[] args) {
//        int[] arr={1,2,3,4,5,6,9};
//        int start=0;
//        int end= arr.length-1;
//        while (start<=end){
//            int temp=arr[start];
//                arr[start]=arr[end];
//                arr[end]=temp;
//
//            start++;
//            end--;
//        }
//        for (int ele:arr){
//            System.out.println(ele);
//        }
//    }
//}
public class reverseArray {
public static void main(String[]args) {
    int[] arr={1,2,3,4,5,6,9};
    for (int i=0;i<=arr.length/2;i++){
        int j= arr.length-1-i;
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    System.out.println(Arrays.toString(arr));
  }
}