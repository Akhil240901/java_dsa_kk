package conditional_loop;

import java.util.Scanner;

public class lowercase_uppercase {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the text");
        char ch=input.next().trim().charAt(0);
        if(ch >= 'a' && ch <= 'z'){
            System.out.println("It is in lowercase ");
        }
        else{
            System.out.println("It is in uppercase");
        }

    }
}
