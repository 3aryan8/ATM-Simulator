
import java.util.Scanner;

class L2Invoice {

    private String partnum;
    private String description;
    private int quantity;
    private double price;

    public L2Invoice(String a, String b, int c, double d) {
        partnum = a;
        description = b;
        quantity = c;
        price = d;
    }

    String getPartNum() {
        return partnum;
    }

    void setPartNum(String input) {
        partnum = input;
    }

    String getDescription() {
        return description;
    }

    void setDescription(String input) {
        description = input;
    }

    int getQuantity() {
        return quantity;
    }

    void setQuantity(int input) {
        quantity = input;
    }

    double getPrice() {
        return price;
    }

    void setPrice(double input) {
        price = input;
    }

    double getInvoice() {
        if (quantity < 0) {
            quantity = 0;
        }
        if (price < 0) {
            price = 0;
        }
        double output = quantity * price;
        return output;
    }
}

public class L2InvoiceTest {

    public static void main(String[] args) {
        String partnum;
        String description;
        int quantity;
        double price;

        try (Scanner sc = new Scanner(System.in)) {

            System.out.println("Enter PartNumber");
            partnum = sc.nextLine();
            System.out.println("Enter Description");
            description = sc.nextLine();
            System.out.println("Enter quantity");
            quantity = sc.nextInt();
            System.out.println("Enter price");
            price = sc.nextDouble();

            L2Invoice inv = new L2Invoice(partnum, description, quantity, price);

            System.out.println("total amout = " + inv.getInvoice());

            System.out.println("your data is ");
            System.out.println("Part Number :" + inv.getPartNum());
            System.out.println("Description :" + inv.getDescription());
            System.out.println("Quantity :" + inv.getQuantity());
            System.out.println("Pricec :" + inv.getPrice());

            System.out.println("were there correct value(Enter true for yes)");
            boolean b1 = sc.nextBoolean();
            if (!b1) {
                inv.setDescription(sc.nextLine());
                inv.setPartNum(sc.nextLine());
                inv.setPrice(sc.nextInt());
                inv.setQuantity(sc.nextInt());
            }
            sc.close();
        }

    }
}
