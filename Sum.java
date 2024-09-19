package OOPS_java_sem_3;

import java.util.Scanner;

public class Sum {

   static int largest(int a, int b, int c) {
        if (a > b) {
            if (a > c) {
                return a;
            } else
                return c;
        }
        if (b > c) {
            return b;
        } else
            return c;

    }

   static int smallest(int a, int b, int c) {
        if (a < b) {
            if (a < c) {
                return a;
            } else
                return c;
        }
        if (b < c) {
            return b;
        } else
            return c;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first integer");
        int a = sc.nextInt();
        System.out.println("Enter the second integer");
        int b = sc.nextInt();
        System.out.println("Enter the third integer");
        int c = sc.nextInt();
        sc.close();
        System.out.println("average "+ ((a+b+c))/3 +"\nproduct " + ((a*b)*c) + "\nlargest " + largest(a,b,c)+ " \nsmallest " + smallest(a, b, c) );

    }
}
