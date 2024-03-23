package BinarySearch;

public class searchInRotatedArray {
    public static void main(String[] args) {
        int []nums = {4,5,6,7,0};
        System.out.println(search(nums,1));
    }


    static  int search(int[] nums, int target) {
        int n= nums.length;
        //pivot fun will check if array rotated ,if not rotated means no pivot  then return -1
        int pivot=pivot(nums);
        System.out.println(pivot);
        //will check for sorted array
        if(pivot==-1){
            return binarySearch(nums,0, nums.length-1,target);
        }
        //if target ele is equal to element at pivot index
        if(nums[pivot]==target){
            return pivot;
        }
        //if target element is smaller than start element then it will lies on right hand side
        if(target<nums[0]){
            return   binarySearch(nums,pivot+1,nums.length-1,target);
        }else{
            //otherwise in left side of pivot
            return binarySearch(nums,0,pivot-1,target);
        }

    }

   static int pivot(int[] arr) {
        int start=0;
        int end= arr.length-1;
        int mid;

        while (start<=end){
            mid=start+(end-start)/2;
            if(mid<end && arr[mid]>arr[mid+1]){
                return mid;
            }else if(mid>start && arr[mid]<arr[mid-1]){
                return mid-1;
            } else if (arr[mid]<=arr[start]){ //it means pivot lies in left side
                end=mid-1;
            }else {  //it means next element is greater can pivot will find in right hand side
                start=mid+1;
            }
        }

        return -1;
    }

    static int  binarySearch(int[] arr,int start,int end, int target) {
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
