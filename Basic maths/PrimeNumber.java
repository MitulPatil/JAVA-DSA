import java.util.Scanner;

public class PrimeNumber {
    static void PrintDivisors(int N){
        int count=0;
        for(int i=1;i*i<=N;i++){
            if(N%i==0) {
                count++;
                if((N/2) != i){
                    count++;
                }
            }
        }
        if(count==2) System.out.println("prime");
        else System.out.println("not prime");
    }
    public static void main(String[] args) {
        System.out.print("enter number");
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        PrintDivisors(N);
        sc.close();
    }
}
