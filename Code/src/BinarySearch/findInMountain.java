package BinarySearch;
//https://leetcode.com/problems/find-in-mountain-array/description/
public class findInMountain {
    public static void main(String[] args) {
        int[] arr= {1,2,4,5,3,1,2};
        int target = 3;
        System.out.println( find(arr,target));
    }

    private static int find(int[] arr, int target) {
        int pivot=peakIndexInMountainArray(arr);

        if (target==arr[pivot]){
            return pivot;
        }
        int firstArray=orderAgnosticBS(arr,0,pivot-1,target);

        if (firstArray!= -1){
            return firstArray;
        }
        return orderAgnosticBS(arr,pivot+1,arr.length-1,target);

    }
    static int  orderAgnosticBS(int[] arr, int start,int end,int target ) {

        int mid;

        boolean isAsc=arr[start]<arr[end];

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
    static int peakIndexInMountainArray(int[] arr) {
        int start=0;
        int end=arr.length-1;
        int mid;

        while(start<end){
            mid=start+(end-start)/2;
            if(arr[mid]>arr[mid+1]){
                end=mid;
            }else{
                start=mid+1;
            }
        }
        return start;
    }
}
