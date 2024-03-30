package cyclicSort;

import java.util.*;
//https://leetcode.com/problems/find-all-duplicates-in-an-array/
public class findAllDuplicate {
    public static void main(String[] args) {
      int[] arr={4,3,2,7,8,2,3,1};
      findDuplicates(arr);
    }
    public static List<Integer> findDuplicates(int[] arr) {
        int i=0;
        while(i< arr.length){
            int correctPosition=arr[i]-1;
            if(arr[i]!=i+1 && arr[i]!=arr[correctPosition]){
                swap(arr,i,correctPosition);
            }else {
                i++;
            }
        }

        List<Integer> ans=new ArrayList<>();
        for (int j=0;j<arr.length;j++){
            if(arr[j]!=j+1){
                ans.add(arr[j]);
            }
        }

        return ans;
    }
    static void swap(int[] arr, int i, int corrPosition) {
        int temp=arr[i];
        arr[i]=arr[corrPosition];
        arr[corrPosition]=temp;
    }
}
