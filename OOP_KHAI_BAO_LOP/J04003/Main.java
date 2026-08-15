package OOP_KHAI_BAO_LOP.J04003;
import java.util.*;
class PhanSo{
    private long tu, mau;
    public PhanSo(long tu, long mau){
        this.tu=tu;
        this.mau=mau;
    }
    public long ucln(long tu, long mau){
        while(mau>0){
            long r=tu%mau;
            tu=mau;
            mau=r;
        }
        return tu;
    }
    public void rutgon(){
        long g= ucln(this.tu, this.mau);
        this.tu/=g;
        this.mau/=g;
    }
    @Override
    public String toString(){
        return tu+"/"+mau;
    }
}
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        PhanSo s= new PhanSo(sc.nextLong(), sc.nextLong());
        s.rutgon();
        System.out.println(s);
    }
}
