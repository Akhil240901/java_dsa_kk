package BinarySearch;

public class orderAgnosticBinarySearch {
    public static void main(String[] args) {
        int[] arr={99,89,80,77,57,55,54,34,23,22,11,1};
        System.out.println( orderAgnosticBS(arr,23));
    }

     static int  orderAgnosticBS(int[] arr, int target ) {
        int start=0;
        int end= arr.length-1;
        int mid;

        boolean isAsc=arr[0]<arr[arr.length-1];

        while(start<=end){
            mid=start+(end-start)/2;

            if(target==arr[mid]){
                return  mid;
            }

            if(isAsc){
                if(target<arr[mid]){
                    end=mid-1;
                }else {
                    start=mid+1;
                }
            }else{
                if(target>arr[mid]){
                    end=mid-1;
                }else{
                    start=mid+1;
                }
            }
        }
        return -1;
    }
}
