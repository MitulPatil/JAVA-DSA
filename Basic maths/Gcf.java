import java.util.*;

public class Gcf {
    static int printGCF(int N1,int N2){
        while (N1>0 && N2>0) {
            if(N1 > N2) N1= N1%N2; 
            else N2= N2%N1; 
        }
        if(N1==0) return N2;
        return N1;
    }
    public static void main(String[] args) {
        System.out.print("enter number");
        Scanner sc = new Scanner(System.in);
        int N1 = sc.nextInt();
        int N2 = sc.nextInt();
        int gcf=printGCF(N1,N2);
        System.out.println("GCF of "+N1+"and "+N2+"is:"+gcf);
        sc.close();
    }
}
