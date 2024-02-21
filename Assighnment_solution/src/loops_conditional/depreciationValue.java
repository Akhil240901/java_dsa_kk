package loops_conditional;

import java.util.Scanner;

public class depreciationValue {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the initial value");
        float initial_value = sc.nextInt();
        System.out.println("Enter rate of depreciation");
        float rate = sc.nextInt();
        System.out.println("time in years");
        float time = sc.nextInt();
        double depreciate_value =Math.ceil( initial_value*Math.pow((1-rate/100),time));
        System.out.println("Depreciated value "+depreciate_value);

    }
}
