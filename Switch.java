import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number (1-7): ");
        int n = sc.nextInt();

        String dayName;

        switch (n) {
            // New style switch expression - break and : not required (old still supported)
            case 1 -> dayName = "Monday";
            case 2 -> dayName = "Tuesday";
            case 3 -> dayName = "Wednesday";
            case 4 -> dayName = "Thursday";
            case 5 -> dayName = "Friday";
            case 6 -> dayName = "Saturday";
            case 7 -> dayName = "Sunday";
            default -> dayName = "Invalid day";
        }

        String weekend;
        switch (n) {
            case 1, 2, 3, 4, 5 -> weekend = "Weekday";
            case 6, 7 -> weekend = "Weekend";
            default -> weekend = "Invalid day";
        }

        System.out.println("Day " + n + ": " + dayName + " (" + weekend + ")");
        sc.close();
    }
}
