package Stack;

import java.util.Stack;

public class addElementAtBottom {
    public static void main(String[] args) {
        Stack<Integer> s=new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);

        addAtBottom(5,s);
        while (!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
    }
//using recursion
    static void addAtBottom(int element, Stack<Integer> s) {
        if(s.isEmpty()){
            s.push(element);
            return;
        }
        int pop=s.pop();
        addAtBottom(element,s);
        s.push(pop);
    }
}
