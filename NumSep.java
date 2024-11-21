package OOPS_java_sem_3;

import java.util.Scanner;

public class NumSep {

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter a 5 digit number");
            int no = sc.nextInt();

            for (int i = 1; i <= 5; i++) {
                System.out.print((int) (no / Math.pow(10, 5 - i)) + "   ");
                no = no % (int) Math.pow(10, 5 - i);
            }
            System.out.println("");
        } catch (Exception e) {
            System.out.println("Enter the correct input");
        }
    }
}
