package OOP_KHAI_BAO_LOP.J04014;
import java.util.*;
class PhanSo{
    private long x, y;
    public PhanSo(long x, long y){
        this.x=x;
        this.y=y;
    }
    public long ucln(long x, long y){
        while(y>0){
            long r= x%y;
            x=y;
            y=r;
        }
        return x;
    }
    public PhanSo tinhToan1(PhanSo p1){
        long tu1=x*p1.y+p1.x*y;
        long mau1=y*p1.y;
        long tu2=tu1*tu1;
        long mau2=mau1*mau1;
        long g = ucln(tu2, mau2);
        tu2/=g;
        mau2/=g;
        return new PhanSo(tu2, mau2);
    }
    public PhanSo tinhToan2(PhanSo p1){
        long tu1=x*p1.y+p1.x*y;
        long mau1=y*p1.y;
        long tu2=tu1*tu1;
        long mau2=mau1*mau1;
        long g=ucln(tu2, mau2);
        tu2/=g;
        mau2/=g;
        long tu3=x*p1.x*tu2;
        long mau3=y*p1.y*mau2;
        long g1=ucln(tu3, mau3);
        tu3/=g1;
        mau3/=g1;
        return new PhanSo(tu3, mau3);
    }
    @Override
    public String toString(){
        return x+"/"+y;
    }
}
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t= sc.nextInt();
        while(t-- >0){
            PhanSo p1 = new PhanSo(sc.nextLong(), sc.nextLong());
            PhanSo p2 = new PhanSo(sc.nextLong(), sc.nextLong());
            PhanSo p=p1.tinhToan1(p2);
            PhanSo p3=p1.tinhToan2(p2);
            System.out.print(p+" ");
            System.out.println(p3);
        }
    }
}
