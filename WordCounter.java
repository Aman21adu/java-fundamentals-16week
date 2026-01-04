import java.util.Scanner;

public class WordCounter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = input.nextLine();
        String[] words = sentence.trim().split("\\s+"); 
        int wordCount = words.length;
        System.out.println("Number of words in the sentence: " + wordCount);

        input.close();
    }
}
