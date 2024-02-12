import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int ans=0;
        while(true){
            System.out.print("enter the operation you want to perform: ");
            char op=input.next().trim().charAt(0);

            if(op== '+' || op=='-' || op=='*' || op=='/' || op=='%'){
                System.out.print("Enter the first number ");
                int num1=input.nextInt();
                System.out.print("Enter the second number ");
                int num2=input.nextInt();

                if(op== '+'){
                    ans=num1+num2;
                }
                else if(op=='-'){
                    ans= num1-num2;
                }
                else if(op=='*'){
                    ans= num1*num2;
                }
                else if(op=='/'){
                    ans= num1/num2;
                }
                else if(op=='%'){
                    ans= num1%num2;
                }
            }else if(op== 'x' || op== 'X'){
                break;
            }else{
                System.out.println("Invalid input");
            }
            System.out.println(ans);
        }
    }
}
