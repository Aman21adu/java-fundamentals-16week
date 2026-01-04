import java.util.Scanner;

public class LoopAnalyzer {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int n = input.nextInt();

        int sum = 0;

        // For loop version
        for (int i = 1; i <= n; i++) {
            sum += i;
            System.out.println("i = " + i + ", sum = " + sum);
        }

        System.out.println("Final Sum = " + sum);

        // While loop version
        int i = 1;
        int sum2 = 0;
        while (i <= n) {
            sum2 += i;
            i++;
        }

        System.out.println("Sum using while loop = " + sum2);

        if (sum == sum2) {
            System.out.println("Both results are identical.");
        } else {
            System.out.println("Results are NOT identical!");
        }

        input.close();
    }
}
