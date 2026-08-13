package ARRAY.J02022;
import java.util.*;
public class Main {
    static int n;
    static int[] a;
    static boolean[] visited;
    public static boolean check(){
        for(int i=1; i<=n-1; i++){
            if(Math.abs(a[i] - a[i+1])==1){
                return false;
            }
        }
        return true;
    }
    public static void Try(int t){
        if(t>n){
            if(check()){
            for(int i=1; i<=n; i++){
                System.out.print(a[i]);
            }
            System.out.println();
            return;
        }
        }
        for(int i=1; i<=n; i++){
            if(!visited[i]){
                visited[i]=true;
                a[t]=i;
                Try(t+1);
                visited[i]=false;
            }
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t= sc.nextInt();
        while(t-- >0){
            n=sc.nextInt();
            a = new int[n+1];
            visited= new boolean[n+1];
            Try(1);
        }
    }
}
