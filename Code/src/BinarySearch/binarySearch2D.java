package BinarySearch;

import java.util.Arrays;
//algorithm works on matrix sorted in rowwise and column wise
public class binarySearch2D {
    public static void main(String[] args) {
        int[][] matrix={
                {10,20,30,40},
                {15,25,35,45},
                {28,29,37,49},
                {33,34,38,50}};
        System.out.println(Arrays.toString(search(matrix,15)));
    }

    static int[] search(int[][] matrix, int target) {
        int row=0;
        int col= matrix.length-1;

        while (row < matrix.length && col>=0){
            if(matrix[row][col]==target){
                return new int[]{row,col};
            }else if(matrix[row][col]>target){
                col--;
            }else {
                row++;
            }
        }

        return new int[]{-1,-1};
    }
}
