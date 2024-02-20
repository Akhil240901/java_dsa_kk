package loops_conditional;
import java.util.Scanner;
public class sumOfIntegerTill_0 {
    public static void main(String[] args) {

                Scanner in = new Scanner(System.in);
                int sum = 0;
                //int count = 0;
                int x = in.nextInt();
                while (x >0) {
                    if (x > 0) {

                        sum = sum + x;
                        System.out.println(sum);
                        x--;

                    } else {
                        System.out.println("no data was entered");

                    }

                    x--;
                }


    }
}
