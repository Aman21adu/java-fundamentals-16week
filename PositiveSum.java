import java.util.Scanner;

public class PositiveSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum = 0;
        int number;

        while (true) {
            System.out.print("Enter a number: ");
            number = input.nextInt();
            if (number < 0) {
                break;
            }
            sum += number;
        }

        System.out.println("Sum = " + sum);
        input.close();
    }
}
