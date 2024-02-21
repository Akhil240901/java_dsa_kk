package loops_conditional;

import java.util.Scanner;

public class discount {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the market price");
        int market_value= sc.nextInt();
        System.out.println("Enter the selling price");
        int selling_value= sc.nextInt();
        int discount_Per=((market_value-selling_value)*100/market_value);
        System.out.println(discount_Per+"%");
    }
}
