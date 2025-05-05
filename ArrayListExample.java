import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        System.out.println("ArrayList: " + list);
        System.out.println("Size: " + list.size());
        System.out.println("Element at index 1: " + list.get(1));

        list.remove(1);
        System.out.println("ArrayList after removal at index 1: " + list);

        list.set(1, 5);
        System.out.println("ArrayList after setting index 1 to 5: " + list);

        for (int i = 0; i < list.size(); i++) {
            System.out.println("Element at index " + i + ": " + list.get(i));
        }

        System.out.println("Is the list empty? " + list.isEmpty());
        System.out.println("Does the list contain 3? " + list.contains(3));
        System.out.println("Index of 5: " + list.indexOf(5));

        list.clear();
        System.out.println("ArrayList after clearing: " + list);
        System.out.println("Is the list empty? " + list.isEmpty());

        list.add(10);
        list.add(20);
        list.add(30);
        System.out.println("ArrayList after adding elements: " + list);
        list.remove(list.size() - 1); // This will throw an exception since the list is empty

        System.out.println("ArrayList after removing last element: " + list);

        list.set(0, 99); // This will throw an exception since the list is empty
        System.out.println("ArrayList after setting index 0 to 99: " + list);
    }
}
