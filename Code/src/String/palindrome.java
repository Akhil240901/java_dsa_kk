package String;

public class palindrome {
    public static void main(String[] args) {
        String str="c";
        System.out.println(palindromeCheck(str));
    }

     static boolean palindromeCheck(String str) {
        if (str.length()==0){
            return true;
        }
       for(int i=0;i<str.length()/2;i++){
           if (str.charAt(i)!=str.charAt(str.length()-1-i)){
               return false;
           }
       }
       return true;
    }
}
