import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class LearnCollectionClass {
    public static void main(String[] args) {
       ArrayList<Integer> list = new ArrayList<>();

        list.add(2);
        list.add(43);
        list.add(62);
        list.add(54);
        list.add(5);
        list.add(5);
        list.add(10);
        list.add(45);
        list.add(11);

        System.out.println(list);

        System.out.println("min element:"+Collections.min(list)); //find min element
        System.out.println("max element:"+Collections.max(list)); //find max element
        System.out.println("frequency of 5:-"+Collections.frequency(list, 5)); // Returns the number of times a given value present in the list

        Collections.sort(list);// sort in ascending order
        System.out.println(list);

        Collections.sort(list,Comparator.reverseOrder());// sort in descending order
        System.out.println(list);

    }
}
