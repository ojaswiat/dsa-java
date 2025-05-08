import java.lang.Math;
import java.util.Scanner;

class LongestCommonSubstring {

    private static int[][] grid;

    private static void initGrid(int m, int n) {
        grid = new int[m + 1][n + 1];
        for (int i = 0; i < m + 1; i++) {
            for (int j = 0; j < n + 1; j++) {
                grid[i][j] = -1;
            }
        }
    }

    private static int lcs(String s1, String s2, int m, int n) {
        if (m == 0 || n == 0 || s1.charAt(m - 1) != s2.charAt(n - 1)) {
            return 0;
        }

        else if (grid[m - 1][n - 1] != -1) {
            return 1 + grid[m - 1][n - 1];
        }

        else {
            grid[m][n] = 1 + lcs(s1, s2, m - 1, n - 1);
            return grid[m][n];
        }
    }

    private static int findLongestSubstring(String s1, String s2) {
        int m = s1.length();
        int n = s2.length();

        initGrid(m, n);

        int res = 0;

        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                res = Math.max(res, lcs(s1, s2, i, j));
            }
        }

        return res;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        String s1 = sc.nextLine();
        String s2 = sc.nextLine();

        int ans = findLongestSubstring(s1, s2);

        System.out.println(ans);

        sc.close();
    }
}