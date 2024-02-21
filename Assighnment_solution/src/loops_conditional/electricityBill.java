package loops_conditional;

import java.util.Scanner;

public class electricityBill {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the amount of unit of electricity ");
        int unit= sc.nextInt();
        int ans=0;
        if(unit<=100){
            ans=unit*10;
        }else  if(unit<=200){
            ans=100*10 + (unit-100)*15;
        }else if(unit<=300){
            ans=(100*10)+(100*15)+(unit-200)*20;
        }else if(unit>300){
            ans=unit*25;
        }else{
            ans=0;
        }
        System.out.println(ans+"Rs");
    }
}
