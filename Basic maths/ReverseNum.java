import java.util.*;
public class ReverseNum {
    static int ReverseNumber(int N){
        int RevN = 0;
        while(N>0){
            int last = N%10;
            N=N/10;
            RevN = (RevN*10)+last;
        }
        return RevN;
    }
    public static void main(String[] args) {
        System.out.print("enter number");
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int RevN=ReverseNumber(N);
        System.out.println("Reverse of the number is:"+RevN);
        sc.close();
    }
}
