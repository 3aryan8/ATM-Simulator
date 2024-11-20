package OOPS_java_sem_3;

import java.util.Scanner;

public class Circle {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius of the circle");
        int rad = sc.nextInt();
        sc.close();
        System.out.println("Circumference = " + (2 * Math.PI * rad));
        System.out.println("The area of the circle is " + (Math.PI* Math.PI* rad )) ;

    }
}