import java.util.*;

public class Labprogram {
    static int index(int n){
        int[] arr={1,2,3,5,6};
        for (int i=0;i<arr.length;i++){
            if(n==arr[i]){
                return i;
            }
            else if(n != arr[i]){
                while(arr[i]>n){
                    return i;
                }
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        int n=4;
        int element=index(n);
        System.out.println(element);
    }
}

