package cyclicSort;
//https://leetcode.com/problems/first-missing-positive/description/
public class firstMissingPositive {
    public static void main(String[] args) {
      int [] arr={3,4,-1,1};
      firstMissingPositive(arr);
    }
    public static int firstMissingPositive(int[] arr) {
        int i=0;
        while (i< arr.length){
            int corrPosition=arr[i]-1;
            //ignore nth element,add arr[i] < n condition
            if(arr[i]>0 && arr[i]<= arr.length && arr[i]!=arr[corrPosition]){
                swap(arr,i,corrPosition);
            }else{
                i++;
            }
        }
        //case1: return smallest missing no
        for(int j=0;j< arr.length;j++){
            if(arr[j]!=j+1){
                return j+1;
            }
        }

        //case2: if 0 to n element is presentin sorted form return n+1
        return arr.length+1;
    }
    static void swap(int[] arr, int i, int corrPosition) {
        int temp=arr[i];
        arr[i]=arr[corrPosition];
        arr[corrPosition]=temp;
    }
}
