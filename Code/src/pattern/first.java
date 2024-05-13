package pattern;

import java.util.Scanner;

public class first {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter how many rows ");
        int n=sc.nextInt();
        pattern(n);
    }
    /*

     * *
     * **
     * ***
     * ****
     * *****
    */

    private static void pattern(int n) {
        for (int row=1;row<=n;row++){
            for (int col=1;col<=row;col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
