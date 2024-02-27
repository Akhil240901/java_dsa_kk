package method;

public class pythagoreanTriplet {
    public static void main(String[] args) {
      //  Write a function to check if a given triplet is a Pythagorean triplet or not. (A Pythagorean triplet is when the sum of the square of two numbers is equal to the square of the third number). is not a pythagorean triplet
        int arr[] = {3, 1, 4, 6, 5};
       if (triplet(arr)){
           System.out.println("Yes");
       }else {
           System.out.println("No");
       }
    }

    static boolean triplet(int[] arr) {
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j< arr.length;j++){
                for (int k=j+1;k< arr.length;k++) {
                    int a = arr[i]*arr[i];
                    int b = arr[j]*arr[j];
                    int c = arr[k]*arr[k];
                    if (a==b+c || b==a+c ||c==a+b) {
                       return true;
                    }
                }
            }
        }
        return  false;
    }
}
