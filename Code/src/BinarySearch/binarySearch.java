package BinarySearch;

public class binarySearch {
    public static void main(String[] args) {
        int[] arr={1,22,33,34,56,66,74,82,83,90};
        System.out.println( binarySearch_1(arr,33));
    }

    private static int  binarySearch_1(int[] arr, int target) {
        int start=0;
        int end=arr.length-1;
        int mid;
        //loop will run till the end greater than start
        while (start<=end){
            mid=start+(end-start)/2;

            if(target<arr[mid]){
                end=mid-1;   //if target element is lies in left side
            }else if(target>arr[mid]){
                start=mid+1; //if target element is lies right side
            }else {
                return mid;
            }
        }

        return -1;
    }
}
