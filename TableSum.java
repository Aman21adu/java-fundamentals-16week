import java.util.Scanner;

public class TableSum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[][] table = new int[3][4];

        System.out.println("Enter 12 integers:");
        for (int r = 0; r < table.length; r++) {
            for (int c = 0; c < table[r].length; c++) {
                table[r][c] = in.nextInt();
            }
        }

        int totalSum = 0;

        for (int r = 0; r < table.length; r++) {
            for (int c = 0; c < table[r].length; c++) {
                totalSum += table[r][c];
            }
        }

        System.out.println("Total Sum = " + totalSum);

        for (int r = 0; r < table.length; r++) {
            int rowSum = 0;
            for (int c = 0; c < table[r].length; c++) {
                rowSum += table[r][c];
            }
            System.out.println("Row " + r + " Sum = " + rowSum);
        }
    }
}
