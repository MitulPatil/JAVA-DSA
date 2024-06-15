import java.util.Scanner;

public class pattern11 {
    public static void nTriangle(int n){
        int start=1;
        for(int i=1;i<=n;i++){
            if(i%2 == 0) start=0;
            else start=1;
            for(int j=1;j<=i;j++){
                System.out.print(start);
                start=1-start;
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
