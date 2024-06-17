package Set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class implementation {
    public static void main(String[] args) {
        //we can implement SET interface using hashSet when order is not important
          //Set<Integer> set=new HashSet<>();

        //if want insertion order means set should be in the order that we entered our elements
           //Set<Integer> set=new LinkedHashSet<>();

        //if you want your set should in sorted order,you can use TreSet()
          Set<Integer> set=new TreeSet<>();

        set.add(10);
        set.add(20);
        set.add(30);
        set.add(40);
        set.add(50);
        set.add(60);
        set.add(70);
        set.add(80);

        System.out.println(set.contains(60));
        set.remove(40);
        System.out.println(set);

        System.out.println(set.size());

    }
}
