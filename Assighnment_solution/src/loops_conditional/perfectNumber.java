package loops_conditional;

import java.util.Scanner;

public class perfectNumber {
    public static void main(String[] args) {
        //perfect number is a number in  which sum of its factor is equal to number itself
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number ");
        int num=sc.nextInt();
        int sum=1;
        for (int i=2;i<=num/2;i++){
            if(num%i==0){
                sum+=i;
            }
        }
        if(sum==num){
            System.out.println("It is a perfect number");
        }
        else{
            System.out.println("It is not a perfect number");
        }
    }
}
