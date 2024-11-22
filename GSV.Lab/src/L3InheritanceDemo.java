
import java.util.Scanner;

public class L3InheritanceDemo {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            
            System.out.println("Enter radius");
            double r = sc.nextDouble();
            System.out.println("Enter height");
            double h = sc.nextDouble();
            System.out.println("Enter slant");
            double s = sc.nextDouble();

            Cone cone = new Cone(r, h, s);
            cone.calcArea();
            cone.calcVolume();
            sc.close();
        }
    }
}

class Figure {

    double r;
    double v;
    double a;

    public void dispArea() {
        System.out.println("Area : " + a);
    }

    public void dispVolume() {
        System.out.println("Volume " + v);
    }

}

class Cone extends Figure {

    double h;
    double s;

    Cone(double r, double h, double s) {
        this.r = r;
        this.h = h;
        this.s = s;
    }

    public void calcArea() {
        a = Math.PI * r * r + Math.PI * r * s;
        dispArea();
    }

    public void calcVolume() {
        v = (Math.PI * r * r * h) / 3;
        dispVolume();

    }

}
