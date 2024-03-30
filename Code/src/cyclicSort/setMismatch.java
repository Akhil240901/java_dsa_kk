package cyclicSort;

//https://leetcode.com/problems/set-mismatch/
public class setMismatch {
    public static void main(String[] args) {
      int [] arr={1,2,2,4};
      findErrorNums(arr);
    }
    public static int[] findErrorNums(int[] arr) {
        int i=0;
        while(i< arr.length){
            int correctPosition=arr[i]-1;
            if(arr[i]!=i+1 && arr[i]!=arr[correctPosition]){
                swap(arr,i,correctPosition);
            }else {
                i++;
            }
        }

        for (int j=0;j<arr.length;j++){
            if(arr[j]!=j+1){
                return new int[]{arr[j],j+1};
            }
        }

        return new int[]{-1,-1};
    }
   static void swap(int[] arr, int i, int corrPosition) {
        int temp=arr[i];
        arr[i]=arr[corrPosition];
        arr[corrPosition]=temp;
    }
}
