import java.util.Scanner;

public class pattern4 {
    public static void nTriangle(int n) {
        // Write your code here
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <=i; j++) {
                System.out.print(i+" ");
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