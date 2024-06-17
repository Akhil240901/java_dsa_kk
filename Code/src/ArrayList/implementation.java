package ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class implementation {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        //add() method add the element to list
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(60);
        list.add(70);
        list.add(80);
        list.add(90);
        list.add(100);

        //remove() method is used to remove list element,need to provide index
        list.remove(1);

        //set() method is used to update the value of specific element
        list.set(2,25);

        System.out.println(list);

        //contain method check if it containes element in list
        System.out.println(list.contains(25));

        //iterate through for loop,for each and iterable
        for (int i=0;i<list.size();i++){
            System.out.println("elemnt of for loop"+list.get(i));
        }

        for (int element:list) {
            System.out.println("Foreach element"+element);
        }

        //list.iterator() return iterator which has functionality like hasNext(),next()
        Iterator<Integer> it= list.iterator();

        while(it.hasNext()){
            System.out.println("iterator"+it.next());
        }

    }
}
