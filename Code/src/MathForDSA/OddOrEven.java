package MathForDSA;

import java.util.Scanner;

public class OddOrEven {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();
        if(find(n)){
            System.out.println("The number is odd");
        }else {
            System.out.println("the number is even");
        }
    }
    public static boolean find(int n){
      return  ((n&1)==1);
    }
}
