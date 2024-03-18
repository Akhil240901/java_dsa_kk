package BinarySearch;

public class floorNumber {
    public static void main(String[] args) {
        int[] arr={1,3,4,7,11,15,34,36,38};
        System.out.println(findCeil(arr,35)) ;
    }

    static int findCeil(int[] arr, int target) {
        int start=0;
        int end=arr.length-1;
        int mid;

        if(arr.length==0){
            return -1;
        }
        while(start<=end){
            mid=start+(end-start)/2;
            if(target<arr[mid]){
                end=mid-1;   //if target element is lies in left side
            }else if(target>arr[mid]){
                start=mid+1; //if target element is lies right side
            }else {
                return mid;
            }
        }
        return end;
    }
}
