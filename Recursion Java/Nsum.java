import java.util.*;

public class Nsum {
    static void sum(int n,int sum){
        if(n<1){
            System.out.print(sum);
            return;
        }

        sum(n-1,sum+n);
    }
    public static void main(String[] args) {
        System.out.print("enter Number");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sum(n,0);
    }
}
