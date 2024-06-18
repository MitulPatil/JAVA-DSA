import java.util.*;

public class PrintNtoOne {
    static void PrintN(int i,int n){
        
        if(n<i) return;
        System.out.print(n+" ");
        PrintN(i,n-1);
    }
    public static void main(String[] args) {
        System.out.print("enter Number");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        PrintN(1,n);
    }
}
