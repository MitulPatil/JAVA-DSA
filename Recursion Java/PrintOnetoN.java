import java.util.*;

public class PrintOnetoN {
    static void printNos(int i,int N)
    {
        //Your code here
        
        if(i>N) return;
        System.out.print(i+" ");
        printNos(i+1, N);   
    }
    public static void main(String[] args) {
        System.out.println("Enter Number");
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        printNos(1,N);
    }
}
