package recursion;

public class sumOfDigit {
    public static void main(String[] args) {
        System.out.println( func(1234));
    }
    public  static  int func(int n){
        if(n<0){
            return 0;
        }
        return  (n%10)+func(n/10);
    }
}
