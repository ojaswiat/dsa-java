
import com.demo.*;

public class Hello {
    public static void main(String[] args) {
        if (args.length > 0) {
            System.out.println("Hello, " + args[0] + "!");
        } else {
            System.out.println("Hello, User!");
        }

        System.out.println("Sum of 5 and 10 is: " + CustomMath.sum(5, 10));

    }
}