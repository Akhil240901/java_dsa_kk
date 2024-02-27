package method;

import java.util.Scanner;

public class pallindromeNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number ");
        int num= sc.nextInt();
        pallindromeFunc(num);
    }

    static void pallindromeFunc(int num) {
         int rev_num=reverse(num,0);
         if (num==rev_num){
             System.out.println("Yes,it is pallindromeNumber number");
         }else {
             System.out.println("No, it is not a pallindromeNumber number");
         }
    }

    static  int reverse(int num,int rev_num){
        while (num>0){
            rev_num=rev_num*10 +num%10;
            num=num/10;
        }
        return rev_num;
    }
}
