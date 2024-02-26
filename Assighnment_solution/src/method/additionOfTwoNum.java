package method;

import java.util.Scanner;

public class additionOfTwoNum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first  number");
        int first=sc.nextInt();
        System.out.println("Entger the second number");
        int second=sc.nextInt();
        addition(first,second);
    }

    static void addition(int first, int second) {
        int sum=first+second;
        System.out.println("The addition of two entered number is "+ sum);
    }
}
