import java.util.Arrays;

public class LearnArraysClass {
    public static void main(String[] args) {
        int[] number = {1,2,3,4,5,6,7,8,9,10};

        int index = Arrays.binarySearch(number, 4); // it work on sorted array

        System.out.println("the index of the element 4 in the array is:"+index);

        int[] arr = {4,52,5,26,1,45};

        Arrays.sort(arr); // to sort array

        for(int i:arr){
            System.out.println(i+" ");
        }

        Arrays.fill(arr, 14); // it replace all element with given element

        // traversal of Arrays
        for(int i:arr){
            System.out.println(i+" ");
        }
    }
}
