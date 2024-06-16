package Interfaces;

interface Vehicle{
    int password=12435;
    //can contain method signature or abstract method that needs to be define while class implements interface
    void run();

    //can contain default method which has implementation too
    default void  wheel(){
        System.out.println("You can drive");
    }

    //static method associated interface itself rather than instance of class
    static  int  add(int a,int b){
        return a+b;
    }
}

 class Car implements Vehicle{
    public void run(){
        System.out.println("vehicle is running ");
    }
}
public class Implementation {
    public static void main(String[] args) {
        //Implementation impl = new Implementation();
        Vehicle car = new Car();
        car.run();
        car.wheel();

        System.out.println(Vehicle.add(2,3));

    }
}
