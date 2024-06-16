import java.util.Scanner;
public class CountDigit {

    static int Count(int N){
        int count = 0;
        while(N>0){
            N=N/10;
            count++;
        }
        return count;
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
