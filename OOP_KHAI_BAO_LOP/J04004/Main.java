package OOP_KHAI_BAO_LOP.J04004;
import java.util.*;
class PhanSo{
    private long tu, mau;
    public PhanSo(long tu, long mau){
        this.tu=tu;
        this.mau=mau;
    }
    public long ucln(long tu, long mau){
        while(mau>0){
            long r= tu%mau;
            tu=mau;
            mau=r;
        }
        return tu;
    }
    public PhanSo tong(PhanSo p){
        long tu1=tu*p.mau+mau*p.tu;
        long mau1=mau*p.mau;
        long g=ucln(tu1, mau1);
        tu1/=g;
        mau1/=g;
        return new PhanSo(tu1, mau1);
    }
    @Override
    public String toString(){
        return tu+"/"+mau;
    }
}
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        PhanSo p1= new PhanSo(sc.nextLong(), sc.nextLong());
        PhanSo p2= new PhanSo(sc.nextLong(), sc.nextLong());
        PhanSo p = p1.tong(p2);
        System.out.println(p);
    }
}
