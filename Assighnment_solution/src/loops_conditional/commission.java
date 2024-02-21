package loops_conditional;

import java.util.Scanner;

public class commission {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the amount of sell happened ");
        int sell_price=sc.nextInt();
        System.out.println("Commission rate ");
        int commission_rate= sc.nextInt();
        int profit=sell_price*commission_rate/100;
        System.out.println(profit);
    }
}
