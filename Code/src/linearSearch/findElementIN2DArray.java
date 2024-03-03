package linearSearch;

import java.util.Arrays;

public class findElementIN2DArray {
    public static void main(String[] args) {
        int[][] arr={
                {1,23,34},
                {3,55,7},
                {1,6,9},
        };
        int[] ans=find(arr,6);
        System.out.println(Arrays.toString(ans));
    }

    private static int[] find(int[][] arr, int target) {
        for(int i=0;i< arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                if(arr[i][j]==target){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{-1,-1};
    }
}
