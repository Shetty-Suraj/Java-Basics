import java.util.Scanner;

public class TwoDArraySearch {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int n = scr.nextInt();

        System.out.print("Enter the number of columns: ");
        int m = scr.nextInt();

        int[][] arr = new int[n][m];

        System.out.println("Enter elements of the matrix:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print("Element at (" + (i + 1) + "," + (j + 1) + "): ");
                arr[i][j] = scr.nextInt();
            }
        }

        System.out.print("Enter the element to search: ");
        int x = scr.nextInt();

        boolean isFound = false;
        int foundRow = -1;
        int foundColumn = -1;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (arr[i][j] == x) {
                    foundRow = i + 1;
                    foundColumn = j + 1;
                    isFound = true;
                    break;
                }
            }
            if (isFound) break;
        }

        if (isFound) {
            System.out.println("Element found at: Row " + foundRow + ", Column " + foundColumn);
        } else {
            System.out.println("Element not found in the matrix.");
        }

        scr.close();
    }
}
