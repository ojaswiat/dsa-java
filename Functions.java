import java.util.Scanner;

public class Functions {

    static int calculateSum(int m, int n) {
        return m + n;
    }

    public static void main(String[] args) {
        int m, n;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        m = sc.nextInt();

        System.out.print("Enter the second number: ");
        n = sc.nextInt();

        int sum = calculateSum(m, n);
        System.out.println("The sum is: " + sum);

        sc.close();

    }
}
