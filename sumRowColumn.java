public class sumRowColumn {

    public static void sum(int[][] arr) {
        int m = arr.length;       
        int n = arr[0].length;   

        int[] row = new int[m];
        int[] column = new int[n];

       
        for (int i = 0; i < m; i++) {
            int sum = 0;
            for (int j = 0; j < n; j++) {
                sum += arr[i][j];
            }
            row[i] = sum;
        }

        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = 0; j < m; j++) {
                sum += arr[j][i];
            }
            column[i] = sum;
        }

        System.out.print("Row sums: ");
        for (int i = 0; i < m; i++) {
            System.out.print(row[i] + " ");
        }
        System.out.println();

        System.out.print("Column sums: ");
        for (int i = 0; i < n; i++) {
            System.out.print(column[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[][] arr = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        sum(arr);
    }
}
