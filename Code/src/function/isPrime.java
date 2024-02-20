package function;

import java.util.Scanner;

public class isPrime {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int num=sc.nextInt();
       boolean ans= isPrimeOrNot(num);
       if(ans){
           System.out.println("Yes! it is prime");
        }
       else {
           System.out.println("Sorry,it is not a prime number");
       }
    }

    private static boolean isPrimeOrNot(int num) {
       int c=2;
        while(c*c <= num){
            if(num%c==0){
                return false;
            }
            c++;
        }
        return  true;
    }
}
