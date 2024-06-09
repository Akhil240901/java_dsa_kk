package LinkedList;

import java.util.LinkedList;
import  java.util.Collections;

public class reverseLL {
    public static void main(String[] args) {
        LinkedList<Integer> list=new LinkedList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        //before reversing
        System.out.println(list);

        //after reversing
        Collections.reverse(list);
        printLL(list);
    }

    private static void printLL(LinkedList<Integer> list) {
        for (int i=0;i<list.size();i++){
            System.out.print(list.get(i)+"-->");
        }
        System.out.print("null");
    }
}
