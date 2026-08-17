package OOP_KHAI_BAO_LOP.J04012;
import java.util.*;
class TinhCong{
    private String ten, chucvu;
    private int luong, songay;
    public TinhCong(String ten, int luong, int songay, String chucvu){
        this.ten=ten;
        this.luong=luong;
        this.songay=songay;
        this.chucvu=chucvu;
    }
    public int getLuongThang(){
        return luong*songay;
    }
    public int getThuong(){
        if(songay>=25){
            return 20*getLuongThang()/100;
        }
        else if(songay>=22){
            return 10*getLuongThang()/100;
        }
        else{
            return 0;
        }
    }
    public int getPhuCap(){
        if(chucvu.equals("GD")){
            return 250000;
        }
        else if(chucvu.equals("PGD")){
            return 200000;
        }
        else if(chucvu.equals("TP")){
            return 180000;
        }
        else{
            return 150000;
        }
    }
    public int getTong(){
        return getLuongThang()+getThuong()+getPhuCap();
    }
    @Override
    public String toString(){
        return "NV01"+" "+ten+" "+getLuongThang()+" "+getThuong()+" "+getPhuCap()+" "+getTong();
    }
}
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        TinhCong s= new TinhCong(sc.nextLine(), Integer.parseInt(sc.nextLine()), Integer.parseInt(sc.nextLine()), sc.nextLine());
        System.out.println(s);
    }
}
