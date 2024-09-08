/*1_1 Write an application that ask the user to enter two integer, obtain them from user 
and print their sum, product, difference and quotient and must be use package 
concept in this application.*/

package OOPS_java_sem_3;

import java.util.Scanner;

public class First {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a, b;
        System.out.println("Enter the first number ");
        a = sc.nextInt();
        System.out.println("Enter the second number ");
        b = sc.nextInt();

        System.out.println("Sum of the 2 number is " + (a + b));
        System.out.println("Difference of the 2 number is " + (a - b));
        System.out.println("Product of the 2 number is " + (a * b));
        System.out.println("Quotient of the 2 number is " + (a / b));
        sc.close();
        
    }
}