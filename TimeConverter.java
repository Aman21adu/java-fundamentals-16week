import java.util.Scanner;

public class TimeConverter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

       
        System.out.print("Enter total number of seconds: ");
        int totalSeconds = input.nextInt();

        int hours = totalSeconds / 3600;
        int remainingSeconds = totalSeconds % 3600;
        int minutes = remainingSeconds / 60;
        int seconds = remainingSeconds % 60;


        System.out.println(totalSeconds + " seconds = " + hours + " hours, " 
                           + minutes + " minutes, " 
                           + seconds + " seconds");

        input.close();
    }
}
