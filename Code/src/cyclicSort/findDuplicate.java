package cyclicSort;

//https://leetcode.com/problems/find-the-duplicate-number/
public class findDuplicate {
    public static void main(String[] args) {
         int [] arr={3,1,3,4,2};
        System.out.println(findDuplicate2(arr));
    }
    //1st way by filling negative element
    public static int findDuplicate(int[] nums) {
        for(int i=0;i<nums.length;i++){
            int index=Math.abs(nums[i]);

            if(nums[index]<0){
                return index;
            }else{
                nums[index]=-nums[index];
            }
        }
        return -1;
    }
    //2nd way using cyclicsort
    static  int findDuplicate2(int [] arr){
        int i=0;
        while (i< arr.length) {
            //check if  already element is in correct position
            if (arr[i] != i + 1) {
                int corrPosition = arr[i] - 1;
                //checks if already same element present at corrPosition,if yes return else condition
                if (arr[i] < arr.length && arr[i] != arr[corrPosition]) {
                    swap(arr, i, corrPosition);
                } else {
                    return arr[i];
                }
            } else {
                i++;
            }
        }

        return -1;
    }

    static void swap(int[] arr, int i, int corrPosition) {
        int temp=arr[i];
        arr[i]=arr[corrPosition];
        arr[corrPosition]=temp;
    }

}
