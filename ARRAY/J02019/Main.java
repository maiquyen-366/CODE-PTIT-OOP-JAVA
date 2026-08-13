package ARRAY.J02019;
import java.util.*;
public class Main {
    public static boolean check(int n){
        int sum=1;
        for(int i=2; i<=Math.sqrt(n); i++){
            if(n%i==0){
                sum+=i;
                if(i!=n/i){
                    sum+=n/i;
                }
            }
        }
        if(sum>n) return true;
        else return false;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a =sc.nextInt();
        int b = sc.nextInt();
        int dem=0;
        for(int i=a; i<=b; i++){
            if(check(i)){
                dem++;
            }
        }
        System.out.println(dem);
    }
}
