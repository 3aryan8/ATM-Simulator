
class X {

    int i, j;

    // Constructor to initialize i and j
    public X(int i, int j) {
        this.i = i;
        this.j = j;
    }

    // Method to compute the sum of i and j
    public int findSum() {
        return i + j;
    }
}

class Y extends X {

    // Constructor to initialize i and j using super()
    public Y(int i, int j) {
        super(i, j);
    }

    // Method to compute the product of i and j
    public int findProduct() {
        return i * j;
    }
}

class Z extends Y {

    // Constructor to initialize i and j using super()
    public Z(int i, int j) {
        super(i, j);
    }
}

public class L3MultiInheritance {

    public static void main(String[] args) {
        // Create an object of class Z
        Z obj = new Z(5, 10);

        // Invoke methods and display the results
        int sum = obj.findSum();
        int product = obj.findProduct();

        System.out.println("Sum: " + sum);
        System.out.println("Product: " + product);
    }
}
