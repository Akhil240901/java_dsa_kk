package recursion;

public class BinarySearch {
    public static void main(String[] args) {
        int [] arr={12,14,33,45,46,67,88};
        int target=89;
        System.out.println(bSearch(arr,target,0,arr.length-1));
    }
    public  static int bSearch(int[] arr,int target,int start,int end){
        if(start>=end ){
            return -1;
        }
        int mid=start+(end-start)/2;
        if(arr[mid]==target){
            return mid;
        }
        else if(target>arr[mid]){
            return bSearch(arr,target,mid+1,end);

        }
        return bSearch(arr,target,start,mid-1);
    }
}
