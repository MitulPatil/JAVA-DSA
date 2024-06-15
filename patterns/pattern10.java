import java.util.Scanner;

public class pattern10 {
    public static void nTriangle(int n){
        for(int i=1 ;i<=2*n-1; i++){
            int start=i;
            if(start>n) start=2*n-i;
            for(int j=1;j<=start;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        System.out.print("enter number");
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        nTriangle(n);
        sc.close();
    }
}
