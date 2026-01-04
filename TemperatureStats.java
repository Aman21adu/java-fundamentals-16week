import java.util.Scanner;

public class TemperatureStats {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double[] temperature = new double[7];

        System.out.println("Enter 7 temperatures:");
        for (int i = 0; i < temperature.length; i++) {
            temperature[i] = in.nextDouble();
        }

        double min = temperature[0];
        double max = temperature[0];
        double sum = 0;

        for (int i = 0; i < temperature.length; i++) {
            if (temperature[i] < min) min = temperature[i];
            if (temperature[i] > max) max = temperature[i];
            sum += temperature[i];
        }

        double avg = sum / temperature.length;

        System.out.printf("Min = %.2f, Max = %.2f, Avg = %.2f\n", min, max, avg);
    }
}
