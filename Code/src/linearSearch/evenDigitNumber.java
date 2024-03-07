package linearSearch;

public class evenDigitNumber {
    public static void main(String[] args) {
        int[] arr={12,345,2,6,7896};
        System.out.println(findNumbers(arr));
    }
    static int findNumbers(int[] nums) {
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(even(nums[i])){
                count++;
            }
        }
        return count;
    }
    static boolean even(int n){
        int digit=0;
        while(n>0){
            digit++;
            n=n/10;
        }
        if(digit%2==0){
            return true;
        }
        else{
            return false;
        }
    }
}
