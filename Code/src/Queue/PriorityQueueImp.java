package Queue;

import java.util.ArrayDeque;
import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueueImp {
    public static void main(String[] args) {
        //this initialization will give small element as first priority in queue(minHeap)
          //PriorityQueue<Integer> ad=new PriorityQueue<>();

        //this initialization of queue will give max element as first priority
        PriorityQueue<Integer> ad=new PriorityQueue<>(Comparator.reverseOrder());

        //same properties like queue
        ad.offer(60);
        ad.offer(20);
        ad.offer(70);
        ad.offer(40);
        System.out.println(ad);

    }
}
