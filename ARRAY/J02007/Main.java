package ARRAY.J02007;
import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t= sc.nextInt();
        for(int j=1; j<=t; j++){
            int n= sc.nextInt();
            LinkedHashMap<Integer, Integer> map = new LinkedHashMap<>();
            int[] a= new int[n];
            for(int i=0; i<n; i++){
                a[i]= sc.nextInt();
            }
            for(int x: a){
                if(map.containsKey(x)){
                    int dem=map.get(x);
                    map.put(x, dem+1);
                }
                else{
                    map.put(x, 1);
                }
            }
            System.out.println("Test "+ j+":");
            Set<Map.Entry<Integer, Integer>> entrySet = map.entrySet();
            for(Map.Entry<Integer, Integer> entry : entrySet){
                System.out.print(entry.getKey() +" xuat hien " + entry.getValue() +" lan");
                System.out.println();
            }
        }
    }
}