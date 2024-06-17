package Map;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class implementation {
    public static void main(String[] args) {
        //add key and value ,but in random order
          //Map<String,Integer> mp=new HashMap<>();

        //add key value in orederd sorted way
        Map<String,Integer> mp=new TreeMap<>();
        //put method adds key,value pair
        mp.put("india",140);
        mp.put("china",140);
        mp.put("australia",30);
        mp.put("myanmar",10);

        //.containsKey and containsValue returns true or false
        System.out.println(mp.containsKey("india"));

        if(!mp.containsKey("pakistan")){
            mp.put("pakistan",80);
        }
        //either use putIfAbsent instead if condition
        mp.putIfAbsent("bhutan",1);
        System.out.println(mp);

        //iterate through hashset
        for(Map.Entry<String,Integer> e:mp.entrySet()){
            System.out.println(e);
        }
    }
}
