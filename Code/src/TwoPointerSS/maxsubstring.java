package TwoPointerSS;

import java.util.HashMap;

public class maxsubstring {
    public static void main(String[] args) {
        String str="zxcvbnmzasdfghx";
        int maxlength=maxSubStr(str);

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
}
