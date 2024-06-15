import java.util.Scanner;

public class pattern5 {
    public static void nTriangle(int n) {
        // Write your code here
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <=(n+1-i); j++) {
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        System.out.println("enter number of rows");
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        nTriangle(n);
        sc.close();
    }
}
