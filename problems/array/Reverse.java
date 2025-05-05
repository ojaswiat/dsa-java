package problems.array;

import java.util.Scanner;

public class Reverse {

    private static void reverse(int[] arr, int n) {
        int start = 0;
        int end = n - 1;

        while (start < end) {
            // Swap arr[start] and arr[end]
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        reverse(arr, n);
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();

        sc.close();

    }
}
