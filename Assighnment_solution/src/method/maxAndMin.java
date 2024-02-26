package method;

public class maxAndMin {
    public static void main(String[] args) {
        int a=12, b=10,c=26 ;
        int max=max(a,b,c);
        System.out.println(max);
        int min=min(a,b,c);
        System.out.println(min);
    }

    static  int max(int a,int b, int c){
        int max=a;

        if(b>max){
            max=b;
        }
        if(c>max){
            max=c;
        }
        return  max;
    }

    static  int min(int a,int b, int c){
        int min=a;

        if(b<min){
            min=b;
        }
        if(c<min){
            min=c;
        }
        return min;
    }
}
