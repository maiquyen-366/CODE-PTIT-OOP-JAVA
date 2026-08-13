package ARRAY.J02020;
import java.util.*;
public class Main {
    static int n, k;
    static int[] a;
    static int dem=0;
    public static void Try(int t){
        if(t>k){
            for(int i=1; i<=k; i++){
                System.out.print(a[i]+" ");
            }
            System.out.println();
            dem++;
            return;
        }
        for(int i= a[t-1] +1; i<=n-k+t; i++){
            a[t]=i;
            Try(t+1);
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        n= sc.nextInt();
        k=sc.nextInt();
        a= new int[k+1];
        a[0]=0;
        Try(1);
        System.out.println("Tong cong co " + dem+" to hop");
    }
}
