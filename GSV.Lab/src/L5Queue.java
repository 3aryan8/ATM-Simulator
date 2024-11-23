import java.util.Scanner;

// Interface for Queue operations
interface QueueImpl {
    void insert(int value); // Method to insert an element into the queue
    void delete();          // Method to delete an element from the queue
    void display();         // Method to display the queue elements
}

// QueueDemo class implementing QueueImpl
class QueueDemo implements QueueImpl {
    private int[] queue;  // Array to store the queue
    private int front;    // Index of the front of the queue
    private int rear;     // Index of the rear of the queue
    private int size;     // Number of elements in the queue

    // Constructor to initialize the queue
    public QueueDemo() {
        queue = new int[10]; // Queue can hold up to 10 elements
        front = 0;
        rear = -1;
        size = 0;
    }

    // Method to insert an element into the queue
    @Override
    public void insert(int value) {
        if (size == 10) {
            System.out.println("Error: Queue Overflow! Cannot insert " + value);
            return;
        }
        rear = (rear + 1) % 10; // Circular increment for rear
        queue[rear] = value;
        size++;
    }

    // Method to delete an element from the queue
    @Override
    public void delete() {
        if (size == 0) {
            System.out.println("Error: Queue Underflow! No elements to delete.");
            return;
        }
        System.out.println("Deleted: " + queue[front]);
        front = (front + 1) % 10; // Circular increment for front
        size--;
    }

    // Method to display elements in the queue
    @Override
    public void display() {
        if (size == 0) {
            System.out.println("Queue is empty.");
            return;
        }
        System.out.print("Queue: ");
        for (int i = 0; i < size; i++) {
            int index = (front + i) % 10; // Circular logic for index
            System.out.print(queue[index] + " ");
        }
        System.out.println();
    }
}

// Main class to test Queue operations
public class L5Queue {
    public static void main(String[] args) {
        QueueDemo queue = new QueueDemo();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\nQueue Operations:");
            System.out.println("1. Insert");
            System.out.println("2. Delete");
            System.out.println("3. Display");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1: // Insert
                    System.out.print("Enter value to insert: ");
                    int value = sc.nextInt();
                    queue.insert(value);
                    break;
                case 2: // Delete
                    queue.delete();
                    break;
                case 3: // Display
                    queue.display();
                    break;
                case 4: // Exit
                    System.out.println("Exiting...");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
