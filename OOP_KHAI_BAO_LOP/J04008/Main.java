package OOP_KHAI_BAO_LOP.J04008;
import java.util.*;
class Point{
    private double x, y;
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
        double x1=x-secondPoint.x;
        double y1=y-secondPoint.y;
        return Math.sqrt(x1*x1+y1*y1);
    }
    public double distance(Point p1, Point p2){
        double x1 = p1.x-p2.x;
        double y1 = p1.y-p2.y;
        return Math.sqrt(x1*x1+y1*y1);
    }
    @Override
    public String toString(){
        return x + " "+y;
    }
}
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t= Integer.parseInt(sc.nextLine());
        while(t-- >0){
            Point p1= new Point(sc.nextDouble(), sc.nextDouble());
            Point p2= new Point(sc.nextDouble(), sc.nextDouble());
            Point p3= new Point(sc.nextDouble(), sc.nextDouble());
            double canh1= p1.distance(p2);
            double canh2 = p2.distance(p3);
            double canh3=p1.distance(p3);
            if(canh1>0 && canh2>0 && canh3>0 && canh1+canh2>canh3 && canh1+canh3>canh2 && canh2+canh3>canh1){
                System.out.printf("%.3f", canh1+canh2+canh3);
            }
            else{
                System.out.print("INVALID");
            }
            System.out.println();
        }
    }
}
