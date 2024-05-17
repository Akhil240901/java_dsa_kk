package pattern;

public class fifth {
    public static void main(String[] args) {
        int n=5;
        pattern(n);
    }
/*
       *
       * *
       * **
       * ***
       * ****
       * *****
       * ****
       * ***
       * **
       * *
 */
    static void pattern(int n) {
        for (int i=1;i<2*n;i++){
            int sizeOfRow= i>n? 2*n-i:i;
            for (int j=1;j<=sizeOfRow;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
