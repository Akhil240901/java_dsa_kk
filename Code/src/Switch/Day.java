package Switch;

import java.util.Scanner;

public class Day {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int day=sc.nextInt();

        switch (day) {
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 7 -> System.out.println("Sunday");
            default -> System.out.println("Fuck day");
        }
    }
}
