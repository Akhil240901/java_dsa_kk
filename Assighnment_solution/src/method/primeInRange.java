package method;

import java.util.Scanner;

public class primeInRange {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the initial range");
        int start=sc.nextInt();
        System.out.println("End range");
        int end=sc.nextInt();
        for (int i=start;i<=end;i++) {
            if (prime(i)){
                System.out.println(i);
            }
        }

    }

    static boolean prime(int n) {
            for (int j=2;j*j<=n;j++){
                if(n%j==0){
                    return false;
                }
            }
            return true;
    }
}
