package hashmaps;

import java.util.TreeMap;
import java.util.function.BiConsumer;

public class TreeMapSortedMap {

    public static void main(String[] args) {
        TreeMap<Integer, String> sorted_map = new TreeMap<>();
        sorted_map.put(2, "Sameer Kumar");
        sorted_map.put(1, "Aman");
        sorted_map.put(3, "Ajay");
        sorted_map.put(5, "Mayank");
        System.out.println("Printing all value of trees");
        // using for eact with lambda functions
        sorted_map.forEach((key, value) -> System.out.println(key + " -> " + value)
        );
        // sorted_map.forEach(new BiConsumer<String,String>() {
        //     @Override
        //     public void accept(String t, String u) {
                
        //     }
            
        // });
        
        System.out.println("Getting Top value of Sorted Tree : " + sorted_map.firstEntry().toString());
        System.out.println("Ceil value of Tree " + sorted_map.ceilingEntry(4));
        System.out.println("Floor value of Tree " + sorted_map.floorEntry(4));
        System.out.println("Last value of Tree " + sorted_map.lastEntry().toString());

    }
}
