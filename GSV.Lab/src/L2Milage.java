
import java.util.Scanner;

public class L2Milage {

    public static void main(String[] args) throws Exception {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter total miles diven per day");
            int miles = sc.nextInt();
            System.out.println("Enter total cost per gallon of gasoline");
            int fuelcost = sc.nextInt();
            System.out.println("Enter average fees per day");
            int fee = sc.nextInt();
            System.out.println("Enter tolls per day");
            int toll = sc.nextInt();
            
            int output = miles*fuelcost + fee + toll;
            System.out.println("Total cost = "+ output);
        }
    }
}
