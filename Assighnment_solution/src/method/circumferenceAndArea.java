package method;

import java.util.Scanner;

public class circumferenceAndArea {
    public static void main(String[] args) {
        System.out.println("Enter the radius of circle to calculate the circumference and area ");
        Scanner sc=new Scanner(System.in);
        float radius= sc.nextFloat();
        System.out.println(area(radius));
        System.out.println(circumference(radius));
    }

     static double circumference(float radius) {
        return 2*3.14*radius;
    }

    static double area(float radius) {
        return 2*3.14*radius*radius;
    }
}
