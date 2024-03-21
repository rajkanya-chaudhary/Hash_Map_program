package Mappingcode;

import java.util.HashMap;
import java.util.Map;

public class Hash_map {
    public static void main(String[] args) {
        HashMap<Integer,String> map = new HashMap<Integer,String>();
        map.put(1, "dimpal");
        map.put(2, "neha");
        map.put(3, "Kumkum");
        map.put(4, "jhunjhun");
        System.out.println("Iterating hashmap");
        for(Map.Entry m : map.entrySet())
        {
            System.out.println(m.getKey() + " " + m.getValue());
        }
    }
}
