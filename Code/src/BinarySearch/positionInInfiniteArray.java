package BinarySearch;

public class positionInInfiniteArray {
    public static void main(String[] args) {
        int arr[] ={3, 5, 7, 9, 10, 90,
                100, 130, 140, 160, 170};
        System.out.println(ans(arr,10));
    }

     static int ans(int[] arr,int target) {
         int start=0;
         int end=1;
         if(arr[end]<target){
             int newstart=end+1;
             end=end+(end-start+1)*2;
             start=newstart;
         }
        int ans= binarySearch_1(arr,target,start,end);
         return ans;
     }
     static int  binarySearch_1(int[] arr, int target,int start,int end) {
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
