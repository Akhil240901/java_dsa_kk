package String;

import java.util.Locale;

public class reverseString {
    public static void main(String[] args) {
        String str="Akhil";
        reverse(str);
    }

    static void reverse(String str) {
        str=str.toLowerCase();
        String rev_str="";
        for (int i=str.length()-1;i>=0;i--){
            rev_str=rev_str+str.charAt(i);
        }
        System.out.println(rev_str);
    }
}
