package OOP_KHAI_BAO_LOP.J04011;
import java.util.*;
class Point3D{
    private int x, y, z;
    public Point3D(int x, int y, int z){
        this.x=x;
        this.y=y;
        this.z=z;
    }
    public static boolean check(Point3D p1, Point3D p2, Point3D p3, Point3D p4){
        int x1=p1.x-p2.x;
        int y1=p1.y-p2.y;
        int z1=p1.z-p2.z;
        int x2=p1.x-p3.x;
        int y2=p1.y-p3.y;
        int z2=p1.z-p3.z;
        int x3=p1.x-p4.x;
        int y3=p1.y-p4.y;
        int z3=p1.z-p4.z;
        int xx1=y1*z2-z1*y2;
        int yy1=x2*z1-x1*z2;
        int zz1=x1*y2-y1*x2;
        int kq=xx1*x3+yy1*y3+zz1*z3;
        if(kq==0){
            return true;
        }
        else{
            return false;
        }
    }
}
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t= sc.nextInt();
        while(t-- >0){
            Point3D p1 = new Point3D(sc.nextInt(), sc.nextInt(), sc.nextInt());
            Point3D p2 = new Point3D(sc.nextInt(), sc.nextInt(), sc.nextInt());
            Point3D p3 = new Point3D(sc.nextInt(), sc.nextInt(), sc.nextInt());
            Point3D p4 = new Point3D(sc.nextInt(), sc.nextInt(), sc.nextInt());
            if(Point3D.check(p1,p2,p3,p4)){
            System.out.println("YES");
            } else{
            System.out.println("NO");
        }
        }
    }
}
