
package Queue;
import java.util.ArrayDeque;

public class ArrayDequeImp {
    public static void main(String[] args) {
        ArrayDeque<Integer> aq=new ArrayDeque<>();
        aq.offer(10);
        aq.offer(11);
        aq.offer(15);
        aq.offerFirst(1);
        aq.offerLast(30);
        System.out.println(aq);
        System.out.println(aq.pollLast());
        System.out.println(aq);

        System.out.println(aq.size());
    }
}
