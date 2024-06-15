import java.util.*;
public class LearnlinkedList {

    public static void main(String[] args) {
        
        List<Integer> List = new LinkedList<>();
        // add element to end of the list
        List.add(1);
        List.add(2);
        List.add(3);
        List.add(4);
        List.add(5);
        System.out.println(List);

        // add element to the certain position of the list
        List.add(2,7);
        System.out.println(List);
         
        ArrayList<Integer> newList = new ArrayList<>();
        newList.add(10);
        newList.add(20);

        // add list to end of the list
        List.addAll(newList);

        System.out.println(List);

        System.out.println(List.get(3));

        // remove element to certain positon of the list

        List.remove(2);
        System.out.println(List);

        // remove given element from the list

        List.remove(Integer.valueOf(10));
        System.out.println(List);
    }
}
