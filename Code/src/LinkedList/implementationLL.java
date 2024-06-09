
package LinkedList;
import java.util.*;
public class implementationLL {
    public static void main(String [] args){
        LinkedList<String> list=new LinkedList<>();
        list.add("is");
        list.add("a");
        System.out.println(list);

        list.addFirst("This");
        list.addLast("list");

        System.out.println(list);
        list.remove();
        System.out.println(list);
        list.remove(2);
        System.out.println(list);

        list.add(1,"last");
        System.out.println(list);
    }
}
