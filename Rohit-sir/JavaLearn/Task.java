
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Task {

    public static void main(String[] args) throws FileNotFoundException {
        File file = new File(
                "C:\\Ubuntu\\UCA\\Rohit-sir\\JavaLearn\\temp.txt");
        Scanner sc = new Scanner(file);
        String str = "";

        while (sc.hasNextLine()) {
            str = str + sc.nextLine();
        }
        List<String> arr = new ArrayList<>();
        StringBuilder br = new StringBuilder();
        for (char c : str.toCharArray()) {
            if (c == ' ' || c == ',' || c == '.') {
                arr.add(br.toString());
                br = new StringBuilder();
            } else {
                br.append(c);
            }
        }
        Map<String, Integer> map = new HashMap<>();
        for (String key : arr) {

            if (key.length() < 10) {
                continue;
            }
            
            map.put(key, map.getOrDefault(key, 0) + 1);
        }
        String max_str = "";
        for (String key : map.keySet()) {

            if (max_str.length() == 0 || map.get(key) > map.get(max_str)) {
                max_str = key;
            }
        }
        System.err.println(max_str + " length is " + map.get(max_str));

    }
}
