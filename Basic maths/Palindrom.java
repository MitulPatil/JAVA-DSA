import java.util.*;

public class Palindrom {
    static String CheckPalindrom(int N){
        int RevN = 0;
        int dub = N;
        while(N>0){
            int last = N%10;
            N=N/10;
            RevN = (RevN*10)+last;
        }
        if (dub == RevN) return "yes";
        else return "No";
    }
    public static void main(String[] args) {
        System.out.print("enter number");
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String RevN=CheckPalindrom(N);
        System.out.println("Reverse of the number is:"+RevN);
        sc.close();
    }
}
