package OOPS_java_sem_3;

import java.util.Scanner;

public class Larger {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first int ");
        int a = sc.nextInt();
        System.out.println("Enter the second int ");
        int b = sc.nextInt();
        
        if (a > b) {
            System.out.println(a +" is larger");
        }
        else if (a == b) {
            System.out.println("both are equal");
        }
        else {
            System.out.println(b + " is larger");
        }

        sc.close();


    }
    
}
