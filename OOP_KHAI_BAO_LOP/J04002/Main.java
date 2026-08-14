package OOP_KHAI_BAO_LOP.J04002;
import java.util.*;
class Rectange{
    private double width, height;
    private String color;
    public Rectange(){

    }
    public Rectange(double width, double height, String color){
        this.width=width;
        this.height=height;
        this.color=color;
    }
    public double getWidth(){
        return width;
    }
    public void setWidth(double width){
        this.width=width;
    }
    public double getHeight(){
        return height;
    }
    public void setHeight(double height){
        this.height=height;
    }
    public String getColor(){
        return color;
    }
    public void setColor(String color){
        this.color=color;
    }
    public double findArea(){
        return width * height;
    }
    public double findPerimeter(){
        return 2*(width + height);
    }
    public String chuanHoaMau(String color){
        String res="";
        res+=color.toUpperCase().charAt(0);
        for(int i=1; i<color.length(); i++){
            res+=color.toLowerCase().charAt(i);
        }
        res=res.trim();
        return res;
    }
    @Override
    public String toString(){
        return String.format("%.0f", findPerimeter()) +" "+ String.format("%.0f", findArea())+" "+chuanHoaMau(color);
    }
}
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double dai= sc.nextDouble();
        double rong=sc.nextDouble();
        String mau = sc.next();
        Rectange s = new Rectange(dai, rong, mau);
        if(dai >0 && rong>0){
            System.out.println(s);
        }
        else{
            System.out.println("INVALID");
        }
    }
}
