import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class LearnMap {
    public static void main(String[] args) {
        Map<String, Integer> num = new HashMap<>();
        num.put("one", 1);
        num.put("two", 2);
        num.put("three", 3);
        num.put("four", 4);

        num.put("two", 23); // 23 override with 2

        num.putIfAbsent("three", 45); //to avoid override use putIfAbsent(key,value) function
        System.out.println(num);

        System.out.println(num.containsKey("four")); 
        System.out.println(num.containsValue(3));

        // iterate Map
        for(Map.Entry<String, Integer> e : num.entrySet()){
            System.out.println(e);
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }

        // iterate key
        for(String key: num.keySet()){
            System.out.println(key);
        }
        // iterate value
        for(Integer value: num.values()){
            System.out.println(value);
        }

        // print element in sorted order baised on key
        Map<String, Integer> number= new TreeMap<>();
        number.put("one", 1);
        number.put("two", 2);
        number.put("three", 3);
        number.put("four", 4);

        System.out.println(number);

        number.remove("three");
    }
}
