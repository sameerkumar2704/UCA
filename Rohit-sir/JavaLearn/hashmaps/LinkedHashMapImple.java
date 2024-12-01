package hashmaps;

import java.util.*;

public class LinkedHashMapImple {

    public void printValuesInOrderOfEntry(LinkedHashMap<String, String> link_map) {
        System.out.println("Values  in order of entry");
        System.out.println("Key -> Value");
        for (Map.Entry<String, String> node : link_map.entrySet()) {
            System.out.println(node.getKey() + " -> " + node.getValue());
        }
    }

    public static void main(String[] args) {
        LinkedHashMap<String, String> link_map = new LinkedHashMap<>();
        link_map.put("2210990776", "sameer kumar");
        link_map.put("2210990777", "sameer kumar sahu");

    }
}
