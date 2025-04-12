package TwoPointerSS;

import java.util.HashMap;

public class maxsubstring {
    public static void main(String[] args) {
        String str="zxcvbncmzasdfghx";
        //int maxlength=maxSubStr(str);
        int maxlength=maxSubStr2(str);
        System.out.println(maxlength);
    }
   //bruteforch approach with TC:O(n2),  SC:O(n)
    static  int maxSubStr(String str){
        int maxLen=0;
        //outer loop for starting point
        for (int i=0;i<str.length();i++){
            HashMap<Character, Integer> charCount = new HashMap<>();
            int currlen=0;
            //inner loop for currElemnt or will look until duplicate elemnt finds
            for(int j=i;j<str.length();j++){
                char c=str.charAt(j);
                if(charCount.containsKey(c)){    //checks if character occurs in current substring,if true then will start new substring (i++)
                    break;
                }else {
                    charCount.put(c,1);
                    currlen=j-i+1;
                }
            }
            maxLen=Math.max(maxLen,currlen);
        }
        return maxLen;
    }

    //Using two pointer approach
    //TC:-O(n) SC:-O(n)
   static  int maxSubStr2(String str){
        HashMap<Character,Integer> map=new HashMap<>();
        int left=0,maxLength=0,len=0;
        for(int right=0;right<str.length();right++){
            char c=str.charAt(right);
            if(map.containsKey(c) && map.get(c)>=left){
                left=map.get(c)+1;
            }
            len=right-left+1;
            maxLength=Math.max(maxLength,len);
            map.put(c,right);
        }

        return maxLength;

   }
}
