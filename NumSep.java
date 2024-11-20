package OOPS_java_sem_3;

import java.util.Scanner;

public class NumSep {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int no = sc.nextInt();
        for (int i = 4; i > 0; i--) {
            System.out.print((no/(10*i))+ "   ");
            System.out.print("hi");
            
            no = no%(10*i);
        }
        sc.close();
    }
}
