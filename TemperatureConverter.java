import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter temperature in Celsius: ");
        double c = input.nextDouble();
        double f = (c * 9 / 5) + 32;
        System.out.println("Temperature in Celsius: " + c + " °C");
        System.out.println("Temperature in Fahrenheit: " + f + " °F");

        input.close();
    }
}
