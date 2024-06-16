import java.util.Scanner;
import java.lang.Math;
public class CountDigit {
    // using while loop 
    static int Count(int N){
        int count = 0;
        while(N>0){
            N=N/10;
            count++;
        }
        return count;
    }
    // using Math.log10()
    static int CountLog(int N){
        int cnt = (int)(Math.log10(N)+1);
        return cnt;
    }
    public static void main(String[] args) {
        System.out.print("enter number");
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int count=Count(N);
        System.out.println("coun is:"+count);
        sc.close();
    }
}
