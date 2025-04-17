package TwoPointerSS;

//No of consecutive 1s,k flip allowed
public class NoOfNonZero {
    public static void main(String[] args) {
        int arr[]={1,1,1,0,0,0,1,1,1,1,0};
        //int maxxlength=consecutiveNonZero(arr,2);
        int maxxlength=consecutiveNonZero2(arr,2);
        System.out.println(maxxlength);
    }

    //bruteforce approach ,tc:O(n2)
    static  int consecutiveNonZero(int []arr,int k){
        int maxLen=0;
        for(int i=0;i<arr.length;i++){
            int len=0, noOfZero=0;
            for(int j=i;j<arr.length;j++){
                if(arr[j]==0){
                    noOfZero++;
                }
                if(noOfZero<=k){
                    len=j-i+1;
                    maxLen=Math.max(maxLen,len);
                }
                else{
                    break;
                }
            }
        }
        return  maxLen;
    }

    //Two pointer sliding window approach, tc:O(n)

    static  int consecutiveNonZero2(int []arr,int k){
        int maxLen=0;
        int right=0,left=0;
        int zero=0;

        while(right<arr.length){
            int len=0;
            if(arr[right]==0){
                zero++;
            }
            if(zero>k){
                if(arr[left]==0){
                    zero--;
                }
                left++;
            }
            if(zero<=k){
                len=right-left+1;
                maxLen=Math.max(maxLen,len);
            }
            right++;
        }
      return maxLen;
    }
}
