package cyclicSort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class disapearedNums {
    public static void main(String[] args) {
        int [] arr={4,3,2,7,8,2,3,1};
        System.out.println(findDisappearedNums(arr));
        System.out.println(Arrays.toString(arr));
    }

    static List<Integer> findDisappearedNums(int[] arr) {
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
                 ans.add(j+1);
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
