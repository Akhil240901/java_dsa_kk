package BinarySearch;

import java.util.Arrays;

public class binarySearch2DfullySorted {
    public static void main(String[] args) {
        int[][] matrix={
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16},
        };
        System.out.println(Arrays.toString(search(matrix,4)));
    }

     static int[] search(int[][] matrix, int target) {
         int rows = matrix.length;
         int cols = matrix[0].length; // be cautious, matrix may be empty
         if (cols == 0){
             return new int[] {-1,-1};
         }
         if (rows == 1) {
             return binarySearch(matrix,0, 0, cols-1, target);
         }

         int rowStart = 0;
         int rowEnd = rows - 1;
         int cMid = cols / 2;

         // run the loop till 2 rows are remaining
        while (rowStart<(rowEnd-1)){
            int midR=rowStart+(rowEnd-rowStart)/2;
            if(matrix[midR][cMid]==target){
                return new int[]{midR,cMid};
            }else if(matrix[midR][cMid]<target){
                rowStart=midR;
            }else{
                rowEnd=midR;
            }
        }

        //check for two element in same col element
        if (target==matrix[rowStart][cMid]){
            return new int[]{rowStart,cMid};
        }
        if (target==matrix[rowStart+1][cMid]){
            return new int[]{rowStart+1,cMid};
        }

        //1st half of rowStart and cmid-1
        if(target<=matrix[rowStart][cMid-1]){
            return binarySearch(matrix,rowStart,target,0,cMid-1);
        }
        //2nd half of rowStart and cmid+1
        if(target>=matrix[rowStart][cMid+1] && target<=matrix[rowStart][cols-1]){
            return binarySearch(matrix,rowStart,target,cMid+1,cols-1);
        }
        //3rd half of rowStart+1 and cmid-1
        if(target<=matrix[rowStart+1][cMid-1] ){
            return binarySearch(matrix,rowStart+1,target,0,cMid-1);
        }else {
            //4th half
            return binarySearch(matrix,rowStart+1,target,cMid+1,cols-1);
        }

    }

    static int[] binarySearch(int[][] arr,int row,int target,int start,int end){

        while (start<=end){
            int mid = start + (end - start) / 2;
            if (arr[row][mid] == target) {
                return new int[]{row, mid};
            }
            if (arr[row][mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return  new int[]{-1,-1};
    }
}
