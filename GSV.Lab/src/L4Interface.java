interface Function {
    public int evaluate(int param);
}

// Class implementing the Function interface
class Half implements Function {
    @Override
    public int evaluate(int param) {
        return param / 2; // Returns half of the given parameter
    }
}

public class L4Interface {

    // Method to create a new array with half the values of the original array
    public static int[] halfArray(int[] arr) {
        int len = arr.length;
        int[] res = new int[len];
        Half half = new Half(); // Create an instance of Half

        for (int i = 0; i < len; i++) {
            res[i] = half.evaluate(arr[i]); // Use the Half instance to calculate values
        }

        return res; // Return the result array
    }

    public static void main(String[] args) {
        // Input array
        int[] arr = {8, 9, 3, 5, 12, 4, 18, 22};
        
        // Get the array with half values
        int[] res = halfArray(arr);

        // Print the original array
        System.out.println("Original Array:");
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();

        // Print the array with halved values
        System.out.println("Array with Halved Values:");
        for (int value : res) {
            System.out.print(value + " ");
        }
    }
}
