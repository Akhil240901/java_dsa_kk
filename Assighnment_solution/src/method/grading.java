package method;

import java.beans.beancontext.BeanContextServicesListener;
import java.util.Scanner;

public class grading {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int marks=input.nextInt();
        showGrades(marks);
    }

    static void showGrades(int marks) {
     if(marks>=91 && marks<=100){
         System.out.println("AA");
     }else if(marks>=81 && marks<=90){
         System.out.println("AB");
     }else if(marks>=71 && marks<=80){
         System.out.println("BC");
     }else if(marks>=61 && marks<=70){
         System.out.println("CC");
     }else if(marks>=51 && marks<=60){
         System.out.println("CD");
     }else if(marks>=41 && marks<=50){
         System.out.println("DD");
     }else {
         System.out.println("Fail");
     }
    }
}
