package recursion;

public class print_n_Number {
    public static void main(String[] args) {
        print(5);
    }

    public static void print(int i) {
        if(i==0) {
            return ;
        }
        System.out.println(i);
        print(i-1);
    }
}
