package ARRAY.J02005;
import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int m = sc.nextInt();
        int[] a= new int[n];
        int[] b= new int[m];
        TreeSet<Integer> s1= new TreeSet<>();
        TreeSet<Integer> s2= new TreeSet<>();
        TreeSet<Integer> s3 = new TreeSet<>();
        for(int i=0; i<n; i++){
            a[i]= sc.nextInt();
            s1.add(a[i]);
        }
        for(int i=0; i<m; i++){
            b[i]= sc.nextInt();
            s2.add(b[i]);
        }
        for(int x: s1){
            if(s2.contains(x)){
                s3.add(x);
            }
        }
        for(int x:s3){
            System.out.print(x+" ");
        }
    }
}
