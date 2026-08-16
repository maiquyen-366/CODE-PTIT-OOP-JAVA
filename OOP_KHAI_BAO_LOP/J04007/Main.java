package OOP_KHAI_BAO_LOP.J04007;
import java.util.*;
class NhanVien{
    private String ten, gt, ns, dc, mst, hd;
    public NhanVien(String ten, String gt, String ns, String dc, String mst, String hd){
        this.ten=ten;
        this.gt=gt;
        this.ns=ns;
        this.dc=dc;
        this.mst=mst;
        this.hd=hd;
    }
    @Override
    public String toString(){
        return "00001" +" "+ten+" "+gt+" "+ns+" "+dc+" "+mst+" "+hd;
    }
}
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        NhanVien s = new NhanVien(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
        System.out.println(s);
    }
}
