import java.util.*;

public class LearnArrayList{
    public static void main(String[] args) {
        
        ArrayList<Integer> List = new ArrayList<>();
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

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(30);
        list2.add(40);
        list2.add(50);
        list2.add(60);

        // remove all element from list
        list2.clear();

        System.out.println(list2);

        List.set(1, 100);

        System.out.println(List);
        System.out.println(List.contains(5));

        // traverse list

        for (int i = 0; i < List.size(); i++) {
            System.out.println("elements:"+List.get(i));
        }

        for (Integer element: List){
            System.out.println("foreach:"+element);
        }

        Iterator<Integer> it = List.iterator();

        while (it.hasNext()) {
            System.out.println("iterator:"+it.next());
        }
    }
}