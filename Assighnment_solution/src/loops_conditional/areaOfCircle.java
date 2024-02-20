package loops_conditional;

import java.util.Scanner;

public class areaOfCircle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the radius of circle");
        float radius=sc.nextFloat();
        double area=3.14*radius*radius;
        System.out.println("Area of circle "+area);
    }
}
