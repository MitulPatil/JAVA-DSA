import java.util.HashSet;
import java.util.Set;


public class LearnSet{
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>(); // print in rendom order
        // Set<Integer> set = new LinkedHashSet<>(); // print in insertion order
        // Set<Integer> set = new TreeSet<>(); //print in insertion and sorted order

        set.add(1);
        set.add(90);
        set.add(5);
        set.add(47);
        set.add(52);

        System.out.println(set);

        set.remove(1);

        System.out.println(set);
        System.out.println(set.contains(90));
        System.out.println(set.isEmpty());
        System.out.println(set.size());

        set.clear();
        System.out.println(set);
    }
}