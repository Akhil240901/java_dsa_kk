package loops_conditional;

import java.util.Scanner;

public class areaOfIsosceles {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int base=sc.nextInt();
        int height=sc.nextInt();
        double area=(base*height)/2;
        System.out.println(area);
    }
}
