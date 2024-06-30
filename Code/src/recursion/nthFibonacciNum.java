package recursion;
//Recurence relation
  //  F(n)=F(n-1)+F(n-2);
public class nthFibonacciNum {
    public static void main(String[] args) {
        System.out.println(fibo(4));
    }

    private static int fibo(int num) {
       if(num<2){
           return num;
       }
       return fibo(num-1)+fibo(num-2);
    }
}
