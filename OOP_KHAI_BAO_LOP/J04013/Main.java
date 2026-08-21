package OOP_KHAI_BAO_LOP.J04013;
import java.util.*;
class ThiSinh{
    private String ma, ten;
    private double diem1, diem2, diem3;
    public ThiSinh(String ma, String ten, double diem1, double diem2, double diem3){
        this.ma=ma;
        this.ten=ten;
        this.diem1=diem1;
        this.diem2=diem2;
        this.diem3=diem3;
    }
    public double getUu(){
        if(ma.charAt(2)=='1'){
            return 0.5;
        }
        else if(ma.charAt(2)=='2'){
            return 1;
        }
        else{
            return 2.5;
        }
    }
    public String format(double x){
        if(x== (int) x){
            return String.valueOf((int) x);
        }
        else{
            return String.valueOf(x);
        }
    }
    public double getTong(){
        return diem1*2+diem2+diem3;
    }
    public String getTt(){
        double tong=getTong()+getUu();
        if(tong>=24){
            return "TRUNG TUYEN";
        }
        else{
            return "TRUOT";
        }
    }
    @Override
    public String toString(){
        return ma+" "+ten+" "+format(getUu())+" "+format(getTong())+" "+getTt();
    }
}
public class Main {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        ThiSinh s = new ThiSinh(sc.nextLine(), sc.nextLine(), sc.nextDouble(), sc.nextDouble(), sc.nextDouble());
        System.out.println(s);
    }
}
