import java.util.Scanner;

abstract class Figures {

    double PI = 3.1420;
    double a, v;

    public abstract void calcArea();

    public abstract void calcVol();

    public abstract void dispVol();

    public abstract void dispArea();

}

class Cone extends Figures {

    double h;
    double s;
    double r;

    Cone(double r, double h) {
        this.r = r;
        this.h = h;
        s = Math.sqrt(r * r + h * h); // Correct square root calculation
    }

    @Override
    public void calcArea() {
        a = PI * r * r + PI * r * s;
        dispArea();
    }

    @Override
    public void dispArea() {
        System.out.println("Area of cone: " + a);
    }

    @Override
    public void calcVol() {
        v = (PI * r * r * h) / 3;
        dispVol();
    }

    @Override
    public void dispVol() {
        System.out.println("Volume of cone: " + v);
    }
}

class Sphere extends Figures {

    double r;

    Sphere(double r) {
        this.r = r;
    }

    @Override
    public void calcArea() {
        a = 4 * PI * r * r;
        dispArea();
    }

    @Override
    public void calcVol() {
        v = (4 * PI * r * r * r) / 3;
        dispVol();
    }

    @Override
    public void dispArea() {
        System.out.println("Area of sphere: " + a); // Corrected message
    }

    @Override
    public void dispVol() {
        System.out.println("Volume of sphere: " + v); // Corrected message
    }
}

class Cylinder extends Figures {

    double h, r;

    Cylinder(double r, double h) {
        this.r = r;
        this.h = h;
    }

    @Override
    public void calcArea() {
        a = 2 * PI * r * h + 2 * PI * r * r;
        dispArea();
    }

    @Override
    public void calcVol() {
        v = PI * r * r * h;
        dispVol();
    }

    @Override
    public void dispArea() {
        System.out.println("Area of cylinder: " + a); // Corrected message
    }

    @Override
    public void dispVol() {
        System.out.println("Volume of cylinder: " + v); // Corrected message
    }
}

public class L3Demo {

    public static void main(String[] args) {
        double r, h;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter radius of Sphere:");
            r = sc.nextDouble();

            Sphere sp = new Sphere(r);
            sp.calcArea();
            sp.calcVol();

            System.out.println("Enter for Cone: ");
            System.out.println("Radius: ");
            r = sc.nextDouble();
            System.out.println("Height: ");
            h = sc.nextDouble();

            Cone cone = new Cone(r, h);
            cone.calcArea();
            cone.calcVol();

            System.out.println("Enter for Cylinder:");
            System.out.println("Radius: ");
            r = sc.nextDouble();
            System.out.println("Height: ");
            h = sc.nextDouble();

            Cylinder cyl = new Cylinder(r, h);
            cyl.calcArea();
            cyl.calcVol();
        }
    }
}
