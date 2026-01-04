import java.io.*;
import java.util.*;

public class TransactionCSVReader {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter CSV file name: ");
        String fileName = sc.nextLine();

        double totalSales = 0.0;

        try {
            Scanner inputStream = new Scanner(new File(fileName));

            if (inputStream.hasNextLine()) {
                inputStream.nextLine(); 
            }

            while (inputStream.hasNextLine()) {
                String line = inputStream.nextLine();
                String[] parts = line.split(",");

                String code = parts[0];
                int qty = Integer.parseInt(parts[1]);
                double price = Double.parseDouble(parts[2]);
                String desc = parts[3];

                totalSales += qty * price;
            }

            inputStream.close();
            System.out.println("Total sales = " + totalSales);

        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
        }
    }
}
