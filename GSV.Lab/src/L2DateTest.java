
public class L2DateTest {

    public static void main(String[] args) {
        // Create two Date objects
        Date date1 = new Date(12, 25, 2024);
        Date date2 = new Date(7, 4, 2024);

        // Display initial dates
        System.out.print("Date 1: ");
        date1.displayDate();

        System.out.print("Date 2: ");
        date2.displayDate();

        // Modify the dates
        date1.setMonth(1);
        date1.setDay(1);
        date1.setYear(2025);

        date2.setMonth(10);
        date2.setDay(31);

        // Display updated dates
        System.out.print("Updated Date 1: ");
        date1.displayDate();

        System.out.print("Updated Date 2: ");
        date2.displayDate();
    }
}

class Date {
    private int month;
    private int day;
    private int year;

    // Constructor
    public Date(int month, int day, int year) {
        this.month = month;
        this.day = day;
        this.year = year;
    }

    // Set methods
    public void setMonth(int month) {
        this.month = month;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public void setYear(int year) {
        this.year = year;
    }

    // Get methods
    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    public int getYear() {
        return year;
    }

    // Method to display date in MM/DD/YYYY format
    public void displayDate() {
        System.out.printf("%02d/%02d/%d%n", month, day, year);
    }
}

