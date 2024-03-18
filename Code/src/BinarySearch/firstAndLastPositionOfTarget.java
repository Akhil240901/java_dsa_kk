package BinarySearch;

import java.util.Arrays;

public class firstAndLastPositionOfTarget {
    public static void main(String[] args) {
        int[] arr={5,7,7,8,8,10};
        System.out.println(Arrays.toString(searchRange(arr,7)));
    }
    static int[] searchRange(int[] nums, int target) {
        int[] ans={-1,-1};

        ans[0]=position(nums,target,true);
        ans[1]=position(nums,target,false);
        return ans;
    }

    static int position(int[] arr,int target,boolean firstPosition){
        int start=0;
        int end=arr.length-1;
        int mid;
        int ans=-1;
        while(start<=end){
            mid=start+(end-start)/2;
            if(target>arr[mid]){
                start=mid+1;
            }else if(target<arr[mid]){
                end=mid-1;
            }else{
                ans=mid;
                if(firstPosition){
                    end=mid-1;
                }else{
                    start=mid+1;
                }
            }
        }

        return ans;
    }
}
