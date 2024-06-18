import java.util.Scanner;

public class PrintName {
    static void Name(int i,int n){

        if(i>n) return;
        System.out.print("Mitul ");
        Name(i+1, n);
    }
    public static void main(String[] args) {
        System.out.print("enter number");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Name(1, n);
    }
}
