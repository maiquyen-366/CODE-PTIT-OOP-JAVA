package ARRAY.J02008;
import java.util.*;
public class Main {
    public static long ucln(long a, long b){
        while(b>0){
            long r=a %b;
            a=b;
            b=r;
        }
        return a;
    }
    public static long bcnn(long a, long b){
        return a*b/ucln(a, b);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t= sc.nextInt();
        while(t-- >0){
            int n= sc.nextInt();
            long boi= 1;
            for(int i=2; i<=n; i++){
                boi= bcnn(boi, i);
            }
            System.out.println(boi);
        }
    }
}
