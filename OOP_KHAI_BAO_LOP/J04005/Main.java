package OOP_KHAI_BAO_LOP.J04005;
import java.util.*;
class SinhVien{
    private String ten, ns;
    private float diem1, diem2, diem3;
    public SinhVien(String ten, String ns, float diem1, float diem2, float diem3){
        this.ten=ten;
        this.ns=ns;
        this.diem1=diem1;
        this.diem2=diem2;
        this.diem3=diem3;
    }
    @Override 
    public String toString(){
        return ten+" "+ns+" "+ String.format("%.1f", diem1+diem2+diem3);
    }
}
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        SinhVien s = new SinhVien(sc.nextLine(), sc.nextLine(), sc.nextFloat(), sc.nextFloat(), sc.nextFloat());
        System.out.println(s);
    }
}
