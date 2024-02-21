package loops_conditional;

import java.util.Scanner;

public class compoundInterest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the principal");
        float principal=sc.nextInt();
        System.out.println("Rate of interest");
        float rate=sc.nextInt();
        System.out.println("Time");
        float time=sc.nextInt();
        double ci=Math.ceil( principal*Math.pow((1+rate/100),time));
        System.out.println(ci);
    }
}
