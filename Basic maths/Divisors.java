import java.util.*;

public class Divisors {
    static void DivisorsPrint(int N){
        for(int i=1;i<=N;i++){
            if(N%i==0) System.out.println(i+" ");
        }
    }

    // print Divisor using loop from 1 to sqrt(n) and add this to list 
    static void PrintDivisors(int N){
        List<Integer> list = new ArrayList<>();
        for(int i=1;i<=(int)Math.sqrt(N);i++){
            if(N%i==0) {
                list.add(i);
                if((N/i) !=i){
                    list.add(N/i);
                }
            }
        }
        Collections.sort(list);
        System.out.println(list);
    }
    public static void main(String[] args) {
        System.out.print("enter number");
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        PrintDivisors(N);
        sc.close();
    }
}
