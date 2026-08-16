package OOP_KHAI_BAO_LOP.J04006;
import java.util.*;
class SinhVien{
    private String ten, lop, ns;
    private float diem;
    public SinhVien(String ten, String lop, String ns, float diem){
        this.ten=ten;
        this.lop=lop;
        this.ns=ns;
        this.diem=diem;
    }
    public String chuanHoa(){
        String[] a = ns.split("/");
        return ns= String.format("%02d/%02d/%04d", Integer.parseInt(a[0]), Integer.parseInt(a[1]), Integer.parseInt(a[2]));
    }
    @Override
    public String toString(){
        return "B20DCCN001"+" " +ten+" "+ lop+" "+ ns +" "+String.format("%.2f", diem);
    }
}
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        SinhVien s = new SinhVien(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextFloat());
        s.chuanHoa();
        System.out.println(s);
    }
}
