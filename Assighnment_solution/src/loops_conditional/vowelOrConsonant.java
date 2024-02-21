package loops_conditional;

import java.util.Scanner;

public class vowelOrConsonant {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the character");
        char ch=sc.next().trim().charAt(0);
        if(ch=='a'|| ch=='e'||ch=='i'||ch=='o'||ch=='u'){
            System.out.println(ch+ "it is vowel");
        }else {
            System.out.println(ch+"it is consonant");
        }

    }
}
