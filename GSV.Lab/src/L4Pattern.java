import java.util.Scanner;

public class L4Pattern {

    // Function to count occurrences of a pattern in the given range
    public static int countPatternOccurrences(int start, int end, String pattern) {
        int count = 0;

        for (int i = start; i <= end; i++) {
            String numStr = Integer.toString(i);

            // Check if the pattern exists in the number
            int index = numStr.indexOf(pattern);
            while (index != -1) {
                count++;
                // Look for further occurrences in the same number
                index = numStr.indexOf(pattern, index + 1);
            }
        }

        return count;
    }

    public static void main(String[] args) {
        // Input range
        try (Scanner sc = new Scanner(System.in)) {
            // Input range
            System.out.print("Enter range (start and end): ");
            int a = sc.nextInt();
            int b = sc.nextInt();
            
            // Input pattern
            System.out.print("Enter pattern to search: ");
            String pattern = sc.next();
            
            // Calculate the result
            int result = countPatternOccurrences(a, b, pattern);
            
            // Output the result
            System.out.println("The pattern " + pattern + " occurred " + result + " times between " + a + " and " + b + ".");
        }
    }
}
