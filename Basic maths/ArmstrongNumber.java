import java.util.*;
public class ArmstrongNumber{
    static String Armstrong(int N){
        int Arm = 0;
        int dub = N;
        while(N>0){
            int last = N%10;
            N=N/10;
            Arm = Arm+(last*last*last);
        }
        if (dub == Arm) return "yes";
        else return "No";
    }
    public static void main(String[] args) {
        System.out.print("enter number");
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String Arm=Armstrong(N);
        System.out.println("Armstrong number:"+Arm);
        sc.close();
    }
}