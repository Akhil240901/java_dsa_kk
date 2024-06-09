package Stack;

import java.util.Stack;

public class reverseStack {
    public static void main(String[] args) {
        Stack<Integer> s=new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);

        reverse(s);

        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
    }
    static void reverse(Stack<Integer> s){
        //base condition,when stack is empty add element at bottom and to previous call
        if(s.isEmpty()){
            return;
        }
        int pop= s.pop(); //if stack filled then it will pop element from top
        reverse(s);      //it will call again reverse function with remaining stack element
        pushElementAtBottom(s,pop);//this function will add first poped element,2nd,3rd...so on
    }

    static void pushElementAtBottom(Stack<Integer> stack, int element) {
        //when stack gets empty,add elemnt got from method call
        if (stack.isEmpty()){
            stack.push(element);
            return;
        }
        //will pop full elemnt in stack ,so that elemnt can added to bottom
        int pop=stack.pop();
        pushElementAtBottom(stack,element);//call again and again until stack gets empty
        stack.push(pop); //will add poped element

    }
}
