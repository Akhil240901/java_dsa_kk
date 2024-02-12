package conditional_loop;

import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int a=0;
        int b=1;
        System.out.println("Enter the no of element you want:");
        int n=input.nextInt();
        while(n>0){
            System.out.println(b);
            int temp=b;
            b=a+b;
            a=temp;
            n--;
        }
    }
}
