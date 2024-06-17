package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class implementation {
    public static void main(String[] args) {
        Queue<Integer> q=new LinkedList<>();
        //offers element to add and use instead of add due exception throw while queue is empty
        q.offer(20);
        q.offer(30);
        q.offer(40);
        System.out.println();

        //.poll() remove the head element(first element)
        q.poll();
        //peek() will return first element
        System.out.println(q.peek());
        System.out.println(q);

    }
}
