import java.io.*;
import java.util.*;

public class LineNumberWriter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter output file name: ");
            String fileName = sc.nextLine();

            PrintWriter outputStream = new PrintWriter(new FileOutputStream(fileName));

            for (int i = 1; i <= 3; i++) {
                System.out.print("Enter line #" + i + ": ");
                String line = sc.nextLine();
                outputStream.println(i + " " + line);
            }

            outputStream.close();
            System.out.println("Successfully wrote lines to " + fileName);
        } catch (FileNotFoundException e) {
            System.out.println("Error: Unable to open file.");
        }
    }
}
