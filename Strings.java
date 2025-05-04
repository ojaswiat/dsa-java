public class Strings {
    public static void main(String[] args) {
        String a = "Java";
        String b = "Java";

        System.out.println("a == b: " + (a == b)); // true, same object from pool

        String c = new String("Java"); // new object on heap
        System.out.println("a == c: " + (a == c)); // false, new object on heap

        String d = c.intern(); // tries to move c reference inside the pool but "hello" is already in the pool
                               // so uses the same reference
        System.out.println("a == d: " + (a == d)); // true, both point to interned string (pool)
    }
}
