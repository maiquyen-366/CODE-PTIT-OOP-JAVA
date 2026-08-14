package OOP_KHAI_BAO_LOP.J04001;
import java.util.*;
class Point{
    private double x, y;
    public Point(){

    }
    public Point(double x, double y){
        this.x=x; 
        this.y=y;
    }
    public Point(Point p){
        x=p.x;
        y=p.y;
    }
    public double getX(){
        return x;
    }
    public double getY(){
        return y;
    }
    public double distance(Point secondPoint){
        double x1=x - secondPoint.x;
        double y1= y- secondPoint.y;
        return Math.sqrt(x1*x1 + y1*y1);
    }
    public double distance(Point p1, Point p2){
        double x1=p1.x-p2.x;
        double y1= p1.y-p2.y;
        return Math.sqrt(x1*x1 + y1*y1);
    }
    @Override
    public String toString(){
        return x+" "+y;
    }
}
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t= sc.nextInt();
        while(t-- >0){
            Point p1= new Point(sc.nextDouble(), sc.nextDouble());
            Point p2 = new Point(sc.nextDouble(), sc.nextDouble());
            double kq= p1.distance(p2);
            System.out.printf("%.4f", kq);
            System.out.println();
        }
    }
}
